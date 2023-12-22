package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hardassertpgm {

	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		
		driver =new ChromeDriver();//to launch driver
		driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		String exptitle="googl";
		String actualtitle=driver.getTitle();
		System.out.println("title="+actualtitle);
		Assert.assertEquals(actualtitle, exptitle);
		System.out.println("title verified");
		
		
		
	}
		
		
	}

