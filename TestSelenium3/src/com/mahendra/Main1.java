package com.mahendra;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\bdd-ws\\Selenium-JARS\\chromedriver.exe");

		ChromeDriver d = new ChromeDriver();
		
		d.get("file:///C:/html-pages/AlertExample.html");
		
		d.findElement(By.name("btnAlert")).click();
		Alert a = d.switchTo().alert(); //Capture the already open Alert BOX!
		String text = a.getText();
		a.accept();
		System.out.println("Alert had text "+text);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.close();
	}

}
