
package imp;

public class fibonacci {
	
	
	public static void main(String[] args) {
		int a=0,b=1,c;
		
		System.out.print(a+" "+b);
		for(int i=2;i<10;i++)
		{c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		
		}
	}

}
