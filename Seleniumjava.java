package automation;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Seleniumjava {
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch");
	}
	@BeforeMethod
	public void starttime() {
		System.out.println("Start");
	}
	@AfterMethod
	public void startend() {
		System.out.println("end");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close");
	}
	@Test
	public void testc() {
	Assert.assertTrue(true);
	Assert.assertTrue(false);
	Assert.assertTrue(true);
	System.out.println("2");
	}
	@Test
	public void testa() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		System.out.println("3");
	}
	@Test
	public void testb() {
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		System.out.println("1");
	}
	

}
