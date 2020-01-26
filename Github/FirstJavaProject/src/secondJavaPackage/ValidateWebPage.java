package secondJavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateWebPage 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		Methods m=new Methods();
		m.verifyTitle(driver, "Google");
		
	}

}
