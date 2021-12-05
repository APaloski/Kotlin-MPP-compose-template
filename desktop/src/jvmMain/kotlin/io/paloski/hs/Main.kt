package io.paloski.hs

import androidx.compose.material.MaterialTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.paloski.pkg.compose.App
import io.paloski.pkg.compose.DatabaseDrivenMainScreenComponent
import io.paloski.pkg.db.SampleDbDriver
import io.paloski.pkg.db.SampleDbImpl

fun main() = application {
    val component = DatabaseDrivenMainScreenComponent(SampleDbImpl(SampleDbDriver()))

    Window(onCloseRequest = ::exitApplication) {
        MaterialTheme {
            App(component)
        }
    }
}