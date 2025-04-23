package imp;

public class star {
	public static void main(String[] args) {

int a=100,r,rev=0;


 	while(a>0)
	{
	r=a%10;
	
	rev=rev*10+r;
	a=a/10; 
	
	System.out.print(r);
	}
  
}
}