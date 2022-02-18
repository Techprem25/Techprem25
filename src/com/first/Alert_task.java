package com.first;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tchprem\\eclipse-workspace\\Seleniun_Tools\\Driver\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		
		//enter url
		search.sendKeys("www.automationdemosite.com");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		//click to register
		driver.findElement(By.xpath("//h3[text()='Register']")).click();
		
		//click switchTo button
		driver.findElement(By.xpath("//*[text()='SwitchTo']")).click();
		Thread.sleep(2000);
		//click alert with ok button
		WebElement a = driver.findElement(By.xpath("(//a[@style='color: white'])[1]"));
		a.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		
		//click alert with ok & cancel
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		
		//click alert Textbox 
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.getText();
		System.out.println("premkumar");
		
		driver.switchTo().alert().accept();
		
}
}
