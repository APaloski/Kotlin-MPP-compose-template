plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group = "io.paloski.pkg"
version = "1.0"

kotlin {
    js(IR) {
        browser {
            binaries.executable()
//            commonWebpackConfig {
//                cssSupport.enabled = true
//            }
            useCommonJs()
            this.webpackTask {
                outputFileName = "output.js"
            }
        }
    }

    sourceSets {
        named("jsMain") {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.web.widgets)
                implementation(npm("copy-webpack-plugin", "9.0.0"))
                implementation(project(":common:database"))
                implementation(project(":common:main-screen"))
            }
        }
    }
}

// a temporary workaround for a bug in jsRun invocation - see https://youtrack.jetbrains.com/issue/KT-48273
afterEvaluate {
    rootProject.extensions.configure<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension> {
        versions.webpackDevServer.version = "4.0.0"
        versions.webpackCli.version = "4.9.0"
    }
}