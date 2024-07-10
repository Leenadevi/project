package a.airline.project2.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Project2_Launch_Quit 
{
	WebDriver d1;
@BeforeMethod
public void Airline_Browser_Launching()
{
	d1=new ChromeDriver();
	d1.manage().window().maximize();
	d1.get("https://www.amazon.in/s?k=flight+ticket+booking+online+amazon&adgrpid=57989285205&ext_vrnc=hi&gclid=EAIaIQobChMIisSD6eH1hQMVMKpmAh105AizEAAYASAAEgLlAfD_BwE&hvadid=590474248044&hvdev=c&hvlocphy=9148852&hvnetw=g&hvqmt=b&hvrand=6444868657151654042&hvtargid=kwd-1397416659064&hydadcr=15293_2267882&tag=googinhydr1-21&ref=nav_ya_signin");
	
}
@AfterMethod
public void closing_Browser() throws InterruptedException
{
	Thread.sleep(2000);
	d1.close();
}
}
