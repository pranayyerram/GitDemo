package _3_WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_NavigationCommands {
	
	WebDriver driver;
	public void navigate() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.co.in");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		_2_NavigationCommands n=new _2_NavigationCommands();
		
		n.navigate();
	}
}