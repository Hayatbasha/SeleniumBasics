package opengoogle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Link.html");
WebElement home = driver.findElement(By.linkText("Go to Home Page"));
home.click();
driver.navigate().back();
WebElement one = driver.findElement(By.partialLinkText("Find where am"));
 String H1 = one.getAttribute("href");
 System.out.println("the link is:"+H1);
 WebElement broken = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/a"));
 broken.click();
String title = driver.getTitle();
if(title.contains("404")) {
	System.out.println("link is broken");
}else {
	System.out.println("link is not broken");
}
driver.navigate().back();
WebElement home1 = driver.findElement(By.linkText("Go to Home Page"));
home1.click();
driver.navigate().back();
List<WebElement> no = driver.findElements(By.tagName("a"));
int s = no.size();
System.out.println(s);
	}

}
