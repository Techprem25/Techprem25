package com.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.first.Action;

public class Mini_Project2 {
	public static void main(String[] args) throws IOException   {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com./");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("www.automationpractice.com" + Keys.ENTER);
		
		
		JavascriptExecutor ss = (JavascriptExecutor) driver;
		ss.executeScript("window.scrollBy(0,200);");
		ss.executeScript("window.scrollBy(0, -200);");
	
		WebElement clikautomation = driver.findElement(By.partialLinkText("Automation Practice"));
		clikautomation.click();
		
		WebElement login = driver.findElement(By.className("login"));
		login.click();
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("prem25cse@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Tech95@@@");
		
	
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		submit.click();
		
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		tshirt.click();
		driver.navigate().back();
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		women.click();
		ss.executeScript("window.scrollBy(0,200);");
		ss.executeScript("window.scrollBy(0,700);");
		
		WebElement pt = driver.findElement(By.id("selectProductSort"));
		Select n =new Select(pt);
		n.selectByIndex(2);
		ss.executeScript("window.scrollBy(0,700);");
		
		WebElement chosedress = driver.findElement(By.xpath("(//img[@title='Printed Dress'])[1]"));
		chosedress.click();
	
		WebElement f = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(f);
		
		WebElement q = driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]"));
		q.clear();
		q.sendKeys("4");
		
		WebElement sel = driver.findElement(By.id("group_1"));
		Select b1=new Select(sel);
		b1.selectByIndex(2);
		driver.navigate().to("http://automationpractice.com/index.php?id_product=1&controller=product#/color-blue/size-m");

		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\'add_to_cart\']/button/span"));
		addtocart.click();
		
		WebElement layer = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/child::span"));
		layer.click();
		
		
		WebElement proceedtocheckout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceedtocheckout.click();
	
		WebElement con1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		con1.click();
		
		
		WebElement a = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		a.click();
		
	
		WebElement b = driver.findElement(By.xpath("//*[@id=\"order\"]/div[2]/div/div/a"));
		b.click();

		WebElement c = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		c.click();

		WebElement d = driver.findElement(By.xpath("//*[@id=\"order\"]/div[2]/div/div/a"));
		d.click();

		
		WebElement e = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		e.click();

		WebElement submit2 = driver.findElement(By.xpath("//*[@id=\"order\"]/div[2]/div/div/a"));
		submit2.click();
		
	
		
		WebElement cgv = driver.findElement(By.id("cgv"));
		cgv.click();
	
		
		WebElement g = driver.findElement(By.name("processCarrier"));
		g.click();
		ss.executeScript("window.scrollBy(0,700);");
	
		
		WebElement h = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
		h.click();
	
		ss.executeScript("window.scrollBy(0,700);");
		WebElement j = driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span"));
		j.click();
		
//		TakesScreenshot sc21=(TakesScreenshot)driver;
//		File src21= sc21.getScreenshotAs(OutputType.FILE);
//		File dest21=new File("C:\\Users\\tchprem\\eclipse-workspace\\Seleniun_Tools\\sreenshot\\x.png");
//		FileUtils.copyFile(src21, dest21);
//		
		driver.close();

		

	}
}
