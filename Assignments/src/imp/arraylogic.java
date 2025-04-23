package imp;
public class arraylogic {
	public static void main(String[] args) {
		
		int num[]= {15,20,30,18,10,12,50};
		
		for(int i=0;i<num.length;i++)
		{
		for(int j=i+1;j<num.length;j++)
		   {if(num[i]>num[j])
		   {int temp=num[i];
		    num[i]=num[j];
		    num[j]=temp;	   
		   }	
		   }
		}
		System.out.println("********Ascending***********");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+"  ");
		}
	System.out.println();	
		System.out.println("*********Descending**********");
		for( int i=num.length-1;i>=0;i--)	
		{
			System.out.print(num[i]+"  ");
		}
		System.out.println();
		System.out.println("Max="+num[num.length-1]);
		System.out.println("Min="+num[0]);
		
		
		
	}

}
