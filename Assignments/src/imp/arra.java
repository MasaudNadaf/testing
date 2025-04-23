package imp;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Collections;
public class arra {
	
	public static void main(String[] args) {
		
	   int num[]= {50,15,5,6,8,75,75,100};

	    int min=Arrays.stream(num).min().getAsInt();
	    int max=Arrays.stream(num).max().getAsInt();
	    
	    System.out.println("MIN="+min);
	    System.out.println("MAX="+max);
	    
	    
	    int num1[]= {50,15,5,6,8,75,75,100}; 
	    IntSummaryStatistics stat=Arrays.stream(num1).summaryStatistics();
	    int min1=stat.getMin();
	    int max1=stat.getMax();
	   System.out.println(min1);
	   System.out.println(max1);
	   
	  
	   
     
	}}
   