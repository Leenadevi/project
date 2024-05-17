package a.amazon.project1.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Invaild_Credentials
{
	//EdgeDriver d1;
			ChromeDriver d1;
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
			//	username_tf.sendKeys("8526729522");
				username_tf.sendKeys("8567890232");
				
			}
			public void ctn()
			{
				continue_button.click();;
			}
			
			public void pwd()
			{
			//	password_tf.sendKeys("12345@lee");
				password_tf.sendKeys("lee@1234");
			}
			public void sign_in()
			{
				sign_In_button.click();;
			}
		public Login_Invaild_Credentials(WebDriver d12)
		{
			PageFactory.initElements(d12, this);
		}
			
			

		}

