package opengoogle;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
	String oldwindow = driver.getWindowHandle();
	WebElement Home = 	driver.findElement(By.id("home"));
	Home.click();
	Set<String> Handles = driver.getWindowHandles();
	for (String string : Handles) {
		driver.switchTo().window(string);
	}
	WebElement edit = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
	edit.click();
	driver.close();
	driver.switchTo().window(oldwindow);
	//driver.switchTo().
	WebElement noofopenwindow= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
	noofopenwindow.click();
int size=	driver.getWindowHandles().size();
	System.out.println(size);
	WebElement dontcloseme = driver.findElement(By.id("color"));
	dontcloseme.click();
	Set<String> newwindowhandles = driver.getWindowHandles();
	for (String allwindows : newwindowhandles) {
		if(!allwindows.equals(oldwindow)) {
			driver.switchTo().window(allwindows);
			driver.close();
		
		}
	}
	}

}
