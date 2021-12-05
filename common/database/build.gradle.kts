plugins {
    id("multiplatform-setup")
    id("android-setup")
    id("com.squareup.sqldelight")
}

sqldelight {
    database("FillMeInDatabase") {
        packageName = "io.paloski.pkg.db"
    }
}

description = "Contains a multiplatform database that can be used for local storage"

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(Deps.Kotlinx.Coroutines.core)
            }
        }

        androidMain {
            dependencies {
                implementation(Deps.Squareup.SQLDelight.androidDriver)
            }
        }

        desktopMain {
            dependencies {
                implementation(Deps.Squareup.SQLDelight.sqliteDriver)
            }
        }

        jsMain {
            dependencies {
                implementation(Deps.Squareup.SQLDelight.sqljsDriver)
            }
        }
    }
}