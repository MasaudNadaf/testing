package demo;

public class Demo {
	public static void main(String[] args) {
		
		String s="visiest",
			  s2="VISIEST",
			  s3="vis",
		      s4="12345";
		
		System.out.println(s.length());
		System.out.println(s4.length());
		
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.indexOf("s"));
		System.out.println(s.lastIndexOf("s"));
		System.out.println(s4.indexOf('3'));
		
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s3.equals("vis")); 
		
		System.out.println(s.contains(s2));
		System.out.println(s.contains(s3));
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.concat(s4));
		
		System.out.println(s.startsWith("vi"));
		System.out.println(s4.startsWith("1"));
		
		System.out.println(s2.endsWith("ST"));
		System.out.println(s4.endsWith("4"));
		
		String s5="abc-efg-hij";

		
		String arr[]=s5.split("-");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			
	   System.out.println(s5.replace("efg","ddd"));
	   
	   System.out.println(s2.substring(2));
	   System.out.println(s2.substring(0,6));
	   System.out.println(s4.substring(2,4));
			
			
	}}
