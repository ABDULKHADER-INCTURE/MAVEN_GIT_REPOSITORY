package appModules;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import pageObjects.BaseClass;
import pageObjects.LogIn_Page;
import pageObjects.New_RFS;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class RFS_Action extends BaseClass{

	public RFS_Action(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void cliknewRFS(int iTestCaseRow) throws Exception{
	       
    	Log.info("page loades in the browser" );
    	 
        New_RFS.clik_RFS().click();
        Log.info("Click action is performed on RFS button clicked");
        Reporter.log("RFS clic action performed ");
    }
	
	
	

	public static void frame_swich(int iTestCaseRow) throws Exception{
	       
    	Log.info("click on drop down starts" );
    	 System.out.println("RFS action swich to frame >>>>>>  ");
     //   New_RFS.selec_drop_list().click();
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	 WebElement element = driver.findElement(By.xpath("//*[@id='contentFrameId']"));
 	 	 driver.switchTo().frame(element);
    	System.out.println("RFS action has swiched to frame >>>>>>  ");
       
    	Log.info("framr switch from action");
        Reporter.log("frame switch from action");
    }
	
	
	
	public static void selecet_drop(int iTestCaseRow) throws Exception{
	       
    	Log.info("click on drop down starts" );
    	 
     //   New_RFS.selec_drop_list().click();
    	
        Actions action = new Actions(driver); 
        String drp_option = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Lab_Sel);
	     System.out.println("drivers action in drop down "+(driver));
	     //New_RFS.selec_drop_list().click();
	     Thread.sleep(4000);
	     
	     action.moveToElement(New_RFS.selec_drop_list()).click().perform();
	     System.out.println("drivers action in drop down after click "+(driver));
	     Thread.sleep(4000);
	     String Analytical_Core_Lab="Analytical Core Lab";
	     if(drp_option==Analytical_Core_Lab)
	     {
	     Actions action1 = new Actions(driver); 
	     action1.moveToElement(New_RFS.drp_ana_cor_lab()).click().perform();
	     Log.info("Click on nano fabric");
	     System.out.println("drp nano fabric "+(driver));
	     }
	     
	     Thread.sleep(5000);
	     Actions action2 = new Actions(driver); 
	     action2.moveToElement(New_RFS.btn_req_for_servi()).click().perform();
         Log.info("Click btn next button clicked");
         Reporter.log("RFS clic action performed ");
	     
	     /*Actions action2 = new Actions(driver); 
	     action2.moveToElement(New_RFS.btn_req_for_servi()).click().perform();
         Log.info("clicked on service reqiest ");
         Reporter.log("request for service clicked btn ");*/
         
         
         
	}
	
	
	public static void Requester_Info(int iTestCaseRow) throws Exception{
         
         /* del this code 
         
         Actions action6 = new Actions(driver); 
	     action6.moveToElement(New_RFS.txt_F_Name());
         Log.info("clicked on service reqiest ");
         Reporter.log("request for service clicked btn ");*/
         
         //****click on pocket id
         
         Actions action3 = new Actions(driver);
         String drp_option1 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PocketIdSelection);
         Thread.sleep(4000);
         
	     action3.moveToElement(New_RFS.pock_ID_drp_dwn()).click().perform();
	     System.out.println("drivers action in drop down after click "+(driver));
	     
	     Log.info("clicked on pocket ID ");
         Reporter.log("pocket id drop down clicked ");
	     Thread.sleep(4000);
	     
	     
	     String Pocketid="1000001051";
	     if(drp_option1==Pocketid)
	     {
	     Actions action1 = new Actions(driver); 
	     action1.moveToElement(New_RFS.Pock_ID_drp_dwn_Selec_first()).click().perform();
	     Log.info("Click on inorganics");
	     System.out.println("drp inorganics "+(driver));
	     }
	    
    
        /* //selecting option from pocket id
         
         Actions action4 = new Actions(driver); 
	     action4.moveToElement(New_RFS.Pock_ID_drp_dwn_Selec_first()).click().perform();
         Log.info("selected pocket ID option ");
         Reporter.log("pocket id drop down option selected ");*/
         
         //next button
         
         Actions action5 = new Actions(driver); 
	     action5.moveToElement(New_RFS.req_info_next_btn()).click().perform();
         Log.info("clicked next btn ");
         Reporter.log("next btn is clicked ");
         
         //txt_F_Name
         
	}
	
	public static void Service_Area_Section(int iTestCaseRow) throws Exception{
	
	
		 Actions action6 = new Actions(driver); 
		 String drp_option2 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ServiceAreaSection);
		 
		 Thread.sleep(4000);
	     action6.moveToElement(New_RFS.serv_area_drp_dwn()).click().perform();
         Log.info("clicked on service area dropdown ");
         Reporter.log("service area dropdown is clicked ");
         
         String Inorganics= "Inorganics";
         if(drp_option2.equals(Inorganics))
         {
        	 Actions action1 = new Actions(driver); 
    	     action1.moveToElement(New_RFS.serv_area_drp_dwn_selec_frst()).click().perform();
    	     Log.info("Click on inorganics");
    	     System.out.println("drp inorganics "+(driver)); 
        	 
         }
	
	}
	
	public static void aim_of_study(int iTestCaseRow) throws Exception{
         String Aim = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Aimstudy);
     	 New_RFS.txt_Aim_of_stdy().sendKeys(Aim);
         System.out.println("RFS_Action  -----    Aim > " +Aim);
         Log.info(Aim+" is entered in Aim of study text box" );  }
	
    
	
	public static void expected_data(int iTestCaseRow) throws Exception{
         String Expect = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Expected_data);
     	 New_RFS.txt_Aim_of_stdy().sendKeys(Expect);
         System.out.println("RFS_Action  -----    Expect > " +Expect);
         Log.info(Expect+" is entered in Expected data text box" ); }
	
	
	public static void method(int iTestCaseRow) throws Exception{
         String method = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_method);
     	 New_RFS.txt_Aim_of_stdy().sendKeys(method);
         System.out.println("RFS_Action  -----    method > " +method);
         Log.info(method+" is entered in method text box" ); }
    
	
	public static void uplaod_file(int iTestCaseRow) throws Exception{
         Actions action8 = new Actions(driver); 
	     action8.moveToElement(New_RFS.serv_area_Sec_browse_btn()).click().perform();
         Log.info("clicked on browse button ");
         Reporter.log("browse button is clicked ");
         
         String file = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_file);	
 		StringSelection selection=new StringSelection(file);
 		Thread.sleep(5000);
 		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
 		Robot robot= new Robot();
 		robot.keyPress(KeyEvent.VK_CONTROL);
 		robot.keyPress(KeyEvent.VK_V);
 		robot.keyRelease(KeyEvent.VK_CONTROL);
 		robot.keyRelease(KeyEvent.VK_V);
 		robot.keyPress(KeyEvent.VK_ENTER);
 		robot.keyRelease(KeyEvent.VK_ENTER);
         
         Actions action9 = new Actions(driver); 
	     action9.moveToElement(New_RFS.serv_area_Sec_upload_btn()).click().perform();
         Log.info("clicked on upload button ");
         Reporter.log(" upload is clicked ");
         
         Actions action10 = new Actions(driver); 
	     action10.moveToElement(New_RFS.pop_up()).click().perform();
         Log.info("clicked on pop-up ");
         Reporter.log("pop-up is clicked ");    //--------> pop-up
         
         /*Actions action11 = new Actions(driver); 
	     action11.moveToElement(New_RFS.serv_area_Sec_next_btn()).click().perform();
         Log.info("clicked on next button ");
         Reporter.log("next button is clicked ");*/
	}
	
	
	public static void sample_section(int iTestCaseRow) throws Exception{
		
	
		Actions action12 = new Actions(driver); 
	    action12.moveToElement(New_RFS.tab_samp_sec()).click().perform();
        Log.info("clicked on sample section tab ");
        Reporter.log("sample section tab is clicked "); }
		
		//no of sample
       
	
	public static void no_of_sample(int iTestCaseRow) throws Exception{
        String No_Samp = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_No_Samp);
    	New_RFS.txt_no_of_samp().sendKeys(No_Samp);
        System.out.println("RFS_Action  -----    No_Samp > " +No_Samp);
        Log.info(No_Samp+" is entered in no of sample text box" );  }
     
	
	public static void solid(int iTestCaseRow) throws Exception{
      //solid
        Actions action14 = new Actions(driver); 
	    action14.moveToElement(New_RFS.solid_chkbx()).click().perform();
        Log.info("clicked on solid ");
        Reporter.log("solid is clicked ");  }
 
	public static void Inorganic(int iTestCaseRow) throws Exception{
      //Inorganic
        Actions action18 = new Actions(driver); 
	    action18.moveToElement(New_RFS.inorganic_chkbx()).click().perform();
        Log.info("clicked on Inorganic ");
        Reporter.log("Inorganic is clicked "); }
       
	public static void sample_specifications(int iTestCaseRow) throws Exception{   
        //sample/data specifications
        String sample_data = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_sample_data);
    	New_RFS.txt_samp_speci().sendKeys(sample_data);
        System.out.println("RFS_Action  -----    sample_data > " +sample_data);
        Log.info(sample_data+" is entered in sample/data specifications text box" ); }
       
	
	public static void specific_instuction(int iTestCaseRow) throws Exception{
        //specific instuction
        String specific_instuct = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_specific_instuct);
    	New_RFS.txt_speci_instn().sendKeys(specific_instuct);
        System.out.println("RFS_Action  -----    sample_data > " +specific_instuct);
        Log.info(specific_instuct+" is entered in specific instuction text box" );  }
        
    
	public static void upload_flie_2(int iTestCaseRow) throws Exception{
	
	Actions action20 = new Actions(driver); 
	     action20.moveToElement(New_RFS.samp_sec_browse_btn()).click().perform();
        Log.info("clicked on browse button ");
        Reporter.log("browse button is clicked ");
        
        String file = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_file);	
		StringSelection selection=new StringSelection(file);
		Thread.sleep(5000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
        
        Actions action21 = new Actions(driver); 
	     action21.moveToElement(New_RFS.samp_sec_upload_btn()).click().perform();
        Log.info("clicked on upload button ");
        Reporter.log("browse upload is clicked ");
        
        Actions action10 = new Actions(driver); 
	     action10.moveToElement(New_RFS.pop_up()).click().perform();
        Log.info("clicked on pop-up ");
        Reporter.log("pop-up is clicked "); }
        
	
	public static void next(int iTestCaseRow) throws Exception{
       Actions action23 = new Actions(driver); 
	     action23.moveToElement(New_RFS.samp_sec_next_btn()).click().perform();
       Log.info("clicked on next button ");
       Reporter.log("next button is clicked ");
        
	}
	
	public static void sample_delivery_section(int iTestCaseRow) throws Exception{
	
		//return samples
		Actions action23 = new Actions(driver); 
	     action23.moveToElement(New_RFS.ret_sampls_chkbx()).click().perform();
      Log.info("clicked on return samples ");
      Reporter.log("return samples is clicked ");
      
      //sample delivery mode
      
      Actions action6 = new Actions(driver); 
		 String drp_option3 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SampleDeliveryMode);
		 
		 Thread.sleep(4000);
	     action6.moveToElement(New_RFS.serv_area_drp_dwn()).click().perform();
      Log.info("clicked on sample delivery mode dropdown ");
      Reporter.log("sample delivery mode dropdown is clicked ");
      
      String str= "Other methods, specify";
      if(drp_option3.equals(str))
      {
     	 Actions action1 = new Actions(driver); 
 	     action1.moveToElement(New_RFS.samp_del_mod_arrow_btn()).click().perform();
 	     Log.info("Click on Other methods, specify");
 	     System.out.println("drp sample delivery mode "+(driver)); 
     	 
      }
      
      //
      String specific_instuct = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_specific_instuct);
  	  New_RFS.txt_speci_instn().sendKeys(specific_instuct);
      System.out.println("RFS_Action  -----    sample_data > " +specific_instuct);
      Log.info(specific_instuct+" is entered in no of specific instuction text box" );
      
      //report
      Actions action5 = new Actions(driver); 
		 String drp_option4 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SampleDeliveryMode);
		 
		 Thread.sleep(4000);
	     action6.moveToElement(New_RFS.rep_arrow_btn()).click().perform();
   Log.info("clicked on report dropdown ");
   Reporter.log("report dropdown is clicked ");
   
   String str2= "Other methods, specify";
   if(drp_option4.equals(str2))
   {
  	 Actions action1 = new Actions(driver); 
	     action1.moveToElement(New_RFS.rep_drp_dwn_selec_sec()).click().perform();
	     Log.info("Click on Other methods, specify");
	     System.out.println("drp sample delivery mode "+(driver)); 
  	 
   }
      
   
   //save
   
   Actions action11 = new Actions(driver); 
   action11.moveToElement(New_RFS.samp_del_sec_save_btn()).click().perform();
   Log.info("clicked on save button ");
   Reporter.log("save button is clicked ");
   
   //pop-up
   
   Actions action10 = new Actions(driver); 
   action10.moveToElement(New_RFS.pop_up()).click().perform();
   Log.info("clicked on pop-up ");
   Reporter.log("pop-up is clicked ");
      
	}  
    
	
	public void robot(int iTestCaseRow) throws Exception{
		String file = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_file);	
		StringSelection selection=new StringSelection(file);
		Thread.sleep(5000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		}
    }
	
	
	

	
	/*public static void Calender(int iTestCaseRow) throws Exception{
	Log.info("calender method starts " );
    	 
     //  click on calender icon
    	Thread.sleep(5000);
	     Actions action = new Actions(driver); 
	     action.moveToElement(New_RFS.calender_RFS_Sev_Ses_Ico()).click().perform();
        Log.info("Click btn next button clicked");
        Reporter.log("RFS clic action performed ");
        
         // click on month 
        Thread.sleep(5000);
        String sMonth = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_month);
        System.out.println("iTestCaseRow in rfs action string >>>"+iTestCaseRow);
        System.out.println(" Constant.Col_month in rfs action string >>>"+ Constant.Col_month);
        System.out.println("col 5 st       
    	ring >>>"+sMonth);
        int x = Integer.parseInt(sMonth);
        System.out.println("col 5 inte"+x);
      	
		String monthString;
		
	      switch (x) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
		
		
		
		

		 List<WebElement> Melements = driver.findElements(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']"));
	        System.out.println("list size" + Melements.size());
	        for (int i = 1; i < Melements.size()+1; i++) {
	            WebElement linkElement = driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']"));
	            System.out.println("list containt " + linkElement.getText());
	            
	          //*[@id="__xmlview10--reqcompdate-cal--MP"]
	            
	            String month;
	            
	       if(linkElement.getText() == monthString ){
	    	   
	    	   break;
	    	   
	       }
	       
	       else {
	    	  int month1= x; 	
	    	  
	    	   
	    	     switch (month1) {
	             case 1:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
						  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m0']")).click();
	                      break;
	             case 2:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
	             		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m1']")).click();
	                      break;
	             case 3:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m2']")).click();
	                      break;
	             case 4:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
	             		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m3']")).click();
	                      break;
	             case 5:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  	      driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m4']")).click();
	                      break;
	             case 6:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  	      driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m5']")).click();
	                      break;
	             case 7:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m6']")).click();
	                      break;
	             case 8:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m7']")).click();
	                      break;
	             case 9:  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
	             		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m8']")).click();
	                      break;
	             case 10: driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
	             		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m9']")).click();
	                      break;
	             case 11: driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m10']")).click();
	                      break;
	             case 12: driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--Head-B1']")).click(); 
				  		  driver.findElement(By.xpath("//*[@id='__xmlview10--reqcompdate-cal--MP-m11']")).click();
	                      break;
	             default: monthString = "Invalid month";
	                      break;
	       }
	      
	        }
        
      */  
        
     
        

         
    
	

