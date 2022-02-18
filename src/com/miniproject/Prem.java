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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prem {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com./");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("www.automationpractice.com" + Keys.ENTER);
		JavascriptExecutor ss = (JavascriptExecutor) driver;
		ss.executeScript("window.scrollBy(0,200);");
		ss.executeScript("window.scrollBy(0, -200);");
		
		driver.findElement(By.partialLinkText("Automation Practice")).click();
		
	
		driver.findElement(By.className("login")).click();
		
		ss.executeScript("window.scrollBy(0, 500);");
		
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("premji25cs96@gmail.com");
		WebElement creataccount = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		creataccount.click();
		Thread.sleep(5000);
		
		WebElement Tittle = driver.findElement(By.id("id_gender1"));
		Tittle.click();
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("premkumar");
		
		driver.findElement(By.name("customer_lastname")).sendKeys("M");
		ss.executeScript("window.scrollBy(0,200);");
		driver.findElement(By.name("passwd")).sendKeys("Tech95@@@");
		
		WebElement days = driver.findElement(By.name("days"));
		Select day = new Select(days);
		day.selectByIndex(5);

		WebElement month = driver.findElement(By.name("months"));
		Select m = new Select(month);
		m.selectByIndex(5);

		WebElement year = driver.findElement(By.name("years"));
		Select y = new Select(year);
		y.selectByValue("1997");

		
		driver.findElement(By.xpath("//label[@for='newsletter']")).click();
		driver.findElement(By.xpath("//label[@for='optin']")).click();
		ss.executeScript("window.scrollBy(0,200);");

		driver.findElement(By.name("company")).sendKeys("prem software solution");
		driver.findElement(By.name("address1")).sendKeys("3/255, bommalpatti,dharmapuri");
		driver.findElement(By.name("address2")).sendKeys("3/255,Ammakovil steet,nallampallai,dpi");
		driver.findElement(By.name("city")).sendKeys("dharmapuri");
		ss.executeScript("window.scrollBy(0,200);");
		
		driver.findElement(By.name("postcode")).sendKeys("63687");
		WebElement state = driver.findElement(By.name("id_state"));
		Select s = new Select(state);
		
		s.selectByVisibleText("California");
		WebElement country = driver.findElement(By.id("id_country"));
		Select c = new Select(country);
		c.selectByIndex(1);

		driver.findElement(By.id("other")).sendKeys("1234567890");
		driver.findElement(By.name("phone")).sendKeys("9894722821");
		driver.findElement(By.id("phone_mobile")).sendKeys("7708308019");

		driver.findElement(By.id("alias")).sendKeys("Prem");
	
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		// navigate
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
		TakesScreenshot sc14=(TakesScreenshot)driver;
		File src14= sc14.getScreenshotAs(OutputType.FILE);
		File dest14=new File("C:\\Users\\tchprem\\eclipse-workspace\\Seleniun_Tools\\Sshot\\o.png");
		FileUtils.copyFile(src14, dest14);
		
		driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();
		
		TakesScreenshot sc15=(TakesScreenshot)driver;
		File src15= sc15.getScreenshotAs(OutputType.FILE);
		File dest15=new File("C:\\Users\\tchprem\\eclipse-workspace\\Seleniun_Tools\\Sshot\\p.png");
		FileUtils.copyFile(src15, dest15);
		
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		Thread.sleep(3000);
		ss.executeScript("window.scrollBy(0,200);");
		ss.executeScript("window.scrollBy(0,700);");
		
		TakesScreenshot sc16=(TakesScreenshot)driver;
		File src16= sc16.getScreenshotAs(OutputType.FILE);
		File dest16=new File("C:\\Users\\tchprem\\eclipse-workspace\\Seleniun_Tools\\Sshot\\q.png");
		FileUtils.copyFile(src16, dest16);

		WebElement pt = driver.findElement(By.id("selectProductSort"));
		Select n = new Select(pt);
		n.selectByIndex(2);
		ss.executeScript("window.scrollBy(0,700);");
		
		TakesScreenshot sc17=(TakesScreenshot)driver;
		File src17= sc17.getScreenshotAs(OutputType.FILE);
		File dest17=new File("C:\\Users\\tchprem\\eclipse-workspace\\Seleniun_Tools\\Sshot\\r.png");
		FileUtils.copyFile(src17, dest17);
		
		driver.findElement(By.xpath("(//img[@title='Printed Dress'])[1]")).click();
		
		TakesScreenshot sc18=(TakesScreenshot)driver;
		File src18= sc18.getScreenshotAs(OutputType.FILE);
		File dest18=new File("C:\\Users\\tchprem\\eclipse-workspace\\Seleniun_Tools\\Sshot\\s.png");
		FileUtils.copyFile(src18, dest18);
		
		WebElement f = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(f);
		WebElement q = driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]"));
		q.clear();
		q.sendKeys("4");
		WebElement sel = driver.findElement(By.id("group_1"));
		Select b = new Select(sel);
		b.selectByIndex(2);
		
		TakesScreenshot sc19=(TakesScreenshot)driver;
		File src19= sc19.getScreenshotAs(OutputType.FILE);
		File dest19=new File("C:\\Users\\tchprem\\eclipse-workspace\\Seleniun_Tools\\Sshot\\t.png");
		FileUtils.copyFile(src19, dest19);
		
		driver.navigate()
				.to("http://automationpractice.com/index.php?id_product=1&controller=product#/color-blue/size-m");
		driver.findElement(By.xpath("//*[@id=\'add_to_cart\']/button/span")).click();
		Thread.sleep(2000);
		TakesScreenshot sc20=(TakesScreenshot)driver;
		File src20= sc20.getScreenshotAs(OutputType.FILE);
		File dest20=new File("C:\\Users\\tchprem\\eclipse-workspace\\Seleniun_Tools\\Sshot\\u.png");
		FileUtils.copyFile(src20, dest20);
		
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/child::span")).click();
		
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		
		
		//driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\'order\']/div[2]/div/div/a")).click();
		
		
		driver.findElement(By.name("cgv")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		
		driver.findElement(By.xpath("//a[@title='Pay by check.']")).click();
		ss.executeScript("window.scrollBy(0,700);");
		
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
	
	}}
