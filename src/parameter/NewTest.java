package parameter;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class NewTest {
 WebDriver driver;
  @BeforeMethod
  public void launch() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	   driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
	  
  }
  @Test(dataProvider="loginSite")
  public void fetchdata(String user,String pwd) {
	  
	  WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement pswd=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement button=driver.findElement(By.xpath("//input[@id='login-button']"));
		username.sendKeys(user);
		pswd.sendKeys(pwd);
		button.click();
  }
  
  
  



  @DataProvider(name="loginSite")
  public Object[][] getData() 
  {
    return new Object[][] {{"standard_user","secret_sauce"},
    					   {"locked_out_user","secret_sauce"},
    					   {"problem_user","secret_sauce"}
    					};
  }
  
  
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
  }
 
}
