package ng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class asserttype {
	
  @Test
  public void Login() 					
  {	System.setProperty("webdriver.chrome.driver","C:\\Users\\mas\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
   		
      		
      //Creating the JavascriptExecutor interface object by Type casting		
      JavascriptExecutor js = (JavascriptExecutor)driver;		
      		
      //Launching the Site.		
      driver.get("http://demo.guru99.com/V4/");			
      		
      WebElement button =driver.findElement(By.name("btnLogin"));			
      		
      //Login to Guru99 		
      driver.findElement(By.name("uid")).sendKeys("mngr418676");					
      driver.findElement(By.name("password")).sendKeys("ezytAdE");					
      		
      //Perform Click on LOGIN button using JavascriptExecutor		
      js.executeScript("arguments[0].click();", button);
                              
      //To generate Alert window using JavascriptExecutor. Display the alert message 			
      js.executeScript("alert('Welcome to Guru99');");   
  		
}}
