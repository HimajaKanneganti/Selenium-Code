package firstJavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ffProileEx 
{
    public static void main(String[] args) 
    {
		ProfilesIni ini=new ProfilesIni();
		FirefoxProfile fp=ini.getProfile("Himaja");
		WebDriver driver=new FirefoxDriver(fp);
		
	}
	
}
