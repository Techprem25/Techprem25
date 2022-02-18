package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		WebElement Tshart = driver.findElement(By.partialLinkText("T-shirts"));
	Actions a =new Actions(driver);
	a.moveToElement(Tshart).build().perform();
	WebElement s = driver.findElement(By.xpath("//img[@itemprop='image']"));
	a.moveToElement(s).build().perform();
	a.click(s).build().perform();
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Current URL :"+ currentUrl);
	
	WebElement b = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
	a.moveToElement(b).build().perform();
	a.click(b).build().perform();

	}
}
