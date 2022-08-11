package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;  

public class DropdownSelect {
	public static void main(String args[]) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\edgedriver_win64\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		Assert.assertEquals("https://www.facebook.com/reg/", "https://www.facebook.com/reg/");
		// driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		String y= driver.findElement(By.name("birthday_day")).getText();
		Select s = new Select(driver.findElement(By.name("birthday_day")));
		s.selectByIndex(2);
		driver.findElement(By.xpath("//*[@type='radio' and @value='1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//*[@type='radio' and @value='1']")).isSelected());
		driver.findElement(By.xpath("//*[@type='radio' and @value='2']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@type='radio' and @value='2']")).isSelected());
    	//s.selectByIndex(2);	
	}
}