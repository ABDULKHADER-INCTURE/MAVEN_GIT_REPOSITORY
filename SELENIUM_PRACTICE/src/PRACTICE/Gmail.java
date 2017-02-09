package PRACTICE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("Email")).sendKeys(new String[] { "khaderabdul93@gmail.com" });
		driver.findElement(By.id("next")).click();
		
		driver.findElement(By.xpath("//*[@id='gaia_loginform']//*[@id='Passwd']")).sendKeys(new String[] { "Nainaayisha" });
		driver.findElement(By.xpath("//*[@id='gaia_loginform']//*[@id='signIn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id=':ik']")).click();
		driver.findElement(By.xpath(".//*[@id=':ma']//*[@id=':oe']")).sendKeys(new String[] { "abdul.khader@incture.com" });
		driver.findElement(By.xpath(".//*[@id=':ma']//*[@id=':ny']")).sendKeys(new String[] { "Gmail Automation_Please not respond to this Email" });
		driver.findElement(By.xpath(".//*[@id=':ma']//*[@id=':no']")).click();
		//driver.findElement(By.xpath(".//*[@id=':pt']")).click();
	}}

	

