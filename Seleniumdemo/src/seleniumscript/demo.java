package seleniumscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class demo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		
		driver.get("https://www.google.com/");
		
		WebElement search=driver.findElement(By.name("q"));
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='facebook';",search);
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
	}
	}


