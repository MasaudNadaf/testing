package ng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeClass
	void beforeclass()
	{
		System.out.println("This will excute before class");
	}
	@AfterClass
	void afterclass()
	{
		System.out.println("This will excute after class");
	}
	
	
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("This will excute before every test method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This will excute after every test method");
	}
	
  @Test(enabled=true)
  public void TC1()
  {System.out.println("This is Test 1");
	  Assert.fail();
  }
  
  @Test
  void TC2()
  {
	  System.out.println("This is test 2");
  }
  @Test(priority=0)
  void TC3()
  {
	  System.out.println("THis is test3");
  }
  @BeforeTest
  void beforetest()
  {
	  System.out.println("This will excute before test");
  }
  @AfterTest
  void aftertest()
  {
	  System.out.println("THis will excute after test");
  }
  @BeforeSuite
  void beforesuit()
  {
	  System.out.println("This will excute before test suit");
  }
  @AfterSuite
  void aftersuit()
  {
	  System.out.println("THis will excute after test suit");
  }
  @Test(dependsOnMethods={"TC3"})
  void TC4()
  {
	  System.out.println("This is test4");
  }
  
}
