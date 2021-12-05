package io.paloski.pkg.compose

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

interface MainScreenComponent {

    val platformName : String

    val clickCount : Flow<Long>

    fun onButtonClick()
}