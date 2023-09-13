package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	

	   public static WebDriver driver;
 
	public static WebDriver browserLaunch() {
 	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
 public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
 
public static void implicitwait(int sec) {
	   driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	
}
 
public static void SendKeys(WebElement e,String value) {
	   e.sendKeys(value);
	   
}
public static void click(WebElement e) {
	   e.click();
	
}
public static String currenturl() {
	   
	   String currentUrl = driver.getCurrentUrl();
	return currentUrl;
} 

public static String gettitle() {
	String title = driver.getTitle();
	return title;
}
public static void quit() {
  driver.quit();	
}


}
