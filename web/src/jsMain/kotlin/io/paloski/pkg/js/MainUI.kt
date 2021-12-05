package io.paloski.pkg.js

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import io.paloski.pkg.compose.MainScreenComponent
import io.paloski.pkg.compose.getPlatformName
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Text
import kotlin.js.Promise

@Composable
fun MainUI(component : MainScreenComponent) {

    var clickCount = component.clickCount.collectAsState(0)

    Button(attrs = {
        this.onClick { component.onButtonClick() }
    }) {
        Text("Hello, ${getPlatformName()} (click ${clickCount.value})")
    }
}