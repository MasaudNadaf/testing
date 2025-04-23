import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {
   public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mas\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();		 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

	    String main=driver.getWindowHandle();
		
		Set <String> child=driver.getWindowHandles();//CONVERT TO ARRAY 
		String[] ids=child.toArray(new String[child.size()]);
		String childid=ids[1];
		
		Iterator<String> it=child.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		driver.switchTo().window(childid);
		driver.findElement(By.name("emailid")).sendKeys("mas@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		driver.switchTo().window(main);
		driver.close();
		
		Thread.sleep(4000);
		driver.quit();
		
}
}