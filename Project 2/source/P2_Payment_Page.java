package a.airline.project2.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P2_Payment_Page 
{
	WebDriver d1;
@FindBy(xpath="//i[@class='d726bd8f _4d2636f0']")
WebElement checkbox;
@FindBy(xpath="//button[.='Proceed to Payment']")
WebElement proceed_to_payment_button;
@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
WebElement click_on_radio_credit_debit_card;
@FindBy(xpath="(//input[@name='addCreditCardNumber'])[1]")
WebElement enter_the_card_number;
@FindBy(xpath="//select[@name='ppw-expirationDate_month']")
WebElement select_expiry_date;
@FindBy(xpath="//select[@name='ppw-expirationDate_year']")
WebElement select_expiry_month;
@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
WebElement click_enter_card_details_button;

//step2
public void checkbox()
{
	checkbox.click();
}
public void proceed_to_payment_button()
{
	proceed_to_payment_button.click();
}
public void ccd_radio_button()
{
	click_on_radio_credit_debit_card.click();
}
public void card_number()
{
	enter_the_card_number.sendKeys("567890345678");
}
public void select_card_expiry_date()
{
	Select d =new Select(select_expiry_date);
			d.selectByIndex(2);
}
public void select_card_expiry_month()
{
	Select d =new Select(select_expiry_month);
	d.selectByIndex(3);
}
public void click_on_card_details_button()
{
	click_enter_card_details_button.click();
}
//step3
public P2_Payment_Page(WebDriver d1)
{
	PageFactory.initElements(d1, this);
}
}
