package io.paloski.pkg.db

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.sqljs.initSqlDriver
import io.paloski.pkg.db.FillMeInDatabase
import kotlin.js.Promise

fun SampleDbDriver() : Promise<SqlDriver> =
    initSqlDriver(FillMeInDatabase.Schema)