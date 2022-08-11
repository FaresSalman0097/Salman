 package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Select sa = new Select(driver.findElement(By.id("oldSelectMenu")));
		sa.selectByIndex(1);
		//sa.deselectByIndex(1);
		sa.selectByValue("red");
		driver.findElement(By.id("oldSelectMenu")).isEnabled();
		
		
	}

}
