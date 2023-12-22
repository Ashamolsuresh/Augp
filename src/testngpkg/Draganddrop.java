package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {

	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	ChromeDriver driver;
	@BeforeTest
	public void  setUp()
	{
		
		driver=new ChromeDriver();
		driver.get(baseurl);	
	}

    @Test
    public void test()
    {
    	
    	
    	WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
    	WebElement debitamt=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
    	WebElement debitant=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
    	WebElement amt1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
    	WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
    	WebElement creditamt=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
    	WebElement creditant=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
    	WebElement amt2=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
        Actions act=new Actions(driver);
    	act.dragAndDrop(bank,debitant).perform();
    	act.dragAndDrop(debitamt,amt1).perform();
    	act.dragAndDrop(sales,creditant).perform();
    	act.dragAndDrop(creditamt,amt2).perform();
    	WebElement button=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
    	if(button.equals("perfect!"))
    	{
    		
    		System.out.println("true");
    	}
    	
    }
	
}
