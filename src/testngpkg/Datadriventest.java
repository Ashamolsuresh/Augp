package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {

	WebDriver driver;
	@BeforeTest
	public void beforetest()
	{
		
		driver=new ChromeDriver();
		
	}
   @Test
   public void test()
   {
	   
	   
	   
   }

}
