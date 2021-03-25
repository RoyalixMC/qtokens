plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
}

dependencies {
    implementation(project(":api"))

    implementation("com.oop.inteliframework.config:1.0")
    implementation("com.oop.inteliframework.config-node:1.0")
    implementation("com.oop.inteliframework.config-property:1.0")
}
