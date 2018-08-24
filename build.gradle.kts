group = "ch.peters.daniel"
version = "1.0"

plugins {
  java
  application
  groovy
}

application {
  applicationName = "partyinviter"
  mainClassName = "${project.group}.$applicationName.App"
}

dependencies {
  implementation("com.google.guava:guava:23.0")
  testImplementation("org.codehaus.groovy:groovy-all:2.4.15")
  testImplementation("org.spockframework:spock-core:1.0-groovy-2.4")
  testImplementation("junit:junit:4.12")
}

repositories {
  jcenter()
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10
}
