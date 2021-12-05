pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    
}


include(":android")
include(":desktop")
include(":common")
include(":common:database")
include(":common:main-screen")
include(":common:material-compose-ui")
include(":web")

