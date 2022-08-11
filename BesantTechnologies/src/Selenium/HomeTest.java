package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HomeTest {
	public static void main(String args[]) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\edgedriver_win64\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.co.in");
		String Sa = driver.getTitle();
		System.out.println(Sa);
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getClass());
		//System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("salmanvolverine@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("8526812028");
		//driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("8526812028");
		driver.findElement(By.xpath("//button[starts-with(@type,'submit')]")).click();
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();
		//driver.quit();
		
	}
}
