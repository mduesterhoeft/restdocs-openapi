import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
    jcenter()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    compile(kotlin("stdlib-jdk8"))

    compile(project(":restdocs-openapi-model"))
    compile("io.swagger.core.v3:swagger-core:2.0.4")
    compile("com.fasterxml.jackson.core:jackson-databind:2.9.5")
    compile("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.5")
    compile("com.github.everit-org.json-schema:org.everit.json.schema:1.9.1")

    testImplementation("io.swagger:swagger-parser:2.0.0-rc1")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    testImplementation("org.assertj:assertj-core:3.10.0")

    testImplementation("com.jayway.jsonpath:json-path:2.4.0")
    testImplementation("com.github.java-json-tools:json-schema-validator:2.2.10")
}


