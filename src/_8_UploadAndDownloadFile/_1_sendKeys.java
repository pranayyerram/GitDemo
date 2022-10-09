package _8_UploadAndDownloadFile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _1_sendKeys {
	
	WebDriver driver;
	
	public void FileSendKeys() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(2000);
		
		WebElement FileUpload=driver.findElement(By.xpath("//input[@id='input-4' and @type='file']"));
		
		FileUpload.sendKeys("C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\xyz.txt");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		_1_sendKeys s=new _1_sendKeys();
		s.FileSendKeys();
		
	}

}
