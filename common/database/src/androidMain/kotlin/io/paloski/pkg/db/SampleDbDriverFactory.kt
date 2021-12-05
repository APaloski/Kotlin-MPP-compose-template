package io.paloski.pkg.db

import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

fun SampleDbDriver(context : Context) : SqlDriver =
    AndroidSqliteDriver(schema = FillMeInDatabase.Schema,
                       context = context,
                       name = "FillMeIn.db")