package a.airline.project2.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import a.airline.project2.source.P2_Registration_Page;

public class Testcase1_P2_NewAccount 
{
WebDriver d1;
@Test
public void new_account() throws InterruptedException
{
d1=new ChromeDriver();
d1.get("https://www.amazon.in/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex");
P2_Registration_Page P1 =new P2_Registration_Page(d1);
P1.un();
P1.email();
P1.pwd();
P1.vef_pwd();
P1.continue_button();
}
}
