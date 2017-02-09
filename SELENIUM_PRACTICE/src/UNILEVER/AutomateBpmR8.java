package UNILEVER;
//Pushing to kunal branch
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomateBpmR8 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driverbpm=new FirefoxDriver();
		driverbpm.get("http://on8q051a.eu.unilever.com:50000/irj/portal");
		Thread.sleep(3000);
		driverbpm.findElement(By.xpath(".//*[@id='logonuidfield']")).sendKeys(new String[] {"khader_a700"});
		driverbpm.findElement(By.xpath(".//*[@id='logonpassfield']")).sendKeys(new String[] {"abdulr2q@123"});
		driverbpm.findElement(By.xpath(".//*[@id='logonForm']/table/tbody/tr[5]/td[2]/input")).click();
		Thread.sleep(15000);
		driverbpm.findElement(By.xpath(".//*[@id='tabIndex4']")).click();
		
	}
}
