package _4_RadioBtn_CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiocheck {
	WebDriver driver;

	public void radiobtncheckbox() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		WebElement GenderRadio=driver.findElement(By.xpath("//input[@id='sex-0' and @type='radio']"));
		GenderRadio.click();
		
		WebElement professionCheck=driver.findElement(By.id("profession-1"));
		professionCheck.click();
		
		List<WebElement> list=driver.findElements(By.name("tool"));
		for(int i=0;i<list.size();i++) {
			WebElement ele=list.get(i);
			String prof=ele.getAttribute("value");
			System.out.println(prof);
		}
		
}
	
	public static void main(String[] args) {
		radiocheck r=new radiocheck();
		r.radiobtncheckbox();
	}
}