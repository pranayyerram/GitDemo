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

public class _3_SendfileRobotClass {
	
	WebDriver driver;
	public void SendFileRobot() throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(2000);
		
		WebElement FileUpload=driver.findElement(By.xpath("//input[@id='input-4' and @type='file']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(FileUpload).click().perform();
		Thread.sleep(2000);
		Robot rb=new Robot();
		
		StringSelection s=new StringSelection("C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\xyz.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		_3_SendfileRobotClass s=new _3_SendfileRobotClass();
		s.SendFileRobot();

	}

}
