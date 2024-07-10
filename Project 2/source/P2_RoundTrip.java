package a.airline.project2.source;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P2_RoundTrip {
	WebDriver d1;
	@FindBy(xpath = "//span[.='Round Trip']")
	WebElement Roundtrip_radio_button;

	@FindBy(xpath = "(//span[@class='colorBase sizeMedium _8d2f006b _79bb5d49'])[1]")
	WebElement click_on_source_location_button;

	@FindBy(xpath = "//input[@name='searchText']")
	WebElement enter_source_location_name;

	@FindBy(xpath = "//div[@class='_1a6c1b03']/div/div")
	List<WebElement> select_from_location;

	@FindBy(xpath = "(//span[@class='colorBase sizeMedium _8d2f006b _79bb5d49'])[2]")
	WebElement click_on_destination_place;

	@FindBy(xpath = "//input [@name='searchText']")
	WebElement enter_destination_place_name;

	@FindBy(xpath = "//div[@class='_1a6c1b03']/div/div")
	List<WebElement> select_To_location;

	@FindBy(xpath = "(//div[@class='_79bb5d49'])[1]")
	WebElement click_on_date_label;

	@FindBy(xpath = "//div[@class='_8bd51405']/ul/li")
	List<WebElement> choose_date;

	@FindBy(xpath = "(//span[@class='dcb9db95 colorBase sizeMedium'])[2]")
	WebElement click_on_return_location;

	@FindBy(xpath = "//div[@class='_8bd51405']/ul/li")
	List<WebElement> select_return_date;

	@FindBy(xpath = "//div[@class='sizeMedium a8cdd5cb']")
	WebElement click_on_travellers_and_economy;

	@FindBy(xpath = "//div[@class='_4e0ac60f _75ad9cd5 ad23ce76']/div/button")
	List<WebElement> select_passengers;
	
	@FindBy(xpath="//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement search_button ;


//step2
	public void round_trip_booking() {
		Roundtrip_radio_button.click();
	}

	public void click_on_source_location_button() {
		click_on_source_location_button.click();
	}

	public void enter_source_location_name() {
		enter_source_location_name.sendKeys("Bangalore");
	}

	public void select_source_location() {
		int count = select_from_location.size();
		System.out.println(count);
		select_from_location.get(1).click();
	}

	public void click_on_dest_location() {
		click_on_destination_place.click();
	}

	public void enter_dest_location_name() 
	{
		enter_destination_place_name.sendKeys("DEL");
	}

	public void select_dest_location() {
		select_To_location.get(1).click();
	}

	public void travel_date() {
		click_on_date_label.click();
	}

	public void choose_date()
	{
		
		choose_date.get(10).click();

	}

	public void return_date() {
		click_on_return_location.click();
	}

	public void select_return_date() 
	{
		
		select_return_date.get(14).click();
	}
	public void click_on_travellers_and_economy()
	{
		click_on_travellers_and_economy.click();
	}

	public void select_passengers() throws InterruptedException 
	{
		Thread.sleep(2000);
		select_passengers.get(2).click();
		Thread.sleep(2000);
		select_passengers.get(13).click();
		Thread.sleep(1000);
		select_passengers.get(20).click();
	}
	public void search_button()
	{
		search_button.click();
	}
	

//step3
	public P2_RoundTrip(WebDriver d1) {
		PageFactory.initElements(d1, this);
	}
}