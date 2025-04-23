package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmTest {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mas\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Loginpage login=new Loginpage(driver);
		login.SetLoginPageUn();
		login.SetLoginPagePwd();
		login.clickLoginBtn();
		
		Adduserpage adduser=new Adduserpage(driver);
		adduser.clickonAdmin();
		adduser.clickonUserMngmt();
		//adduser.clickonuser();
		adduser.clickonaddbtn();
		adduser.SelectUserRole();
		adduser.Addusername();
		adduser.addempName();
		adduser.SelectStatus();
		adduser.Addpwd();
		adduser.ConfirmPwd();
		adduser.ClickSaveBtn();
		
		
		

		
}
}