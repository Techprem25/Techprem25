package com.first;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AertDemo {
	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\tchprem\\eclipse-workspace\\Seleniun_Tools\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		//simple alert 
		driver.findElement(By.id("alertBox")).click();
		Alert simplealert = driver.switchTo().alert();
	    System.out.println(simplealert.getText());
	    Thread.sleep(2000);
	    simplealert.accept();
	    Thread.sleep(2000);
	    
	    //confirmation alert
		driver.findElement(By.id("confirmBox")).click();
		Alert confirmationalert = driver.switchTo().alert();
	    System.out.println(confirmationalert.getText());
	    Thread.sleep(2000);
	    confirmationalert.dismiss();
	    Thread.sleep(2000);
	
		System.out.println(driver.findElement(By.id("output")).getText());
		
		//prompt alert
		driver.findElement(By.id("promptBox")).click();
		Alert promptalert = driver.switchTo().alert();
	    System.out.println(promptalert.getText());
	    promptalert.sendKeys("premji");
	    Thread.sleep(2000);
	    promptalert.accept();
	    Thread.sleep(2000);
	
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.quit();
	}

}
