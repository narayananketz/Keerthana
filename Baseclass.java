package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	static WebDriver driver;
	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Working\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
		 
	}
	public static void closeBrowser() {
		driver.quit();

	}
	public static void send(WebElement loc,String text) {
		loc.sendKeys(text);
		}

	}


