package testNG;

import org.testng.annotations.Test;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
    @Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver","G:\\\\chromedriver_win32\\\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
	   ChromeDriver driver = new ChromeDriver();
		 driver.get("http://google.co.in");
	    // driver.close();
		 driver.executeScript("window.open()");
    	  //((JavascriptExecutor)driver).executeScript("window.open()");
		  ArrayList<String> tabs = new ArrayList<String>( driver.getWindowHandles() );
		  driver.switchTo().window(tabs.get(1)); 
		  driver.get("http://yahoo.com");
		 
		 driver.close();
		//String A =  driver.getWindowHandle();
		//System.out.println("window is :" +A);
		//  ((JavascriptExecutor)driver).executeScript("window.close()");
		 
	/*
	 * @Test public void openYahoo() { System.setProperty("webdriver.chrome.driver",
	 * "G:\\\\chromedriver_win32\\\\chromedriver.exe"); WebDriver driver = new
	 * ChromeDriver(); driver.get("http://yahoo.com"); driver.quit();
	 * 
	 * }
	 */
    }
}
