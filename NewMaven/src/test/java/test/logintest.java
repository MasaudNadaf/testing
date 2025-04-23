package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Baseclass;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy;
import net.bytebuddy.utility.RandomString;
import pages.Buywindow;
import pages.Homepage;
import pages.Login;

import utility.utility;

public class logintest extends Baseclass {
	WebDriver driver;
	Login lgn;
	
	@BeforeMethod
	public void OpenBrowser()
	{
		driver=openFirefoxBrowser();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
@Test (dataProvider="logindata")
  public void Log(String user,String pwd,String pi) 
  { lgn=new Login(driver);
	  lgn.Enterusername(user);
	  lgn.Enterpassword(pwd);
	  lgn.Clicksubmit();
	  lgn.Enterpin(pi);
		lgn.Entercontinue();
  }

@DataProvider(name="logindata")
  public Object[][] getdata()
  {
	 return new Object[][] {{"HX1777","masaud100","921008"},
							{"HX1777","Mas200","920000"},
							{"HX1777","Masaud300","922222"}
	
						};
  }






@AfterMethod
public void screenShot(ITestResult result) throws IOException
{if(ITestResult.SUCCESS==result.getStatus())
{
	String abc=RandomString.make(3);
	utility.screenShot(driver,abc);
}
else if(ITestResult.FAILURE==result.getStatus())
{	String abc=RandomString.make(3);
	utility.screenShot(driver,abc);
	
}

	
}
@AfterClass
public void closebrowser()
{
	driver.quit();
}


}
