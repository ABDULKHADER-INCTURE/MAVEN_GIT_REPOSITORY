package pageObjects;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {
	
	public static WebDriver driver;
	ExtentReports report;
	ExtentTest logger;

	public static boolean bResult;
	public  BaseClass(WebDriver driver){

		BaseClass.driver = driver;
		BaseClass.bResult = true;
	}
	public  BaseClass(ExtentReports report){
	  this.report=report;
		
	}public  BaseClass(ExtentTest logger){

	  this.logger=logger;
		
	}

}
