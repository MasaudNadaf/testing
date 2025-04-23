package addmissionform;

public class Constructor {
   int x, y ;
   float a,b;
  public  Constructor(){
	  a=x=35 ;
	  b=y=50;
	  }
	  public static void main(String[]args) {
		 
		Constructor t1=new Constructor();
		
      System.out.println(" Calculation");
System.out.println("Addition    ="+(t1.x+t1.y));
System.out.println("Substraction="+(t1.x-t1.y));
System.out.println("Multification="+(t1.x*t1.y));
		System.out.println("Divide="+(t1.a/t1.b));
		
	  
  }
}
