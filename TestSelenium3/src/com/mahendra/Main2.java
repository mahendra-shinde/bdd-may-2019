package com.mahendra;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\bdd-ws\\Selenium-JARS\\chromedriver.exe");

		ChromeDriver d = new ChromeDriver();

		d.get("file:///C:/html-pages/PopupWin.html");
		String parent = d.getWindowHandle().toString();
		System.out.println("Parent Window:" + parent);

		// Click on "Open" button
		d.findElement(By.name("Open")).click();
		try {
			// Pause for 10 seconds, let popup window load it's contents
			Thread.sleep(10000);
		} catch (InterruptedException ex) {
		}

		Set<String> children = d.getWindowHandles();
		System.out.println("The number of children windows are " + children.size());

		for (String childWin : children) {
			// Skip the parent window
			if (childWin.equals(parent)) {
				continue;
			}
			// Switch focus to child window
			System.out.println("Child Window :" + childWin);
			d.switchTo().window(childWin.toString());
			System.out.println(d.getTitle());
		}
		d.switchTo().window(parent);

		d.close();
	}

}
