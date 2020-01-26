package secondJavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
		List<WebElement> checkboxes=driver.findElements(By.xpath(".//*[@type='checkbox']"));
		for(int i=4;i<checkboxes.size();i++) 
		{
			boolean state=checkboxes.get(i).isSelected();
			if(state==false)
				checkboxes.get(i).click();
		}
		/*
		 * WebElement checkbox=driver.findElement(By.name("permission")); boolean
		 * state=checkbox.isSelected(); if(state==true)
		 * System.out.println("Checkbox already checked"); else checkbox.click();
		 */
		
	}

}
