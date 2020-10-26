plugins {
    kotlin("jvm") version "1.4.0"
}

group = "com.creeperface.cloudburst.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(kotlin("stdlib"))
    api("org.cloudburstmc:cloudburst-server:1.0.0-SNAPSHOT")
}
