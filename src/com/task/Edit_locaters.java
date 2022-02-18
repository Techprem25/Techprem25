package com.task;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_locaters {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com./");
//type input for search after enter process= keys+ENTER
		driver.findElement(By.name("q")).sendKeys("www.leafground.com"+ Keys.ENTER);
//partial link text
	//	driver.findElement(By.partialLinkText("Selenium Playground")).click();
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3")).click();
		driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']")).click();
		driver.findElement(By.id("email")).sendKeys("techprem95@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("karthika");
		String val = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(val);
// two way xpath
		//driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		WebElement disenable = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		boolean enabled = disenable.isEnabled();
		System.out.println(enabled);
	}

}
