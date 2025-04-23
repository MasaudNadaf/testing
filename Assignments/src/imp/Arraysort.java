package imp;

import java.util.Arrays;

public class Arraysort {
	public static void main(String[] args) {
		
	
	System.out.println("**********A"
			+ "scending********");
	int num[]= {3,5,7,8,2,8,9,10};
	
	Arrays.sort(num);
	for(int i=0;i<num.length;i++)
	{
		System.out.println(num[i]);
	}
	System.out.println("**********Descending********");
	
    for(int i=num.length-1;i>=0;i--)
	{
		System.out.println(num[i]);
	}
     
	
	}
}
