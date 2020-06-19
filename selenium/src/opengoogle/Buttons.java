package opengoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//1. get the position
		driver.get("http://leafground.com/pages/Button.html");
		WebElement getposition = driver.findElement(By.id("position"));
		Point position = getposition.getLocation();
	int x = position.getX();
	int y = position.getY();
	System.out.println("x is :"+ x + "y is:"+y);
	//2. get the color
WebElement colorbutton = driver.findElement(By.id("color"));
String color = colorbutton.getCssValue("background-color");
System.out.println("the color is:"+color);
//3.find the size
WebElement size =driver.findElement(By.id("size"));
int height =  size.getSize().getHeight();
int width = size.getSize().getWidth();
System.out.println("Height is:" + height + "Width is :" + width);
//4. go to home


	}
	

}
