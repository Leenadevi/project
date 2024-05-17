package a.amazon.project1.test;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import a.amazon.project1.source.Home_Page;
import a.amazon.project1.source.Login_Page;
import a.amazon.project1.source.Payment_Page;
import a.amazon.project1.source.Product_Description_Page;
import a.amazon.project1.source.Product_Search_Result_Page;


public class Testcase13 extends LaunchQuit
{

@Test
public void apply_coupon_code() throws InterruptedException
{

	d1 =new ChromeDriver();
	d1.get("https://www.amazon.in");
	d1.manage().window().maximize();
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
	a6.add_to_cart();
	a6.checkout();
	Payment_Page p1 =new Payment_Page(d1);
	p1.address();
	p1.card_payment();
	p1.apply_coupon();
	Set<String> pc2 = d1.getWindowHandles();
	Iterator<String> il2 = pc2.iterator();
	String parentid2 = il2.next();
	String childid2 = il2.next();
	d1.switchTo().window(parentid2);
	
		WebElement review =d1.findElement(By.xpath("//span[.='& Orders']"));
	review.click();
}
}
