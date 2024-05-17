package selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_register_Assignment4 {

	public static void main(String[] args)
	{
		FirefoxDriver d1 =new FirefoxDriver();
		d1.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D676742245123%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D5680203939004614045%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062041%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2367553%26gad_source%3D1&prevRID=5WPRJ5KR243WTX6K1BVN&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

//WebElement Amazon_Reg =d1.findElement(By.id("createAccountSumbit"));
//Amazon_Reg.click();
		WebElement Amazon_Reg4= d1.findElement(By.id("ap_customer_name"));
 Amazon_Reg4.sendKeys("Leenadevi");
WebElement Amazon_Reg1 =d1.findElement(By.id("ap_phone_number"));
Amazon_Reg1.sendKeys("8526725679");
WebElement Amazon_Reg2 =d1.findElement(By.id("ap_password"));
Amazon_Reg2.sendKeys("12345@Lee");
WebElement Amazon_Reg3 =d1.findElement(By.id("continue"));
Amazon_Reg3.click();


	}

}
//automate the amazon registration page