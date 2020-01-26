package secondJavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPractice1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath(".//div[@class='fl search-box date-box gtm-onwardCalendar']")).click();
		String month=driver.findElement(By.xpath("(.//td[@class='monthTitle'])[2]")).getText();
		if(month.equals("Jan 2024"))
		{
			List<WebElement> rows=driver.findElements(By.xpath("(.//table[@class='rb-monthTable first last'])[2]/tbody/tr"));
			for(int i=1;i<=rows.size();i++)
			{
				List<WebElement> cols=driver.findElements(By.xpath("(.//table[@class='rb-monthTable first last'])[2]/tbody/tr["+i+"]/td"));
				for(int j=1;j<=cols.size();j++)
				{
					WebElement ele=driver.findElement(By.xpath("(.//table[@class='rb-monthTable first last'])[2]/tbody/tr["+i+"]/td["+j+"]"));
					String date=ele.getText();
					if(date.equals("29"))
						ele.click();
				}
			}
		}
		else
		{
			 while(!month.equals("Jan 2024"))
			 {
				   driver.findElement(By.xpath("(.//td[@class='next']/button)[2]")).click();
				   month=driver.findElement(By.xpath("(.//td[@class='monthTitle'])[2]")).getText();
				   
			        if(month.equals("Jan 2024"))
					{
						List<WebElement> rows=driver.findElements(By.xpath("(.//table[@class='rb-monthTable first last'])[2]/tbody/tr"));
						for(int i=1;i<=rows.size();i++)
						{
							List<WebElement> cols=driver.findElements(By.xpath("(.//table[@class='rb-monthTable first last'])[2]/tbody/tr["+i+"]/td"));
							for(int j=1;j<=cols.size();j++)
							{
								WebElement ele=driver.findElement(By.xpath("(.//table[@class='rb-monthTable first last'])[2]/tbody/tr["+i+"]/td["+j+"]"));
								String date=ele.getText();
								if(date.equals("29"))
									ele.click();
								
						    }
					   }
				   }
			
		     }

		}
	}

}
