package demo;

public class Buffer {

	public static void main(String[] args) {
	    String s="Hello",s1=" Welcome";
	   
	    String s2=s.concat(s1);
	   	System.out.println(s2);
	   	
	    
	   	
	   	StringBuffer s3=new StringBuffer("Visiest");
	   	
	   	s3.append(s1);
	   	System.out.println(s3);
	   	System.out.println(s3.reverse());
	   
	   	
	}
}
