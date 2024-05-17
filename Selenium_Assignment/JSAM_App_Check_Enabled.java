package selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAM_App_Check_Enabled {

	public static void main(String[] args)
	{
		ChromeDriver d1 =new ChromeDriver();
		d1.get("file:///C:/Users/MY%20PC/Downloads/learningHTML1.html");
		WebElement c1 = d1.findElement(By.name("name2"));
		c1.click();
				
		if (c1.isDisplayed()==true)
		{
			System.out.println("test passed");
		}
		else 
		{
			System.out.println("Test case fail");
		}
		WebElement c2 =d1.findElement(By.id("121"));
		c2.click();
		if (c2.isEnabled()==true)
		{
			System.out.println("test passed");
		}
		else 
		{
			System.out.println("Test case fail");
		}
		if (c1.isSelected())
		{
			System.out.println("test passed is selected");
		}
		else 
		{
			System.out.println("test passed is not selected");
		}
	}

}
