package ng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
  @Test
  public void f() {
		
			
			String s="Masaud",s1="Mas",s2="Masaud";
		
			SoftAssert soft=new SoftAssert();
			soft.assertNotEquals(s, s2);
			soft.assertNotEquals(s, s1);
			
  }
}
