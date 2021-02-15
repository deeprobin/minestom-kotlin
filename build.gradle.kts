plugins {
    java
    kotlin("jvm") version "1.4.30"
}

group = "de.deeprobin"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_15
    targetCompatibility = JavaVersion.VERSION_15
}

repositories {
    mavenCentral()
    maven(url = "https://libraries.minecraft.net/")
    maven(url = "https://jitpack.io")
    maven(url = "https://repo.spongepowered.org/repository/maven-public")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
    implementation("com.github.Minestom:Minestom:df2ee23a7c")
    testImplementation("junit", "junit", "4.12")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "15"
}
