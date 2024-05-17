package selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JSAM_New_Registration_Page_Assignment {

	public static void main(String[] args) 
	{
		ChromeDriver d1 =new ChromeDriver();
		d1.get("https://grotechminds.com/registeration-form/");
		d1.manage().window().maximize();
		WebElement r1 =d1.findElement(By.id("firstName"));
		r1.sendKeys("Leena");
		WebElement r2 =d1.findElement(By.id("lastName"));
		r2.sendKeys("devi");
		WebElement r3 =d1.findElement(By.id("email"));
		r3.sendKeys("m.leenadevi@gmail.com");
		
		WebElement r5 =d1.findElement(By.name("phone"));
		r5.sendKeys("8524678910");
		WebElement r6 =d1.findElement(By.name("gender"));
		
		Select s = new Select(r6);
		s.selectByIndex(2);
		WebElement r10 = d1.findElement(By.xpath("//input[@id='aadhaar']"));
		r10.sendKeys("120002345672");
		WebElement r7 =d1.findElement(By.name("pan"));
		r7.sendKeys("Aswer4567q");
		WebElement r8 =d1.findElement(By.id("terms"));
	r8.click();
	WebElement r9= d1.findElement(By.xpath("//input[@type='submit']"));
	r9.click();

	}

}
