package popup;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.utility.RandomString;

public class Alertmain {
	public static void main(String[] args) throws InterruptedException, IOException {
		
			System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://demoqa.com/alerts");
		//popup only accept
			Popup al=new Popup(driver);
			al.clickon1();
			
			Alert a=driver.switchTo().alert();
			a.accept();
			//popup come after 5 sec.
			Thread.sleep(2000);
			try {
			al.clickon2();
			WebDriverWait wait=new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert b=driver.switchTo().alert();
			b.accept();System.out.println("Alert popup in time");
			}
			catch(Exception e)
			{
				System.out.println("Alert not popup in time");
			}Thread.sleep(2000);
			//popup with ok cnacel text
			
			al.clickon3();
			Alert c=driver.switchTo().alert();
			System.out.println(c.getText());
			c.accept();
			
			Thread.sleep(2000);
			//Poupp to send text and accept
			
			al.clickon4();
			
			Alert d=driver.switchTo().alert();
			d.sendKeys("abcd");
			d.accept();
			
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String str=RandomString.make(2);
			File dest=new File("C:\\Users\\mas\\Pictures\\Scrennshot\\"+str+".jpg");
			FileHandler.copy(source, dest);
					
			
			Thread.sleep(5000);
			driver.quit();
			
			
			/*Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
					.withTimeout(20, TimeUnit.SECONDS)
					.pollingEvery(5, TimeUnit.SECONDS)
					.ignoring(NoSuchElementException);*/
			
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebDriverWait wait=new WebDriverWait(driver,10);
					wait.until(ExpectedConditions.alertIsPresent());
			
	}

}
