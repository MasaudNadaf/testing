package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;


public class DragnDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
	
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("scroll(0,300)");
		
		
		driver.switchTo().frame(0);
		Actions act=new Actions(driver);
		
		//act.moveToElement(target).perform();
		WebElement s=driver.findElement(By.id("draggable"));
		WebElement t=driver.findElement(By.id("droppable"));
		act.dragAndDrop(s,t).build().perform();
		
		
		
		
		
		
	}

}
