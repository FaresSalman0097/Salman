package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDDYatra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.yatra.com/flights");
		Thread.sleep(5000);
		driver.findElement(By.id("BE_flight_origin_city")).click();
		driver.findElement(By.xpath("//*[@id=\'BE_flight_origin_city\']")).sendKeys("chennai");	
		List<WebElement> elmt = driver.findElements(By.cssSelector("#BE_flight_origin_city"));
		System.out.println(elmt.get(1));
		
	}
}
