package secondJavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeEx 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		WebElement dropdown=driver.findElement(By.id("gh-cat"));
		Select sel=new Select(dropdown);
		List<WebElement> items=sel.getOptions();
		for(int i=0;i<items.size();i++)
		{
			String text=items.get(i).getText();
			if(text.equals("Books"))
			{
				System.out.println("Books found");
			}
			else if(!text.equals("Books"))
			{
				
			}
			/*else
			{
				System.out.println("Books not found");
			}*/
		}
		
		
	}
	
}
