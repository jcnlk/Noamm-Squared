pluginManagement {
    plugins {
        kotlin("jvm") version providers.gradleProperty("kotlin_version").get()
        kotlin("plugin.serialization") version providers.gradleProperty("kotlin_version").get()
        id("net.fabricmc.fabric-loom") version providers.gradleProperty("loom_version").get()
    }

    repositories {
        maven("https://maven.fabricmc.net/") {
            name = "Fabric"
        }

        maven("https://jitpack.io") {
            name = "JitPack"
        }
        gradlePluginPortal()
    }
}
