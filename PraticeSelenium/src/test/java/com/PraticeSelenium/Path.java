package com.PraticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Path {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.xpath("//input[@id='search2']")).sendKeys("java Tutorial");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.id("tnb-google-search-input")).sendKeys("colletions");
		driver.findElement(By.id("tnb-google-search-submit-btn")).click();
		driver.findElement(By.xpath("//a[@tabindex='0'] and [@target='_blank']"));
		
	}

}
