package com.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_locaters {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com./");
		driver.findElement(By.name("q")).sendKeys("www.leafground.com" + Keys.ENTER);
		driver.findElement(By.partialLinkText("TestLeaf - Selenium ")).click();

		driver.findElement(By.xpath("//h5[text()='Drop down']")).click();
		// single dropdown
		WebElement singledropdown = driver.findElement(By.id("dropdown1"));
		Select single = new Select(singledropdown);
		single.selectByIndex(1);
		single.selectByValue("3");
		single.selectByVisibleText("Loadrunner");
		singledropdown.sendKeys("selenium");
		// multiple dropdown
		WebElement multi = driver.findElement(By.xpath("//select[@multiple]"));
		Select multiple = new Select(multi);
		multiple.selectByIndex(1);
		multiple.selectByValue("2");
		multiple.selectByVisibleText("Loadrunner");
		
//get options
		List<WebElement> options = multiple.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		System.out.println("-------------");
//get all options
		List<WebElement> allSelectedOptions = multiple.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());}
	System.out.println("==================");	
	WebElement firstSelectedOption = multiple.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
	
	multiple.deselectAll();
	driver.close();
	
	}
}