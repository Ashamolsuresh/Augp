package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingDemopgm {

	
	@BeforeTest
	public void setUP()
	{
		
		System.out.println("browseropen");
	}

@BeforeMethod
public void urlload()
{
	
  System.out.println("url loading");
  
}
@Test(priority=1,invocationCount=3)
public void test1()
{
	
System.out.println("test1");

}
@Test(priority=0,dependsOnMethods= {"test1"})
public void test2()
{
	
System.out.println("test2");
}
@AfterMethod
public void bfrmthd()
{
	
System.out.println("aftermethod");
}

@AfterTest
public void teatDown()
{
	System.out.println("browserclose");
}
}
