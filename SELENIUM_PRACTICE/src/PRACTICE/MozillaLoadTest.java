package PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaLoadTest {

public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.co.in");
		//driver.close();
		
		}
}
