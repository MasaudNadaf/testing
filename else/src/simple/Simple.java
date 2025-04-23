package simple;

import java.util.Scanner;

public class Simple {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username=");
		
		String  s=sc.next();
		
		if(s.length()<=7)
		{
			System.out.println("Accepted");
		}
		else
		{
			System.out.println("Error...");
		}
	}

}
