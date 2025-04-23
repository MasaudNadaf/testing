import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handleframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		   
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview.summary.html");

		 
		 driver.switchTo().frame("packageListFrame");
		 driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
		 driver.switchTo().defaultContent();
	
		 driver.switchTo().frame("packageFrame");
		 driver.findElement(By.xpath("//span[text()='Alert']")).click();
		 driver.switchTo().defaultContent();
		
		 driver.switchTo().frame("classFrame");
		 driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
		
		 
		 driver.quit();
		
	}
	
	

}
