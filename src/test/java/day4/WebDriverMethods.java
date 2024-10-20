package day4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		
        //get url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		
		
		//getTitle
		
		System.out.println(driver.getTitle());
		
		//getCurrentUrl
		
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource
		System.out.println(driver.getPageSource());
		
		//getWindowHnadle
		String windowid = driver.getWindowHandle();
		
		System.out.println("Window ID :"+windowid);
		
	}

}
