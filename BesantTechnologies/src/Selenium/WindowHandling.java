package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("openwindow")).click();
		//driver.findElement(By.tagName("")).above();
		//driver.findElement(By.tagName("")).below();
		//driver.findElement(By.tagName("")).toTightOf();
		//driver.findElement(By.tagName("")).toLeftOf();
		//driver.switchTo().window(WindowType.WINDOW);     Available only in Selinium v4
		//driver.switchTo().window(WindowType.TAB);
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child =it.next();
		System.out.println(parent);
		System.out.println(child);
		
}
}