import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Formlogin {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement FN=driver.findElement(By.xpath("//input[@name='firstName']"));
		FN.sendKeys("Masaud");Thread.sleep(2000);
		WebElement LN=driver.findElement(By.xpath("//input[@name='lastName']"));
		LN.sendKeys("Nadaf");
		WebElement PN=driver.findElement(By.xpath("//input[@name='phone']"));
		PN.sendKeys("9538181");
		WebElement email=driver.findElement(By.xpath("//input[@name='userName']"));
		email.sendKeys("abc.gmail.com");
		WebElement add=driver.findElement(By.xpath("//input[@size='40']"));
		add.sendKeys("16 th lane");
		WebElement city=driver.findElement(By.xpath("(//input[@size='15'])[2]"));
		city.sendKeys("Jaysingpur");
		WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("Maharashtra");
		WebElement code=driver.findElement(By.xpath("(//input[@size='15'])[3]"));
		code.sendKeys("416101");
		WebElement country=driver.findElement(By.xpath("//select[@size='1']"));
	Select s=new Select(country);
	s.selectByValue("INDIA");
	
	    WebElement user=driver.findElement(By.xpath("(//input[@size='20'])[3]"));
	    user.sendKeys("Masaud");
	    WebElement pass=driver.findElement(By.xpath("(//input[@size='20'])[4]"));
	    pass.sendKeys("pass");
	    WebElement confirm=driver.findElement(By.xpath("(//input[@size='20'])[5]"));
	    confirm.sendKeys("pass");
	    
	    WebElement submit=driver.findElement(By.xpath("//input[@name=\"submit\"]"));
	    submit.click();
	    
	    File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //File dest=new File("C:\\Users\\mas\\Downloads\\m.png");
	    //FileHandler.copy(source,dest);
	    
	    String str=RandomString.make(3);
	    File dest1=new File("C:\\Users\\mas\\Downloads"+str+".jpg");
	    FileHandler.copy(source,dest1);
	    Thread.sleep(5000);
	    driver.quit();
	    
	

		
		
		
		
	}

}
