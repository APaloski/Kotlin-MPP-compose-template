package io.paloski.pkg.db

import com.squareup.sqldelight.db.SqlDriver

class SampleDbImpl(driver : SqlDriver) : SampleDbInterface {

    val database = FillMeInDatabase(driver)

    override fun getCurrentCount(): Long = database.fillMeInDatabaseQueries.dummyCount().executeAsOne()

    override fun incrementCount() {
        database.fillMeInDatabaseQueries.dummyInsert()
    }
}