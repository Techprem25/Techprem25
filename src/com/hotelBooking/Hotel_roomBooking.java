
package com.hotelBooking;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;

public class Hotel_roomBooking{
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.name("q"));
		a.sendKeys("www.adactinhotelapp.com"+Keys.ENTER);
		WebElement b = driver.findElement(By.partialLinkText("Adactin Launches The Adactin Hotel App!"));
		b.click();
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Thalaprem"+Keys.ENTER);
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("Thala25");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		WebElement location = driver.findElement(By.name("location"));
		Select s = new Select(location);
		s.selectByIndex(6);
		
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByVisibleText("Hotel Sunshine");
		
		WebElement roomtype = driver.findElement(By.name("room_type"));
		Select s2 = new Select(roomtype);
		s2.selectByValue("Standard");
		
		WebElement roomno = driver.findElement(By.name("room_nos"));
		Select s3= new Select(roomno);
		s3.selectByIndex(1);
		
		WebElement checkdate = driver.findElement(By.name("datepick_in"));
		checkdate.sendKeys("28/01/2022");
		
		WebElement checkdate1 = driver.findElement(By.name("datepick_out"));
		checkdate1.sendKeys("14/02/2022");
		
		
		WebElement room = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(room);
		s4.selectByIndex(2);
		
		WebElement child = driver.findElement(By.name("child_room"));
		Select s5 = new Select(child);
		s5.selectByIndex(2);
		
		WebElement search = driver.findElement(By.name("Submit"));
		search.click();
		
		WebElement select = driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]"));
		select.click();
		
		WebElement con = driver.findElement(By.name("continue"));
		con.click();
		
		WebElement fname = driver.findElement(By.name("first_name"));
		fname.sendKeys("premkumar");
		 
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("madhaiyan");
		
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("3/255 nepolean street, newyark..");
		
		WebElement creditcard = driver.findElement(By.name("cc_num"));
		creditcard.sendKeys("34586007736356987");
		
		WebElement cardtype = driver.findElement(By.name("cc_type"));
		Select s6=new Select(cardtype);
		s6.selectByIndex(2);
		
		WebElement ExpiryDate = driver.findElement(By.name("cc_exp_month"));
		Select s7=new Select(ExpiryDate);
		s7.selectByIndex(4);
		
		WebElement ExpiryDate1 = driver.findElement(By.name("cc_exp_year"));
		Select s8=new Select(ExpiryDate1);
		s8.selectByIndex(11);
		
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("0455");
		
		WebElement book = driver.findElement(By.name("book_now"));
		book.click();
		
		JavascriptExecutor ss = (JavascriptExecutor) driver;
		ss.executeScript("window.scrollBy(0,1000);");
		
		TakesScreenshot sc=(TakesScreenshot)driver;
		File src= sc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Hotel\\a.png");
		FileUtils.copyFile(src, dest);
			}
}
