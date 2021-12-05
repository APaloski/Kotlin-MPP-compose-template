package io.paloski.pkg.compose

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun App(component: MainScreenComponent) {

    var clickCount = component.clickCount.collectAsState(0)

    Button(onClick = {
        component.onButtonClick()
    }) {
        Text("Hello, ${getPlatformName()} (click ${clickCount.value})")
    }
}