package opengoogle;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		WebElement e = driver.findElement(By.id("tags"));
		e.sendKeys("s");
		Thread.sleep(3000);
	List<WebElement> optionsList = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
	System.out.println(optionsList.size());
	for (WebElement webElement : optionsList) {
		if(webElement.getText().equals("Web Services")) {
			webElement.click();
			System.out.println("selecting:" +webElement.getText());
			break;
		}
				
				
	}
		
		
		
	}

}
