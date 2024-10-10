plugins {
    kotlin("jvm") version "2.0.20"
}

group = "work.stdpi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.postgresql/postgresql
    compileOnly("org.postgresql:postgresql:42.7.4")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(kotlin("reflect"))
}

tasks.test {
    useJUnitPlatform()
}