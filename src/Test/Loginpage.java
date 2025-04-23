package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	//Declaration
	@FindBy(xpath="//input[@name='txtUsername']") private WebElement un; 
	@FindBy(xpath="//input[@name='txtPassword']") private WebElement pwd;
	@FindBy(xpath="//input[@name='Submit']") private WebElement btn;
	
	//Initialization
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Usage
	public void SetLoginPageUn()
	{un.sendKeys("Admin");}
	public void SetLoginPagePwd()
	{pwd.sendKeys("admin123");}
	public void clickLoginBtn()
	{btn.click();}
}
