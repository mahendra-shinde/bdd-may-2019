package demobdd2;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageModel {

	private WebDriver driver = null;

	public LoginPageModel(WebDriver driver) {
		super();
		this.driver = driver;
		//Register the Page Factory : Responsible to extract all web elements 
		PageFactory.initElements(driver, this);
		///////////////////////////
	}
	// Every HTML element is now Mapped to variable / field
	// Makes it easy to modify in case your developers makes any changes
	// in page/website under test.
	@FindBy(name="userName")
	private WebElement userName;

	@FindBy(name="userPwd")
	private WebElement password;
	
	//@FindBy(xpath="//*[@id=\"userErrMsg\"]")
	@FindBy(id="userErrMsg")
	private WebElement userError;
	
	@FindBy(id="pwdErrMsg")
	private WebElement pwdError;
	
	@FindBy(id="btn1")
	private WebElement button;
	
	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getUserError() {
		return userError;
	}

	public void setUserError(WebElement userError) {
		this.userError = userError;
	}

	public WebElement getPwdError() {
		return pwdError;
	}

	public void setPwdError(WebElement pwdError) {
		this.pwdError = pwdError;
	}

	public void triggerClick() {
		System.out.println("Button click triggered");
		button.click();
	}
}
