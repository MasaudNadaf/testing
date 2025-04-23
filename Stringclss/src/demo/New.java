package demo;

public class New {
	
	 String m="MaSaUd",l="nadaf",k="  Abssd ";
	 
	 
	public void Uppercase()
	{
	System.out.println(m.toUpperCase());
	System.out.println(k.trim());

	}
	
	public void lowercase()
	{
		System.out.println(m.toLowerCase());
	}
	public void findlength()
	{
		System.out.println(m.length());
		System.out.println(l.length());
	}
	 public void lastindex()
	 {
	 System.out.println(m.indexOf("S"));
	 
	 System.out.println(l.charAt(4));
	 }
	 public void compare()
	 {
		 System.out.println(l.compareTo(m));
	 } 
	


	public static void main(String[] args) {
		New n=new New();
		n.Uppercase();
		n.lowercase();
		n.findlength();
		n.lastindex();
		n.compare();
	}
		
		
}
