package opengoogle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Image.html");
		WebElement image = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		image.click();	
	
		driver.navigate().back();
	WebElement broken = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));	
	if(broken.getAttribute("naturalWidth").equals("0")) {
		System.out.println("image is broken");
	}else {
			System.out.println("image is not broken");
	}
	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/img")).click();
	
	}

}
