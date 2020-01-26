package secondJavaPackage;

import org.openqa.selenium.WebDriver;

public class Methods 
{
	public void verifyTitle(WebDriver driver,String titleToVerify)
	{
		String actualTitle=driver.getTitle();
		boolean result=titleToVerify.equals(actualTitle);
		if(result)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
