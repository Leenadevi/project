package selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Relative_Xpath_Assignment {

	public static void main(String[] args) 
	{
		FirefoxDriver d1 =new FirefoxDriver();
		d1.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D676742245123%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D5680203939004614045%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062041%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2367553%26gad_source%3D1&prevRID=5WPRJ5KR243WTX6K1BVN&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
WebElement register1 =d1.findElement(By.xpath("(//input)[6]"));
register1.sendKeys("Leenadevi");
WebElement register2 =d1.findElement(By.xpath("(//input)[7]"));
register2.sendKeys("8526729222");
WebElement pass1 =d1.findElement(By.xpath("(//input)[8]"));
pass1.sendKeys("123@4567");
WebElement v1 =d1.findElement(By.xpath("(//input)[9]"));
v1.click();



	}

}
