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

kotlin {
    sourceSets {
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