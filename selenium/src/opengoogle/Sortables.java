package opengoogle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/sortable.html");
	List<WebElement> sortable = driver.findElements(By.xpath("//*[@id='sortable']/li"));
	WebElement to = sortable.get(0);
	WebElement from = sortable.get(6);
	Actions action = new Actions(driver);
action.clickAndHold(from);
action.moveToElement(to);
action.release(to);
action.build().perform();
	
	}
	
}
