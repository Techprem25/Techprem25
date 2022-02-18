package com.first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium_Tools\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='Table']")).click();
		List<WebElement> p = driver.findElements(By.tagName("th"));
		int s = p.size();
		System.out.println("No.of Column:  "+s);
		WebElement r = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact using Keyboard, Actions']"));
		System.out.println(r.getText());
		WebElement persentage = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[4]/td[2]"));
		String text = persentage.getText();
		System.out.println("persentage is:  "+text);
		WebElement ol = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[4]"));
		System.out.println(ol.getText());
		WebElement all = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]"));
		System.out.println();
		System.out.println(all.getText());
	
	
	}

}
