package _1_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch {
	WebDriver driver;
	
	public void LaunchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
	}
	
	public void LaunchIEBrowser() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\IEDriverServer_Win32_4.3.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		
		driver.get("https://www.google.co.in/");
	}
	
	public void LaunchFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
	}
	
	public void LaunchEdgeBrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver=new EdgeDriver();
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
	}
	
	public void CloseBrowser() {
		driver.quit();
	}
	
	
	public static void main(String args[]) {
		
		Launch l=new Launch();
		//l.LaunchChromeBrowser();
		//l.LaunchIEBrowser();
		//l.LaunchFirefoxBrowser();
		l.LaunchEdgeBrowser();
		l.CloseBrowser();
		
	}
}
