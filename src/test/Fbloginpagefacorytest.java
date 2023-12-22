package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpagefactory;



public class Fbloginpagefacorytest {

	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
   @Test
   public void testlogin()
   {
	   
	   
	   Fbloginpagefactory ob=new Fbloginpagefactory(driver);
	   ob.setvalues("bcd@gmail.com", "aabb");
	   ob.clickloginbtn();
   }
}
