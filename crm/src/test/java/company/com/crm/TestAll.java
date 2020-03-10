package company.com.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAll {
	WebDriver d;

	
@Test	
public void login()
	{
		//Base_all.launchb();
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium project\\Selenium webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
	 d = new ChromeDriver();
	d.get("https://ui.cogmento.com");
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	}



@Test

public void print()
{
	System.out.println("Hi test is done");
}
}