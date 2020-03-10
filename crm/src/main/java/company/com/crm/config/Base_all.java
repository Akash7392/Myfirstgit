package company.com.crm.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Base_all {
	
	public static WebDriver d;
	public static Properties prop;
	
 public  Base_all() throws IOException
	
	{
		prop = new Properties();
		FileInputStream ip= new FileInputStream("D:\\Eclipse\\eclipse-workspace\\crm\\config.properties");
	    prop.load(ip);
	 }
	
 public static void launchb()
		
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium project\\\\Selenium webdriver\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		 d = new ChromeDriver();
		d.get(prop.getProperty("https://ui.cogmento.com"));
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
	}
 
	public static void takescreenshot(WebDriver d, String name) throws IOException
	
	{
		TakesScreenshot shc = (TakesScreenshot)d;
		File sr = shc.getScreenshotAs(OutputType.FILE);
		Files.copy(sr, new File("D:\\Eclipse\\eclipse-workspace\\crm\\CRM screen sot\\"+name+".png"));
	}
}
