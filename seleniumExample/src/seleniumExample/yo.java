package seleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yo {
	public static void main(String arr[]) throws InterruptedException
	{System.setProperty("webdriver.gecko.driver",
		"C:\\Users\\HP\\Desktop\\driver\\geckodriver-v0.20.1-win64\\geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("http://www.gmail.com");
       driver.findElement(By.name("identifier")).sendKeys("testautomationqai");
       driver.findElement(By.id("identifierNext")).click();
       Thread.sleep(1000);
       driver.findElement(By.name("password")).sendKeys("automation@123");
       driver.findElement(By.id("passwordNext")).click();
       driver.close();

	}
}
