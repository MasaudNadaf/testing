package simple;

public class Stringreverse {
	
	public static void main(String[] args) {
		
	   String A="Visiest", B=A,Reverse="";
	   
	   int l=A.length();

	   for(int i=l-1;i>=0;i--)
	   {
	   Reverse=Reverse+A.charAt(i);
	   
	   
	   }System.out.print(Reverse);	 
	   System.out.println();
	   System.out.println("A=Reverse or not");
	   
	   //Polindrom with reverse
	   if(A.equals(Reverse))
		   
{      System.out.println("A is polindrom");}
	   else
		   
{      System.out.println("A is not polindrom");}
	   //polindrome with B
	   System.out.println();
	   System.out.println("A=B or not");
	   if(A.equals(B))
		   
 {     System.out.println("A is Polindrom");}
	   else 
		   
{       System.out.println("A is not polindrom");}
	   
	   
	
}
}
