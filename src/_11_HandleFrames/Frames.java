package _11_HandleFrames;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	WebDriver driver;
	public void Framess() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		/*
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		List<WebElement> allFrames=driver.findElements(By.tagName("iframe"));
		for(WebElement ele:allFrames) {
			System.out.println(ele.getAttribute("name"));
		}
		
		driver.switchTo().frame(driver.findElement(By.id("singleframe")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("xyz");
		*/
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='analystic' and @aria-expanded='true']/parent::li[@class='active']")).click();
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("xyz");
		
	}
	public static void main(String[] args) throws InterruptedException {
		Frames f=new Frames();
		f.Framess();
	}
}
