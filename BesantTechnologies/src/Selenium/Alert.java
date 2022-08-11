package Selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.manage().timeouts().implicitlyWait( 100000, TimeUnit.MILLISECONDS);
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//Thread.sleep(10000);
	//	driver.findElement(By.id("name")).sendKeys("salman");
		driver.manage().timeouts().implicitlyWait( 10000, TimeUnit.MILLISECONDS);
		WebDriverWait ibj = new WebDriverWait(driver,2);
		//ibj.until(ExpectedConditions.visibilityOfElementLocated(By.id("alertbtn")));
		ibj.until(ExpectedConditions.invisibilityOfElementLocated(By.id("alertbtn")));
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		String sad = driver.switchTo().alert().getText();
		System.out.println(sad);
		driver.switchTo().alert().dismiss();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
WebElement we =wait.until(new Function<WebDriver, WebElement>() {

	@Override
	public WebElement apply(WebDriver t) {
		// TODO Auto-generated method stub
		return null;
	}
});	
}
}