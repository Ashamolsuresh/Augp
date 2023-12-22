package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	
	ChromeDriver driver;
	
	String baseurl="https://www.facebook.com";
	
@Before
	public void setUp()
	{
		
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
@Test
public void fbtest()
{

driver.findElement(By.id("email")).sendKeys("abc@gmail.com");//how to pass values in selenium that is 'sendKeys()'.then sendKeys()
                                                            //string il mathreve support cheiyuvollu.

//ethreyum run cheiyumbol thanne  facebook load cheiyum ,emailnn parayane field locate cheiyum,then values pass cheiyum	


driver.findElement(By.id("pass")).sendKeys("a29");
driver.findElement(By.name("login")).click();// 'login' ennparyane button aayathukond sendkeys nu pakaram click aanu kodukkendath

}
	

		
	
	
}
