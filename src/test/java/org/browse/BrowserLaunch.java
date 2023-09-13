package org.browse;

import org.base.BaseClass;
import org.pom.RegisterFacebook;

public class BrowserLaunch extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		 
		browserLaunch();
		  //WebDriverManager.chromedriver().setup();
		  // WebDriver driver = new ChromeDriver();
		
		urlLaunch("https://www.facebook.com/");
		
	//	driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  implicitwait(10);
		
	//	  WebElement txtusername = driver.findElement(By.id("email"));
		RegisterFacebook r = new RegisterFacebook();
    
		click(r.getCna());
		
	     SendKeys(r.getFirstname(), "malar");
	     SendKeys(r.getLastname(),"selva");
	     SendKeys(r.getMobilenumber(), "8675121514");
	     SendKeys(r.getNewpassword(), "malar@58632");
	     SendKeys(r.getDay(), "15");
	     SendKeys(r.getMonth(),"jan");
	     SendKeys(r.getYear(), "1997");
	     click(r.getFemale());
	     click(r.getSignup());
	     

		//txtusername.sendKeys("saravanan");
		//WebElement txtpass = driver.findElement(By.id("pass"));
		
		//SendKeys(txtpass, "saravanan5863");
		//txtpass.sendKeys("saravanan5863");
	//	WebElement btn = driver.findElement(By.name("login"));

	//	click(btn);
	     
		String currenturl = currenturl();
		System.out.println(currenturl);
		
		String gettitle = gettitle();
		System.out.println(gettitle);

		
		
//		quit();
		//btn.click();
		
	}
	

}


