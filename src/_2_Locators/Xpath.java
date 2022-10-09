package _2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath {

	WebDriver driver;
	
	public void xpath() {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\Pranay\\\\Documents\\\\LearnSeleniumFiles\\\\edgedriver_win64 (1)\\\\msedgedriver.exe");
		driver=new EdgeDriver();
		
		
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php");
		
		//Contains
		driver.findElement(By.xpath("//input[contains(@id,'weblog_title')]")).sendKeys("Hello");
		
		//OR
		driver.findElement(By.xpath("//*[@name='user_name' or @id='user_login123455']")).sendKeys("Pranay");
		////*[@name='user_name'] | //*[@id='user_login123455']
		
		//And
		driver.findElement(By.xpath("//*[@name='user_name' and @id='user_login']")).clear();
		
		//Starts with
		driver.findElement(By.xpath("//input[starts-with(@name,'admin_password')]")).clear();
		
		//text()
		boolean res=driver.findElement(By.xpath("//*[text()='Welcome']")).isDisplayed();
		System.out.println(res);
		
		//XPATH AXES
		//ancestor - //input[@name='user_name']/ancestor::form[@method='post']
		//child - //tr[@class='form-field form-required user-pass1-wrap']/child::*
		//descendent - //tr[@class='form-field form-required user-pass1-wrap']/descendant::*
		//following - //tr[@class='form-field form-required user-pass1-wrap']/following::*
		//Parent //preceding //preceding-siblings //self
		
		//chropath - easy extension to identify elements
		
	}
	
	public static void main(String[] args) {
		
		Xpath x=new Xpath();
		x.xpath();
		
	}

}
