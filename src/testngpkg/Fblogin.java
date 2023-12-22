package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fblogin {
	
	ChromeDriver driver;
	@BeforeTest
	public void setUP()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
    @Parameters({"email","password"})
	@Test
	public void test(String email,String password)//email and passwordil ulla value test ilot kittan 
	{
		
		driver.findElement(By.name("email")).sendKeys(email);//email ulla content aanu veendath.athond sendkeysil emailnu double quote veenda
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
}
