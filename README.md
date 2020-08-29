# MinecraftTicks

A utility to convert minecraft ticks to/from other time units.

[![Release](https://jitpack.io/v/robertlit/MinecraftTicks.svg)](https://jitpack.io/#robertlit/MinecraftTicks)

[Javadoc](https://javadoc.jitpack.io/com/github/robertlit/MinecraftTicks/latest/javadoc/)

[See on SpigotMC](https://www.spigotmc.org/threads/a-utility-to-convert-minecraft-ticks-to-from-other-time-units.460621/)

If this has helped you, please consider [donating via PayPal](https://www.paypal.me/robertlitmc).

# How to use
You can get the artifact from JitPack using Maven/Gradle, install the artifact locally, or copy the necessary classes.

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
    <version>1.0.1</version>
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
    implementation 'com.github.robertlit:MinecraftTicks:1.0.1'
}
```

## Installing locally
Clone the repository, install the artifact locally (using ```mvn install```, for example)
and use the artifact information that is in the ```pom.xml``` file as a dependency.