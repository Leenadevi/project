package selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAM_Javascript_popup {

	public static void main(String[] args)
	{
		ChromeDriver d1 =new ChromeDriver();
		d1.get("https://grotechminds.com/javascript-popup/");
		WebElement p = d1.findElement(By.cssSelector("button.btnjs"));
		p.click();
		d1.switchTo().alert().accept();
		

	}

}
