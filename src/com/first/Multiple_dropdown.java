package com.first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//get google
		driver.get("https://www.google.com/");
//search leafground
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("www.leafground.com"+Keys.ENTER);
// click google search
	//	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
// select first option
		driver.findElement(By.xpath("//h3[text()='Selenium Playground: TestLeaf']")).click();
		driver.manage().window().maximize();
// click  image option
		driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
// selectAll multiple 6th
		WebElement mul = driver.findElement(By.xpath("//select[@multiple]"));
// select object
		Select s = new Select(mul);

		s.selectByValue("1");
		s.selectByValue("2");
		s.selectByValue("3");
		s.selectByValue("4");
// deselect  
		s.deselectByIndex(2);
		s.deselectByIndex(4);

		WebElement f = s.getFirstSelectedOption();
		System.out.println(f.getText());
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement refname : all) {
			System.out.println(refname.getText());

		}

		//driver.quit();
	}

}
