package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpagefactory {

	WebDriver driver;
	@FindBy(name="login")
	WebElement loginbutton;
	
	@FindBy(name="email")
	WebElement emailIdField;
	
	@FindBy(name="pass")
	WebElement pswd;
	
	
	public Fbloginpagefactory(WebDriver  driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
  
 public void clickloginbtn()
 {
	 
	 loginbutton.click();
 }

public void setvalues(String UN,String PWD)
{
	emailIdField.sendKeys(UN);
	pswd.sendKeys(PWD);
	
}

}

