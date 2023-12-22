package pkg;

// Gmail nn parayane text indonn verify cheiythu nokuanu evide

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverification {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();//to launch browser
	driver.get("https://www.google.com");//site load cheiythu
	String src=driver.getPageSource();//ethilu nammal parayunna text indonn nokuka
	if(src.contains("Gmail"))//small letter g aane output kitilla.src nn kodukkanamnn ella ishtam olle name kodukkam
	{
		
		System.out.println("text is present");
	}
	
	else
	{
		
		
		System.out.println("not present");
		
	}
	
	driver.quit();//entire browser close cheiyan
	//driver.close();tab wise close cheiyanum

	}


}
