package a.amazon.project1.test;





import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import a.amazon.project1.source.Home_Page;
import a.amazon.project1.source.Product_Search_Result_Page;


public class Testcase8 extends LaunchQuit
{
ChromeDriver d1;
@Test
public void sorts_product() throws InterruptedException
{
	
	
	d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Home_Page a2 =new Home_Page(d1);
	a2.searching_the_product();
	WebElement s4 =d1.findElement(By.xpath("//select[@id='s-result-sort-select']"));
	Select ss =new Select(s4);
	ss.selectByIndex(1);
	
	WebElement s5 =d1.findElement(By.xpath("//select[@id='s-result-sort-select']"));
	Select ss2 =new Select(s4);
	ss2.selectByIndex(2);
	
	WebElement s3 =d1.findElement(By.xpath("//select[@id='s-result-sort-select']"));
	Select ss3 =new Select(s3);
	ss3.selectByIndex(3);
	
	WebElement s6 =d1.findElement(By.xpath("//select[@id='s-result-sort-select']"));

	Select ss4 =new Select(s6);
	ss4.selectByIndex(4);


	
	
	
}
}
