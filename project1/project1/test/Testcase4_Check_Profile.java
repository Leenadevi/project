package a.amazon.project1.test;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import a.amazon.project1.source.Login_Page;
import a.amazon.project1.source.Profile_Page;



public class Testcase4_Check_Profile extends Testcase4_Profileedit_LaunchQuit
{

@Test
public void edit_profile() throws InterruptedException
{
	
	WebElement s1 =d1.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
	Actions a1 =new Actions (d1);
	a1.moveToElement(s1).perform();
	Thread.sleep(2000);
	//WebElement s2 =d1.findElement(By.xpath("(//a[.='Your Account'])[3]"));
	//s2.click();
	WebElement s7 =d1.findElement(By.linkText("Your Account"));
	s7.click();
	WebElement s3 =d1.findElement(By.linkText("Profile"));
	s3.click();
	Login_Page a4 =new Login_Page(d1);
	a4.un();
	a4.ctn();
	a4.pwd();
	a4.sign_in();
	Profile_Page a5 =new Profile_Page(d1);
	a5.profilename();
	a5.profilelocation();
	a5.sumbit();
}
}
