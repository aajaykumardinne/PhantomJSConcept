package com.qa.phantom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomHeadlessBrowser {

	public static void main(String[] args) throws InterruptedException {
		
//	  phantomJSdriver internally uses ghost driver
//    ghostdriver--->>> is used as JSON wire protocol -- HTTP REST calls
//    headless browser testing:
//    no browser will be launched.
//    testing is happening behind the scene.
//     its very fast.
//    it directly interacts with your app HTML DOM.
		
		
		System.setProperty("phantomjs.binary.path", "D:\\phantomjs-2.1.1-windows\\bin/phantomjs.exe");
		
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://classic.freecrm.com/");
		
		
		String title = driver.getTitle();
		System.out.println("Title before login --->>> " + title);
		
		
		// login code:
		driver.findElement(By.name("username")).sendKeys("aajaykumardinne");
		driver.findElement(By.name("password")).sendKeys("Meat@2050");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		System.out.println("after login,title is:==== " + driver.getTitle());
		

	}

}
