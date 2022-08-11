package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTestOne {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\edgedriver_win64\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		//System.setProperty("webdriver.edge.driver","C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		 //driver= new EdgeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		// driver= new ChromeDriver();
		driver.get("https://www.cricbuzz.com");
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		driver.navigate().back();
		//driver.navigate().forward();	
		//driver.close();
		//driver.quit();
		 //driver.equals(driver);		 	 
	}
}
