
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement countries=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select s=new Select(countries);
		
		//s.selectByIndex(5);
		
		s.selectByValue("INDIA");
		//s.selectByVisibleText("INDIA");
		List<WebElement>all=s.getOptions();
		int total=all.size();
		System.out.println("all countries="+total);
	
		for(int i=1;i<=total;i++)
		{
		System.out.println(all.get(i).getText());	
		}
		
	}

}
