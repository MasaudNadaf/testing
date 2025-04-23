package demo;



public class de {
	public static void main(String[] args) {
		
		/*777
		 *66
		 *5
		 */
		
		int space=0;
		int star=3;
		
		for(int i=7;i>=5;i--)
		{for(int j=1;j<=space;j++)
			{System.out.print(" ");}
		
		
		 for(int j=1;j<=star;j++)
		 {System.out.print(i);
		 }	
		System.out.println();
		space++;
		star--;
		}
	
	System.out.println("////////////////////////");
	/*  * * *
	 *   * *
	 *    *
	 */
	
	
	int num=3;
	for(int i=1;i<=3;i++)
	{for(int j=1;j<=num;j++)
		{
			System.out.print(" "+"*"+" ");
		}
	System.out.println();
	if(i==1)
	{
		System.out.print("  ");
	}
	else if(i==2)
	{
		System.out.print("   ");
	}
	
	
	num--;
	
	}
	System.out.println("////////////////////////");
	
	int a=10;
	int b=20;
	int sum=0;
	for(int i=1;i<=b;i++)
	{
		sum=sum+a;
	}
	System.out.println(sum);
	
	System.out.println("////////////////////////");
	
	
	
	for(int i=1;i<=2;i++)
	{for(int j=1;j<=3;j++)
		{
		System.out.print("*");
		}
	System.out.println();
		
	}
	
	System.out.println("////////////////////////");
	
	for(int i=1;i<=2;i++)
	{for(int j=1;j<=3;j++)
		{System.out.print(i+" ");}
	
	System.out.println();
	}
	
	System.out.println("////////////////////////");
	
	
	
	for(int i=1;i<=2;i++)
	{for(int j=1;j<=3;j++)
	{System.out.print(j+" ");}
	System.out.println();
		
	}
	
	System.out.println("////////////////////////");
	
	
	//*
	//**
	//*
	
	int spac=0;
	int str=1;
	
	for(int i=1;i<=3;i++)
	{for(int j=1;j<=str;j++)
		{System.out.print("*");}
	
		if(i<2)
		{
			str++;
		}
		else
		{
			str--;
		}
	
		System.out.println();
	
	}	
	System.out.println("////////////////////////");
	
	String s="masaud",rev="";

	int l=s.length();


	for(int i=l-1;i>=0;i--)
	{
	rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	System.out.println("////////////////////////");
	
	
	
	int m=500,re=0;
	
	
	while(m>0)
	{  re=m%10;//0
		m=m/10;//50
		System.out.print(re);
	}//System.out.println(re);
	System.out.println("////////////////////////");
	
	
	int d;
	int nu[]={4,8,6,3,4,7};
	int le=nu.length;
	for(int i=0;i<le;i++)
	{for(int j=i+1;j<le;j++)
	{if(nu[i]>nu[j])//n,n,y
	    { d=nu[i];
		nu[i]=nu[j];
		nu[j]=d;
		}
	}}
	for(int i=0;i<le;i++)
	{
		System.out.print(nu[i]);
	}
	
}

}




