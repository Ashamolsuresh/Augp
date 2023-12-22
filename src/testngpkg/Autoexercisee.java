package testngpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoexercisee {
	
	ChromeDriver driver;
	String url="https://automationexercise.com/";

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test(priority=2)
	public void autotst()
	{     
		//signup
		
		driver.findElement(By.xpath(" //*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Asha");
		driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("ashasuresh900@gmail.com");
		driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		
		//account info
		
		driver.findElement(By.xpath(" //*[@id=\"id_gender2\"]")).click();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("aa@1234");
		WebElement Days = driver.findElement(By.xpath("//*[@id='days']"));
		Select day = new Select(Days);
		day.selectByIndex(21);
		WebElement Month=driver.findElement(By.xpath("//*[@id='months']"));
		Select month = new Select(Month);
		month.selectByIndex(9);
		WebElement year = driver.findElement(By.xpath("//*[@id='years']"));
		Select yr = new Select(year);
		yr.selectByIndex(23);
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Asha");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("suresh");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("anthiyattu (H)");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("anthiyattu (H)");
		 WebElement Country =driver.findElement(By.xpath(" //*[@id=\"country\"]"));
		  Select country =new Select (Country);
	      country.selectByIndex(0);
	      driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
	      driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("idukki");
	      driver.findElement(By.xpath(" //*[@id=\"zipcode\"]")).sendKeys("685563");
	      driver.findElement(By.xpath(" //*[@id=\"mobile_number\"]")).sendKeys("7034672077");
	      driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div/div[1]/form/button")).submit();
	}
	@Test(priority=1)
	public void logintest()
	{
		driver.findElement(By.xpath(" //*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div/div[1]/form/button"));
		driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button "));
		
		
		
		String exptdurl=" https://automationexercise.com/";
		String currenturl=driver.getCurrentUrl();
		
		if(currenturl.equals(exptdurl))
		{
			System.out.print("currenturl");
		}
		
		else
		{
			System.out.println("url is different");
			System.out.println("Actual url is "+currenturl);
			
		}
		
	}
}

