package day5;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands2 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		 
		 Set<String> windowIDs = driver.getWindowHandles();
		 
		 List<String> windowList = new ArrayList(windowIDs);
		 
		 String parentID = windowList.get(0);
		 String childID = windowList.get(1);
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().window(childID);
		 
		 Thread.sleep(3000);
		 
		 System.out.println(driver.getTitle());
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().window(parentID);
		 
		 System.out.println(driver.getTitle());
				 
		 
		 

	}

}
