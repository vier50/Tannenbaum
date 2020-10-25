plugins {
    java
    kotlin("jvm") version "1.4.10"
    application
}

group = "org.example"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application.mainClassName = "org.example.tannenbaum.MainKt"
