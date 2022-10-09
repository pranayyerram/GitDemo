package _6_MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _2_DoubleRightClick {

	
	WebDriver driver;
	
	public void Keyboard() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		/*driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.id("doubleClickBtn"));
		WebElement ele1=driver.findElement(By.id("rightClickBtn"));
		
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
		
		act.contextClick(ele1);
		*/
		driver.get("https://demo.automationtesting.in/Static.html");
		WebElement from1=driver.findElement(By.xpath("//*[@id=\"angular\"]"));
		WebElement to=driver.findElement(By.id("droparea"));
		Actions act=new Actions(driver);
		act.dragAndDrop(from1, to).perform();
		
	}
	public static void main(String[] args) {
		_2_DoubleRightClick d=new _2_DoubleRightClick();
		d.Keyboard();

	}

}
