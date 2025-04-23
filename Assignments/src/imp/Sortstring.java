package imp;
public class Sortstring {
	public static void main(String[] args) {
		String s="WelCome To VisiesT";
		
		int lower =0;
		int upper=0;
		String up="",lo="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
		    {
			upper++;
			up=up+s.charAt(i);
			}
	
			else
			{lower++;
			 lo=lo+s.charAt(i);
			}
		}
		
		System.out.println("count of lowercase="+lower+"  "+"Lowercase="+lo);
		System.out.println("count of uppercase="+upper+"  "+"Uppercase="+up);
	}

}
