package action;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		
		driver.get("https://www.google.com/");
		
		WebElement search=driver.findElement(By.name("q"));
		
		search.sendKeys("face");
		
		
		List<WebElement> result=driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		System.out.println(result.size());
		
		/*for(int i=0;i<result.size();i++)
		{	
		System.out.println(result.get(i).getText());
		}*/
		
		/*for(int i=0;i<result.size();i++)
		{if(result.get(i).getText().equalsIgnoreCase("facebook share price"))
		{result.get(i).click();
			break;
		}
		}*/
		
		Actions act=new Actions(driver);
		for(int i=0;i<6;i++)
		{
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		
		}act.sendKeys(Keys.ENTER).perform();
		
	
		
		
		
	
		
	}

}
