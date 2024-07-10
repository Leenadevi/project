package a.airline.project2.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P2_Validate_Flight_Information
{
WebDriver d1;
@FindBy(xpath="//div[@class='_7c598c35 ']")
WebElement view_baggage_cancellation_policy;
@FindBy(xpath="//div[@class='_7c598c35 a69d62e8']")
WebElement view_fare_details;

//step2
public void view_baggage_cancellation_policy()
{
	view_baggage_cancellation_policy.click();
}
public void view_fare_details()
{
	view_fare_details.click();
}
public P2_Validate_Flight_Information (WebDriver d1)
{
	PageFactory.initElements(d1, this);
}
}
