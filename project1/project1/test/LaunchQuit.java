package a.amazon.project1.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit 
{
	ChromeDriver d1;
@BeforeMethod

	public void launch_browser()
	{
		d1=new ChromeDriver();
		//d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259813113%26hvpone%3D%26hvptwo%3D%26hvadid%3D678802104197%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D4619410505136594580%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9148852%26hvtargid%3Dkwd-304880464215%26hydadcr%3D14450_2371567%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		d1.get("https://www.amazon.in");
		d1.manage().window().maximize();
	}


@AfterMethod
public void close_browser() throws InterruptedException
{
	Thread.sleep(2000);
	//d1.close();
}}