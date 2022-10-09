package _5_DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	WebDriver driver;
	
	public void DropDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		WebElement continents=driver.findElement(By.name("continents"));
		
		Select con=new Select(continents);
		
		con.selectByIndex(2);
		Thread.sleep(2000);
		
		//con.selectByValue("South America");
		//Thread.sleep(2000);
		
		con.selectByVisibleText("North America");
		Thread.sleep(2000);
		
		//get selected value
		WebElement ele=con.getFirstSelectedOption();
		System.out.println(ele.getText());
		
		//get all values
		List<WebElement> list=con.getOptions();
		for(WebElement e:list) {
			System.out.println(e.getText());
		}
		
		con.deselectByIndex(0);
		con.deselectByValue(null);
		con.deselectByVisibleText(null);
		con.deselectAll();
		con.getAllSelectedOptions();
		
		/*driver.get("https://demo.mobiscroll.com/select/multiple-select");
		WebElement element=driver.findElement(By.xpath("//span[text()='Please select...']"));
		Select s=new Select(element);
		
		s.selectByIndex(1);
		s.selectByVisibleText("Home, Garden & Tools");
		*/
	}
	public static void main(String[] args) throws InterruptedException {
		dropdown d=new dropdown();
		d.DropDown();
	}
}
