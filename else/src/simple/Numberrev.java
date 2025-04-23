package simple;

public class Numberrev {
	public static void main(String[] args) {
		
	
    int rev;
	int a=15556;
			
     while(a>0)
	{
    	 rev=a%10;
		a=a/10;
		
		System.out.print(rev);
	}
	
	
}
}