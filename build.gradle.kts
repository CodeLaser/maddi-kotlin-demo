plugins {
    kotlin("jvm") version "2.4.0"
}

group = "io.codelaser.demo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val maddiVersion = "0.9.5"

dependencies {
    // the annotations, for the contracts some classes write by hand
    implementation("io.codelaser:maddi-annotation:$maddiVersion")
    // SetOnce and EventuallyFinalOnDemand, for the eventually immutable classes
    implementation("io.codelaser:maddi-support:$maddiVersion")
}

kotlin {
    jvmToolchain(21)
}
