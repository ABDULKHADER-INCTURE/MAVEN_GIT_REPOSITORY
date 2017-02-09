package PRACTICE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class New {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		
		//TO login to gmail
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("khaderabdul93@gmail.com");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='gaia_loginform']//*[@id='Passwd']")).sendKeys("Nainaayisha");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		System.out.println("Logged In");
		
		//Inside gmail account //*[@id=":hn"]/div/div //*[@id=":gq"]/div/div
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.findElement(By.className("z0")).click();//click on compose button
		System.out.println("Clicked on compose button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		driver.findElement(By.className("vO")).sendKeys("s");
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
		     action.moveToElement(a1.get(3)).click().build().perform();
		//a1.get(0).click();
		System.out.println("First MailID Clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//driver.findElement(By.className("vO")).sendKeys(",");
		//Thread.sleep(100000);
//		//a1.clear();
//		
//		driver.findElement(By.className("vO")).sendKeys("c");
//		System.out.println("Second letter 'c' Entered");
//		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//		Thread.sleep(10000);
//		List<WebElement> a2= driver.findElements(By.className("Jd-axF"));
//		  System.out.println("list 2 size : " + a2.size());
//	        for (int i = 0; i < a2.size(); i++) {
//	            System.out.println("list contains : " + a2.get(i).getText());
//	        }
//	        Actions action1 = new Actions(driver); 
//		     System.out.println("drivers action"+driver);
//		     action1.moveToElement(a2.get(0)).click().build().perform();
//		System.out.println("Second MailID Clicked");

	    //attaching file
	    driver.findElement(By.className("a1")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    //String selection will copy the file
	    StringSelection stringSelection = new StringSelection("E:\\OFFICE_IMPORTANT\\FRESH-DIRECT\\AP AUTOMATION\\FRAMEWORK_AUTOMATION\\Invoice\\Kellogg_106830347_PO562531_Cr Allowances.pdf");
	    //Toolkit will create an object and holds the file which is present in the clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		System.out.println("yes");
	    
	    Robot r=new Robot();//robot class to upload a file 
	    r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
	 
	    
	    System.out.println("Sending");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("  //*[@id=':m8']")).click();//send button 
	}

}

