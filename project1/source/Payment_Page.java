package a.amazon.project1.source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page

{
	ChromeDriver d1;
	@FindBy(xpath="//span[@id='orderSummaryPrimaryActionBtn']")
	WebElement address;
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	WebElement card_payment_method;

	@FindBy(xpath="(//input [@name='ppw-instrumentRowSelection'])[2]")
	WebElement net_banking;
	@FindBy(xpath="(//input [@name='ppw-instrumentRowSelection'])[3]")
	WebElement other_UPI_Apps;
	@FindBy(xpath="(//input [@name='ppw-instrumentRowSelection'])[4]")
	WebElement EMI_Payment;
	@FindBy(xpath="(//input [@name='ppw-instrumentRowSelection'])[5]")
	WebElement case_delivery;
	@FindBy(xpath="//input[@name='ppw-claimCode']")
	WebElement coupon_code;
	@FindBy(name="ppw-claimCodeApplyPressed")
	WebElement apply_button;
	//step2
	public void address()
	{
		address.click();
	}
	public void card_payment()
	{
		card_payment_method.click();
	}
	public void net_banking_payment()
	{
		net_banking.click();
	}
	public void UPI_Apps_payment()
	{
	other_UPI_Apps.click();	
	}
	public void EMI_Payment()
	{
		EMI_Payment.click();
	}
	public void cash_on_delivery()
	{
		case_delivery.click();
	}
	public void apply_coupon()
	{
		coupon_code.sendKeys("1234abcd5678");
		apply_button.click();
		
	}
	public Payment_Page (ChromeDriver d1)
	{
		PageFactory.initElements(d1, this);
	}
	
}
