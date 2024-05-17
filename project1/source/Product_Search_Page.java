package a.amazon.project1.source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Search_Page 
{
	ChromeDriver d1;
	@FindBy(xpath="(//span[@class='a-size-base a-color-base puis-bold-weight-text'])[1]")
	WebElement category;
	@FindBy(xpath ="(//span[@class='a-size-base a-color-base puis-bold-weight-text'])[2]")
	WebElement Customer_Review;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base puis-bold-weight-text'])[3]")
	WebElement Brand;

	@FindBy(xpath="(//span[@class='a-size-base a-color-base puis-bold-weight-text'])[4]")
	WebElement Price;
	
	@FindBy (xpath ="(//span[@class='a-size-base a-color-base puis-bold-weight-text'])[5]")
	WebElement Deals_Discounts;
	
	@FindBy (xpath ="(//span[@class='a-size-base a-color-base puis-bold-weight-text'])[6]")
	WebElement Amazon_fashion;
	@FindBy (xpath ="(//span[@class='a-size-base a-color-base puis-bold-weight-text'])[7]")
	WebElement size;
	@FindBy (xpath ="(//span[@class='a-size-base a-color-base puis-bold-weight-text'])[8]")
	WebElement color;
	@FindBy(xpath="//span[@class='a-dropdown-prompt']")
	WebElement sortby_featured;
	
	//step2
	public void categorty()
	{
		category.click();
		
	}
		public void Customer_Review()
	{
		Customer_Review.click();
		
	}
	public void Brand()
	{
		Brand.click();
		
	}
	public void Price()
	{
		Price.click();
		
	}
	public void Deal_Discount()
	{
		Deals_Discounts.click();
	}
	public void product_fashion()
	{
		Amazon_fashion.click();
	}
	public void size()
	{
		size.click();
	}
	public void color()
	{
		color.click();
	}
	public void sorted_by_featured()
	{
		sortby_featured.click();
	}
	public Product_Search_Page (ChromeDriver d1)
	{
		PageFactory.initElements(d1, this);
		
	}
}
