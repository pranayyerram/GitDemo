package _8_UploadAndDownloadFile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _2_SendfileToolKit {
	WebDriver driver;
	public void SendFileAutoIT() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(2000);
		
		WebElement FileUpload=driver.findElement(By.xpath("//input[@id='input-4' and @type='file']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(FileUpload).click().perform();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\UploadFileAutoIT.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		_2_SendfileToolKit s=new _2_SendfileToolKit();
		s.SendFileAutoIT();

	}

}
