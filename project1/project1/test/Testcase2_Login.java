package a.amazon.project1.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import a.amazon.project1.source.Login_Page;
import project1.ddt.ExcelSheet_Program_1;

public class Testcase2_Login extends LaunchQuit
{
@Test
public  void login() throws EncryptedDocumentException, IOException, InterruptedException
{
	
//d1.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("ab");
//Thread.sleep(15000);
//d1.findElement(By.xpath("//button[.='Continue shopping']")).click();
	
	WebElement s1 =d1.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	s1.click();
	Thread.sleep(2000);
	ExcelSheet_Program_1.excel_fetching_data();
	Login_Page a2 =new Login_Page(d1);
	Thread.sleep(2000);
	a2.un();
	a2.ctn();
	Thread.sleep(2000);
	a2.pwd();
	a2.sign_in();
	
	
	
		
		
			
}

}
