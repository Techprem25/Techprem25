package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locaters_instagram
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("www.instagram.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[@value='Google Search'])[1]")).click();
		driver.findElement(By.xpath("(//*[text()='Instagram'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='sign-up-link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys("9894722821");
		driver.findElement(By.xpath("//input[@aria-label='Full Name']")).sendKeys("Premji");
		driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("Thalaprem25");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Tech95@@@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(3000);
		//dropdown
		WebElement month = driver.findElement(By.xpath("//select[@title='Month:']"));
		Select s =new  Select(month);
		//s.selectByVisibleText("January");
		//s.selectByIndex(4);
		s.selectByValue("4");
		WebElement date = driver.findElement(By.xpath("//select[@title='Day:']"));
		Select d =new Select(date);
		d.selectByIndex(4);
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year:']"));
		Select y= new Select(year);
		y.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		
	}
	
}
