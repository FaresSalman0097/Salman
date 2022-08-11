package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		WebElement i_frames = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(i_frames);
		WebElement drag = driver.findElement(By.id("draggable"));
		Actions a = new Actions(driver);
		a.clickAndHold(drag).moveByOffset(56, 54).build().perform();
		
		

	}

}
