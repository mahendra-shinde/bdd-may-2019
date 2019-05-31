package demobdd2;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	WebDriver driver = null;
	LoginPageModel model = null;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","c:\\bdd-ws\\selenium-jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("c:\\html-pages\\login.html");
		model = new LoginPageModel(driver);
	}

	@When("User enters invalid username")
	public void user_enters_invalid_username() {
		model.getUserName().sendKeys(""); //try sending EMPTY username
		model.triggerClick();
	}

	@Then("Display Please enter username")
	public void display_Please_enter_username() {
	    String msg = model.getUserError().getText();
	    assertEquals("Please enter username", msg);
	}

	@When("User enters invalid password")
	public void user_enters_invalid_password() {
	    model.getPassword().sendKeys(""); //try EMPTY password
	    model.triggerClick();
	}

	@Then("Display Please enter password")
	public void display_Please_enter_password() {
		String msg = model.getPwdError().getText();
		assertEquals("Please enter password",msg);
	}


}
