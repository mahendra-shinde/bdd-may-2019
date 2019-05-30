package com.mahendra;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Test Website using HtmlUnit
 * 	- No GUI : Faster access
 *  - No External EXE (driver) required
 *  - Just need following JAR
 *  	selenium-server-standalone-2.48.2.jar
 * @author mahendra
 *
 */

public class HtmlUnitDemo {

	public static void main(String[] args) {

		HtmlUnitDriver d = new HtmlUnitDriver();
		d.get("file:///C:/html-pages/TestHTMLUnit.html");
		System.out.println("Title on Page : "+d.getTitle());
		d.close();
	}

}
