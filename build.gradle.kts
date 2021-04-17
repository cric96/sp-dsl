
plugins {
    scala
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    implementation("org.scala-lang:scala-library:2.13.+")
    implementation("it.unibo.tuprolog:solve-classic-jvm:0.17.1")
    testImplementation("junit:junit:4.13")
}