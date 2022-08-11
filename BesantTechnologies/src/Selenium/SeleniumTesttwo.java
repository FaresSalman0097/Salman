package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTesttwo {
	public static void main(String[] args) {
		//Starts with
		//tagname[starts-with(@attribute, 'value')]
		//input[starts-with(@placeholder,'Email address')]
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\edgedriver_win64\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("test");
		//using index     "//*[@attribite='value'])[index]"
        driver.findElement(By.xpath("(//*[@class='inputtext _55r1 _6luy'])[1]")).sendKeys("name");
		//Text      "//*[text()='value']"
		driver.findElement(By.xpath("//*[text()='உள்நுழை']")).click();
		//driver.findElement(By.xpath("//*[text()='புதிய கணக்கை உருவாக்கு']")).click();
		//driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("test");		
	}
}