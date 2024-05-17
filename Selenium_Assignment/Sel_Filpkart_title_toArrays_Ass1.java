	package selenium_Assignment;
	import java.util.*;
	
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Sel_Filpkart_title_toArrays_Ass1
	{
	
		public static void main(String[] args)
		{
			ChromeDriver d1 =new ChromeDriver();//empty browser
			d1.get("https://www.filpkart.com");//navigate to google.com
		//	d1.close();
			
			String d = d1.getTitle();
			System.out.println(d);
			/*for (int i=0;i <d.length();i++)
			{
				char output = d.charAt(i);
				System.out.println(output);
			}*/
				char[] c1 =d.toCharArray();
			System.out.println(Arrays.toString (c1));
				
			}
			
	
		}
	
	
