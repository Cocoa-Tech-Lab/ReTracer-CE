plugins {
    alias(libs.plugins.kotlinJvm) apply false
    alias(libs.plugins.kotlinSerialization) apply false
    alias(libs.plugins.kotlinx.rpc) apply false
    alias(libs.plugins.ktor) apply false
    alias(libs.plugins.jetbrains.compose) apply false
    alias(libs.plugins.kotlinCompose) apply false
}

group = "com.milkcocoa.info.retracer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}