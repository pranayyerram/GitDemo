package _9_Scrolling_RightLeftUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AllScrollings {

	WebDriver driver;
	public void scroll() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver=new EdgeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//Scroll using page dimensions
		//js.executeScript("window.scrollBy(1000,2000)");
		
		//Scroll by visible element
		WebElement ele=driver.findElement(By.id("yearbox"));
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		
		//Scroll till end of page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public static void main(String[] args) {
		AllScrollings a=new AllScrollings();
		a.scroll();

	}

}
