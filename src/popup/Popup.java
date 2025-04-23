package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popup {
	@FindBy(xpath="//button[@id='alertButton']") private WebElement click1;
	@FindBy(xpath="//button[@id='timerAlertButton']") private WebElement click2;
	@FindBy(xpath="//button[@id='confirmButton']") private WebElement click3;
	@FindBy(xpath="//button[@id='promtButton']") private WebElement click4;
	
	public Popup(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickon1()
							{click1.click();}
	public void clickon2()
						{click2.click();}
	public void clickon3()
						{click3.click();}
	public void clickon4()
						{click4.click();}

}
