Založení projektu:

Maven

TestNG

Selenide

Na inportovat si:

import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Condition.*;

@Test --> Nezapomenout --> Generata --> MethodTest (ušetří práci)

pom.xml

<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>20</maven.compiler.source>
    <maven.compiler.target>20</maven.compiler.target>
  </properties>

  <dependencies>
    <dependency>
    <groupId>com.codeborne</groupId>
    <artifactId>selenide</artifactId>
    <version>6.17.0</version>
    <scope>test</scope>
</dependency>
    <!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.8.0</version>
    <scope>test</scope>
</dependency>
  </dependencies>
</project>