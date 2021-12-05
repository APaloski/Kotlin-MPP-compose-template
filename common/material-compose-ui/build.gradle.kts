plugins {
    id("multiplatform-compose-setup")
    id("android-setup")
}

kotlin {
    sourceSets {
        named("commonMain") {
            dependencies {
                api(project(":common:main-screen"))
            }
        }
    }
}


description = "Contains JVM + Android compose implemenetations (See: https://github.com/JetBrains/compose-jb/tree/master/examples/todoapp). This exists because there's no " +
              "standard material components impl for JS yet"