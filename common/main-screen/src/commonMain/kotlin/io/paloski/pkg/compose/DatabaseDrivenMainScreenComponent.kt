package io.paloski.pkg.compose

import io.paloski.pkg.db.SampleDbInterface
import kotlinx.coroutines.flow.Flow

class DatabaseDrivenMainScreenComponent(val sampleDb : SampleDbInterface) : MainScreenComponent {
    override val platformName: String
        get() = getPlatformName()
    override val clickCount: Flow<Long>
        get() = sampleDb.currentCount

    override fun onButtonClick() {
        sampleDb.incrementCount()
    }
}