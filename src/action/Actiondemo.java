package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.browserstack.com/");
	
	WebElement dev=driver.findElement(By.xpath("//span[@class='nav_item_name']"));
	WebElement status=driver.findElement(By.xpath("//a[text()='Status']"));
	
	Actions act=new Actions(driver);
	act.moveToElement(dev).click(status).build().perform();
	Thread.sleep(4000);
	
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("scroll(0,1500)");
	Thread.sleep(4000);
	js.executeScript("scroll(0,-1500)");
	
	
	
	//driver.quit();
	
	
	
	
	
	
	
	
	
	
	

}
}