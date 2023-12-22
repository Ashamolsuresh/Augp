package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Redifflogo {

	ChromeDriver driver;
	@BeforeTest
	public void setUP()
	{
		
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
@Test
public void rtest()
{
	
WebElement logo=driver.findElement(By.xpath("//*[@title='Rediff.com']"));
if(logo.isDisplayed())
{
System.out.println("logo is present");	

}
else
{
	System.out.println("logo is not present");
}


}	

}



