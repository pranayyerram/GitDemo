package _6_MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class _3_DragDropToolTip {
	
	WebDriver driver;
	public void y() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver=new EdgeDriver();
		
		driver.navigate().to("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement from1=driver.findElement(By.id("draggable"));
		
		WebElement to=driver.findElement(By.id("droppable"));
		
		//act.dragAndDrop(from1,to).perform();
		//act.dragAndDropBy(from1, 150, 150).perform();
		
		//click and hold
		act.clickAndHold(from1).moveToElement(to).release().build().perform();
		
		//moveToElement
		//act.moveToElement(to);
		
		//ToolTip
		driver.get("https://www.automationtestinginsider.com/");
		WebElement ele=driver.findElement(By.name("q"));
		
		System.out.println(ele.getAttribute("title"));
	}
	public static void main(String[] args) {
		_3_DragDropToolTip z=new _3_DragDropToolTip();
		z.y();
	}
	
}
