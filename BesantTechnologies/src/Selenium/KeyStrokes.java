package Selenium;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyStrokes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement key_1 = driver.findElement(By.xpath("//*[@name='email']"));
		Actions keys_1 = new Actions(driver);
		keys_1.moveToElement(key_1).click().keyDown(Keys.SHIFT).sendKeys("salman").build().perform();
		keys_1.moveToElement(key_1).contextClick().build().perform();      //perform move to element
		//screenshot for entire page
		//File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File src =(key_1.getScreenshotAs(OutputType.FILE));
		FileUtils.copyFile(src,new File("D:\\Java Besant Technology\\screenshot\\fb1.png"));
		
	}

}
