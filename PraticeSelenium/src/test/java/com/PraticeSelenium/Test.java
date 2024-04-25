package com.PraticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://youtu.be/8FOG4vhc8q8?si=wnIz6kjlRWCKlibU");
	}

}
