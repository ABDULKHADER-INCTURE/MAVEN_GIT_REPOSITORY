package Kaust;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KaustMain {

	private static final String Element = null;

	public static void main(String[] args) {


		
		
		
		
//		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		

		
		
		driver.get("https://sthcibpdqq1.kaust.edu.sa:50001/dashboard/index.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id='__hbox170']/div[2]"));
		System.out.println("element displayed" + element1.isDisplayed());
		element1.click();
		
		 Actions action = new Actions(driver); 
	     System.out.println("drivers action"+driver);
	     action.moveToElement(element1).click();
	     
	     
	     //Displaying list data 
	     List<WebElement> liElements = driver.findElements(By.xpath("//*[@id='__list27']"));
	        System.out.println("list size" + liElements.size());
	        for (int i = 1; i < liElements.size()+1; i++) {
	            WebElement linkElement = driver.findElement(By.xpath("//*[@id='__list27']"));
	            System.out.println("list containt " + linkElement.getText());
	        }
	        
	      // click from list data 
	        
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     WebElement value = driver.findElement(By.xpath("//*[@id='__item123-__xmlview9--idLab-4']"));
			System.out.println("value"+value.isDisplayed()); 
			 System.out.println("value ---------> " + value.getText());
		     System.out.println("drivers action"+driver);
		     driver.findElement(By.xpath(".//*[@id='__item123-__xmlview9--idLab-4']")).click();
		  
		     
		     
			
	  // click action on button

		     WebElement btn_click = driver.findElement(By.xpath("//*[@id='__hbox172']/div//*[@id='__button58']"));
				System.out.println("btn_click"+value.isDisplayed()); 
			     System.out.println("drivers action"+driver);
			     action.moveToElement(btn_click).click().perform();
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     System.out.println("move to next page");
			     
			     
		  
		
		//Select se=new Select(element);
		////Here we will take multi select dropdown to show you the difference
		//se.selectByVisibleText("Analytical Core Lab");
		
		//driver.findElement(By.xpath("//*[@id='__xmlview9--idLab-arrow']")).click();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='__item123-__xmlview9--idLab-1']")).click();
		
		

	}

}

