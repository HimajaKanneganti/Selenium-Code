package secondJavaPackage;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot 
{
	public void takescreenshot(WebDriver driver, String fileName) throws Exception
		{
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\Himaja Kanneganti\\Documents\\"+fileName));
		}
	public static void main(String[] args) throws Exception
	{
		Screenshot obj=new Screenshot();
		WebDriver driver=new ChromeDriver();
		try 
		{
			driver.get("www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			obj.takescreenshot(driver, "screenshot1.png");
		}
		try
		{
			WebElement ele=driver.findElement(By.name("permission"));
		}
		catch(NoSuchElementException nsee)
		{
			System.out.println(nsee.getMessage());
			obj.takescreenshot(driver, "screenshot2.png");
		}
	}

}
