package day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		
		//isDispalyed
		
		//WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		//System.out.println("Display status of logo :"+logo.isDisplayed());
		
		//isEnabled
		
		boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		
		System.out.println("status:"+status);

	}

}
