package grouping;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
@Test(groups= {"allclasstestgroup"})
public class Smoke {
	
	
	
	@Test(groups= {"sanity"},priority=2)
	void test1()
	{
		System.out.println("Thest is sanity tset case1");
	}

	@Test(groups= {"smoke","sanity"},priority=1)
	void test2()
	{
		System.out.println("Thest is sanityand smoke tset case2");
	}

	@Test(groups= {"regression"},priority=3)
	void test3()
	{
		System.out.println("Thest is regression case1");
	}

	@Test(groups= {"regression"},priority=4)
	void test4()
	{
		System.out.println("Thest is regression case2");
	}

	@Test(groups= {"smoke"},priority=0)
	void test5()
	{
		System.out.println("Thest is smoke tset case1");
	}

}
