package a.airline.project2.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import a.airline.project2.source.P2_Home_Page;
import a.airline.project2.source.P2_Login_Page;
import a.airline.project2.source.P2_Multi_city;
import a.airline.project2.source.P2_Seat_Selection_Page;

public class Testcase11_P2_Enter_Various_Text_Fields extends Project2_Launch_Quit
{
	
	@Test
	public void check_seat_selection_during_booking() throws InterruptedException
	{
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
		P2_Multi_city a7 =new P2_Multi_city(d1);
		Thread.sleep(5000);
		a7.choose_inter_city();
		Thread.sleep(3000);
		a7.book_button();
		Thread.sleep(3000);
	P2_Seat_Selection_Page a8 = new P2_Seat_Selection_Page(d1);
	Thread.sleep(1000);
	a8.Proceed_to_traveller_details();
	Thread.sleep(1000);
	a8.click_add_new_adults_button();
	Thread.sleep(1000);
	a8.adult_gender_button();
	Thread.sleep(1000);
	a8.select_adult_gender();
	a8.adult_first_middle_name();
	Thread.sleep(1000);
	a8.adult_last_name();
	Thread.sleep(2000);
	a8.adult_button();
	Thread.sleep(2000);
	a8.child_add_new_arrow();
	Thread.sleep(2000);
	a8.child_dropdown();
	Thread.sleep(2000);
	a8.select_child_gender();
	Thread.sleep(2000);
	a8.child_first_middle_name();
	Thread.sleep(2000);
	a8.child_last_name();
	Thread.sleep(2000);
	a8.date_of_birth_child_drop_down();
	Thread.sleep(2000);
	a8.child_brith_year();
	Thread.sleep(2000);
	a8.control_Next_brith_year();
	Thread.sleep(2000);
	a8.select_correct_brith_year();
	Thread.sleep(2000);
	a8.click_child_brith_month();
	Thread.sleep(2000);
	a8.choose_child_brith_month();
	Thread.sleep(2000);
	a8.choose_child_brith_date();
	Thread.sleep(2000);
	a8.click_add_child_button();
	Thread.sleep(2000);
	a8.click_add_new_infant();
	Thread.sleep(2000);
	a8.infant_gender_drop_down();
	Thread.sleep(2000);
	a8.infant_gender_selection();
	Thread.sleep(2000);
	a8.infant_first_middle_name();
	Thread.sleep(2000);
	a8.infant_last_name();
	Thread.sleep(2000);
	a8.child_brithday_drop_down();
	Thread.sleep(2000);
	a8.click_infant_brith_year();
	Thread.sleep(2000);
	a8.select_infant_brith_year();
	Thread.sleep(2000);
	a8.click_on_infant_brith_month();
	Thread.sleep(2000);
	a8.choose_infant_brith_month();
	Thread.sleep(2000);
	a8.choose_infant_brith_date();
	Thread.sleep(2000);
	a8.click_add_infant_button();
	Thread.sleep(2000);
	a8.emailID();
	Thread.sleep(2000);
	a8.select_adult_checkbox();
	Thread.sleep(2000);
	a8.select_child_checkbox();
	Thread.sleep(2000);
	a8.select_infant_checkbox();
	Thread.sleep(2000);
	a8.proceed_to_seat_selection();
	Thread.sleep(2000);
	

	}
}
