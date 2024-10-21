package day5;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		//select specific checkbox
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//select multiple checkboxes
		
		//List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//for(int i=0; i<3;i++)
	//	{
			
		//	checkboxes.get(i).click();
		//}
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(6000);
		
		driver.switchTo().alert().accept();
		
		
		
		

	}

}
