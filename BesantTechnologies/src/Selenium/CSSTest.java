package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTest {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\edgedriver_win64\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		 //driver.findElement(By.cssSelector("input[type='text']")).sendKeys("name");
	//driver.findElement(By.xpath("//div[@jscontroller='JGHKP']/input")).sendKeys("class");
		// String s=driver.findElement(By.xpath("//div[@jsname='vdLsw']/following-sibling::input")).getAttribute("jsaction");
		 //System.out.println(s);
		
		 //div[@jscontroller='JGHKP']/style/input
		 
		 //syntax   tagname[attribute='value']
		//syntax for contains		 tagname[attribute*='value']
		 // css shortcut
		 //  #value is for id      and     .value is for class
	//siblings syntax     xpath/following-siblings::tagname
		 //div[@jsname='vdLsw']/following-siblings::input
		 
		 // xpath/parent::tagname
		 //input[@type='text']/div::jscontroller
		 String sa=driver.findElement(By.xpath("//input[@type='text']/parent::div")).getAttribute("jsaction");
		 System.out.println(sa);
	}
}
