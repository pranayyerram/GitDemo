package _8_UploadAndDownloadFile;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _4_Download_file {
	WebDriver driver;
	
	public void DownloadFile() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		
		
		String DownloadPath="C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles";
		
		ChromeOptions options = new ChromeOptions();
		
		HashMap<String,Object> chromeprefs=new HashMap<String,Object>();
		chromeprefs.put("profile.default_content_settings.popups", 0);
		chromeprefs.put("download.default_directory", DownloadPath);
		
		chromeprefs.put("download.prompt_for_download", false);
		options.setExperimentalOption("prefs", chromeprefs);
		
		driver=new ChromeDriver(options);
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Download")).click();
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		_4_Download_file d=new _4_Download_file();
		d.DownloadFile();

	}

}
