package banktest;




import java.io.FileInputStream;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage  {
		
	@FindBy(xpath="//input[@name='uid']") private WebElement UserId;
	@FindBy(xpath="//input[@name='password']") private WebElement Pwd;
	@FindBy(xpath="//input[@name='btnLogin']") private WebElement Loginbutton;
	

	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserId()
							{UserId.sendKeys("mngr397769");}
	public void Enterpwd()
							{Pwd.sendKeys("uzusetY");}
	public void Clickloginbutton()
							{Loginbutton.click();}
	
	


}
