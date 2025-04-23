package polymor;

public class Ol1 {
       //overload add method
	public void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(a-b);
	}
	public void add(String a,String b)
	{
		System.out.println(a+b);
		
	}
	public static void add(int a,String b)
	{
		System.out.println(a+"  "+b);
	}
}
