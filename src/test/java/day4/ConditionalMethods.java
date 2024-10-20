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
		
		//boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		
		//System.out.println("status:"+status);

		//isSelected
		
		//WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		
		//WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//System.out.println("Before selection.......");
		
		//System.out.println(male_rd.isSelected());
		
		//System.out.println(female_rd.isSelected());
		
		//System.out.println("After selecting male.....");
		//male_rd.click();
		
		//System.out.println(male_rd.isSelected());
		
		//System.out.println(female_rd.isSelected());
		
		//System.out.println("After selecting female...");
		
		//female_rd.click();
		
		//System.out.println(male_rd.isSelected());
		 
		//System.out.println(female_rd.isSelected());
		
		//isSelected 
		
		boolean newsletterstatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		
		System.out.println("newsletter checkbox status : "+newsletterstatus);
		
		
		
		
		
	}

}
