package a.airline.project2.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import a.airline.project2.source.P2_Home_Page;
import a.airline.project2.source.P2_Login_Page;
import a.airline.project2.source.P2_Multi_city;

public class Testcase7_P2_Multi_city extends Project2_Launch_Quit
{
	WebDriver d1;

@Test
public void test_Multi_City() throws InterruptedException

{
	
	
	P2_Login_Page a2 =new P2_Login_Page(d1);
	
	
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
	P2_Multi_city a7 =new P2_Multi_city(d1);
	Thread.sleep(5000);
	a7.choose_inter_city();
	Thread.sleep(2000);
	a7.book_button();


}
}
