import static org.testng.Assert.assertEquals;

import org.testng.asserts.SoftAssert;

public class Assert {
	
	public static void main(String[] args) {
		
		String s="Masaud",s1="Mas",s2="Masaud";
	
		SoftAssert soft=new SoftAssert();
		soft.assertNotEquals(s, s2);
		soft.assertNotEquals(s, s1);
		
	}

}
