package opengoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");
		WebElement mailbox = driver.findElement(By.id("email"));
		mailbox.sendKeys("basha0752@gmail.com");
		WebElement append = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		append .sendKeys("Text");
		WebElement textbox = driver.findElement(By.name("username"));
		String value =	textbox .getAttribute("value");
		System.out.println(value);
		WebElement clear = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		     clear.clear();
	WebElement disabled = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
	boolean get = disabled.isEnabled();
	System.out.println(get);
	
	//driver.manage().window().Minimize();
	}

}
