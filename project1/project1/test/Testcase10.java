package a.amazon.project1.test;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import a.amazon.project1.source.Home_Page;
import a.amazon.project1.source.Login_Page;
import a.amazon.project1.source.Product_Description_Page;

import a.amazon.project1.source.Product_Search_Result_Page;

public class Testcase10 extends LaunchQuit
{
	ChromeDriver d1;
	@Test
	public void updating_remove_item() throws InterruptedException
	{
	
	Home_Page a2 = new Home_Page(d1);
	a2.searching_the_product();
	/*Product_Page a6 = new Product_Page(d1);
	Thread.sleep(2000);
	a6.categorty();
	a6.Customer_Review();
	Thread.sleep(5000);
	a6.Brand();
	a6.Price();
	a6.Deal_Discount();*/
	Product_Search_Result_Page a8 =new Product_Search_Result_Page(d1);
	a8.product_rating();
	d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	a8.product_brand();
	Thread.sleep(2000);
	a8.Deals_Discounts();
	a8.product_price_list();
	a8.product_size();
	a8.product_color();
	a8.Amazon_fashion();
	a8.selecting_the_1st_shoe_moving_control_child();
	Set<String> parent =d1.getWindowHandles();
	Iterator<String>pc=parent.iterator();
	String parent1 =pc.next();
	String child1 =pc.next();
	d1.switchTo().window(child1);
	Thread.sleep(2000);
	a8.add_to_cart();
	Product_Description_Page a6 =new Product_Description_Page(d1);
	a6.click_top_cart();
	a6.quantity();
	d1.navigate().back();
	d1.navigate().back();
	a6.wishlist();
	Login_Page a4 = new Login_Page(d1);
	a4.un();
	a4.ctn();
	a4.pwd();
	a4.sign_in();
	
	a6.wishlist();
	a6.view_your_list();
	a6.remove();
	
}
}