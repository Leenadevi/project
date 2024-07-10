package a.airline.project2.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import a.airline.project2.source.P2_Home_Page;
import a.airline.project2.source.P2_Login_Page;

public class Testcase4_P2_Oneway_flights extends Project2_Launch_Quit
{

@Test
public void search_functionalities_oneway_flights() throws InterruptedException
{
	
	
	P2_Login_Page a2 =new P2_Login_Page(d1);
	Thread.sleep(2000);
	
	a2.click_on_flight_ticket_bookings_button();
	
	a2.un();
	a2.ctn();
	a2.pwd();
	a2.sign_in();
	
	P2_Home_Page a3 =new P2_Home_Page(d1);
	
	a3.one_way_booking();
	Thread.sleep(2000);
	a3.click_on_source_place_button();
	Thread.sleep(2000);
	a3.enter_source_place_name();
	Thread.sleep(2000);
	a3.select_source_place();
	Thread.sleep(2000);
	a3.enter_destination_place_name();
	Thread.sleep(2000);
	a3.select_destination_place();
	Thread.sleep(2000);
	a3.select_date();
	Thread.sleep(2000);
	a3.select_adults();
	Thread.sleep(2000);
	a3.search_button();


	
}
}
