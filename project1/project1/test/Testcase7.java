package a.amazon.project1.test;


import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import a.amazon.project1.source.Home_Page;
import a.amazon.project1.source.Product_Search_Page;



public class Testcase7 extends LaunchQuit
{
	
	Date d;
	@Test
public void verify_Productdetail() throws IOException, InterruptedException
{

Home_Page a2 =new Home_Page(d1);
a2.searching_the_product();

Product_Search_Page a6 = new Product_Search_Page(d1);
Thread.sleep(2000);
a6.categorty();
a6.Customer_Review();
Thread.sleep(2000);
a6.Brand();
a6.Price();
a6.Deal_Discount();
a6.product_fashion();
a6.size();
a6.color();
TakesScreenshot ts=(TakesScreenshot) d1;
double name =Math.random();
Date d = new Date(0);
String ctime=d.toString();
ctime= ctime.replaceAll(":", "-");
ctime=ctime.replaceAll("", " ");
File source =ts.getScreenshotAs(OutputType.FILE);
File des =new File("D:\\Worksapces\\Testing\\Maven_Project1\\src\\test\\java\\a\\amazon\\project1\\test"+ "Ensure_Product_details" + name +ctime+".png");
FileHandler.copy(source, des);
}
}