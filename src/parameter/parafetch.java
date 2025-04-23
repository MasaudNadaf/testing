package parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parafetch {
  @Test
  @Parameters({"User","Pass"})
  public void fetchdata(String User,String Pass) {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement pswd=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement button=driver.findElement(By.xpath("//input[@id='login-button']"));
		username.sendKeys(User);
		pswd.sendKeys(Pass);
		button.click();
		
		
  }
}
