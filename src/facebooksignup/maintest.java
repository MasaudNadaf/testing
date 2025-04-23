package facebooksignup;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;

import net.bytebuddy.utility.RandomString;

public class maintest {
	
			public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();	
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
		
			
			signup in=new signup(driver);
			in.ClickonCreate();
			in.InsertFirstname();
			in.Insertsurname();
			in.Insermoblieno();
			in.Insertpswd();
			in.Selectday();
			in.Selectmonth();
			in.Selectyear();
			in.Selectgender();
			
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String str=RandomString.make(3);
			File dest=new File("C:\\Users\\mas\\Pictures\\Scrennshot\\"+str+".jpg");
			FileHandler.copy(source,dest);
			
			
			
			
}
}
