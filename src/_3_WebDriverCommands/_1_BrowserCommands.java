package _3_WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_BrowserCommands {

	WebDriver driver;
	public void BroSpecificCommands() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.co.in");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.close();
		
		driver.quit();
	}
	
	
	public static void main(String[] args) {
		_1_BrowserCommands b=new _1_BrowserCommands();
		b.BroSpecificCommands();

	}

}
