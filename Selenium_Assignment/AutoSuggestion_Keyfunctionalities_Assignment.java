package selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Keyfunctionalities_Assignment {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d1 =new ChromeDriver();//empty browser
		d1.get("https://www.google.com");//navigate to google.com
		d1.manage().window().maximize();
		WebElement search =d1.findElement(By.name("q"));
	search.sendKeys("India news channel");
	Thread.sleep(3000);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ENTER);
		
		

	}

}
