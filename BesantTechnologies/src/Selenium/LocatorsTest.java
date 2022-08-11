package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class LocatorsTest {
   	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver;
	 //System.setProperty("webdriver.chrome.driver","C:\\Selenium\\edgedriver_win64\\chromedriver_win32\\chromedriver.exe");
	 //driver= new ChromeDriver();
	 System.setProperty("webdriver.edge.driver","C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
	 driver= new EdgeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.id("email")).sendKeys("salmanvolverine@gmail.com");
	 //Thread.sleep(3000);
	 driver.findElement(By.id("pass")).sendKeys("Salman0097");
	 //driver.findElement(By.name("login")).click();
	 //driver.findElement(By.xpath("//*[@type='submit']")).click();
	 //driver.findElement(By.xpath("//*[contains(@class,'_42ft _4jy0 _6lt')]")).click();
	 //driver.findElement(By.xpath("//*[@value='1' or @type = 'submit']")).click();
	 driver.findElement(By.xpath("//*[@value='5' and @type = 'submit']")).click();
	 //Syntax         "//*[@attribute='value']"
	 //tagname[@attribute='value']
	 //contains         "//*[contains(@attribute,'value')]"
	 //Using or         "//*[@attribute='value' or @attribute='value']"
	 //Using and        "//*[@attribute='value' and @attribute='value']"
	 //driver.quit();   "//*[@id='searchField']"	//*[@id='searchField']
}
}