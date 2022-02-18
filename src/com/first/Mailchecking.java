package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mailchecking {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("techprem25@gmail.com");
		
		
		
	}

}
