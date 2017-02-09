package REDBUS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateBus {

	
	public static void main(String[] args) throws InterruptedException {
		
		AutomateRedbus redbus=new AutomateRedbus();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	driver.findElement(By.xpath(".//*[@id='txtSource']")).sendKeys(new String[] { "Bangalore" });
    
    	driver.findElement(By.xpath(".//*[@id='txtDestination']")).sendKeys(new String[] { "Chennai" });
    	Thread.sleep(6000);
    	//redbus.checkAlert();
    	driver.findElement(By.id("txtOnwardCalendar")).click();
    	//redbus.checkAlert();
    	Thread.sleep(3000);
    	  try {
    		    // WebDriver driver = null;
    				 //  WebDriver driver1 = new FirefoxDriver();
    				WebDriverWait wait = new WebDriverWait(driver, 5);
    		        wait.until(ExpectedConditions.alertIsPresent());
    		        Alert alert = driver.switchTo().alert();
    		        alert.dismiss();
    		        
    		    } catch (Exception e) {
    		        //exception handling
    		    }
    	
    	
    	driver.findElement(By.xpath(".//*[@id='rbcal_txtOnwardCalendar']/table[1]/tbody/tr[4]/td[6]")).click();
    	driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
    	Thread.sleep(6000);
    	
	}
	

	public void checkAlert() 
	{
	    try {
	    // WebDriver driver = null;
			   WebDriver driver1 = new FirefoxDriver();
			WebDriverWait wait = new WebDriverWait(driver1, 5);
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = driver1.switchTo().alert();
	        alert.dismiss();
	        
	    } catch (Exception e) {
	        //exception handling
	    }
	}
}

