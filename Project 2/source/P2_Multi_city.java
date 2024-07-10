package a.airline.project2.source;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P2_Multi_city
{
	WebDriver d1;
	
@FindBy(xpath="//div[@class='_6a9abefc']/ul/li")
List <WebElement> select_inter_city;
@FindBy(xpath="//button[.='Book']")
WebElement click_book_button;
//step2
public void choose_inter_city()
{

	int count =select_inter_city.size();
	System.out.println(count);
	
	select_inter_city.get(9).click();
	
}
public void book_button()
{
	
	click_book_button.click();
}
//step3
public P2_Multi_city(WebDriver d1) 
{
	PageFactory.initElements(d1, this);
}
}
