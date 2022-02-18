package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Email {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		Thread.sleep(1000);
		driver.get("https://www.google.com/");   
		Thread.sleep(1000);
		WebElement dont = driver.findElement(By.className("M6CB1c rr4y5c"));
		dont.click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("www.gmail.com");
	
		
//		WebElement gm = driver.findElement(By.xpath("//a[text() ='Gmail - Email from Google']"));
//       gm.click();
//       Thread.sleep(1000);
//       WebElement id = driver.findElement(By.id("identifierId"));
//       id.sendKeys("techprem25@gmail.com");
       
       
       
       
       
       
	}
	

}
