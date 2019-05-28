## Creating Gherkins/Cucumber steps in eclipse

1.  Create new maven project

    ```ini
    Name:       CucumberDemo1
    Artefact:   CucumberDemo1
    GroupId:    com.cg
    Packaging:  JAR
    ```

2.  Add following lines inside "POM.XML" file to add "Cucumber Dependencies"

    ```XML
    <dependencies>
		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>4.3.1</version>
		</dependency>
        <dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>4.3.1</version>
		</dependency>
	</dependencies>
    ```
3.  Create new folder "features" inside `/src/test/resources/` folder

4.  Create new file "search-product.feature' inside `features` folder
Copy following lines inside newly created feature file:

    ```
    Feature:    Search product
        Allows users to search product by name, user may not enter full product name but can be just partial name.

    Scenario:   User searching for an existing product
        Given   User at home page 
        When    User searches for product
        Then    Search page should display list of matching products

    ```

5.  Create new JUnit Test case 

    ```ini
    Test class:     Demo1
    Folder:         /src/test/java
    
    ```

    The code for Test Case

    ```java
    
    @RunWith(Cucumber.class)
    @CucumberOptions(features="classpath:features",dryRun=true,monochrome=true)
    public class Demo1 {

    }
    ```

6.  Right click inside "Demo1.java" and choose option : `Run As > JUnit Test`