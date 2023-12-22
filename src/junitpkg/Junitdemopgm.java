package junitpkg;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemopgm {
	
	ChromeDriver driver;//globally 1 st thanne chromedriver declare cheiythu.bcoz driver nn paryane variable ella methodlum use cheiya
	
	String baseurl="https://www.google.com"; //url pass cheiythu
	
	@Before  //pre condition
	public void setUp()
	{
		
		 driver=new ChromeDriver();
		 driver.get(baseurl); //then url string evide pass cheiyua ie,direct url evide kodukkunnenu pakaram oru url referenceil
		                        // store cheiythu.bcoz again evide enkilum url kodukkanamenkil athinte aa reference mathrem koduthathi
	                            // link pinnem pinnem kodukkanda.updations vannalum ath referenceil cheiytha mathi.
	
	}                             
	
//must aayitum	'@test' annotation veenam.enkile pgm run cheiyan pattolu.
	
	@Test // oru classil thanne multiple @test kodukkan pattum
	
	public void test()
	{
		String exptitle="Google";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(exptitle))
		{
			
			System.out.println("pass");
		}
		else
		{
			
			System.out.println("fail");
		}
		
	}


@After
public void tearDown()
{
	
	driver.quit();
	
}




	
	
}

