package simple;

import java.util.Scanner;

public class Result {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Marks in %=");
		
		int marks=sc.nextInt();
		
		
		if(marks<=100 && marks>=75)
		{
			System.out.println("Distiction");
		}
		else if(marks<75 && marks>=60)
		{
			System.out.println("First class");
		}
		else if(marks<60 && marks>=35)
		{
			System.out.println("Second class");
		}
		
		else if(marks<35 && marks>=0)
		{
			System.out.println("fail");
		}
		
		else
		{
			System.out.println("invalid");
		}
	}

}
