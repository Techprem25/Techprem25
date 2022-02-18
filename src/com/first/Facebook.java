package com.first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tchprem\\eclipse-workspace\\Seleniun_Tools\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create.click();
		Thread.sleep(1000);
		WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys("premkumar");

		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("M");

		WebElement mail = driver.findElement(By.name("reg_email__"));
		mail.sendKeys("techprem25@gmail.com");

		WebElement reemail = driver.findElement(By.name("reg_email_confirmation__"));
		reemail.sendKeys("techprem25@gmail.com");

//		WebElement pass = driver.findElement(By.name("reg_passwd__"));
//		pass.sendKeys("tech25@@@");

		WebElement pass = driver.findElement(By.id("password_step_input"));
		pass.sendKeys("tech25@@@");

		WebElement date = driver.findElement(By.id("day"));
		date.sendKeys("5");

		WebElement month = driver.findElement(By.id("month"));
		month.sendKeys("April");
		
		WebElement year = driver.findElement(By.id("year"));
		year.sendKeys("1997");
		
		WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		gender.click();
		
		WebElement signup = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		signup.click();
		
		Thread.sleep(1000);
        WebElement otp = driver.findElement(By.xpath("//input[@class='inputtext _9o1w _9o1_']"));
		otp.sendKeys("685046");
		otp.click();
		WebElement cont = driver.findElement(By.xpath("//button[@type='submit']"));
		cont.click();

}
}