# avro-example

The __Apache Avro™ 1.8.1 Getting Started (Java)__ documentation resides at <https://avro.apache.org/docs/1.8.1/gettingstartedjava.html>. 

Its section entitled __Compiling and running the example code__, refers to example source code for java, python (py), and map reduce (ml) that resides at
<https://avro.apache.org/docs/1.8.1/examples/>

This project describes changes I made to the __java-example__ project to get the ```GenericMain``` and ```SpecificMain``` classes to run from Eclipse on my dev environment.

These changes include:

1. create ```avro.sourceDirectory``` ```${project.basedir}/src/main/resources/avro``` as defined in ```pom.xml``` ```project/properties```

2. put all ```.avsc``` schema files into ```avro.sourceDirectory``` 

3. create ```avro.outputDirectory``` ```${project.basedir}/src/main/java/avro``` as defined in ```pom.xml``` ```project/properties```

4. add ```avro.outputDirectory``` as a source directory in project's __BuildPath__

5. create two maven __Run Configurations__: 
    * ```mvn SpecificMain``` with goals ```clean generate-sources compile exec:java -Dexec.mainClass="example.SpecificMain" ```
    * ```mvn GenericMain``` with goals ```clean compile exec:java -Dexec.mainClass="example.GenericMain"```

6. NOTE that ```avro-maven-plugin``` needs to be placed under ```project/build/plugins``` because
avro java source files will not be generated if 
the plugin is placed under ```project/build/pluginManagement```

7. just ignore the ```pom.xml``` warning ```Plugin execution not covered by lifecycle configuration```

### My dev environment ###

* MacBook Pro
Model: MacBookPro8,3 (17-inch, Late 2011)
Processor: 2.5 GHz Intel Core i7
Memory: 16 GB 1333 MHz DDR3
OS: Mac OS Sierra Version 10.12.4

* Java version "1.8.0_74"
Java(TM) SE Runtime Environment (build 1.8.0_74-b02)
Java HotSpot(TM) 64-Bit Server VM (build 25.74-b02, mixed mode)

* Eclipse Java EE IDE for Web Developers. 
Version: Neon.3 Release (4.6.3) 
Build id: 20170314-1500

* Apache Maven 3.5.0 

