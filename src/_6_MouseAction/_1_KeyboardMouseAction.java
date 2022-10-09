package _6_MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _1_KeyboardMouseAction {
	WebDriver driver;
	
	public void Keyboard() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement GoogleSearch=driver.findElement(By.name("q"));
		
		
		//keyDown-press key //keyUp-release key
		Actions act=new Actions(driver);
		act.keyDown(GoogleSearch, Keys.SHIFT).sendKeys("selenium").build().perform();
		act.keyDown(GoogleSearch, Keys.CONTROL).sendKeys("a").build().perform();
		act.keyDown(GoogleSearch, Keys.CONTROL).sendKeys("x").build().perform();
		
	}
	public static void main(String[] args) {
		_1_KeyboardMouseAction k=new _1_KeyboardMouseAction();
		k.Keyboard();
	}
}
