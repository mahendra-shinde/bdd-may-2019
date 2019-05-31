# Selenium - Cucumber - Gherkins Integration

1. Create a new Maven project 

    ```yaml
    ProjectName:    DemoBDD1
    GroupId:        com.cg
    ArtefactId:     demobdd1
    Packaging:      JAR
    ```

2.  Open `pom.xml` file and add new dependencies

    ```xml
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
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-server</artifactId>
        <version>3.141.59</version>
    </dependency>  
    ```
3.  Goto `/src/main/resources` and create new folder `features`
4.  Create a new `file` google-search.feature

5.  Add following lines in file:

    ```yaml
    Feature:  search selenium-docs on google
	Search if selenium docs are available on google.
	
	Scenario:  search WebDriver docs
		Given	Google home page
		When search WebDriver on selenium docs
		Then result list should appear
		
    ```
6.  Create new JUnit test case 
    ```yaml
    Name:   TestMain
    ```

7.  Add following annotations (Class level)

    ```java
    @RunWith(Cucumber.class)
    @CucumberOptions(dryRun=true, features="classpath:/features",monochrome=true)
    ```

8.  Right click and Run as Junit Test 
    You should get output in console with suggested methods, copy them inside test class.
    