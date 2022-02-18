package com.firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_practiceCA {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize(); 
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("www.automationpractice.com"+ Keys.ENTER);
		
		WebElement website = driver.findElement(By.partialLinkText("Automation Practice"));
		website.click();
		
		WebElement sigin = driver.findElement(By.className("login"));
		sigin.click();
		
		WebElement entermailid = driver.findElement(By.name("email_create"));
		entermailid.sendKeys("prem22cse@gmail.com"+Keys.ENTER);
		
		WebElement createaccount = driver.findElement(By.name("SubmitCreate"));
		createaccount.click();
		Thread.sleep(5000);
		
		WebElement title = driver.findElement(By.className("radio"));
		title.click();
		
		WebElement firstname = driver.findElement(By.name("customer_firstname"));
		firstname.sendKeys("Premkumar");
		
		WebElement lastname = driver.findElement(By.name("customer_lastname"));
		lastname.sendKeys("M");
		Thread.sleep(4000);
		
		JavascriptExecutor srd= (JavascriptExecutor) driver;
		srd.executeScript("window.scrollBy(0,200);");
		WebElement pass = driver.findElement(By.name("passwd"));
		pass.sendKeys("Tech95@@@)");
		
		WebElement checkbox = driver.findElement(By.className("checker"));
		checkbox.click();
		
		WebElement check = driver.findElement(By.id("uniform-optin"));
		check.click();
		
		WebElement days = driver.findElement(By.name("days"));
		Select s= new Select(days);
		s.selectByIndex(5);
		
		WebElement month = driver.findElement(By.name("months"));
		Select s1= new Select(month);
		s1.selectByValue("4");
		
		WebElement year = driver.findElement(By.name("years"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1997  ");
		
		srd.executeScript("window.scrollBy(0,500);");
		
		WebElement company = driver.findElement(By.name("company"));
		company.sendKeys("IBM"+Keys.ENTER);
		
		WebElement addrss = driver.findElement(By.name("address1"));
		addrss.sendKeys("3/255, kadathikuttai, newyark,US,10002."+Keys.ENTER);
		 
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("new yark");
		
		WebElement state = driver.findElement(By.name("id_state"));
		Select s3= new  Select(state);
		s3.selectByIndex(32);
		
		WebElement postcode = driver.findElement(By.name("postcode"));
		postcode.sendKeys("10001");
		srd.executeScript("window.scrollBy(0,500);");
		
		WebElement additional = driver.findElement(By.name("other"));
		additional.sendKeys("Premkumar, 3/255, kadathikuttai, newyark,US,10002 .");
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("770000003");
		
		WebElement mobile = driver.findElement(By.name("phone_mobile"));
		mobile.sendKeys("7708308019");
		
		WebElement alise = driver.findElement(By.name("alias"));
		alise.sendKeys("IBM software solutions");
		
		WebElement register = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		register.click();
		
	}

}
