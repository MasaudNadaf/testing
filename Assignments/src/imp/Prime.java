package imp;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("insert no=");
		int a=sc.nextInt();
		    
	        for(int i=2;i<a;i++)
	        {
			if(a%i==0)
			{
				System.out.println("no.is not prime");
				flag =1;
				break;
			}
	        }
			if(flag==0)
			{System.out.println("no. is prime");}
	        
	}

}
