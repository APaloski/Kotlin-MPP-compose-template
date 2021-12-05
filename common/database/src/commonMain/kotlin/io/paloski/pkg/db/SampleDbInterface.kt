package io.paloski.pkg.db

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

interface SampleDbInterface {

    val currentCount : Flow<Long>

    fun incrementCount()
}