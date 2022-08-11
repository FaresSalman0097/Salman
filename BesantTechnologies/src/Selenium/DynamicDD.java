package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDD {
	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\edgedriver_win64\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://www.makemytrip.com/"); //URL in the browser
		        Thread.sleep(5000);
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']/label")).click();
		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input")).sendKeys("Kolkata");
		List<WebElement> ele = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
		//List<WebElement> ele = driver.findElements(By.xpath("//div[@class='makeFlex hrtlCenter']"));
		//System.out.println(ele);
		
		  for(int i=0;i<ele.size();i++)
		  { String text = ele.get(i).getText();
		  System.out.println(text);
		  
		if(text.contains("Kolkata")) 
		{ ele.get(i).click();
		break; } 
		  }
		 
		}
}

