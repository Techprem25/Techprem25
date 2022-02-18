package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.server.handler.AcceptAlert;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("www.leafground.com");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("//h3[text()='Selenium Playground: TestLeaf']")).click();
		driver.findElement(By.xpath("//*[@alt='Alert'] ")).click();
		//to click alert
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box'] ")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		//switching the alert, as we can't inspect alert
		driver.switchTo().alert().sendKeys("I am Software Engineer");
		//getting the text form the prompt to console
		String text = driver.switchTo().alert().getText();
		System.out.println(text +"I am Software Engineer");
		
		driver.switchTo().alert().accept();
}
}