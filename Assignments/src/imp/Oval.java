package imp;

import java.util.Properties;

public class Oval {
	public static void main(String[] args) {
		
	
	String str="Welcome";
	int l=str.length();
	
	for(int i=0;i<l;i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				System.out.println("given string contains   "+str.charAt(i)+"   at index"+i);
			}
       
			
		//Properties p=new Properties();
		//p.load(arg0);
	//	p.setProperty(arg0, arg1);
		//p.get(arg0);

}
}
}