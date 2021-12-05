package io.paloski.pkg.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import io.paloski.pkg.compose.App
import io.paloski.pkg.compose.DatabaseDrivenMainScreenComponent
import io.paloski.pkg.db.SampleDbDriver
import io.paloski.pkg.db.SampleDbImpl

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //TODO: Use dagger or something for DI
        val component = DatabaseDrivenMainScreenComponent(SampleDbImpl(SampleDbDriver(this)))
        setContent {
            MaterialTheme {
                App(component)
            }
        }
    }
}