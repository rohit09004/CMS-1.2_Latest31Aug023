package com.csm.qa.test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;
import com.csm.qa.base.CSMBase;
import com.csm.qa.pages.HomePage;
import com.csm.qa.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class PO_Import extends CSMBase{
	LoginPage loginPage;
	HomePage homePage;
	ExtentReports extent;
	ExtentTest test;
	

	@BeforeTest
	public void startReport() {
		
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/FinalTestRport.html");
	    extent.addSystemInfo("Host Name","Local Host");
	    extent.addSystemInfo("Enviroment","QA");
	    extent.addSystemInfo("User Name","Rohit");
	    extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	}
	
	//Method for adding logs passed from test cases
		 public void reportLog(String message) {    
		    test.log(LogStatus.INFO, message);//For extentTest HTML report
		   // logger.info("Message: " + message);
		    Reporter.log(message);

		}
   
		 
 @Test(priority=1)
 public void Test1() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
		 {
		    
		       File file =new File("PoScreen_TestsDocumentt.xlsx");
		       String Path1= file.getAbsolutePath().toString();
		   	   FileInputStream fs = new FileInputStream(Path1);
		   	   //FileInputStream fs = new FileInputStream();
		   	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
		   	   XSSFSheet sheet = workbook.getSheetAt(0);
		   	 
		   	   test=extent.startTest("Test 01 - Importing new record ");
		   	   
		   	    initialize();
		   		loginPage= new LoginPage(driver);
		        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		   		Thread.sleep(2000);
		   		
		   		CSMBase base=new CSMBase();
		   		base.commonAllElementsPOImport();
		   		
		   		System.out.println("************************************[ Test 1--> 'Importing new record' ]************************************ ");
				 Reporter.log("************************************[ Test 1--> 'Importing new record' ]************************************ ");
				 reportLog("******[ Test 1--> 'Importing new record' ]****** ");
				    
		         System.out.println("[Test 1 steps 'STARTS'] ");
			     Reporter.log("[Test 1 steps 'STARTS'] ");
			     reportLog("[Test 1 steps 'STARTS'] ");
		         
		         //Inspection and clicking '.csv' radio button 
		         WebDriverWait csvRadioButton = new WebDriverWait(driver, Duration.ofMillis(8000));
		         csvRadioButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[1]/div/div/div[2]/div[1]/div")));
				 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[1]/div/div/div[2]/div[1]/div")).click();
				 System.out.println("01.Clicked on '.csv' radio button");
			     Reporter.log("01.Clicked on '.csv' radio button");
			     reportLog("01.Clicked on '.csv' radio button");
				 Thread.sleep(1000); 
				 
				//Inspection and clicking of 'type' dropdown 
		         WebDriverWait typePOButton = new WebDriverWait(driver, Duration.ofMillis(8000));
		         typePOButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[2]/div/div/div/div[2]/div/div/div")));
				 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[2]/div/div/div/div[2]/div/div/div")).click();
				 System.out.println("02.Clicked 'type' dropdown");
			     Reporter.log("02.Clicked 'type' dropdown");
			     reportLog("02.Clicked 'type' dropdown");
				 Thread.sleep(1000); 
				 
				//Inspection and Selected 'type' as 'PO' 
		         WebDriverWait poOption = new WebDriverWait(driver, Duration.ofMillis(8000));
		         poOption.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div")));
				 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div")).click();
				 System.out.println("03.Selected 'type' as 'PO' ");
			     Reporter.log("03.Selected 'type' as 'PO' ");
			     reportLog("03.Selected 'type' as 'PO' ");
				 Thread.sleep(1000); 
				 
				//Inspection and clicking of 'Select Import File' button
		         WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
		         selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
				 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
				 System.out.println("04.Clicked on 'Select Import File' button");
			     Reporter.log("04.Clicked on 'Select Import File' button");
			     reportLog("04.Clicked on 'Select Import File' button");
				 Thread.sleep(1000); 
				 
		      // creating object of Robot class
		       Robot rb = new Robot();
		   
		      // copying File path to Clipboard
		      StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\01_Po_Data.csv");
		      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		      System.out.println("05.Choosing excel file(having records) from System Directory to perform Import functionility");
			  Reporter.log("05.Choosing excel file(having records) from System Directory to perform Import functionility");
			  reportLog("05.Choosing excel file(having records) from System Directory to perform Import functionility");
		      Thread.sleep(1000);
			  
		       // press Contol+V for pasting
		       rb.keyPress(KeyEvent.VK_CONTROL);
		       rb.keyPress(KeyEvent.VK_V);
		   
		      // release Contol+V for pasting
		      rb.keyRelease(KeyEvent.VK_CONTROL);
		      rb.keyRelease(KeyEvent.VK_V);
		   
		      // for pressing and releasing Enter
		      rb.keyPress(KeyEvent.VK_ENTER);
		      rb.keyRelease(KeyEvent.VK_ENTER); 
		      Thread.sleep(2000);
		      
		        //Inspection and clicking of "Upload" button
		  	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
		  	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
		  	     System.out.println("06.Clicked on 'Upload' button");
			     Reporter.log("06.Clicked on 'Upload' button");
			     reportLog("06.Clicked on 'Upload' button");
		         Thread.sleep(1000);

		  	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
		  	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
		  	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
		  	     System.out.println("07.Clicked on 'Import file' button once file uploaded successfully");
			     Reporter.log("07.Clicked on 'Import file' button once file uploaded successfully");
			     reportLog("07.Clicked on 'Import file' button once file uploaded successfully");
		         Thread.sleep(1000);

		            System.out.println("[Test 1 steps 'ENDS'] ");
				    Reporter.log("[Test 1 steps 'ENDS'] ");
				    reportLog("[Test 1 steps 'ENDS'] ");
				 
				    System.out.println("************************************[ Test 1--> 'Importing new record' is ''PASSED'' ]************************************ ");
				    Reporter.log("************************************[ Test 1--> 'Importing new record' is ''PASSED'' ]************************************ ");
				    reportLog("******[ Test 1--> 'Importing new record' is ''PASSED'' ]****** ");
				    System.out.println(" ");
				    Reporter.log(" ");
				    System.out.println(" ");
				    Reporter.log(" ");
				    //driver.quit();
		          //ends PO3
		          
		        Assert.assertTrue(true);
		  		test.log(LogStatus.PASS, "Test 01 - Importing new record is PASSED");
		  		Thread.sleep(3000); 		    
		 }

		 


@AfterMethod
public void getResult(ITestResult result) throws IOException
{
    if(result.getStatus() == ITestResult.FAILURE)
    {
      Random randVar = new Random();
      int randomVarr=randVar.nextInt(1000);
      String screenShotPath = GetScreenShot.capture(driver, "FailedTestScreen"+randomVarr);
      test.log(LogStatus.FAIL, result.getThrowable());
      test.log(LogStatus.FAIL, "Failed Screenshot below : " + test.addScreenCapture(screenShotPath));
      
    }
    extent.endTest(test);
}

@AfterTest
public void endReport() {
	
      extent.flush();
}
	
	
}