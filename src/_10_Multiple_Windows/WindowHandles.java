package _10_Multiple_Windows;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
	WebDriver driver;
	public void windows() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranay\\Documents\\LearnSeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[@target='_blank']/descendant::*")).click();
		
		String ParentWindow=driver.getWindowHandle();
		System.out.println("Parent Window:  "+ParentWindow);
		
		Set<String> list=driver.getWindowHandles();
		for(String IDS:list) {
			System.out.println(IDS);
			
		}
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			String childWindow=itr.next();
			if(!(ParentWindow.equals(childWindow))) {
				driver.switchTo().window(ParentWindow);
				System.out.println(driver.getTitle());
			}
		}
		
		ArrayList<String> arr=new ArrayList<>(list);
		driver.switchTo().window(arr.get(1));
		
		
	}
	
	public static void main(String[] args) {
		WindowHandles w=new WindowHandles();
		w.windows();
	}
}
