package firstJavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstJavaClass {
	public static void main(String[] args) {
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Himaja Kanneganti\\Downloads\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himaja Kanneganti\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); 
	//driver.manage().window().maximize();
    
	driver.get("https://google.com");
	
	driver.get("https://flipkart.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.quit();
	
	}
}
