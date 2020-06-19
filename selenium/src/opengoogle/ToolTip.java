package opengoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	/*	System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		WebElement name = driver.findElement(By.id("age"));

		String n = name.getAttribute("title");
		System.out.println(n);*/
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.globalsqa.com/demo-site/tooltip/");
		driver.findElement(By.xpath("//*[@id=\"Forms Based\"]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2679\"]/div[2]/div/div/div[3]/p/iframe")));
	WebElement ele =	driver.findElement(By.name("firstname"));
	String b = ele.getText();
	System.out.println(b);
		/*Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		Actions action = new Actions(driver);
		WebElement bas =driver.findElement(By.xpath("/html/body/div[1]/div/h3/a"));
	action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/h3/a")))
			.build().perform();
		String aa = bas.getText();
		System.out.println(aa);*/
	}

}
