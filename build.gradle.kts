buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("com.android.tools.build:gradle:4.0.2")
    }
}

group = "me.adam"
version = "1.0"

allprojects {
    repositories {
        mavenCentral()
        jcenter()
        google()
    }
}