package a.airline.project2.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import a.airline.project2.source.P2_Home_Page;
import a.airline.project2.source.P2_Login_Page;
import a.airline.project2.source.P2_RoundTrip;

public class Testcase5_P2_Round_Trip extends Project2_Launch_Quit
{
	
@Test 
public void roundtrip() throws InterruptedException
{
	
	d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	P2_Login_Page a2 =new P2_Login_Page(d1);
	Thread.sleep(2000);
	
	a2.click_on_flight_ticket_bookings_button();
	
	a2.un();
	a2.ctn();
	a2.pwd();
	a2.sign_in();
	Thread.sleep(2000);
	P2_RoundTrip a5=new P2_RoundTrip(d1);
	Thread.sleep(2000);
	a5.round_trip_booking();
	Thread.sleep(2000);
	a5.click_on_source_location_button();
	Thread.sleep(2000);
	a5.enter_source_location_name();
	Thread.sleep(2000);
	a5.select_source_location();
	Thread.sleep(2000);
	//a5.click_on_dest_location();
	//Thread.sleep(2000);
   a5.enter_dest_location_name();
	Thread.sleep(2000);
	a5.select_dest_location();
	//Thread.sleep(3000);
	//a5.travel_date();
	Thread.sleep(2000);
	a5.choose_date();
	//Thread.sleep(2000);
	//a5.return_date();
	Thread.sleep(2000);
	a5.select_return_date();
	//Thread.sleep(2000);
	//a5.click_on_travellers_and_economy();
	Thread.sleep(2000);
	a5.select_passengers();
	Thread.sleep(2000);
	a5.search_button();
}
}
