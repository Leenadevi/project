package selenium_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestion_FilpKart {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver d1 =new FirefoxDriver();//empty browser
		d1.get("https://www.flipkart.com/");//navigate to google.com
	d1.manage().window().maximize();
		WebElement auto =d1.findElement(By.name("q"));
	auto.sendKeys("shoe");
		//auto.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		List<WebElement> g2 =d1.findElements(By.xpath(" //ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
		int count =g2.size();
		System.out.println(count);
		g2.get(1).click();
		
	}

}
