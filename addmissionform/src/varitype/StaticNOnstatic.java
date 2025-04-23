package varitype;

public class StaticNOnstatic {
	
   static int count=1;//static belong to class only 
	StaticNOnstatic()
	
	
	{
		count++;
	
	System.out.println(count);
	}
	public static void main(String[]args)
	{
		StaticNOnstatic d=new StaticNOnstatic();
		StaticNOnstatic d1=new StaticNOnstatic();
		StaticNOnstatic d2=new StaticNOnstatic();
		StaticNOnstatic d3=new StaticNOnstatic();
		StaticNOnstatic d4=new StaticNOnstatic();
	}

}
