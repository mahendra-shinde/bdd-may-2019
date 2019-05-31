package demobdd1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
WebDriver driver = null;

	@Given("Google home page")
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\bdd-ws\\Selenium-JARS\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Given Statement");
		driver.get("http://www.google.com");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}


	@When("search WebDriver on selenium docs")
	public void search_WebDriver_on_selenium_docs() {
	    WebElement element = driver.findElement(By.name("q"));
	    element.sendKeys("Selenium docs: WebDriver");
	    element.submit();
	}

	@Then("result list should appear")
	public void result_list_should_appear() {
	   String title = driver.getTitle();
	   assertTrue(title.contains("Google Search"));
	}

}
