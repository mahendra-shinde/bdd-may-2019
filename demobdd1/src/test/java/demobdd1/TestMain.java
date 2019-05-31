package demobdd1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

//Run With Cucumber Test Runner
@RunWith(Cucumber.class)
//dryRun:true 	To Validate the Steps and Feature file
//dryRun:false 	To Validate and Then execute test cases 
				// (Throws exception when steps are missing)
//features=		The package or directory which contains all Feature files
//monochrome:true	Disable extra formatting characters 
// 					And generate simple plain text output
//monochrome:false	Enable extra formatting (for Linux OS only)
//					DO NOT USE on Windows
@CucumberOptions(dryRun=false, features="classpath:/features",monochrome=true)
public class TestMain {

		
}
