package a.airline.project2.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P2_Registration_Page 
{
	WebDriver d1;
	@FindBy(id="ap_customer_name")
		WebElement user_name_tf;
	@FindBy(id="ap_email")
	WebElement email_tf;
	@FindBy(id ="ap_password")
		WebElement password_tf;
	@FindBy(id ="ap_password_check")
	WebElement verify_password_tf;
	@FindBy(xpath ="//input[@id='continue']")
	WebElement create_account_button;

	//step 2
	public void un()
	{
		user_name_tf.sendKeys("leena");
		
	}
	public void email()
	{
		email_tf.sendKeys("m.leenadevi@gmail.com");	
	}
	public void pwd()
	{
		password_tf.sendKeys("12345@lee");
	}
	public void vef_pwd()
	{
		verify_password_tf.sendKeys("12345@lee");
	}
	public void continue_button()
	{
		 create_account_button.click();
	}
	public P2_Registration_Page(WebDriver d1)
	{
		PageFactory.initElements(d1, this);
	}

}
