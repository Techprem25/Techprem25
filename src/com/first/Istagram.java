package com.first;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Istagram {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		
		WebElement name = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		name.sendKeys("techprem25@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		pass.sendKeys("tech95@@@");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(5000);
		
		//typecasting //narrowing
		TakesScreenshot pk=(TakesScreenshot) driver;
		File prem=pk.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\tchprem\\eclipse-workspace\\Seleniun_Tools\\sreenshot\\insta.png");
		
		FileUtils.copyFile(prem, dest);
		WebElement fb = driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
		fb.click();
		WebElement fbid = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		fbid.sendKeys("7708308019");
		WebElement pas = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pas.sendKeys("premji");
		WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
		log.click();
		
		
		
		
		
		
		
		
		
		
		
	}
}
