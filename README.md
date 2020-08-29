# MinecraftTicks

A utility to convert minecraft ticks to other time units.

[![Release](https://jitpack.io/v/robertlit/MinecraftTicks.svg)](https://jitpack.io/#robertlit/MinecraftTicks)

[Javadoc](https://jitpack.io/com/github/robertlit/MinecraftTicks/latest/javadoc/)

# How to use
You get the artifact from JitPack using Maven/Gradle, install the artifact locally, or copy the necessary classes.

## Maven
Add JitPack as a repository
``` xml
<repositories>
  <!--   it is recommended to specify JitPack after all other repositories   -->
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```
Add MinecraftTicks as a dependency
``` xml
<dependencies>
  <dependency>
    <groupId>com.github.robertlit</groupId>
    <artifactId>MinecraftTicks</artifactId>
    <version>1.0</version>
  </dependency>
</dependencies>
```

## Gradle
Add JitPack as a repository
``` 
repositories {
    maven { url 'https://jitpack.io' }
}
```
Add MinecraftTicks as a dependency
```
dependencies {
    implementation 'com.github.robertlit:MinecraftTicks:1.0'
}
```

## Installing locally
Clone the repository, install the artifact locally (using ```mvn install```, for example)
and use the artifact information that is in the ```pom.xml``` file as a dependency.

If this has helped you, please consider [donating via PayPal](https://www.paypal.me/robertlitmc).