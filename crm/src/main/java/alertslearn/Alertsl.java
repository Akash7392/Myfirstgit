package alertslearn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsl {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium project\\Selenium webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver al= new ChromeDriver();
	al.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//b.get("https://www.techlistic.com/p/selenium-practice-form.html");
	al.manage().deleteAllCookies();
	al.manage().window().maximize();

  al.findElement(By.xpath("//input[@id='login1']")).sendKeys("akbhai");
  al.findElement(By.xpath("//input[@name='proceed' and @value='Sign in']")).click();
  al.switchTo().alert().accept();
  al.switchTo().defaultContent();
///  String gh=al.switchTo().alert().getText();
  
   //   al.navigate().forward();
  
	}

}
