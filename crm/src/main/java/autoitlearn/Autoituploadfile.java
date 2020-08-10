package autoitlearn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoituploadfile {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium project\\Selenium webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver al= new ChromeDriver();
		al.get("file:///C:/Users/Akash/Desktop/uploadresume.html");
		al.manage().deleteAllCookies();
		al.manage().window().maximize();
		al.findElement(By.xpath("//input[@type='file']")).click();
		al.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Runtime.getRuntime().exec("C:\\Users\\Akash\\Desktop\\autoitfolder\\autoitscript.exe");
		al.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	  
	}

}
