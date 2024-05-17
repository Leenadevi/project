package a.amazon.project1.test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Testcase4_Profileedit_LaunchQuit 
{
	ChromeDriver d1;
	@BeforeMethod
	public void Launch_Amazon_Home()
	{
		d1=new ChromeDriver();
		d1.get("https://www.amazon.in");
		d1.manage().window().maximize();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
public void close_browser() throws InterruptedException
{
	Thread.sleep(2000);
	d1.close();
	d1.quit();
}
}
