package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonques {

	
	WebDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver = new ChromeDriver();
		
		
	}
 @Test
 public void test()
 {
	 
	 driver.get("https://www.amazon.com/");
	 //driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
	 driver.findElement(By.name("field-keywords")).sendKeys("mobilephones",Keys.ENTER);
 }
	 @Test
		public void titletest2()
		{
			boolean display=driver.findElement(By.xpath("https://www.amazon.com/s?k=mobile+phones&crid=ZQRV6F6ZD94F&sprefix=%2Caps%2C335&ref=nb_sb_ss_recent_1_0_recent")).isDisplayed();
			
			if(display)
			{
				System.out.println("displayed");
			}
			else
			{
				System.out.println("not displayed");
			}
		}
 }

