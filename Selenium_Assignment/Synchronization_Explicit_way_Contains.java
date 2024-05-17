package selenium_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_Explicit_way_Contains {

	public static void main(String[] args)
	{
		ChromeDriver d1 =new ChromeDriver();//empty browser
		d1.get("https://www.google.com");//navigate to google.com
	
		d1.manage().window().maximize();
		
		WebElement s1 = d1.findElement(By.name("q"));
		WebDriverWait w1 =new WebDriverWait(d1, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleContains("Google"));
		s1.sendKeys("India");
		s1.sendKeys(Keys.ENTER);
		
	}

}
