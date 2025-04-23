import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//verify title
		
		String T1=driver.getTitle();
		 System.out.println(T1);
		if(T1.equalsIgnoreCase("Amazon.com. Spend less. Smile more."))
		{
			System.out.println("Title is correct");
		}
		else 
		{
			System.out.println("Title is not correct");		
		}
		

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		String url=driver.getCurrentUrl();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
