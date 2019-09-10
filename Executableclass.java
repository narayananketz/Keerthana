package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Executableclass extends Baseclass {
	public static void main(String[] args) {
		 launchBrowser("https://www.facebook.com");	
		 WebElement k = driver.findElement(By.id("email"));
			send(k,"keerthana");
		WebElement j = driver.findElement(By.id("pass"));
			send(j,"keerth");
		closeBrowser();
			
		launchBrowser("https://www.instagram.com");
		WebElement f = driver.findElement(By.xpath("//input[@name='fullName']"));
			send(f,"keerthana");
		WebElement g = driver.findElement(By.xpath("//input[@name='username']"));
		send(g,"keerthana");
		
		closeBrowser();

	}
	
	

	


}
