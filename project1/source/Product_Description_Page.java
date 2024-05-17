package a.amazon.project1.source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Product_Description_Page
{
	ChromeDriver d1;
	Select s1;
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement click_top_cart;
	@FindBy(xpath="//select[@name='quantity']")
	WebElement quantity;
	@FindBy(id="wishListMainButton")
	WebElement wishlist;
	@FindBy(xpath="//a[.='View Your List']")
	WebElement view_your_list;
	@FindBy(xpath="(//input [@name='submit.deleteItem'])[1]")
	WebElement remove_product_from_cart;
	@FindBy(xpath="//span[@class='a-button a-button-normal a-button-primary a-button-icon wl-info-aa_add_to_cart']")
	WebElement add_to_cart;
	@FindBy(xpath="(//span[.='Proceed to checkout'])[1]")
	WebElement proceed_to_checkout;
	
	
	public void click_top_cart()
	{
		click_top_cart.click();
	}
	public void quantity()
	{
	
		 s1 =new Select(quantity);
		 s1.selectByIndex(1);
	}
	public void wishlist()
	{
		wishlist.click();
	}
	public void view_your_list()
	{
		view_your_list.click();
	}
	public void remove()
	{
		remove_product_from_cart.click();
	}
	public void add_to_cart()
	{
		add_to_cart.click();
	}
	public void checkout()
	{
		proceed_to_checkout.click();
	}
public Product_Description_Page(ChromeDriver d1)
{
	PageFactory.initElements(d1, this);
}
}
