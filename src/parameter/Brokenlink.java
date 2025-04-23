package parameter;


import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brokenlink {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\mas\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	   WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		int brokenCount = 0;
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("Total links on page"+links.size());
		
	Iterator<WebElement> it=links.iterator();
	while(it.hasNext())
	{String url=it.next().getAttribute("href");
	
	
	HttpsURLConnection http;
	try {
		http = (HttpsURLConnection)(new URL(url).openConnection());
		http.setRequestMethod("HEAD");
		http.connect();
		
		int respCode=http.getResponseCode();
		if(respCode>=400)
		{System.out.println(url+" is Broken..");
		
		brokenCount++;
		}
		else
		{System.out.println(url+"is active");}
		
		
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	System.out.println("Total broken links"+brokenCount);

	
	
	
	
	
	}
}
}
