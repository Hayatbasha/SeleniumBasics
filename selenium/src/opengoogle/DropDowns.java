package opengoogle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1);
		select.selectByIndex(3);
		Thread.sleep(3000);
		select.selectByValue("2");
		Thread.sleep(3000);
		select.selectByVisibleText("Selenium");
		
List<WebElement> noofoptions =  select.getOptions();
int size = noofoptions.size();
System.out.println(size);
	WebElement multiselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
	Select multiple = new Select(multiselect);
	multiple.selectByIndex(1);
	multiple.selectByIndex(2);
	multiple.selectByIndex(3);
	//dropdown1.sendKeys("loadrunner");
	
	
	*/
		driver.manage().deleteAllCookies();
		driver.get("http://www.globalsqa.com/demo-site/select-dropdown-menu/");
	
	WebElement dropdown	=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
	Select select = new Select(dropdown);
	select.selectByVisibleText("Pakistan");
	select.selectByIndex(21);
/*	dropdown .click();
	List<WebElement> si =	driver.findElements(By.xpath("//div/p/select/option"));
	for (WebElement webElement : si) {
		String p = webElement.getAttribute("innerHTML");
		if(p.contentEquals("India")) {
			webElement.click();
		break;
	}
		/*for (int i=0;i<si.size();i++) {
		WebElement w=	si.get(i);
		String p = w.getAttribute("innerHTML");
		if(p.contentEquals("India")) {
			w.click();
		break;
		}
			System.out.println(p);
				
		}*/
}}
