
# PROGUARD DEMO
Project to use proguard plugin (code obfuscate)

# How to use

To run this project and view the result follow the steps below

- make a configuration in the proguard.conf
- run the mvn command to create a jar file
  - mvn clean package
- check if the jar file was generate in the path /target
  - PROGUARD-DEMO-22.01.1-SNAPSHOT.jar
- unzip the jar file PROGUARD-DEMO-22.01.1-SNAPSHOT.jar
  - unzip PROGUARD-DEMO-22.01.1-SNAPSHOT.jar
- check the path target/PROGUARD-DEMO-22.01.1-SNAPSHOT/BOOT-INF/classes/com/huntercodexs
  - in this path check if the classes has been obfuscated