package io.paloski.pkg.db

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.sqlite.driver.JdbcSqliteDriver
import io.paloski.pkg.db.FillMeInDatabase
import java.io.File

fun SampleDbDriver() : SqlDriver {
    val dbPath = File(System.getProperty("java.io.tmpdir"), "FilleMeIn.db")
    val driver = JdbcSqliteDriver(url = "jdbc:sqlite:${dbPath.absolutePath}")

    FillMeInDatabase.Schema.create(driver)

    return driver
}