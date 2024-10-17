package day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		//with tag id
		
		//driver.findElement(By.cssSelector("input#s")).sendKeys("T-shirts");
		
		//without tag
		
		//driver.findElement(By.cssSelector("#s")).sendKeys("T-shirts");
		
		//with tag classname(tag.classname)
		
	    // driver.findElement(By.cssSelector("input.form-control")).sendKeys("T-shirts");
	     
	     // without tag - (.classname)
	     
	    // driver.findElement(By.cssSelector(".form-control")).sendKeys("T-shirts");
		
		//with tag attribute
		
		//driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("T-shirts");
		
		//without tag - attribute
		
		driver.findElement(By.cssSelector("[placeholder= 'Search']")).sendKeys("T-shirts");
	}
	

}
