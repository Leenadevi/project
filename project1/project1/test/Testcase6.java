package a.amazon.project1.test;





import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import a.amazon.project1.source.Home_Page;
import a.amazon.project1.source.Product_Search_Page;
import a.amazon.project1.source.Product_Search_Result_Page;



public class Testcase6 extends LaunchQuit
{

@Test
public void searching_with_filters() throws InterruptedException
{
	
	d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Home_Page a2 =new Home_Page(d1);
	a2.searching_the_product();
	
	Product_Search_Result_Page a6 =new Product_Search_Result_Page(d1);
	a6.product_rating();
	Thread.sleep(2000);
	a6.product_brand();
	a6.Deals_Discounts();
	a6.product_price_list();
	a6.product_size();
	a6.product_color();
	a6.Amazon_fashion();
		
	
	
	
}
}
