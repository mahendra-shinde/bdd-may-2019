package demobdd2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Assumptions:
 * 	1. ChromeDriver.EXE is at location c:\\bdd-ws\\selenium-jars\\chromedriver.exe"
 *  2. HTML page is at location C:\\html-pages\\login.html
 * @author mahen
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:/features",monochrome=true)
public class TestMain {

	
}
