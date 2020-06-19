package opengoogle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/table.html");
	List<WebElement> columns = driver.findElements(By.tagName("th"));
	int noofcolumns =columns.size();
	System.out.println("no of columns:" +noofcolumns);
	List<WebElement> rows = driver.findElements(By.tagName("tr"));
	int noofrows = rows.size();
	System.out.println("no of rows :"+noofrows);
	String percent =driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]")).getText();
	//td[contains(text(),'Learn to interact with Elements')]//following::td[1]
	System.out.println("percent:"+percent);
	List<WebElement> progress = driver.findElements(By.xpath("//td[2]"));
	List<Integer> allelements = new ArrayList<Integer>();
	for (WebElement webElement : progress) {
		String webElement1 = webElement.getText().replace("%","");
		allelements.add(Integer.parseInt(webElement1));
	}
	System.out.println("List:"+allelements);
	int small = Collections.min(allelements);
	System.out.println(small);
	String smallvalue = Integer.toString(small)+"%";
		System.out.println("the String is "+ smallvalue);
	String finalXpath = "//td[normalize-space()="+"\""+ smallvalue + "\""+"]"+"//following::td[1]//input";
	System.out.println(finalXpath);
	//	WebElement check = driver.findElement(By.xpath(finalXpath)); 
		//check.click();
		 	}
	//*[@id="table_id"]/tbody/tr[4]/td[3]
}
