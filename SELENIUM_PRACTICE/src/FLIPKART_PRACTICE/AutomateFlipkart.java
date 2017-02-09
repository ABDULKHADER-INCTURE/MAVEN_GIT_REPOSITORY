package FLIPKART_PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomateFlipkart {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver flip_driver=new FirefoxDriver();
		flip_driver.get("https://www.flipkart.com");
		flip_driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys(new String[] {"dslr"});
		flip_driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button")).click();
		Thread.sleep(5000);
		flip_driver.findElement(By.xpath(".//*[@class='_3liAhj']//*[@href='/canon-eos-1200d-kit-8-gb-card-bag-ef-s18-55-ii-55-250mm-ii-dslr-camera/p/itmdugsshxq9fdhm?pid=CAMDUGSSHXQ9FDHM&srno=s_1_1&otracker=search&lid=LSTCAMDUGSSHXQ9FDHMWEPL0W&qH=ac7edfe844c3c5f1']")).click();
		flip_driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/ul/li[2]/form/button")).click();
		Thread.sleep(5000);
		flip_driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(new String[] {"khaderabdul93@gmail.com"});
		flip_driver.findElement(By.xpath(".//*[@id='ng-app']/div/div[2]/ul/li[1]/div/div[2]/div[1]/div[2]/div[1]/form/input")).click();
		Thread.sleep(5000);
		flip_driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(new String[] {"abflipkart@123"});
		flip_driver.findElement(By.xpath(".//*[@id='ng-app']/div/div[2]/ul/li[1]/div/div[2]/div[1]/div[2]/div[1]/form/input")).click();
		flip_driver.findElement(By.xpath(".//*[@id='ng-app']/div/div[2]/ul/li[2]/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div[1]/a/p[4]")).click();
		
	}
}
