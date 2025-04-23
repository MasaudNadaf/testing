package simple;

public class Swap {
	
	
	public static void main(String[] args) {
		
	int a=10,b=5,temp;
	
		temp=a; 
		a=b ;
		b=temp;
	   
    System.out.println("new a="+a+"   new b="+b);
    
    int c=10,d=20;
    c=c+d;//10+20=30
    d=c-d;//30-20=10
    c=c-d;//30-10=20
    
    System.out.println("new c="+c+"  new d="+d);
	 

}
}
