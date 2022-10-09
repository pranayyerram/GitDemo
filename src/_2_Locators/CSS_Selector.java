package _2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSS_Selector {
	WebDriver driver;
	
	public void Css() {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\edgedriver_win64 (1)\\\\msedgedriver.exe");
		driver=new EdgeDriver();
		
		//using ID
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php");
		
		//Using Classname
		driver.findElement(By.cssSelector("input#weblog_title")).sendKeys("Hello");
		boolean res=driver.findElement(By.cssSelector("table.form-table")).isDisplayed();
		System.out.println(res);
		
		//Other methods
		//input[name='user_name'] -- tagname[attribute='value']
		//[type='email'] == [attribute='value']
		//AND( ) - input[name='admin_email'][id='admin_email'] 
		//OR - input[name='admin_email'],[id='admin_email123']
		
		//Prefix or starts with
		driver.findElement(By.cssSelector("input[name^='user']")).sendKeys("@gmail.com");
		
		//Suffix or ends with
		driver.findElement(By.cssSelector("input[id$='email']")).sendKeys("dsd");
		
		//Substring or contains
		driver.findElement(By.cssSelector("input[id*='g_pub']")).click();
		
		
	}
	
	public static void main(String[] args) {
		CSS_Selector c=new CSS_Selector();
		c.Css();
	}
}
