package company.com.crm.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAgain {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\selenium project\\Selenium webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
     WebDriver d = new ChromeDriver();
			d.get("https://ui.cogmento.com");
			d.manage().window().maximize();
			
			d.findElement(By.xpath("//input[@name='email']")).sendKeys("akashyesankar999@gmail.com");
			d.findElement(By.xpath("//input[@name='password']")).sendKeys("Crmpro@2019");
			d.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
			System.out.println("successful log in");
		


	}

}
