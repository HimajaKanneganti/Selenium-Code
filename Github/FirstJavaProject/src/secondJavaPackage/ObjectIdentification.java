package secondJavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(15000);
		WebElement wb=driver.findElement(By.className("LM6RPg"));
		wb.sendKeys("Sling Bags");
		WebElement wb1=driver.findElement(By.className("vh79eN"));
		wb1.click();
		//driver.quit();
	}
}
