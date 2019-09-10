package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Working\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++)
		{
		WebElement e = row.get(i);
		
		List<WebElement> data = driver.findElements(By.tagName("td"));
		for(int j=0;j<data.size();j++)
		{
		WebElement f = data.get(j);
		String text = f.getText();
		System.out.println(text);
			
		}
	
	}
	}
}
