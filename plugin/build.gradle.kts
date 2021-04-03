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

    implementation("com.oop.inteliframework:platform:1.0")
    implementation("com.oop.inteliframework:config:1.0")
    implementation("com.oop.inteliframework:item:1.0")
    implementation("com.oop.inteliframework:task:1.0")
    implementation("com.oop.inteliframework:task-bukkit:1.0")
    implementation("com.oop.inteliframework:config-node:1.0")
    implementation("com.oop.inteliframework:config-property:1.0")
    implementation("com.eatthepath:fast-uuid:0.1")
}
