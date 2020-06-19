package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long starttime;
	long endtime;
	@BeforeSuite
	public void launchBrowser() {
		 starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","G:\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
@Test
	public void openGoogle() {	
		driver.get("http://google.co.in");
	}
@Test
	public void openBing() {
	driver.get("http://bing.com");
}
@Test
	public void openYahoo() {
	driver.get("http://yahoo.com");
	}
@AfterSuite
public void closeBrowser() {
	driver.quit();
	 endtime = System.currentTimeMillis();
	long totaltime = endtime - starttime;
	System.out.println("total time :"+totaltime);
}
	}
