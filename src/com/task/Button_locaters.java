package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_locaters {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com./");
		driver.findElement(By.name("q")).sendKeys("www.leafground.com"+ Keys.ENTER);
		driver.findElement(By.partialLinkText("TestLeaf - Selenium ")).click();
		driver.findElement(By.linkText("Button")).click();
		//get position
		WebElement getposition = driver.findElement(By.id("position"));
		Point xylocation = getposition.getLocation();
		int x = xylocation.getX();
		int y = xylocation.getY();
		System.out.println("x value is:"+ x+"\ny value is:"+y);
		//find color
		WebElement colorButton = driver.findElement(By.id("color"));
		String cssValue = colorButton.getCssValue("background-color");
		System.out.println("button color is:"+cssValue);
		//find button size
		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("hight is:"+height+"\nwidth is:"+width);
		//find the home
		WebElement home1 = driver.findElement(By.id("home"));
		home1.click();
	}

}
