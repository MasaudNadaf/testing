package facebooksignup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class signup {
	//Declaration
	@FindBy(xpath="(//a[@role=\"button\"])[2]") private WebElement createAct ;
	@FindBy(xpath="//input[@name='firstname']") private WebElement firstname;
	@FindBy(xpath="//input[@name='lastname']") private WebElement surname;
	@FindBy(xpath="//input[@name='reg_email__']") private WebElement mobileno;
	@FindBy(xpath="//input[@name='reg_passwd__']") private WebElement pswd;
	@FindBy(xpath="//select[@name='birthday_day']") private WebElement day;
	@FindBy(xpath="//select[@name='birthday_month']") private WebElement month;
	@FindBy(xpath="//select[@name='birthday_year']") private WebElement year;
	@FindBy(xpath="(//input[@value=\"2\"])") private WebElement gender;
	//Initialization
	public signup(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void ClickonCreate()
								{createAct.click();}

	public void InsertFirstname()
								{firstname.sendKeys("Masaud");}
	public void Insertsurname()
								{surname.sendKeys("Nadaf");}
	public void Insermoblieno()
								{mobileno.sendKeys("123456");}
	public void Insertpswd()
								{pswd.sendKeys("111111");}
	public void Selectday()
					{    Select s=new Select(day);
						s.selectByValue("11");		}
	public void Selectmonth()
				{    Select s1=new Select(month);
				s1.selectByIndex(11);			}
	public void Selectyear()
				{	Select s2=new Select(year);
				s2.selectByValue("1995");}
	public void Selectgender()
					{	gender.click();	}
					
				

		
}
	


