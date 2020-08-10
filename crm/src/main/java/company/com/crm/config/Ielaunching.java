package company.com.crm.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ielaunching {

	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "C:\\selenium project\\Selenium webdriver\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");

   WebDriver e = new InternetExplorerDriver();
  
    e.get("https://www.facebook.com");
   e.manage().window().maximize();
    e.findElement(By.xpath("//input[@name='email']")).sendKeys("okhgfd");
    e.findElement(By.xpath("//input[@name='pass']")).sendKeys("mastre");
    e.findElement(By.xpath("")).click();
    
	}

}
