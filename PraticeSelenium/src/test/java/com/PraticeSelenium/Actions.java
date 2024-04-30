package com.PraticeSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("7205903650");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("7205903650");
		Thread.sleep(2000);
    	driver.navigate().to("https://www.google.com/search?q=w3+schools&oq=w3+schools&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCTEwODU2ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
    	Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
	}

}
