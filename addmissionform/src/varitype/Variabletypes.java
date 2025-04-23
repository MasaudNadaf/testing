package varitype;

public class Variabletypes {

//Global variable
 static String name="Aa";
 int b=10;

 public void test1() {
	 int a=20; //local variable
	 System.out.println(a+name+b);
     
 }
 public static void test2() {
	 int a=35;//local variable
	 System.out.println(a+name);
	
 }
}

