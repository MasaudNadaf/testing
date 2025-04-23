import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginZerodha {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		//input[@id='userid']
		WebElement userid = driver.findElement(By.xpath("//input[@id='userid']"));
		userid.sendKeys("HX2837");
		Thread.sleep(2000);
		
		//input[@id='password']
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("Masaud@1995");
		Thread.sleep(2000);
		
		//button[@type='submit']
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(2000);
		
		//input[@id='pin']
		WebElement pin=driver.findElement(By.xpath("//input[@id='pin']"));
		pin.sendKeys("921818");
		Thread.sleep(2000);
		
		//button[@type='submit']
		WebElement ctn=driver.findElement(By.xpath("//button[@type='submit']"));
		ctn.click();		
		
		
		
		
						
	
	}

}
