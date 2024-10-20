package day4;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
        //get url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		Thread.sleep(5000);
		
		
		//getTitle
		
		//System.out.println(driver.getTitle());
		
		//getCurrentUrl
		
		//System.out.println(driver.getCurrentUrl());
		
		//getPageSource
		//System.out.println(driver.getPageSource());
		
		//getWindowHnadle
		//String windowid = driver.getWindowHandle();
		
		//System.out.println("Window ID :"+windowid);
		
		//getWindowHandles
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowids = driver.getWindowHandles();
		
		System.out.println(windowids);
		
		
	}

}
