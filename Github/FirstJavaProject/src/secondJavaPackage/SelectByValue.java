package secondJavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		WebElement dropdown=driver.findElement(By.id("gh-cat"));
		Select sel=new Select(dropdown);
		sel.selectByValue("11450");
		sel.selectByVisibleText("Dolls & Bears");
		sel.selectByIndex(4);
		
	}
}
