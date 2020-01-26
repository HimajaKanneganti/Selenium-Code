package secondJavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDExample 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://ebay.com");
		WebElement dropdown=driver.findElement(By.id("gh-cat"));
		Select sel=new Select(dropdown);
		WebElement ele=sel.getFirstSelectedOption();
		String defaultvalue=ele.getText();
		if(defaultvalue.equals("All Categories"))
		{
			System.out.println("Dfault value matched");
		}
		else
		{
			System.out.println("Dfault value not matched");
		}
	}

}
