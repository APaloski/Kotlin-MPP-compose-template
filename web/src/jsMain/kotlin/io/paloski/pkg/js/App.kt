package io.paloski.pkg.js

import io.paloski.pkg.compose.DatabaseDrivenMainScreenComponent
import io.paloski.pkg.db.SampleDbDriver
import io.paloski.pkg.db.SampleDbImpl
import kotlinx.browser.document
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import org.jetbrains.compose.web.ui.Styles
import org.w3c.dom.HTMLElement

fun main() {

    println("Main called")

    val rootElement = document.getElementById("root") as HTMLElement

    val componentPromise = SampleDbDriver().then { DatabaseDrivenMainScreenComponent(SampleDbImpl(it)) }

    println("Promise fired off... ")

    componentPromise.then {
        println("Promise fulfilled")

        renderComposable(rootElement) {
            Style(Styles)

            MainUI(it)
        }
    }


}