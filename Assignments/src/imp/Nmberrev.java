package imp;


public class Nmberrev {
	
	public static void main(String[] args) {
		int a=101,r,rev=0,num;
	
		num=a;
	     while(a>0)
		{
			r=a%10;//0,0,1
			rev= rev*10+r;
			a=a/10;//10,1,
			System.out.print(r);
				
		}System.out.println();
	     System.out.println("checking no is polindrom or not");
	     if(num==rev)
	     {System.out.println("no.is polindrom");}
	     else
	     {System.out.println("no.is not polindrom");}
	    
	    
		
	}

}
