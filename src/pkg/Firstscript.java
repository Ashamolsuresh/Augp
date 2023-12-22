package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static  void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();//to launch browser
		                                       // application load cheiyanam.athinolle method ellam chrome driver classil define 
                                               // cheiythitind.then oru application load or open  cheiyan olla method aanu 'get'
	
	  driver.get("https://www.google.com");//to open a site
	  String exptitle="Google";//expected title
	  
	 String actualtitle=driver.getTitle();//store cheiyandath string il aanu.actual title
	 // then how to compare actual title and expected title.rand string compare cheiyan olla method use cheiyua ie,'equals()'
	 // case koode veendathukond equals() eduthu.
	 
	 System.out.println("title="+actualtitle);//actual title ntha kittunnath enn print cheiyanonki engane cheiyua
	 
	 if(actualtitle.equals(exptitle))
	 {
		 
		 System.out.println("pass");
	 }
	 
	 else
	 {
		 
		 System.out.println("fail");
	 }
	 
	}

}
