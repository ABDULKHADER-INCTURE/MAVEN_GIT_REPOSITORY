package Account_Payable;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver= new ChromeDriver();
		
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
	    
     
	    driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[2]/a")).click();
	    System.out.println("AP is clicked");
        System.out.println("driverstart"+driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("html/body/div[2]/aside//*[@id='apmenu']/li[1]/a")).click();
        System.out.println("Inbox is clicked");
        driver.manage().timeouts().implicitlyWait(220, TimeUnit.SECONDS);
        System.out.println("wait done");
        System.out.println("driver"+driver); 


        WebElement selectelement = driver.findElement(By.xpath(".//*[@id='__field0-I']"));
        System.out.println("found xpath of search ");
        System.out.println("IS ENABLED = " + selectelement.isEnabled());
        System.out.println("IS DISPLAY = " + selectelement.isDisplayed());
        System.out.println("IS SELECTED = " + selectelement.isSelected());
        
        org.openqa.selenium.Point coordinates= selectelement.getLocation();
        System.out.println("Co-ordinates : " + selectelement.getLocation());
        Robot robot1 = new Robot();
        robot1.mouseMove(921,198);
        Thread.sleep(3000);   
        robot1.delay(15000);
        robot1.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot1.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        System.out.println("Search is clicked");
        
        Actions action1 = new Actions(driver);
        Thread.sleep(2000);
        action1.sendKeys(new String [] {"AP281116000006"}).perform();
        System.out.println("value is entered");
       // robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        robot1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        WebDriverWait wait = new WebDriverWait(driver, 300);
        WebElement selecttask= (WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='__link0-col0-row0']")));
        Thread.sleep(10000);
        selecttask.click();
        System.out.println("Task is clicked");
        System.out.println("Task is opened"); 
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        System.out.println("Wait over");
       
        Thread.sleep(30000);
        robot1.keyPress(KeyEvent.VK_CONTROL);
        robot1.keyPress(KeyEvent.VK_TAB);
        robot1.keyRelease(KeyEvent.VK_TAB);
        robot1.keyRelease(KeyEvent.VK_CONTROL);
        System.out.println("switched to main tab");
        
        Thread.sleep(30000);
        System.out.println("In main tab");
        //driver.switchTo().defaultContent();
        //System.out.println(" Switched to default content ");
        
        WebElement iframe= (WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-content']//*[@class='modal-body']//*[@class='bootstrap-dialog-body']//*[@class='bootstrap-dialog-message']//*[@id='iframeId']")));
        driver.switchTo().frame(iframe);
        System.out.println("Switched to IFRAME");
        Thread.sleep(10000);
        System.out.println("Wait over for checkbox");
        WebElement checkbox= driver.findElement(By.xpath("//*[@id='__box2-accpay--idInvoiceTable-1']//*[@id='__box2-accpay--idInvoiceTable-1-CbBg']"));
        System.out.println("Check box found");
        System.out.println("IS ENABLED = " + checkbox.isEnabled());
        System.out.println("IS DISPLAY = " + checkbox.isDisplayed());
        System.out.println("Check box location = " + checkbox.getLocation()); 
        Actions action2 = new Actions(driver);
        //driver.switchTo().activeElement();
        checkbox.click();
      //  action2.click(checkbox);
        System.out.println("IS SELECTED = " + checkbox.isSelected());
        System.out.println("Check box clicked");
        Thread.sleep(20000);
        driver.findElement(By.xpath("//*[@id='__picker0-inner']")).sendKeys(new String[] {"Nov 25, 2016"});
        System.out.println("Posting Date Entered");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id='__picker1-inner']")).sendKeys(new String[] {"Nov 25, 2016"});
        System.out.println("Base Line Date Entered");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id='__input1-inner']")).sendKeys(new String[] {"01687853"});
        System.out.println("Invoice number entered");
        Thread.sleep(5000);
        WebElement submit= driver.findElement(By.xpath("//*[@id='__button2']"));
        submit.click();
        System.out.println("Clicked on submit");
        Thread.sleep(5000);
        WebElement confirmsubmit= driver.findElement(By.xpath("//*[@id='__button28']"));
        confirmsubmit.click();
        System.out.println("Clicked on confirmsubmit");
        Thread.sleep(10000);
        System.out.println("Checking for Alert");
        System.out.println("Checking for Alert message");
        
        Thread.sleep(10000);
      //  System.out.println("Task Successfully Completed");
        String message= driver.findElement(By.className("sapMDialogScrollCont")).getText();
		  System.out.println("message: "+message );
        
        Thread.sleep(10000);
   	    String message1= driver.findElement(By.className("sapMDialogScrollCont")).getText();
		  System.out.println("message: "+message1 );
//      String check = driver.findElement(By.cssSelector("#__alert0-title>span")).getText();
//      if (check == "Error") {
//    	  System.out.println("Error");  
//    	  String Errormessage= driver.findElement(By.className("sapMDialogScrollCont")).getText();
//		  System.out.println("Errormessage: "+Errormessage );
//	} 
//      else
//      {
//    	  System.out.println("Success");
//    	  System.out.println("Task Successfully Completed");
//    	  String Successmessage= driver.findElement(By.className("sapMDialogScrollCont")).getText();
//		  System.out.println("Successmessage: "+Successmessage );
//      }
        
       String Mesage=  driver.findElement(By.xpath("//*[@id='__button28']")).getText();
       System.out.println("Mesage: "+Mesage );
       
        System.out.println("Clicking ok");
      //tagname[contains(@class,'partial classname')]
         driver.findElement(By.className("sapMBarChild sapMBtn sapMBtnBase")).click();
        System.out.println("Done");
}
}
