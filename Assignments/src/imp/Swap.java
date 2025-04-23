package imp;

public class Swap {
	public static void main(String[] args) {
		int a=50,b=60,temp;
		
		System.out.println("original value of a="+a+" & "+"b="+b);
		
		//by using third variable
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping value of a="+a+"  &  "+"b="+b);
		
		//without third variable
		a=a+b;//110
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping value of a="+a+"  &  "+"b="+b);
	}
}
