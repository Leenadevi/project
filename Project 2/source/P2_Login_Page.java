package a.airline.project2.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P2_Login_Page
{
	WebDriver d1;
	
	@FindBy(xpath = "//a[@class='a-button-text']")
	WebElement click_on_flight_ticket_bookings_button;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement username_tf;
	@FindBy(xpath="//input[@class ='a-button-input']")
	WebElement continue_button;
	
	@FindBy(xpath="//input [@name='password']")
	WebElement password_tf;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[1]")
	WebElement sign_In_button;
	
	public void un()
	{
		username_tf.sendKeys("8526729522");
		//username_tf.sendKeys("8567890232");
		
	}
	public void ctn()
	{
		continue_button.click();;
	}
	
	public void pwd()
	{
		password_tf.sendKeys("12345@lee");
		//password_tf.sendKeys("lee@1234);
	}
	public void sign_in()
	{
		sign_In_button.click();;
	}
	public void click_on_flight_ticket_bookings_button()
	{
		
		click_on_flight_ticket_bookings_button.click();
	}
	
public P2_Login_Page(WebDriver d1)
{
	PageFactory.initElements(d1, this);
}
	
	
}
