package opengoogle;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DownloadAfile {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement download = driver.findElement(By.linkText("Download Excel"));
		download.click();
		//Thread.sleep(3000);
		File fileLocation = new File("C:\\Users\\Hayat basha\\Downloads");
		File[] totalFiles = fileLocation.listFiles();
		for (File file : totalFiles) {
			if(file.getName().equals("testleaf(4).xlsx")) {
				System.out.println("file is downloaded");
				break;
			}
			
		}
		
	}

}
