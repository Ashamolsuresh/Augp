package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Doubleandrightclick {
	
String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
ChromeDriver driver;


@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);

}


@Test
public void test()
{
	
Actions act=new Actions(driver);
WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]"));
act.contextClick(right).perform();
driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
}
}
