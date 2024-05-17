package a.amazon.project1.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import a.amazon.project1.source.Home_Page;
import a.amazon.project1.source.Product_Description_Page;
import a.amazon.project1.source.Product_Search_Result_Page;

public class Testcase15 extends LaunchQuit
{

@Test 
public void reach_cart_withoutlogin() throws InterruptedException
{
	
	Home_Page a2 =new Home_Page(d1);
	a2.searching_the_product();
	Product_Search_Result_Page a8 =new Product_Search_Result_Page(d1);
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
}
}
