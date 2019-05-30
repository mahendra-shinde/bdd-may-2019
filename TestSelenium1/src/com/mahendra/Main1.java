package com.mahendra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\bdd-ws\\Selenium-JARS\\chromedriver.exe");

		ChromeDriver d = new ChromeDriver();
		
		d.get("https://duckduckgo.com");
		WebElement element = d.findElement(By.name("q"));
		element.sendKeys("mahendrashinde");
		element.submit();
		
		System.out.println("Title on Page : "+d.getTitle());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.close();
	}

}
