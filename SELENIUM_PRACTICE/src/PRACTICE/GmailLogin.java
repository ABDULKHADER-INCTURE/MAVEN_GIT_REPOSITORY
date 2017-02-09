package PRACTICE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		System.out.println("Gmail Opened");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("Email")).sendKeys(new String[] { "khaderabdul93@gmail.com" });
		System.out.println("Email ID Entered");
		driver.findElement(By.id("next")).click();
		
		driver.findElement(By.xpath("//*[@id='gaia_loginform']//*[@id='Passwd']")).sendKeys(new String[] { "Nainaayisha" });
		System.out.println("Password Entered");
		driver.findElement(By.xpath("//*[@id='gaia_loginform']//*[@id='signIn']")).click();
		System.out.println("Signed In");
		
		Thread.sleep(3000);
		
		Robot robot = new Robot();
			
		 driver.findElement(By.className("z0")).click();//click on compose button
			System.out.println("Clicked on compose button");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			

			driver.findElement(By.className("vO")).sendKeys("a");
			System.out.println("First letter 'a' Entered");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			List<WebElement> a1= driver.findElements(By.className("Jd-axF"));
			//System.out.println(" test in list "+list.get(0).getText());
			  System.out.println("list size : " + a1.size());
		        for (int i = 0; i < a1.size(); i++) {
		            System.out.println("list contains : " + a1.get(i).getText());
		        }
		        Actions action = new Actions(driver); 
			     System.out.println("drivers action"+driver);
			     action.moveToElement(a1.get(1)).click().build().perform();
			//a1.get(0).click();
			System.out.println(" MailID Clicked");
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		driver.findElement(By.className("aoT")).sendKeys(new String[] { "FD AP AUTOMATION" });
		System.out.println("Subject Entered");
		Thread.sleep(5000);
		driver.findElement(By.className("Am")).sendKeys(new String[] { "Hi Team," +"\r\n "+"\r\n "+
				"Please process the attached invoice PDF" });
		System.out.println("Message Entered");
		Thread.sleep(3000);
		driver.findElement(By.className("a1")).click();
		System.out.println("Clicked on Attachment button");
		  Thread.sleep(3000);
		  
		     StringSelection ss = new StringSelection("E:\\OFFICE_IMPORTANT\\FRESH-DIRECT\\AP AUTOMATION\\FRAMEWORK_AUTOMATION\\Invoice\\Kellogg_106830347_PO562531_Cr Allowances.pdf");
		     
		     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		     System.out.println("Path is copied in clipboard");
		    
		     Thread.sleep(5000);
		     
		     //robot.keyPress(java.awt.event.KeyEvent.KEY_PRESSED);
		     robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		     robot.keyPress(java.awt.event.KeyEvent.VK_V);
		     robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		     robot.keyRelease(java.awt.event.KeyEvent.VK_V);
		     Thread.sleep(6000);
		     robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		     robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
		     Thread.sleep(5000);
	    System.out.println("Attached the attachment");
	    WebDriverWait wait = new WebDriverWait(driver, 500);
	    WebElement sendbutton= (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("J-J5-Ji")));
	      sendbutton.click();
	   // driver.findElement(By.className("J-J5-Ji")).click();		
		System.out.println("Clicked on sent");
		System.out.println("Mail sent with an attachment");
		
		
		
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a")).click();
		driver.findElement(By.id("gb_71")).click();		
		System.out.println("Signed Out");
	}}

	

