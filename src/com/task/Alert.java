package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com./");
		driver.findElement(By.name("q")).sendKeys("www.leafground.com"+ Keys.ENTER);
		driver.findElement(By.partialLinkText("TestLeaf - Selenium ")).click();

		driver.findElement(By.xpath("//img[@alt='Alert']")).click();
		
		//simple alert
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
		
		 driver.switchTo().alert().accept();
		 //confirm alert
		 WebElement confirm_alert = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		confirm_alert.click();
		
		driver.switchTo().alert().dismiss();
		
//		//prompt alert
//		WebElement prompt = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
//		
//		prompt.click();
//		org.openqa.selenium.Alert alert = driver.switchTo().alert();
//		
//		alert.sendKeys("premji");
//		alert.accept();
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button")).click();
	org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
	Thread.sleep(2000);
	System.out.println(alert2.getText());
	alert2.sendKeys("karthika");
	alert2.accept();
;
		
		
		
		
}
}
