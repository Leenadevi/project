package a.amazon.project1.source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page
{
	ChromeDriver d1;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;//search
	@FindBy(id ="nav-search-submit-button")
	WebElement search_button;
	
	//step2
	public void searching_the_product()
	{
		search_tf.sendKeys("shoes");
		search_button.click();
		
	}
	
//step3	
public Home_Page(ChromeDriver d1)
{
	PageFactory.initElements(d1, this);
}
	
}

