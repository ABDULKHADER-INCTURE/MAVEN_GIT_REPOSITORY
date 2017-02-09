package Account_Payable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;

public class ApAutomation {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		
	    driver.get("https://employeetest.freshdirect.com/fdportal/index.html");
	    System.out.println("Portal opened");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//*[@id='logonuidfield']")).sendKeys( new String[] {"accpay_reviewer"});
	    System.out.println("User name entered");
	    driver.findElement(By.xpath("//*[@id='logonpassfield']")).sendKeys(new String[] {"incture123"});
	    System.out.println("password entered");
	    driver.findElement(By.xpath("//*[@id='logonForm']/table/tbody/tr[5]/td[2]/input")).click();
	    System.out.println("Logged In");
	    driver.manage().timeouts().implicitlyWait(220, TimeUnit.SECONDS);
	    
      //WebDriverWait wait = new WebDriverWait(driver, 500);
      //WebElement selectAp= (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/aside/section/ul/li[2]/a")));
      //selectAp.click();
	    driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[2]/a")).click();
	    
	    
      System.out.println("AP is clicked");
      
      driver.manage().timeouts().implicitlyWait(220, TimeUnit.SECONDS);
     
      System.out.println("driverstart"+driver);
      //WebElement selectinbox= (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='apmenu']/li[1]/a")));
      //selectinbox.click();
      
      driver.findElement(By.xpath("//*[@id='apmenu']/li[1]/a")).click();
      System.out.println("Inbox is clicked");
      
      driver.manage().timeouts().implicitlyWait(220, TimeUnit.SECONDS);
      System.out.println("wait done");
      System.out.println("driver"+driver);
      //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
      
//     WebElement selectsearch=driver.findElement(By.xpath("//*[@id='__field0-F']//*[@id='__field0-I']"));
//     System.out.println("driversearch"+driver);
//     System.out.println("clicked = "+selectsearch.isDisplayed());
//     System.out.println("clicked = "+selectsearch.isEnabled());
//     
//     driver.switchTo().defaultContent();
//     driver.switchTo().activeElement();
//     Actions action = new Actions(driver); 
//     System.out.println("drivers action"+driver);
//     //webdriver.switchTo().activeElement();
//     action.moveToElement(selectsearch).doubleClick();
//     action.sendKeys(new String [] {"AP081116000012"});
//     action.perform();
//     System.out.println("driverdefcont1"+driver);
//     selectsearch.sendKeys(new String [] {"AP081116000012"} );
//     System.out.println("AP081116000012 is searched");
//    // System.out.println("wait vale"+wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='__field0-F']//*[@id='__field0-I']"))));
//    // selectsearch.click();
      driver.switchTo().defaultContent();
      //driver.findElement(By.xpath("//*[@id='__page0-cont']"));
      
      System.out.println("WAIT 150 DONE ");
      driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
      System.out.println("WAIT 200 DONE ");
      
      
      WebDriverWait wait = new WebDriverWait(driver, 500);
      WebElement selectelement= (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("__field1-I")));
      System.out.println("found xpath ");
      System.out.println("IS ENABLED = " + selectelement.isEnabled());
      System.out.println("IS DISPLAY = " + selectelement.isDisplayed());
      System.out.println("IS SELECTED = " + selectelement.isSelected());
      Actions action = new Actions(driver); 
      System.out.println("drivers action"+driver);
      driver.switchTo().activeElement();
      action.moveToElement(selectelement).click(selectelement).build().perform();
      System.out.println("Clicked on search");

      
      
      
     
     
       
     /* selectsearch.sendKeys(new String [] {"AP081116000012"} );
        System.out.println("AP081116000012 is searched");
     
      driver.close();
      
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      WebElement selecttask= (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='__link0-col0-row0']")));
      selecttask.click();
      System.out.println("Task is clicked");
      System.out.println("Task is opened");
      */
	}
}
