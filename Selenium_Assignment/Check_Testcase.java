package selenium_Assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Testcase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream f1 = new FileInputStream("F:\\Testcase.xlsx");
		Workbook w1 =WorkbookFactory.create(f1);
		//ChromeDriver d1 = new ChromeDriver ();
		
		for (int i=1; i<=6;i++)
		{
			for (int j=1; j<=2;j++)
			{
				String username =w1.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.println(username);
				Thread.sleep(2000);
				String password =w1.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			System.out.println(password);	
			ChromeDriver d1 = new ChromeDriver ();
			d1.get("https://www.facebook.com/login/");
			WebElement c1 = d1.findElement(By.name("email"));
			c1.sendKeys(username);
			WebElement c2 = d1.findElement(By.name("pass"));
			c2.sendKeys(password);
			WebElement c3 = d1.findElement(By.name("login"));
			c3.click();
			Thread.sleep(2000);
			
			}
			
			
		}
		

		

		

	}

}
