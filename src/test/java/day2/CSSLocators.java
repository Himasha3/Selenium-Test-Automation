package day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#s")).sendKeys("T-shirts");
		
	}

}
