package imp;

import java.util.Scanner;

public class not {
	public static void main(String[]args){


		Scanner sc=new Scanner(System.in);
		System.out.println("a=");
		int a=sc.nextInt();
		System.out.println("b=");
		int b=sc.nextInt();

  
		for(int i=0;i<5;i++)
		{
			int c=a+b;//0+1=1 /1+1=2  /1+2=3
			System.out.println(c);
			a=b;
			b=c;
  
		}
		}
	}