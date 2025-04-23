import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		   
        WebDriver driver=new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/frames");
		
		WebElement text=driver.findElement(By.xpath("//div[@class='main-header']"));
		String str=text.getText();
		System.out.println(str);
		
		driver.switchTo().frame("frame1");
		WebElement text1=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		String str1=text1.getText();
		System.out.println(str1);
		
		driver.switchTo().parentFrame();
		WebElement text3=driver.findElement(By.xpath("//div[@class='main-header']"));
		System.out.println(text3.getText());
		
		driver.switchTo().frame("frame2");
		WebElement text2=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		String str2=text2.getText();
		System.out.println(str2);
		
		driver.switchTo().parentFrame();
		WebElement text4=driver.findElement(By.xpath("//div[@class='main-header']"));
		System.out.println(text4.getText());
	
	}

}
