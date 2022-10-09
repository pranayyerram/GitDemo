package _7_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_WebBased {
	
	WebDriver driver;
	
	public void webAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		//Simple alert (ok)
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		driver.switchTo().alert().accept();
		//String alertText=alert.getText();
		//System.out.println(alertText);
		Thread.sleep(2000);
		//Confirmation alert (Yes/No)
		driver.findElement(By.linkText("Alert with OK & Cancel ")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		//Prompt Alert
		driver.findElement(By.linkText("Alert with Textbox ")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println(alertText);
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		_1_WebBased w=new _1_WebBased();
		w.webAlert();
	}

}
