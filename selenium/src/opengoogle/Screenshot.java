package opengoogle;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws AWTException, IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Alert.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]")).click();
		
		/*TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Hayat basha\\Downloads\\sample.png");
				
		FileHandler.copy(source,destination);*/
		Robot robot = new Robot();
		Dimension screenshot = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(screenshot);
		BufferedImage source = robot.createScreenCapture(rect);
		File destination = new File("C:\\Users\\Hayat basha\\Downloads\\sample1.png");
		ImageIO.write(source,"png", destination);
		
		
	}

	

}
