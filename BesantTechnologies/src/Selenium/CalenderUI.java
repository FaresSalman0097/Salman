package Selenium;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CalenderUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		//WebElement sa= driver.findElement(By.className("datepicker-switch"));
		/*
		 * while(!driver.findElement(By.
		 * cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText
		 * ().contains("2022")) { driver.findElement(By.
		 * cssSelector("[class='datepicker-days'] th[class='next']")).click(); }
		 */
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("September 2022"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.className("day"));
		int totaldays= dates.size();
		for(int i=0;i<totaldays;i++) {
			String date_1=dates.get(i).getText();
			if(date_1.equalsIgnoreCase("5")) {
				dates.get(i).click();
				break;
			}
		}
		
		
		
List <WebElement> test= dates.stream().sorted().collect(Collectors.toList());
for(int i=0;i<test.size();i++)
{
	System.out.println(test.get(i).getText());
}
					
	}
}

