package banktest;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {public static void main(String[] args) throws EncryptedDocumentException, IOException  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mas\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://demo.guru99.com/V1/index.php");
	
	/*FileInputStream file=new FileInputStream("C:\\Users\\mas\\Documents\\Banktest.xlsx");
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	//fetching id
	String user=sh.getRow(1).getCell(0).getStringCellValue();
	//fetching pwd
	String pwd=sh.getRow(1).getCell(1).getStringCellValue();*/
	
	
	Loginpage login=new Loginpage(driver);
	login.EnterUserId();
	login.Enterpwd();
	login.Clickloginbutton();
	
	NewCustomer Customertab=new NewCustomer(driver);
	Customertab.Clickonnewcustomer();
	Customertab.Entercustomername();
	Customertab.Entergender();
	Customertab.SElectDOB();
	Customertab.EnterAddress();
	Customertab.Entercity();
	Customertab.Enterpin();
	Customertab.EnterState();
	
	Customertab.Entermob();
	Customertab.Enteremail();
	Customertab.Clicksubmitbtn();
	
	
	

}
}