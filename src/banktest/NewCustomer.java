package banktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewCustomer {
	
	@FindBy(xpath="//a[text()='New Customer']") private WebElement Newcustomer;
	@FindBy(xpath="//input[@name='name']") private WebElement Customername ;
	@FindBy(xpath="//input[@name='rad1'][1]") private WebElement Gender ;
	@FindBy(xpath="//input[@name='dob']") private WebElement DOB   ;
	@FindBy(xpath="//textarea[@name='addr']") private WebElement  Address ;
	@FindBy(xpath="//input[@name='city']") private WebElement City   ;
	@FindBy(xpath="//input[@name='state']") private WebElement State  ;
	@FindBy(xpath="//input[@name='pinno']") private WebElement pin   ;
	@FindBy(xpath="//input[@name='telephoneno']") private WebElement Mobileno  ;
	@FindBy(xpath="//input[@name='emailid']") private WebElement  Emailid ;
	@FindBy(xpath="//input[@name='sub']") private WebElement Submit  ;
	
	public NewCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void Clickonnewcustomer()
									{Newcustomer.click();}
	public void Entercustomername()
									{Customername.sendKeys("Masaud");}
	public void Entergender()
									{Gender.click();}
	public void SElectDOB()
									{DOB.sendKeys("11-12-1995");
								}
	public void EnterAddress()
									{Address.sendKeys("path");}
	public void Entercity()
									{City.sendKeys("JSP");}
	public void EnterState()
									{State.sendKeys("Maharashtra");}
	public void Enterpin()
									{pin.sendKeys("416000");}
	public void Entermob()
									{Mobileno.sendKeys("9292929292");}
	public void Enteremail()
									{Emailid.sendKeys("raj123@gamil.com");}
	public void Clicksubmitbtn()
									{Submit.click();}

}
