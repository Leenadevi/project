package a.airline.project2.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import a.airline.project2.source.P2_Login_Page;
import a.amazon.project1.source.Login_Page;

public class Testcase2_P2_Login extends Project2_Launch_Quit
{

	@Test
	public void login() throws InterruptedException
	{
		
		P2_Login_Page a2 =new P2_Login_Page(d1);
		Thread.sleep(2000);
	a2.click_on_flight_ticket_bookings_button();
		a2.un();
		a2.ctn();
		a2.pwd();
		a2.sign_in();
	}}
