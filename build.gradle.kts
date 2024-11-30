plugins {
    kotlin("jvm") version "1.9.24"
    kotlin("kapt") version "2.0.0"
    /*
     * If you use Spring, you can enable the kotlin-spring compiler plugin instead of specifying Spring annotations manually.
     * The kotlin-spring is a wrapper on top of all-open, and it behaves exactly the same way.
     */
    kotlin("plugin.spring") version "1.9.24"
    kotlin("plugin.jpa") version "1.9.24"
    id("org.springframework.boot") version "3.2.7"
    id("io.spring.dependency-management") version "1.1.3"
}

group = "org.example"
val fasterxmlVersion = "2.17.1"
val jetbrainsKotlinStdlibVersion = "2.0.0"
val ulidCreatorVersion = "5.2.3"
val lineJdslSpringStarterVersion = "2.2.1.RELEASE"
val jetbrainsKotlinReflectVersion = "2.0.0"
val kotlinTestVersion = "2.0.0"
val queryDslVersion = "5.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.h2database:h2")
    /*
     * kotlin
     */
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:$fasterxmlVersion")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$fasterxmlVersion")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$jetbrainsKotlinStdlibVersion")
    implementation("org.jetbrains.kotlin:kotlin-reflect:$jetbrainsKotlinReflectVersion")
    implementation("com.auth0:java-jwt:4.4.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

kotlin {
    jvmToolchain(21)
}

tasks.jar {
    enabled = false
}