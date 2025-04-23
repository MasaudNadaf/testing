package simple;

import java.util.Scanner;

public class Maths {
	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter vaue of a=");
		int a=sc.nextInt();
		
		System.out.println("enter value of b=");
		
		int b=sc.nextInt();	
		
	    int c=a+b,d=a-b,e=a/b,f=a*b;
	    
		
		
		
		
		System.out.println("Addition="+c);
		System.out.println("Sub="+d);
		System.out.println("Devide="+e);
		System.out.println("Multiple="+f);
		
		
		
	}

}
