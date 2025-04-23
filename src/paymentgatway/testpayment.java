package paymentgatway;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class testpayment {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mas\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/");
		
		homepage hm=new homepage(driver);
		hm.ClickonPyamnetgataway();
		hm.Enterquantity();
		hm.Clickonbuynow();
		
		PAyment pay=new PAyment(driver);
		pay.Entercarno();
		try{pay.Selectmonth();}
		finally {
		pay.Selecteyear();
		pay.Enetercvv();
		pay.Clicksubmit();
		pay.Getorderid();


		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String str=RandomString.make(2);
		File dest=new File("C:\\Users\\mas\\Pictures\\Scrennshot\\"+str+".jpg");
		FileHandler.copy(Source,dest);
	
		
		
		
		
		
		}	
		
	}

}
