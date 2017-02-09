package FRESHDIRECT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;

public class Vp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		
	    driver.get("https://suppliertest.freshdirect.com/Vendorportal/index.html#!");
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id='loginForm']//*[@id='userName']")).sendKeys( new String[] {"kaditya621@gmail.com"});
	    driver.findElement(By.xpath("//*[@id='loginForm']//*[@id='userPwd']")).sendKeys(new String[] {"Incture123"});
	    driver.findElement(By.xpath("//*[@id='loginForm']/input[3]")).click();
	    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    
      WebDriverWait wait = new WebDriverWait(driver, 300);
      WebElement selectsearch = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tags']")));
      selectsearch.sendKeys(new String[] {"contact"});
      selectsearch.click();
      System.out.println("Search is clicked");
	    
//	    driver.findElement(By.xpath("/html/body/div[2]/header/nav/a[1]")).click();
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	    
//	    
//        WebDriverWait wait = new WebDriverWait(driver, 300);
//        WebElement selectrequest = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='15']/a")));
//        selectrequest.click();
//        System.out.println("ServiceRequest is clicked");
//        
//        WebElement selectallrequest = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='16']/a")));
//        selectallrequest.click();
//        System.out.println("All request is clicked");
        
        
//	    WebElement selectReport = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='7']/a")));
//	    selectReport.click();
//	     System.out.println("Report is clicked");
//	    
//	    WebElement selectInvoice = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='10']/a")));
//	    selectInvoice.click();
//	     System.out.println("Invoice report is clicked");
	}


}
