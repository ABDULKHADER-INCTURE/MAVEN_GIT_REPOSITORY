package PRACTICE;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateRedbus {

	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	//selecting Source
    	driver.findElement(By.xpath(".//*[@id='txtSource']")).sendKeys(new String[] { "Bangalore" });
    	//selecting Destination
    	driver.findElement(By.xpath(".//*[@id='txtDestination']")).sendKeys(new String[] { "Chennai" });
    	//selecting date of journey
    	//driver.findElement(By.xpath(".//*[@id='txtOnwardCalendar']"));
    	String date= driver.findElement(By.xpath("//table[2]/tbody/tr[3]/td[4]")).getText();
    	System.out.println(date);
    	
    	
    	//WebElement element = driver.findElement(By.xpath("//table[2]/tbody/tr[3]/td[4]"));
        //System.out.println(element);
    	//Actions actions = new Actions(driver);

    	//actions.moveToElement(element).click();
    	
    	
    	
    	//driver.findElement(By.xpath(".//*[@id='rbcal_txtOnwardCalendar']/table[1]/tbody/tr[7]/td[6]")).click(); 
    	//driver.findElement(By.xpath("//td[text()='"+month+"']/../..//a[text()='"+date+"']")).click();
    	//String date="27-May 2016";
    	//String splitter[]= date.split("-");
    	//String month_year = splitter[1];
    	//String day=splitter[0];
    	
    	//driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
    	
	}

}
