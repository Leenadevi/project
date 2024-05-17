package a.amazon.project1.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project1.ddt.ExcelSheet_Program_1;

public class Login_Page extends  ExcelSheet_Program_1 
{
		//EdgeDriver d1;
		WebDriver d1;
		@FindBy(name ="email")
		WebElement username_tf;
		@FindBy(id ="continue")
		WebElement continue_button;
		
		@FindBy(name ="password")
		WebElement password_tf;
		
		@FindBy(id="signInSubmit")
		WebElement sign_In_button;
		
		public void un()
		{
			username_tf.sendKeys(username);
			//username_tf.sendKeys("8567890232");
			
		}
		public void ctn()
		{
			continue_button.click();;
		}
		
		public void pwd()
		{
			password_tf.sendKeys(password);
			//password_tf.sendKeys("lee@1234);
		}
		public void sign_in()
		{
			sign_In_button.click();;
		}
	public Login_Page(WebDriver d1)
	{
		PageFactory.initElements(d1, this);
	}
		
		

	}


