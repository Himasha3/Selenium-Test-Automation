package day4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		
        //get url
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
