package day5;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.opencart.com/");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		

	}

}
