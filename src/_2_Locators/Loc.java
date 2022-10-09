package _2_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc {
	WebDriver driver;
	
	public void Locators(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php?step=2");
		
		//ID Locator
		driver.findElement(By.id("weblog_title")).sendKeys("Pranay");
		
		//NAME Locator
		driver.findElement(By.name("user_name")).sendKeys("Pranay");
		
		//CLASSNAME Locator
		//driver.findElement(By.className("regular-text empty")).clear();
		//driver.findElement(By.className("regular-text empty")).sendKeys("Pranay");
		//driver.findElement(By.className("button wp-hide-pw")).click();
		
		//TAGNAME
		List<WebElement> list=driver.findElements(By.tagName("th"));
		System.out.println(list.size());
		
		//LINKTEXT
		//driver.findElement(By.linkText("Search engine visibility")).isDisplayed();
		//driver.findElement(By.partialLinkText(""));
		
		driver.close();
	}
	
	public static void main(String[] args) {
		Loc l=new Loc();
		l.Locators();
	}
	
	
}
