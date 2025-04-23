package simple;

import java.util.Scanner;

public class Positive {
	 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NO.");
		
		int o=sc.nextInt();
		
		if(o<0)
		{
			System.out.println("Negative No.");
		}
		else if(o>0)
		{
			System.out.println("Positive No.");
		}
		else
		{
			System.out.println("Invalid no");
		}
	}

}
