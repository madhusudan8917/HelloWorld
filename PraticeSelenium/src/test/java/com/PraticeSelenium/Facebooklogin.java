package com.PraticeSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();


		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		Thread.sleep(2000);
//		driver.findElement(By.id("email")).sendKeys("9010667163");
//		Thread.sleep(2000);
//		driver.findElement(By.id("pass")).sendKeys("9010667163");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("kumar");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("pikkili");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9010667163");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("901066");
		Thread.sleep(2000);

		// drop downs selected by create webelement
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));	
		//Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));	
		//Thread.sleep(2000);
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));	
		//Thread.sleep(2000);
		Select s = new Select(date);
		s.selectByValue("9");
		Thread.sleep(2000);
		Select sm = new Select(month);
		sm.selectByValue("5");
		Thread.sleep(2000);
		Select sy = new Select(year);
		sy.selectByValue("1996");
		Thread.sleep(2000);
		//		// radio button 

		//		WebElement radio = driver.findElement(By.xpath("//input[@name='sex']"));
		//		 radio.click();



		//		driver.findElement(By.xpath(" //input [@value='1']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath(" //input [@value='2']")).click();
		//		Thread.sleep(2000);
		driver.findElement(By.xpath(" //input [@value= -1]")).click();
		Thread.sleep(2000);
		//costum
		WebElement custom = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		Select c =new Select(custom);
		c.selectByValue("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label=\"Gender (optional)\"]")).sendKeys("male");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='u_7_2_Nu']")).click();
	}
}