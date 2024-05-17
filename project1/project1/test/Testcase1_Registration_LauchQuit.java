package a.amazon.project1.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testcase1_Registration_LauchQuit 
{
	ChromeDriver d1;
@BeforeMethod
public void launch_registration_browser()

{
	d1=new ChromeDriver();
	d1.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=3600&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&language=en_IN&pageId=amzn_psr_desktop_in&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&prevRID=5M2AW62NAYHENC4Y0PCE&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	d1.manage().window().maximize();
}
@AfterMethod
public void close_broswer() throws InterruptedException
{
	Thread.sleep(2000);
	d1.close();
}
}
