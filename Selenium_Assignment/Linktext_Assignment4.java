package selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_Assignment4 {

	public static void main(String[] args) 
	{
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/");
		WebElement best =d1.findElement(By.linkText("Mobiles"));
		best.click();

	}

}
