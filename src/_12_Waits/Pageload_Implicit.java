package _12_Waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pageload_Implicit {
	
	WebDriver driver;
	public void Waitssss() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Thread.sleep(5);
		
		driver.findElement(By.id("testWait123")).click();
		WebElement ele=driver.findElement(By.id("timeout_text"));
		
		//Explicit Wait
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timeout_text")));
		
		//Fluent Wait
		Wait Fluwait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
		
		WebElement element = (WebElement) Fluwait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.id("timeout_text"));
			}
		});
		}
	public static void main(String[] args) throws InterruptedException {
		Pageload_Implicit p=new Pageload_Implicit();
		p.Waitssss();

	}

}
