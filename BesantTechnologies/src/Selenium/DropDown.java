package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/"); //URL in the browser
		//  //a[@value='MAA']  - Xpath for chennai
		//  //a[@value='BLR']
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1\']")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		//driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1']")).click();
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[1]/li[1]/a")).click();
		//driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li/a")).click();
		

	

		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		}



}
