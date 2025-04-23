import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BYXpath {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://demo.applitools.com/index.html");
	  // by xpath index (//input[@class='form-control'])[1]
	  Thread.sleep(2000);
	 WebElement username= driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
                      username.sendKeys("mas"); Thread.sleep(2000);      
    WebElement pass=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
                      pass.sendKeys("mas"); Thread.sleep(2000);                       
    WebElement check=driver.findElement(By.xpath("//input[@class='form-check-input']"));
    		          check.click();
    WebElement disp=driver.findElement(By.xpath("//label[@class='form-check-label']"));
   Boolean Actual=disp.isDisplayed(); 
    if(Actual==true)
        {System.out.println("Remember me :Displayed");}
    else
    {System.out.println("Remember me:not Display");}
    if(check.isEnabled())
    {  System.out.println("Enable:"+check.isEnabled()); }
    else
    {System.out.println("Enable:"+check.isEnabled());}
    
    if(check.isSelected())
    {System.out.println("Selected:"+check.isSelected());}
    else
    {System.out.println("Selected:"+check.isSelected());}
   
    //Xpath by text
    //<a id="log-in" class="btn btn-primary" href="/app.html">Sign in</a>
                           Thread.sleep(2000);
    WebElement login=driver.findElement(By.xpath("//a[text()='Sign in']"));
                           login.click();

  
  
  
  }	  
}
