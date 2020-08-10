package faqinsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qa_in_sel_by_naveen {
	
	static WebDriver web;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium project\\Selenium webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver web= new ChromeDriver();
	web.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//b.get("https://www.techlistic.com/p/selenium-practice-form.html");
	web.manage().deleteAllCookies();
	web.manage().window().maximize();

	web.findElement(By.xpath("//input[@id='login1']")).sendKeys("akbhai");
	web.findElement(By.xpath("//input[@name='proceed' and @value='Sign in']")).click();
	web.switchTo().alert().accept();
	web.switchTo().defaultContent();
///  String gh=al.switchTo().alert().getText();
  
   //   web.navigate().forward();

	}

}
