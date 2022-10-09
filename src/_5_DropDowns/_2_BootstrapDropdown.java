package _5_DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_BootstrapDropdown {
	WebDriver driver;
	
	public void bootstrap() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='dropdown-menu']"));
		for(WebElement ele:list) {
			String value=ele.getText();
			System.out.println(value);
		}
		
	}
	
	public static void main(String[] args) {
		_2_BootstrapDropdown b=new _2_BootstrapDropdown();
		b.bootstrap();
	}
}
