Cucumber + Selenide:

Instalovat pluginy do IDE Cucumber for Java a Cucumber +

Pom:
<properties>
        <maven.compiler.source>20</maven.compiler.source>
        <maven.compiler.target>20</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
<dependencies>
    <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.13.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>7.13.0</version>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/com.codeborne/selenide -->
<dependency>
    <groupId>com.codeborne</groupId>
    <artifactId>selenide</artifactId>
    <version>6.17.1</version>
</dependency>
</dependencies>
</project>


Tutorial: 

https://www.youtube.com/watch?v=2Vu3wu93yuc&list=PLFGzDEkV3ACsFoqqB5dUu5CAfsZ0Kx2GW&index=1