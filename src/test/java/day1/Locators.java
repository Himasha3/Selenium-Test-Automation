package day1;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		//boolean logoDisplaystatus =driver.findElement(By.id("logo")).isDisplayed();
		
		//System.out.println(logoDisplaystatus);
		
		//linkText
		//driver.findElement(By.linkText("Tablets")).click();
		
		//partialLinkText
		//driver.findElement(By.partialLinkText("Table")).click();
		
		//classname
		List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		
		System.out.println("total number of header links "+headerLinks.size());
		
		

	}

}
