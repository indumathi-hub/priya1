package org.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A {
	static WebDriver driver;
	@BeforeClass
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\TestNG\\TestNG\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
 	}
	@BeforeMethod
	public void start()
	{
		Date d=new Date();
		System.out.println(d);
		System.out.println(d);

	}
	@Test
	public void func2()
	{
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("indumathi@gamil.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("indumathi");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
	}
	@Test
	public void func()
	{
		driver.navigate().refresh();
	}
	
	@Test(priority=-17)
	public void func1()
	{
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("indumathi@yahoo.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("indumathi123456");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
	}
	@AfterMethod()
	public void end()
	{
		Date d=new Date();
		System.out.println(d);	
	}
	@AfterClass
	public void close()
	{
		driver.quit();
	}
	

}
