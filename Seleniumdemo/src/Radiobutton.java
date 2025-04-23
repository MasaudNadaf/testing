import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import net.bytebuddy.utility.RandomString;

public class Radiobutton {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		String actual="https://demo.guru99.com/test/radio.html";
		
		String current=driver.getCurrentUrl();
		
		if(actual.equalsIgnoreCase(current))
		{	System.out.println("Url is correct");	}
		else
		{	System.out.println("Url is not correct");	}
		
		WebElement click=driver.findElement(By.xpath("//input[@type='radio'][2]")); 
		String s=click.getText();
		System.out.println(s);
		
		WebElement check=driver.findElement(By.xpath("//input[@type='checkbox'][3]"));
		String s1=check.getText();
		System.out.println(s1);
		
		WebElement text1=driver.findElement(By.xpath("/html/body/div[4]/strong[1]"));
		System.out.println(text1.isDisplayed());

		
		
		WebElement text2=driver.findElement(By.xpath("/html/body/div[4]/strong[2]"));
		System.out.println(text2.isDisplayed());
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str=RandomString.make(3);
		File dst1=new File("C:\\Users\\mas\\Downloads\\"+str+".jpg");
		FileHandler.copy(source, dst1);
		
		
		

		
		
		
		
		
		
		
	}

}
