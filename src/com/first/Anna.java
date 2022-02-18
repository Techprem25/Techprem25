package com.first;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anna {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tchprem\\eclipse-workspace\\Seleniun_Tools\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		// maximize of the window
		driver.manage().window().maximize();
		// waiting for the seconds
		Thread.sleep(3000);
		// open another web sites
		driver.navigate().to("https://www.hp.com/");
		// back to the web site
		driver.navigate().back();
		Thread.sleep(2000);
		// forward to the website
		driver.navigate().forward();
		// minimize the window
		Dimension prem = new Dimension(400, 600);
		driver.manage().window().setSize(prem);

		// refresh of the window
		driver.navigate().refresh();
		// print title
		String title = driver.getTitle();
		System.out.println(title);
		// print url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		// print sourcecode
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}
}
