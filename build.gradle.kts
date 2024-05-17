import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.repositories
import org.gradle.kotlin.dsl.withType
import org.gradle.api.publish.PublishingExtension
import org.gradle.kotlin.dsl.configure

plugins {
	java
	`maven-publish`
	id("org.springframework.boot") version "3.2.5"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "come.selfstudy"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("org.apache.logging.log4j:log4j-api:2.14.0")
	implementation("org.apache.logging.log4j:log4j-core:2.14.0")
}

configure<PublishingExtension> {
	publications {
		register<MavenPublication>("mavenJava") {
			from(components["java"])
		}
	}
}


//publishing {
//	repositories {
//		maven {
//			name = "GitHubPackages"
//			url = uri("https://maven.pkg.github.com/parastooProgrammer/ListenerStarter")
//			credentials {
////				username = project.findProperty("gpr.user") ?: System.getenv("gprUser")
////				password = project.findProperty("gpr.key") ?: System.getenv("gprKey")
//				username = "parastooProgrammer"
//				password = "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"
//			}
//		}
//	}
//	publications {
//		gpr(MavenPublication) {
//			groupId = 'com.selfstudy'
//			artifactId = 'customStarter' // Use your project's name as artifactId
//			version = '3'  // Or '0.0.1-SNAPSHOT' for development version
////			from components.java
//			artifact source: jar
//		}
//	}
//}
tasks.withType<Test> {
	useJUnitPlatform()
}
