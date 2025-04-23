package parellelexcu;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Testmethod {
	
	WebDriver driver;

 
	
  @Test
  public void test1() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
	 driver.get("https://www.google.com/");
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     WebElement search=driver.findElement(By.name("q"));
     search.sendKeys("facebook");
    driver.quit();
	  
  }
  
  @Test
  public void test2() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\mas\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  WebElement search=driver.findElement(By.name("q"));
	     search.sendKeys("insta");
	     driver.quit();
  }	

}
