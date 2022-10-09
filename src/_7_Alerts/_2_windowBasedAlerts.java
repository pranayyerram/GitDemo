package _7_Alerts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_windowBasedAlerts {

	
WebDriver driver;
	
	public void WindowAlert() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\Authen.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		_2_windowBasedAlerts w=new _2_windowBasedAlerts();
		w.WindowAlert();

	}

}
