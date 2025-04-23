import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PArentframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		   
        WebDriver driver=new FirefoxDriver();
        
		 driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		 
		 driver.switchTo().frame("iframeResult");
		 driver.switchTo().frame(0);
		 System.out.println(driver.findElement(By.xpath("//h1")).getText());
		 
		 driver.switchTo().parentFrame();
		 System.out.println(driver.findElement(By.xpath("//h2")).getText());
		 
		 driver.switchTo().frame(0);
		 System.out.println(driver.findElement(By.xpath("//h1")).getText());
		 
		 driver.switchTo().defaultContent();
		 System.out.println(driver.findElement(By.xpath("/html/body/div[2]/ul/li[4]")).getText());
		 
		 driver.quit();
	}

}
