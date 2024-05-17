package a.amazon.project1.source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Search_Result_Page
{
	@FindBy(xpath="//li[@id='p_72/1318476031']")
	WebElement click_four_star_ratings;
	@FindBy(xpath="//li[@id='p_89/Bacca Bucci']")
	WebElement click_show_brand;
	@FindBy(xpath="//li[@id='p_36/4516641031']")
	WebElement price_list;
	@FindBy(linkText="All Discounts")
	WebElement Deals_Discounts;
	@FindBy(xpath="//li[@id ='p_n_size_browse-vebin/2022659031']")
	WebElement shoe_size;
	@FindBy(xpath="(//div[@class='colorsprite aok-float-left'])[2]")
	WebElement shoe_color;
	@FindBy(xpath="//span[.='Top Brands']")
	WebElement Amazon_Fashion;
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement click_first_shoe;
	@FindBy(xpath="//input[@name='submit.add-to-cart']")
	WebElement product_add_to_cart;

//step2
public void product_rating()
{
	click_four_star_ratings.click();
}
public void product_brand()
{
	click_show_brand.click();
}
public void product_price_list()
{
	price_list.click();
}
public void Deals_Discounts()
{
	Deals_Discounts.click();
}
public void product_size()
{
	 shoe_size.click();
}
public void product_color()
{
	 shoe_color.click();
}
public void Amazon_fashion()
{
	Amazon_Fashion.click();
}
public void selecting_the_1st_shoe_moving_control_child()
{
	click_first_shoe.click();
}
public void add_to_cart()
{
	product_add_to_cart.click();
}

//step 3
public Product_Search_Result_Page(ChromeDriver d1)
{
	PageFactory.initElements(d1, this);
}
}
