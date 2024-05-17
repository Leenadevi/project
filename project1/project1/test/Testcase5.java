package a.amazon.project1.test;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import a.amazon.project1.source.Home_Page;




public class Testcase5 extends LaunchQuit
{

@Test
public void Product_search()
{

Home_Page a2 =new Home_Page(d1);
	a2.searching_the_product();
}
}
