package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsTest2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.get("https://www.google.co.in/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.navigate().to("https://www.hotstar.com/in");
	Thread.sleep(3000);
	driver.findElement(By.id("searchField")).sendKeys("cook with comali");			//doubt
	//driver.findElement(By.id("searchField")).click();
	driver.findElement(By.xpath("//*[@id='searchfield']")).click();	
	}
}
