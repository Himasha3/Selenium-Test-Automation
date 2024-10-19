package day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		//Xpath with single attribute
		
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirts");
		
		//Xpath with multiple attributes
		
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirts");
		
		//Xpath with and or operators
		
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Tshirts");
		
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Tshirts");
		
		//Xpath with inner text - text()
		
		driver.findElement(By.xpath("//*[text() = 'MacBook']")).click();
		
		boolean displaystatus = driver.findElement(By.xpath("//h3[text() = 'Featured']")).isDisplayed();
		
		System.out.println(displaystatus);

	}

}
