package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.id("search_query_top")).sendKeys("tshirts");;//by id
	driver.findElement(By.name("submit_search")).click();//by name
	//driver.findElement(By.linkText("Printed Chiffon Dress")).click();;//by linktext
	driver.findElement(By.partialLinkText("Dress")).click();//By partial link text
	
	
	
	
	

}
}