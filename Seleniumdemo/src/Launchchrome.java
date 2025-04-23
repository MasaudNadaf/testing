

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jcip.annotations.ThreadSafe;

public class Launchchrome {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mas\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.amazon.in/");
		 String url1=driver.getCurrentUrl();
		 System.out.println(url1);
		 String Title1=driver.getTitle();
		 System.out.println(Title1);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.navigate().to("https://www.flipkart.com/");
		 String url2=driver.getCurrentUrl();
		 System.out.println(url2);
		 String Title2=driver.getTitle();
		 System.out.println(Title2);
		 Thread.sleep(2000);
		 
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 
		 //set size
		 Dimension d=new Dimension(400,400);
		 driver.manage().window().setSize(d);
		 Thread.sleep(3000);
		//set position
		Point p=new Point(400,200);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		
		Thread.sleep(5000);
		driver.quit();
		 
	
		 
	}

}
