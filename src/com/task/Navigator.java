package com.task;


import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.dell.com/");
		driver.navigate().to("https:www.hp.com/");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().forward();
		driver.navigate().refresh();
		String title = driver.getTitle();
		System.out.println(title);
		String c = driver.getCurrentUrl();
		System.out.println(c);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

}
