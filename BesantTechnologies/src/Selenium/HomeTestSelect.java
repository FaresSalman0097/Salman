package Selenium;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HomeTestSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Salm");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("eera");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("salmeera1122@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("salmeera1122@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Salmeera1122");
		//dropdown create a web element 
		WebElement day_Fb = driver.findElement(By.id("day"));
		Select obj_1 = new Select(day_Fb);
		obj_1.selectByIndex(15);
		WebElement month_Fb = driver.findElement(By.id("month"));
		Select obj_2 = new Select(month_Fb);
		obj_2.selectByValue("9");
		WebElement year_Fb = driver.findElement(By.id("year"));
		Select obj_3 = new Select(year_Fb);
		obj_3.selectByVisibleText("1993");
		// list the webelements
		List<WebElement> day_Fb1 = obj_1.getOptions();
		int total_days=  day_Fb1.size();
		System.out.println("Total days are: "+total_days);
		for(int i=0; i<=day_Fb1.size(); i++) {
			String days = day_Fb1.get(i).getText();
			System.out.println("The days are "+days);
		driver.findElement(By.xpath("//input[@name='sex' and value = '-1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='sex' and value = '-1']")).isSelected());
		}}}