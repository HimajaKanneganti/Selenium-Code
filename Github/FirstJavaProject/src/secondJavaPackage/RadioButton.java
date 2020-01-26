package secondJavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
		boolean radiobutton=driver.findElement(By.id("two")).isSelected();
		if(radiobutton==false)
			driver.findElement(By.id("two")).click();
		else
			System.out.println("Radiobutton is already clicked");
		
	}

}
