package test;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbcreatepage;

public class Fbcreatetest {

	
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
  
	@Test
	public void createtest()
	{
		
		Fbcreatepage ob1= new Fbcreatepage(driver);
		 ob1.pageclick();
		 ob1.getstarted();
		
	}
}
