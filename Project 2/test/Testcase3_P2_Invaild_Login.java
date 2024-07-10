package a.airline.project2.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import a.amazon.project1.source.Login_Invaild_Credentials;

public class Testcase3_P2_Invaild_Login extends Project2_Launch_Quit
{
	@Test
	public void invalid_credentials() throws InterruptedException
	{
		
		

		Thread.sleep(2000);
		WebElement s1 =d1.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		s1.click();
		d1.manage().window().maximize();
		Login_Invaild_Credentials a3 =new Login_Invaild_Credentials(d1);
		a3.un();
		a3.ctn();
		a3.pwd();
		a3.sign_in();
	}
	

}
