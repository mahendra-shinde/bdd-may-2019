1. Create new Maven project

2. Add dependencies:
    selenium-server
    cucumber-java
    cucumber-junit

3. Create folder "features" under "src/test/resources"
4. Create a file "login.feature" inside "features" folder

    ```yaml
    Feature: Test login page
	
	Scenario: Invalid Username
		Given User is on login page
		When User enters invalid username
		Then Display Please enter username
		
	Scenario: Invalid Password
	 	Given User is on login page
	 	When User enters invalid password
	 	Then Display Please enter password
    ```
5.  Create a new Java Test class "TestMain" inside "src/test/java" with package "demobdd2"

    ```java
    @RunWith(Cucumber.class)
    @CucumberOptions(features="classpath:/features",monochrome=true)
    public class TestMain {
    }
    ```

6.  Run "TestMain" as `JUnit Test`
    The generated output should have total FIVE method signatures.
    Select all methods and copy them

7.  Create a new Java Class `LoginSteps` (Or Use any other meaningful name).
    Paste all methods

    ```java
    @Given("User is on login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User enters invalid username")
    public void user_enters_invalid_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Display Please enter username")
    public void display_Please_enter_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User enters invalid password")
    public void user_enters_invalid_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Display Please enter password")
    public void display_Please_enter_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
    ```
    > NOTE: The text inside @When, @Then & @Given MUST match with
            steps written in .feature file.
