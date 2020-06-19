package opengoogle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		WebElement button = driver.findElement(By.id("click"));
	button.click();	
String text = 	driver.findElement(By.id("Click")).getText();
	System.out.println(text);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	driver.switchTo().frame("frame2");
	driver.findElement(By.id("Click1")).click();
	driver.switchTo().defaultContent();
List<WebElement> total = driver.findElements(By.tagName("iframe"));
int size = total.size();
System.out.println(size);*/

	/*	System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://www.globalsqa.com/demo-site/frames-and-windows/");
driver.findElement(By.id("iFrame")).click();
Thread.sleep(3000);
driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[3]/p/iframe")));
driver.switchTo().frame(3);

Thread.sleep(5000);
//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='mailmunch-topbar-iframe mailmunch-topbar-iframe-1729f36210918526']")));
//new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/iframe[@class='mailmunch-topbar-iframe mailmunch-topbar-iframe-1729f36210918526']")));
driver.findElement(By.xpath("/html/body/div[1]/iframe[@class='mailmunch-topbar-iframe mailmunch-topbar-iframe-1729f36210918526']")).sendKeys("basha0752@gamil.com");
//*[@id="custom_field_text_field_1016375"]
		//WebElement button =	driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='button e.g. button_hilite button_pale small_button'][contains(text(),'Click Here')]"));
//button.click();*/

		//driver.getWindowHandle();
//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"/t");

System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.getWindowHandle();
driver.get("http://leafground.com/pages/frame.html");
((JavascriptExecutor) driver).executeScript("window.open()");

ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
driver.get("http://google.com");
//WebElement button1 =	driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='button e.g. button_hilite button_pale small_button'][contains(text(),'Click Here')]"));
//button1.click();
//driver.close();
driver.switchTo().window(tabs2.get(0));
String oldwindow = driver.getWindowHandle();
//driver.switchTo().window(oldwindow.get(1));



	}

}
