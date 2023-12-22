package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoexercise {

	ChromeDriver driver;
	
	String baseurl="https://automationexercise.com/login";
	
@BeforeTest
	public void setUp()
	{
		
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
@Test
public void rtest()
{
    WebElement signup=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
    signup.click();
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("asha");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("ashasuresh900@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
	WebElement radiobtn2=driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
    radiobtn2.click();
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("bb12");
	WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
	Select sel=new Select(day);
	sel.selectByValue("29");
	WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
	Select sel1=new Select(month);
	sel1.selectByValue("may");
	WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
	Select sel2=new Select(year);
	sel2.selectByValue("1998");
	
	
	

}

}
