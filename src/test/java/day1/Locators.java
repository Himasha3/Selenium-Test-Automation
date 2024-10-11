package day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
		driver.findElement(By.linkText("Tablets")).click();
		

	}

}
