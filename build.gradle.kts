plugins {
    java
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

group = "dev.royalix.qtokens"
version = "0.0.1-BETA"

subprojects {
    apply {
        plugin("java")
        plugin("com.github.johnrengelman.shadow")
    }

    repositories {
        jcenter()
        maven { setUrl("https://repo.codemc.org/repository/nms/") }
        maven { setUrl("https://oss.sonatype.org/content/repositories/snapshots") }
        mavenLocal()
    }

    dependencies {
        compileOnly("org.spigotmc:spigot-api:1.12.2-R0.1-SNAPSHOT")
        compileOnly("com.oop.inteliframework:commons:1.0")

        compileOnly("org.projectlombok:lombok:1.18.8")
        annotationProcessor("org.projectlombok:lombok:1.18.8")
    }
}
