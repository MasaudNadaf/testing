
public class handelbytrail {
	
	public static void main(String[] args) {
		int a=10;
		
		a=a+a;
		System.out.println(a);
		try
		{
		
		System.out.println(a/0);
		}
		catch(NullPointerException c)
		{c.printStackTrace();
			
		}
		catch(ArithmeticException d)
		{
			d.printStackTrace();
			System.out.println(d);
		}
		catch(Exception b)
		{System.out.println("excep.handel");
			
		}
		finally
		{
		
			System.out.println(a/2);
		}
		System.out.println("hello");
		
	}

}
