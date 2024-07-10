package a.airline.project2.source;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P2_Seat_Selection_Page 
{
WebDriver d1;
@FindBy(xpath="//a [.='Proceed to traveller details']")
WebElement click_on_proceed_traveller_details;

@FindBy(xpath="(//span[@class='e5140519 _221e1ca9'])[1]")
WebElement click_add_new_adults_button;

@FindBy(xpath="(//div[@class='edb7cb84'])[1]")
WebElement select_gender_button ;

@FindBy(xpath="(//li[.='Female'])[1]")
WebElement select_adult_female_gender;


@FindBy(xpath="(//input [@name ='first_name'])[1]")
WebElement adults_first_middle_name;

@FindBy(xpath="(//input [@name ='last_name'])[1]")
WebElement adults_last_name;

@FindBy(xpath="(//button[@class='_7e41f983 bba41d3c    _6c913dd6'])[1]")
WebElement click_add_adult_button;

@FindBy(xpath ="(//span[@class='e5140519 _221e1ca9'])[2]")
WebElement click_on_add_new_child_arrow;

@FindBy(xpath="(//div[@class='edb7cb84'])[2]")
WebElement select_Child_gender_button ;

@FindBy(xpath="(//li[.='Female'])[2]")
WebElement select_Child_female_gender;

@FindBy(xpath ="(//input [@name='first_name'])[2]")
WebElement enter_child_first_middle_name;


@FindBy(xpath="(//input [@name ='last_name'])[2]")
WebElement child_last_name;

@FindBy(xpath="(//button[@class='_7e41f983 undefined  _50baedd0  c0de9476'])[1]")
WebElement click_on_date_brith_drop_down;

@FindBy(xpath="//a[@class='rc-calendar-year-select']")
WebElement click_child_brith_year;
@FindBy(xpath="(//a[@class='rc-calendar-year-panel-year'])[1]")
WebElement select_child_brith_year;
@FindBy(xpath="//tbody[@class='rc-calendar-year-panel-tbody']/tr/td")
List<WebElement> select_child_brith_year1;


@FindBy(xpath="//a[@title='Choose a month']")
WebElement click_on_child_brith_month;

@FindBy(xpath="//tbody[@class='rc-calendar-month-panel-tbody']/tr/td")
List<WebElement> choose_child_brith_month;


@FindBy(xpath="//tbody[@class='rc-calendar-tbody']/tr/td")
List <WebElement> choose_child_brith_date;

@FindBy(xpath="(//button[@class='_7e41f983 bba41d3c    _6c913dd6'])[2]")
WebElement click_add_child_button;

@FindBy(xpath ="(//div[@class='_7c598c35 colorLink d7c291ce'])[3]")
WebElement click_add_new_infant_link;

@FindBy(xpath="( //button[@class=' _526485ba _7e41f983   cdf8d022 _50baedd0'])[3]")
WebElement infant_drop_down_gender_option ;

@FindBy(xpath="(//li[.='Male'])[3]")
WebElement select_infant_male_option;

@FindBy(xpath="(//input [@name ='first_name'])[3]")
WebElement infant_first_middle_name;

@FindBy(xpath="(//input [@name ='last_name'])[3]")
WebElement infant_last_name;


@FindBy(xpath="(//button[@class='_7e41f983 undefined  _50baedd0  c0de9476'])[2]")
WebElement click_on_infant_date_brith_drop_down;

@FindBy(xpath="//a[@class='rc-calendar-year-select']")
WebElement click_infant_brith_year;
//@FindBy(xpath="(//a[@class='rc-calendar-year-panel-year'])[2]")
//WebElement select_infant_brith_year;
@FindBy(xpath="//tbody[@class='rc-calendar-year-panel-tbody']/tr/td")
List<WebElement> select_infant_brith_year;


@FindBy(xpath="//a[@title='Choose a month']")
WebElement click_on_infant_brith_month;

@FindBy(xpath="//tbody[@class='rc-calendar-month-panel-tbody']/tr/td")
List<WebElement> choose_infant_brith_month;


@FindBy(xpath="//tbody[@class='rc-calendar-tbody']/tr/td")
List <WebElement> choose_infant_brith_date;


@FindBy(xpath="(//button[@class='_7e41f983 bba41d3c    _6c913dd6'])[3]")
WebElement add_infant_button;

@FindBy(xpath="//input [@name='email']")
WebElement emailid;
@FindBy(xpath="(//i[@class='d726bd8f _4d2636f0'])[1]")
WebElement select_adult_checkbox;
@FindBy(xpath="(//i[@class='d726bd8f _4d2636f0'])[2]")
WebElement select_child_checkbox;
@FindBy(xpath="(//i[@class='d726bd8f _4d2636f0'])[3]")
WebElement select_infant_checkbox;
@FindBy(xpath="//button[.='Proceed to seat selection']")
WebElement proceed_to_seat_selection;

@FindBy(xpath="(//div[@class='_0d462540  _1b6b90e5  '])[1]")
WebElement selectseat1;
@FindBy(xpath="(//div[@class='_0d462540  _1b6b90e5  '])[2]")
WebElement selectseat2;
@FindBy(xpath="//button[@class='_7e41f983 bba41d3c  _50baedd0  ada8b185 _6b9247a2']")
WebElement click_on_next_button;
@FindBy(xpath="//button[.='Yes, proceed']")
WebElement proceed_button;


//step 2
public void Proceed_to_traveller_details()
{
	click_on_proceed_traveller_details.click();
}
public void click_add_new_adults_button()
{
	click_add_new_adults_button.click();
}
public void adult_gender_button()
{
	select_gender_button.click();
}
public void select_adult_gender()
{
	select_adult_female_gender.click();
}

public void adult_first_middle_name()
{
	adults_first_middle_name.sendKeys("leena");
}
public void adult_last_name()
{
	adults_last_name.sendKeys("devi");
}
public void adult_button()
{
	click_add_adult_button.click();
}
public void child_add_new_arrow()
{
	 click_on_add_new_child_arrow.click();
}
public void child_dropdown()
{
	select_Child_gender_button.click();
}
public void select_child_gender()
{
	select_Child_female_gender.click();
}
public void child_first_middle_name()
{
	enter_child_first_middle_name.sendKeys("ram");
}
public void child_last_name()
{
	child_last_name.sendKeys("kumari");
}
public void child_button()
{
	click_add_child_button.click();
}
public void date_of_birth_child_drop_down()
{
	click_on_date_brith_drop_down.click();
}
public void child_brith_year()
{
	click_child_brith_year.click();
}
public void control_Next_brith_year()
{
	select_child_brith_year.click();
}
public void select_correct_brith_year()
{
	select_child_brith_year1.get(5).click();
}
public void click_child_brith_month()
{
	click_on_child_brith_month.click();
}
public void choose_child_brith_month()
{
	choose_child_brith_month.get(4).click();
}
public void  choose_child_brith_date()
{
	 choose_child_brith_date.get(4).click();
}
public void click_add_child_button()
{
	click_add_child_button.click();
}
public void click_add_new_infant()
{
	click_add_new_infant_link.click();
}
public void infant_gender_drop_down()
{
	infant_drop_down_gender_option.click();
}
public void infant_gender_selection()
{
	select_infant_male_option.click();
}
public void infant_first_middle_name()
{
	infant_first_middle_name.sendKeys("rithik");
}
public void infant_last_name()
{
        infant_last_name.sendKeys("Tamil");
}
public void child_brithday_drop_down()
{
	click_on_infant_date_brith_drop_down.click();
}
public void click_infant_brith_year()
{
	click_infant_brith_year.click();
}
public void select_infant_brith_year()
{
	select_infant_brith_year.get(3).click();
}
public void click_on_infant_brith_month()
{
	click_on_infant_brith_month.click();
}
public void choose_infant_brith_month()
{
	choose_infant_brith_month.get(6).click();
}
public void choose_infant_brith_date()
{
	choose_infant_brith_date.get(6).click();
}
public void click_add_infant_button()
{
	add_infant_button.click();
}
public void emailID()
{
	emailid.sendKeys("m.leenadevi@gmail.com");
}
public void select_adult_checkbox()
{
	select_adult_checkbox.click();
}
public void select_child_checkbox()
{
	select_child_checkbox.click();
}
public void select_infant_checkbox()
{
	select_infant_checkbox.click();
}
public void proceed_to_seat_selection()
{
	proceed_to_seat_selection.click();
}
public void select_seat()
{
	selectseat1.click();
}
public void select_seat2()
{
	selectseat2.click();
}
public void proceed_to_next()
{
	click_on_next_button.click();
	click_on_next_button.click();
}
public void proceed_button()
{
	proceed_button.click();
}
public P2_Seat_Selection_Page(WebDriver d1)
{
	PageFactory.initElements(d1, this);
}
}