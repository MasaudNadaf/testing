package simple;

public class Flag {
	public static void main(String[] args) {
		int a=17,flag=0;
		
		for(int i=2;i<a;i++) 
	{
			
	if(a%i==0)
	{
			System.out.println(a+"=not prime");
			flag=1;
			break;
	}
	}
	if(flag==0)
		
			System.out.println(a+"=prime");
		
			
		}
	}	


