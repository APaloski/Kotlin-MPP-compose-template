package io.paloski.hs

import io.paloski.hs.common.App
import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        MaterialTheme {
            App()
        }
    }
}