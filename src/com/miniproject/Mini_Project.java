package com.miniproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com./");
		driver.manage().window().maximize();
		
		WebElement website = driver.findElement(By.name("q"));
		website.sendKeys("www.automationpractice.com" + Keys.ENTER);
		
		JavascriptExecutor ss = (JavascriptExecutor) driver;
		ss.executeScript("window.scrollBy(0,200);");
		ss.executeScript("window.scrollBy(0, -200);");

		WebElement automation = driver.findElement(By.partialLinkText("Automation Practice"));
		automation.click();
		
		WebElement sigin = driver.findElement(By.className("login"));
		sigin.click();
		ss.executeScript("window.scrollBy(0, 500);");
		
		WebElement mail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		mail.sendKeys("prem25@gmail.com");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		submit.click();
		Thread.sleep(4000);
		
		WebElement Tittle = driver.findElement(By.id("id_gender1"));
		Tittle.click();
		Thread.sleep(4000);
		
		WebElement firstname = driver.findElement(By.name("customer_firstname"));
		firstname.sendKeys("Premkumar");
		
		WebElement lastname = driver.findElement(By.name("customer_lastname"));
		lastname.sendKeys("M");
		Thread.sleep(4000);
		ss.executeScript("window.scrollBy(0,200);");
		
		WebElement pass = driver.findElement(By.name("passwd"));
		pass.sendKeys("Tech95@@@");

		WebElement days = driver.findElement(By.name("days"));
		Select day = new Select(days);
		day.selectByIndex(5);

		WebElement month = driver.findElement(By.name("months"));
		Select m = new Select(month);
		m.selectByIndex(5);

		WebElement year = driver.findElement(By.name("years"));
		Select y = new Select(year);
		y.selectByValue("1997");

		WebElement signin = driver.findElement(By.xpath("//label[@for='newsletter']"));
		signin.click();
		
		WebElement recive = driver.findElement(By.xpath("//label[@for='optin']"));
		recive.click();
		ss.executeScript("window.scrollBy(0,200);");
		


		WebElement company = driver.findElement(By.name("company"));
		company.sendKeys("prem software solution");
		
		WebElement add1 = driver.findElement(By.name("address1"));
		add1.sendKeys("3/255, bommalpatti,dharmapuri");
		
		WebElement add2 = driver.findElement(By.name("address2"));
		add2.sendKeys("3/255,Ammakovil steet,nallampallai,dpi");
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("dharmapuri");
		ss.executeScript("window.scrollBy(0,200);");
		
		WebElement postcode = driver.findElement(By.name("postcode"));
		postcode.sendKeys("63687");
		
		
		WebElement state = driver.findElement(By.name("id_state"));
		Select s = new Select(state);
		s.selectByVisibleText("California");
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select c = new Select(country);
		c.selectByIndex(1);
		
		WebElement additional = driver.findElement(By.id("other"));
		additional.sendKeys("1234567890");
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("9894722821");
		
		
		WebElement mobile = driver.findElement(By.id("phone_mobile"));
		mobile.sendKeys("7708308019");

		WebElement alise = driver.findElement(By.id("alias"));
		alise.sendKeys("Prem");
		
		WebElement submit1 = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
		submit1.click();
		
	

	}

}
