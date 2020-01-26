package abstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customer 
{
	public static void main(String[] args) 
	{
		Yamaha obj=new ABCYamaha();
		WebDriver driver=new ChromeDriver();
		obj.tyres();
		obj.color();
		obj.gears();
	}

}
