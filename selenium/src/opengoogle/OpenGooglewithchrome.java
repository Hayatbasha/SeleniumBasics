package opengoogle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenGooglewithchrome {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeoptions);
		driver.navigate().to("http://google.co.in");
//driver.navigate().refresh();
//driver.get(driver.getCurrentUrl());
JavascriptExecutor execute = (JavascriptExecutor)driver;
execute.executeScript("location.reload()");
Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_F5);
robot.keyRelease(KeyEvent.VK_F5);
		//driver.manage().window().maximize();
		//Dimension size = new Dimension(1366, 768);
		//driver.manage().window().setSize(size);
		//String current = driver.getCurrentUrl();
		//System.out.println("current url is :" +current);
		//String page = driver.getPageSource();
		//System.out.println("pagesource is :" +page);
		//driver.findElement(By.name("q")).sendKeys("agni"+Keys.ENTER);
		//driver.quit();
	}

}
