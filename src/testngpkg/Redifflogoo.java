package testngpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Redifflogoo {

	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeMethod
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
				
	}
	
	@Test
	public void displaytest()
	{
		boolean display=driver.findElement(By.xpath("//*[@title='Rediff.com']")).isDisplayed();
		
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

