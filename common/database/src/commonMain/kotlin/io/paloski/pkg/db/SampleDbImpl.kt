package io.paloski.pkg.db

import com.squareup.sqldelight.Query
import com.squareup.sqldelight.db.SqlDriver
import kotlinx.coroutines.async
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SampleDbImpl(driver : SqlDriver) : SampleDbInterface {

    val database = FillMeInDatabase(driver)

    override val currentCount: Flow<Long>
        get() = callbackFlow {

        trySend(database.fillMeInDatabaseQueries.dummyCount().executeAsOne())

        val listener = object :  Query.Listener {
            override fun queryResultsChanged() {
                    trySend(database.fillMeInDatabaseQueries.dummyCount().executeAsOne())
            }
        }

        database.fillMeInDatabaseQueries.dummyCount().addListener(listener)
        awaitClose {
            database.fillMeInDatabaseQueries.dummyCount().removeListener(listener)
        }
    }

    override fun incrementCount() {
        database.fillMeInDatabaseQueries.dummyInsert()
    }
}