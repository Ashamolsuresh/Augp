package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlevaluepass {
	
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}

@Test
public void gtest()
{
//driver.findElement(By.name("q")).sendKeys("cat"); // evide eppo cat nn ollath type cheiyth verolu.nammuk search aanu cheiyendath
	                                                    // so avide search button click cheiyanam allenki enter cheiyanam
	
	//driver.findElement(By.name("btnk")).click();// click vechit cheiyumbo error verum.so nammal 'keys.ENTER' use cheiyuka.
	//driver.findElement(By.name("q")).sendKeys("cat",Keys.ENTER);
	
//second ways without using keys.enter
	
	WebElement searchbutton=driver.findElement(By.name("q"));// first element ne find cheiyuka.vere actions onnum cheiyanilla.find cheiyth return kitunnath
                                     // oru reference il store cheiyum.appo reference nte type 'web element aayirikum.ie, evide oru' 
                                     // element ne find cheiythanu store cheiyunnath so we use the type 'webelement'
                                     // searchbutton weblement nte reference aanu. ee searchbuttonil loacte cheiyande details store 
                                     // cheiythitund
	searchbutton.sendKeys("cat");
    searchbutton.submit();
   

}                                  


}
//second way paranjath enthinann vechal.oru element nte store cheiyuan use cheiyunnatha 'webelement' aanenn parayan