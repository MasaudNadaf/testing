package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Adduserpage {
	//DEclaretion
	
     @FindBy(xpath="//b[text()='Admin']") private WebElement admin;
     @FindBy(xpath="//a[text()='User Management']") private WebElement userMngt;
     @FindBy(xpath="//a[text()='Users']") private WebElement user;
     @FindBy(xpath="//input[@name='btnAdd']") private WebElement addbtn;
     @FindBy(xpath="//select[@id='systemUser_userType']") private WebElement userRole;
     @FindBy(xpath="(//input[@type='text'])[1]") private WebElement empName;
     @FindBy(xpath="//input[@id='systemUser_userName']") private WebElement Username;
     @FindBy(xpath="//select[@id='systemUser_status']") private WebElement Status;
     @FindBy(xpath="//input[@id='systemUser_password']") private WebElement Userpwd;
     @FindBy(xpath="//input[@id='systemUser_confirmPassword']") private WebElement Confirmpwd;
     @FindBy(xpath="//input[@id='btnSave']") private WebElement Save;
     
     //Initiaalization
     public Adduserpage(WebDriver driver)
     {PageFactory.initElements(driver,this); }
     //usage
     public void clickonAdmin()
     							{admin.click();}
     public void clickonUserMngmt()
     							{userMngt.click();}						
     public void clickonuser()
     							{user.click();}
     public void clickonaddbtn()
     							{addbtn.click();}
     public void SelectUserRole()
     							{Select s=new Select(userRole);
    	 						s.selectByIndex(1);}

     public void addempName()
     							{empName.sendKeys("Admin A");}
     public void Addusername()
     							{Username.sendKeys("Masaud");}
     public void SelectStatus()
     							{Select s1=new Select(Status);
     							s1.selectByIndex(0);}
     public void Addpwd()
     							{Userpwd.sendKeys("Rajnadaf2rj@");}
     public void ConfirmPwd()
     							{Confirmpwd.sendKeys("Rajnadaf2rj@");}
     public void ClickSaveBtn()
     							{Save.click();}
     
     
     
     

}
