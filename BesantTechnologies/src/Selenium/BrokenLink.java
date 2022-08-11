package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLink {
	public static void main(String[] args) throws MalformedURLException, IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64\\chromedriver_win32\\chromedriver.exe");
		         WebDriver driver=new ChromeDriver();
		         
		         //broken URL
		         //Step 1 - IS to get all urls tied up to the links using Selenium
		         //  Java methods will call URL's and gets you the status code
		         //if status code >400 then that url is not working-> link which tied to url is broken
		         //a[href*="soapui"]'
		         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		         List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		         SoftAssert a =new SoftAssert();
		        
		         for(WebElement links_1:links) {
		        	String sa= links_1.getAttribute("href");
		        	HttpURLConnection sal= (HttpURLConnection)new URL(sa).openConnection();
		        	sal.setRequestMethod("HEAD");
		        	sal.connect();
		        	int ad =sal.getResponseCode();
		        	System.out.println(ad);
a.assertTrue(ad<400,"test"+links_1.getText()+"..");
		         }
		       a.assertAll();
		         
	}

}
