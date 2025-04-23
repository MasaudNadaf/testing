import java.io.FileInputStream;

public class FileExcp {
	
	public static void main(String[] args){
		
		
		try {
		FileInputStream f=new FileInputStream("z:\\New folder\\IMG-20171207-WA0002.jpg");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("bgag");
		}
		
		
	}

}
