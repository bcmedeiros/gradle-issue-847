plugins {
    kotlin("jvm")
}

group = "dev.bcmedeiros"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":a:lib"))
}
