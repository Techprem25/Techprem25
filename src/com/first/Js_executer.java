package com.first;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_executer {
	private static final JavascriptExecutor JavascriptExecutor = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		JavascriptExecutor ss = (JavascriptExecutor) driver;
		ss.executeScript("window.scrollBy(0,6000);");
		Thread.sleep(3000);
		ss.executeScript("window.scrollBy(0,-6000);");
		ss.executeScript("window.scrollBy(0, 500);");
		driver.findElement(By.xpath(
				"//*[@id=\"container\"]/div/div[3]/div[3]/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/a/div[2]"))
				.click();
		
	}

}
