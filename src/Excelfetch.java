import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelfetch {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mas\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		 
		 FileInputStream file=new FileInputStream("C:\\Users\\mas\\Documents\\Book1.xlsx");
	     Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	     
	     //Fetch by index
	     String Username=sh.getRow(1).getCell(0).getStringCellValue();
	     System.out.println(Username);
	     
	     String Pwd=sh.getRow(1).getCell(1).getStringCellValue();
	     System.out.println(Pwd);
	     
	     System.out.println(sh.getLastRowNum());
	
	     
	     //fetch all
	     for(int i=0;i<=sh.getLastRowNum();i++)
	     {   Row row=sh.getRow(i);
	     //System.out.println(row.getLastCellNum());
	     System.out.println();
	    	 for(int j=0;j<row.getLastCellNum();j++)
	    	 {
	    		 System.out.print(row.getCell(j));
	    		 System.out.print(" ");
	    		
	    	 }
	     }
	     	
	}

}
