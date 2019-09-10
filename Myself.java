package automation;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Myself {
	
	WebDriver driver;
	@BeforeClass
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Working\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Assert.assertTrue(driver.getPageSource().contains("Create"));
	}
	
	@BeforeMethod
	
	public void starttime() {
		Date d =new Date();
		System.out.println("d");

	}
	
	@AfterMethod
	public void endtime() {
		Date d=new Date();
		System.out.println("d");
	}
	
	@AfterClass
	public void closebrowser() {
	driver.quit();
	
	}
	
	@Test
	public void testa() {
		
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("Keerthana");
		WebElement f = driver.findElement(By.id("pass"));
		f.sendKeys("keerts");
		
	}
	
	@Test
	public void testb() {
		WebElement g = driver.findElement(By.id("loginbutton"));
		g.click();

	}
	

}
