package a.amazon.project1.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import a.amazon.project1.source.Login_Invaild_Credentials;




public class Testcase3_Invalid_Login_Credentials extends LaunchQuit
{

@Test
public void login_fails()
{
	

	WebElement s1 =d1.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	s1.click();
	
	Login_Invaild_Credentials a3 =new Login_Invaild_Credentials(d1);
	a3.un();
	a3.ctn();
	a3.pwd();
	a3.sign_in();
	
}
}
