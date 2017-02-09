package Kaust;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class main {

	private static final String Element = null;

	public static void main(String[] args) throws AWTException {


		
		
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		

		
		
		driver.get("https://sthcibpdqq1.kaust.edu.sa:50001/dashboard/index.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='loginForm']/div[2]/input")).sendKeys("billorr");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='loginForm']/div[3]/input")).sendKeys("Kaust.1234");
		driver.findElement(By.xpath("//*[@id='loginForm']/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[4]/a")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//*[@id='contentFrameId']"));
		driver.switchTo().frame(element);
		System.out.println("Switched to Frame");
		
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		WebElement element1 = driver.findElement(By.xpath("//*[@id='__hbox170']/div[2]"));
//		System.out.println("element displayed : " + element1.isDisplayed());
//		//element1.click();
//		 
		 Actions action = new Actions(driver); 
//	     System.out.println("drivers action"+driver);
//	     action.moveToElement(element1).click();
//	     
		 
		 WebElement arrow = driver.findElementByXPath(".//*[@id='__xmlview9--idLab-arrow']");
		 action.click(arrow).build().perform();
	     
	     //Displaying list data 
	     List<WebElement> liElements = driver.findElements(By.xpath("//*[@id='__list27']"));
	        System.out.println("list size : " + liElements.size());
	        for (int i = 0; i < liElements.size()+1; i++) {
	            WebElement linkElement = driver.findElement(By.xpath("//*[@id='__list27']"));
	            System.out.println("list contain : " + linkElement.getText());
	        }
	        
	      // click from list data 
	        
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     WebElement value = driver.findElement(By.xpath(".//*[@id='__item123-__xmlview9--idLab-4']"));
			System.out.println("value  :"+value.isDisplayed()); 
			 System.out.println("value ---------> " + value.getText());
		     System.out.println("drivers action"+driver);
		     Actions action2 = new Actions(driver);
		     driver.switchTo().activeElement();
		     action2.click(value).build().perform();
		    // driver.findElement(By.xpath(".//*[@id='__item123-__xmlview9--idLab-4']")).click();
		  
		     
		     Robot robot = new Robot();
			
	  // click action on button
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     WebElement btn_click = driver.findElement(By.xpath(".//*[@id='__button58']"));
				System.out.println("btn_click"+value.isDisplayed()); 
			     System.out.println("drivers action"+driver);
			     Actions action1 = new Actions(driver);
			     action1.moveToElement(btn_click).click().perform();
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     System.out.println("move to next page");
//			     
//			 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//			  List<WebElement> PocketID = driver.findElements(By.xpath(".//*[@id='__xmlview10--pidcb-inner']"));
//		        System.out.println("list size" + PocketID.size());
//		        for (int i = 0; i < PocketID.size()+1; i++) {
//		            WebElement PocketID1 = driver.findElement(By.xpath(".//*[@id='__xmlview10--pidcb-inner']"));
//		            System.out.println("list containt " + PocketID1.getText());
//		        } 
//		        
//		     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		     WebElement value1 = driver.findElement(By.xpath(".//*[@id='__item317-content']/div[1]/div"));
//				System.out.println("value"+value.isDisplayed()); 
//				 System.out.println("value ---------> " + value1.getText());
//			     System.out.println("drivers action"+driver);
//			     Actions action2 = new Actions(driver);
//			     action2.click(value1).build().perform();
//			     System.out.println("Value is selected");
//			     
//			     
//			     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//			     driver.findElementByXPath("//*[@id='__xmlview10--submitrfs-inner']");
//			     Actions action3 = new Actions(driver);
//			     action3.click(value1).build().perform();
//			     System.out.println("Moved to next tab");
//			     
//			     
//		//Select se=new Select(element);
//		////Here we will take multi select dropdown to show you the difference
//		//se.selectByVisibleText("Analytical Core Lab");
//		
//		//driver.findElement(By.xpath("//*[@id='__xmlview9--idLab-arrow']")).click();
//		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		//driver.findElement(By.xpath("//*[@id='__item123-__xmlview9--idLab-1']")).click();
//		
//		
//
	}

}
