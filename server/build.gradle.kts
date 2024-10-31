plugins {
    application
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.kotlinx.rpc)
    alias(libs.plugins.ktor)
}

group = "com.milkcocoa.info.retracer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation(libs.kotlinx.rpc.core)
    implementation(libs.kotlinx.rpc.krpc.server)
    implementation(libs.kotlinx.rpc.krpc.serialization.core)
    implementation(libs.kotlinx.rpc.krpc.serialization.protobuf)
    implementation(libs.kotlinx.rpc.krpc.ktor.server)
    implementation(libs.ktor.server.cio)


    implementation(projects.protocol)
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}
