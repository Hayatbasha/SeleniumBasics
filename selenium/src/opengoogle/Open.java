package opengoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.co.in");
		//String current = driver.getCurrentUrl();
		//System.out.println("current url is :" +current);
		//String page = driver.getPageSource();
		//System.out.println("pagesource is :" +page);
	String title = driver.getTitle();
	System.out.println("title is :"+title);
	}

}
