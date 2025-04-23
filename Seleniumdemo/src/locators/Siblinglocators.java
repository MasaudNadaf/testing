package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Siblinglocators {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		WebElement search=driver.findElement(By.xpath("(//td[text()='A'][1])//following-sibling::td[2]"));
		System.out.println(search.getText());
		
		WebElement name=driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr[3]/td[2]//preceding-sibling::td[1]"));
		System.out.println(name.getText());
	
}
}