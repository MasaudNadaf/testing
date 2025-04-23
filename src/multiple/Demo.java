package multiple;

public class Demo implements Demo1,Demo2,Demo3{
	
	
	
	public void Whatsapp1()
	{
		System.out.println("Texting");
	}
	 
	public void Whatsapp2()
	 {
			System.out.println("calling");
	}
	public  void Whatsapp3()
	 {
			System.out.println("video calling");
	}

	 public static void main(String[]args) {
		 
		 Demo d=new Demo();
		 d.Whatsapp1();
		 d.Whatsapp2();
		 d.Whatsapp3();
				 
		 
		 
		 
	 }

}
