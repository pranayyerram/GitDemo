package _3_WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_WebElementCommands {
	WebDriver driver;
	
	public void navigate() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		
		System.out.println(driver.findElement(By.cssSelector("input#profession-1")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("input#profession-1")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("input#profession-1")).isSelected());
		
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("name"));
		
		System.out.println(driver.findElement(By.xpath("//*[contains(@class,'btn btn-info')]")).getSize());

		//driver.findElement(By.xpath("//*[contains(@class,'btn btn-info')]")).submit();
		
		
	}
	public static void main(String[] args) {
		_3_WebElementCommands w=new _3_WebElementCommands();
		w.navigate();
		

	}

}
