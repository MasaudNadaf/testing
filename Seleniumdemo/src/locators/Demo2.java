package locators;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	//className and tagname method use generally for multiple web elements
		
		int sliders=driver.findElements(By.className("homeslider-container")).size();
		System.out.println(sliders);
		
		
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		

		
		
		
	}
}

