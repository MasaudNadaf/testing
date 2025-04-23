package paymentgatway;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PAyment {
	
	@FindBy(xpath="//input[@name='card_nmuber']") private WebElement Cardno;
	@FindBy(xpath="//select[@name='month']") private WebElement Expirymonth;
	@FindBy(xpath="//select[@name='year']") private WebElement Expiryyear;
	@FindBy(xpath="//input[@name='cvv_code']") private WebElement CVV;
	@FindBy(xpath="//input[@name='submit']") private WebElement Submit;
	@FindBy(xpath="//td[@align='center'][2]") private  WebElement Orderid;
	
	public PAyment(WebDriver driver)
	{PageFactory.initElements(driver,this);}
	public void Entercarno()
	{Cardno.sendKeys("4001718812679569");}
	public void Selectmonth()
	{Select s=new Select(Expirymonth);
	s.selectByValue("12");;}
	public void Selecteyear()
	{Select s1=new Select(Expiryyear);
	s1.selectByValue("2022");}
	public void Enetercvv()
	{CVV.sendKeys("818");}
	public void Clicksubmit()
	{Submit.click();}
	public void Getorderid()
	{String id=Orderid.getText();
	System.out.println(id);}
}
