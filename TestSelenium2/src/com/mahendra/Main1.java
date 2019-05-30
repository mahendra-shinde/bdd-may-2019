package com.mahendra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\bdd-ws\\Selenium-JARS\\chromedriver.exe");

		ChromeDriver d = new ChromeDriver();
		
		d.get("file:///C:/html-pages/WorkingWithForms.html");
		List<WebElement> elements = d.findElements(By.tagName("input"));
		//First Text field : Username
		elements.get(0).sendKeys("mahendraunlimited");
		//second text field : password
		elements.get(1).sendKeys("StrongPassword!");
		//third text field : Confirm password
		elements.get(2).sendKeys("StrongPassword!");
		//fourth text field : First name
		elements.get(3).sendKeys("Mahendra");
		//fifth text field : last name
		elements.get(4).sendKeys("Shinde");
		//Radio button : gender male
		elements.get(5).click(); //Select MALE
		Select sel = new Select(d.findElement(By.name("City")));
		sel.selectByIndex(3); // Fourth item : Chennai
		
		WebElement music = d.findElements(By.name("chkHobbies")).get(0);
		if(!music.isSelected() ) {
			music.sendKeys(" ");
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.close();
	}

}
