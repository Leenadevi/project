package a.amazon.project1.test;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import a.amazon.project1.source.Registration_Page;



public class Testcase1_Registration extends Testcase1_Registration_LauchQuit
{
	
	@Test
	public void registration_page()
	{
		
		Registration_Page a1 =new Registration_Page(d1);
		a1.un();
		a1.email();
		a1.pwd();
		a1.vef_pwd();
		a1.continue_button();
	}
	
	
}
