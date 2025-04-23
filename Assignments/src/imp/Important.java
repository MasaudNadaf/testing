package imp;

public class Important {

	public static void main(String[] args) {
		
		int  s=123,temp=s,rev=0;
		
		while(s>0)
		{rev=s%10;//3
		//rev=rev*10+d;//3,
		s=s/10;//12
		System.out.println(rev);
		}

		
		if(temp==rev)
		{
			System.out.println("polyndrom");
		}
		else
		{
			System.out.println("not");
		}
	}
}
