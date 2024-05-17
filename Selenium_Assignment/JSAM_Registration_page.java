package selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JSAM_Registration_page {

	public static void main(String[] args) 
	{
		ChromeDriver d1 =new ChromeDriver();
		d1.get("https://grotechminds.com/registration/");
		d1.manage().window().maximize();
		WebElement r1 =d1.findElement(By.id("email"));
		r1.sendKeys("Leenadevi");
		WebElement r2 =d1.findElement(By.id("password"));
		r2.sendKeys("1234556");
		WebElement r3=d1.findElement(By.id("Female"));
		r3.isSelected();
			WebElement dd=d1.findElement(By.id("Skills"));
		Select s =new Select(dd);
		s.selectByIndex(1);
		WebElement dd1=d1.findElement(By.id("Country"));
		Select s1 =new Select(dd1);
		s1.selectByIndex(1);
		WebElement r4 =d1.findElement(By.id("Present-Address"));
		r4.sendKeys("Rajarajan nagar, tamilnadu");
		WebElement r5 =d1.findElement(By.id("Permanent-Address"));
		r5.sendKeys("Rajarajan nagar, tamilnadu");
		WebElement r6 =d1.findElement(By.id("Pincode"));
		r6.sendKeys("638183");
		WebElement dd3=d1.findElement(By.id("Relegion"));
		Select s3 =new Select (dd3);
		s3.selectByIndex(1);
		WebElement r7 =d1.findElement(By.id("relocate"));
		r7.click();
		WebElement rr8=d1.findElement(By.xpath("//button[.='Submit']"));
		rr8.click();
		
		
		
		
		
		

	}

}
