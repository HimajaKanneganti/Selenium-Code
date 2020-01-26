package secondJavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALLLinksExample 
{
  
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int count=0;
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().equals(""))
			{
				count++;
				System.out.println(links.get(i).getText());
			}
		}
		System.out.println(count);
	
	}
}
