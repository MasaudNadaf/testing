package parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Googledata {
	public class Googledataprovidre {
		

		WebDriver driver;
		
		@BeforeMethod
		public void launch()
		{
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
				 driver=new FirefoxDriver();
			 driver.get("https://www.google.com/");
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);}

	  @Test(dataProvider="fetch")
	  public void test(String de) {
	 WebElement print=driver.findElement(By.id("SIvCob"));
	 System.out.println(print.getText());
		
		
		WebElement search=driver.findElement(By.name("q"));
		
		search.sendKeys(de);
		
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ENTER).build().perform();
		
		System.out.println(driver.getTitle());
	  }
	  @DataProvider(name="fetch")
	  public Object[] getdata()
	  {
		  return new Object[] {"face","insta"};
	  }


	@AfterMethod
	public void Close()
	{
		driver.quit();
	}
	}

	}
