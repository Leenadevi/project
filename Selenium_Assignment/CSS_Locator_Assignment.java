package selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locator_Assignment {

	public static void main(String[] args) 
	{
		ChromeDriver d1 =new ChromeDriver();//empty browser
		d1.get("https://www.google.com");//navigate to google.com
			
	WebElement c=	d1.findElement(By.cssSelector("textarea.gLFyf"));
			c.sendKeys("India");
			c.sendKeys(Keys.ENTER);

	}

}
 //CSS locator using tagname and classname