plugins {
    kotlin("jvm") version "2.1.0"
    kotlin("kapt") version "2.1.0"
}

allprojects {
    repositories {
        mavenCentral()
    }
}

val fasterxmlVersion = "2.18.2"
val jetbrainsKotlinVersion = "2.1.0"

group = "org.example"

subprojects {

    apply {
        plugin("org.jetbrains.kotlin.jvm")
        plugin("org.jetbrains.kotlin.kapt")
    }

    dependencies {
        /*
         * kotlin
         */
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin:$fasterxmlVersion")
        implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$fasterxmlVersion")
        implementation("org.jetbrains.kotlin:kotlin-stdlib:$jetbrainsKotlinVersion")
        implementation("org.jetbrains.kotlin:kotlin-reflect:$jetbrainsKotlinVersion")
    }

    tasks.test {
        useJUnitPlatform()
    }
    kotlin {
        jvmToolchain(21)
    }

    tasks.jar {
        enabled = false
    }
}