package imp;

public class Stringrev {
	public static void main(String[] args) {
		String name="masaud", rev="";
		
		int l=name.length();
	
		for(int i=l-1;i>=0;i--)
			
		{
			rev=rev+name.charAt(i);
				
		}System.out.println(rev);
	
	System.out.println("checking name is polindrom or not");
	
	if(name.equals(rev))
	{
		System.out.println("name is polindrom");
	}
	else
	{
		System.out.println("name is not polindrom");
	}
		
	}

}
