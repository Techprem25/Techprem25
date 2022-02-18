package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Karthi2 {
	

	
		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			WebElement google = driver.findElement(By.xpath("//input[@type='text']"));
			google.sendKeys("Automationpractice");
			Thread.sleep(1000);
			WebElement search = driver.findElement(By.xpath("(//span[text()='automationpractice'])[1]"));
			search.click();
			WebElement click = driver.findElement(By.xpath("//h3[text()='Automation Practice']"));
			click.click();
			WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
			signin.click();

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");
			WebElement email = driver.findElement(By.id("email_create"));
			email.sendKeys("techprem25@gmail.com");
			WebElement creataccount = driver.findElement(By.xpath("//i[@class='icon-user left']"));
			creataccount.click();
			Thread.sleep(5000);
			
			WebElement Tittle = driver.findElement(By.id("id_gender1"));
			Tittle.click();
			WebElement firstname = driver.findElement(By.id("customer_firstname"));
			firstname.sendKeys("karthik");
			WebElement Lastname = driver.findElement(By.id("customer_lastname"));
			Lastname.sendKeys("surya");
			WebElement password = driver.findElement(By.id("passwd"));
			password.sendKeys("karthik2000");
			
			WebElement day = driver.findElement(By.id("days"));
			Select days = new Select(day);
			days.selectByValue("17");
			WebElement month = driver.findElement(By.id("months"));
			Select months = new Select(month);
			months.selectByValue("4");
			WebElement year = driver.findElement(By.id("years"));
			Select years = new Select(year);
			years.selectByValue("2000");
			WebElement Address = driver.findElement(By.id("address1"));
			Address.sendKeys("5/493-Nallampalli,Dharmapuri");
			WebElement city = driver.findElement(By.id("city"));
			city.sendKeys("Dharmapuri");
			WebElement state = driver.findElement(By.id("id_state"));
			Select states = new Select(state);
			states.selectByValue("14");
			WebElement code = driver.findElement(By.id("postcode"));
			code.sendKeys("63680");
			WebElement country = driver.findElement(By.id("id_country"));
			Select countrys = new Select(country);
			countrys.selectByIndex(1);
			driver.findElement(By.id("other")).sendKeys("8428618346");
			WebElement phone = driver.findElement(By.id("phone_mobile"));
			phone.sendKeys("9751378346");
			WebElement reference = driver.findElement(By.id("alias"));
			reference.sendKeys("Madhu");
			WebElement register = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
			register.click();
			//driver.close();

		}

	}



