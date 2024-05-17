package selenium_Assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Durations;

public class Get_Window_Handle_Handles {

	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver d1 = new EdgeDriver();
		d1.get("https://www.amazon.in/");
		WebElement best =d1.findElement(By.xpath(" //input [@id='twotabsearchtextbox']"));
		best.sendKeys("Shoe");
		best.sendKeys(Keys.ENTER);
		WebElement best1 =d1.findElement(By.xpath(" //img [@class='s-image']"));
		best1.click();
		System.out.println(d1.getWindowHandles());
		Set<String>Parentclass =d1.getWindowHandles();
		Iterator<String> Pc =Parentclass.iterator();
		String p1 =Pc.next();
		String c1 =Pc.next();
		System.out.println("this is your parent window" +p1);
		d1.switchTo().window(c1);
		
		WebElement b1 =d1.findElement(By.id("add-to-cart-button"));
		b1.click();
		WebElement b2 =d1.findElement(By.name("proceedToRetailCheckout"));
		b2.click();
		WebElement b4 =d1.findElement(By.id("ap_email"));
		b4.sendKeys("8526729522");
		WebElement c3 =d1.findElement(By.id("continue"));
		c3.click();
		WebElement b5 =d1.findElement(By.id("ap_password"));
		b5.sendKeys("12345@lee");
		WebElement c2 =d1.findElement(By.id("signInSubmit"));
		c2.click();
		
		WebElement b3 =d1.findElement(By.xpath("\\input [@class ='a-button-input'][2]"));
		boolean answer =b3.isDisplayed();
		boolean answer2 =b3.isEnabled();
		System.out.println(answer);
		System.out.println(answer2);
		
		
		
		

	}

}
