package a.amazon.project1.source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile_Page 
{
	@FindBy (xpath="//input[@name='name']")
	WebElement public_name_tf;
	@FindBy(xpath="//input[@name ='location']")
	WebElement profile_location_tf;
	@FindBy(xpath="(//span[.='Submit'])[1]")
	WebElement submit_button;
	
	//step2
	public void profilename()
	{
		public_name_tf.sendKeys("devi");
	}
	public void profilelocation()
	{
		profile_location_tf.sendKeys("Tamilnadu");
	}
	public void sumbit()
	{
		submit_button.click();
	}
	//step3
public	Profile_Page(ChromeDriver d1)
{
	PageFactory.initElements(d1, this);
}

}
