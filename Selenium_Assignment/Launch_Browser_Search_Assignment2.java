package selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser_Search_Assignment2 {

	public static void main(String[] args)
	{
		ChromeDriver d1 = new ChromeDriver ();
		d1.get("https://www.flipkart.com/");
		String title =d1.getTitle();
		System.out.println(title);
		d1.findElement(By.name("q")).sendKeys("Shoes");
		d1.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

}
