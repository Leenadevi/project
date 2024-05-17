package selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAM_Handle_Javascript_Popup {

	public static void main(String[] args) 
	{
		ChromeDriver d1 =new ChromeDriver();
		d1.get("file:///C:/Users/MY%20PC/Downloads/learningHTML1.html");
		d1.switchTo().alert().accept();
	WebElement v1=	d1.findElement(By.xpath("//input[@id='1']"));
	v1.sendKeys("Leenadevi");

	}

}
