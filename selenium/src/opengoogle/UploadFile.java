package opengoogle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	String file ="C:\\Users\\Hayat basha\\Downloads\\testleaf(2).xlsx";
	 StringSelection selection = new StringSelection(file);
	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	 driver.get("https://gofile.io/?t=uploadFiles");
		WebElement click = driver.findElement(By.id("btnChooseFiles"));
		click.click();
		
	 Robot robot = new Robot();
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_V);
	 robot.keyRelease(KeyEvent.VK_V);
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 
	 robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);
	}
	//"C:\Users\Hayat basha\Downloads\testleaf.xlsx"
}
