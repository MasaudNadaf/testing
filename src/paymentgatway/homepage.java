package paymentgatway;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class homepage {
	
	@FindBy(xpath="//a[text()='Payment Gateway Project']") private WebElement PymentGateaway;
	@FindBy(xpath="//select[@name='quantity']") private WebElement Quantity;
	@FindBy(xpath="//input[@type='submit']") private WebElement Buynow;
	
	public homepage(WebDriver driver)
	{PageFactory.initElements(driver,this);}
	public void ClickonPyamnetgataway()
	{PymentGateaway.click();}
	public void Enterquantity()
	{Select s2=new Select(Quantity);
	s2.selectByIndex(4);}
	public void Clickonbuynow()
	{Buynow.click();}

}
