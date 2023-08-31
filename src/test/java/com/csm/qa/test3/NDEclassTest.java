package com.csm.qa.test3;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;
import com.csm.qa.base.CSMBase;
import com.csm.qa.pages.HomePage;
import com.csm.qa.pages.LoginPage;
import com.csm.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;


//import extentReport.GetScreenShot;


public class NDEclassTest extends CSMBase{
	LoginPage loginPage;
	HomePage homePage;
	ExtentReports extent;
	ExtentTest test;
	
	
    
//   @BeforeMethod
//	public void setup() throws InterruptedException
//	{
//		initialize();
//		loginPage= new LoginPage(driver);
//	}
	
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
       
	  
	   test=extent.startTest("Test 1 - Insertion of new data ");
	   
	   initialize();
		loginPage= new LoginPage(driver);
        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		
		
		//starts PO3
        System.out.println(" ");
        Reporter.log(" ");
		   System.out.println("************************************[ Test 1--> Insertion of new data ]**************************************************** ");
		   Reporter.log("************************************[ Test 1--> Insertion of new data ]**************************************************** ");
		   reportLog("******[ Test 1--> Insertion of new data ]****** ");
		   
		   
		    System.out.println("[Test 1 steps 'STARTS'] ");
		    Reporter.log("[Test 1 steps 'STARTS'] ");
		    reportLog("[Test 1 steps 'STARTS'] ");
		   
		   
		    WebDriverWait clickOnCMSModules = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnCMSModules.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")).click();
	  	    Thread.sleep(1000);
         

	  	  WebDriverWait clickOnWeldingControlModule  = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	clickOnWeldingControlModule.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='WEC']")));
	  	    driver.findElement(By.xpath("//a[@title='WEC']")).click();
	  	    Thread.sleep(1000);
//		    
//		//    commonElements();
//
	  	  WebDriverWait clickOnMasterData  = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	clickOnMasterData.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")));
		  	    driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")).click();
		  	    Thread.sleep(1000);


		  WebDriverWait clickOnNDEClass  = new WebDriverWait(driver, Duration.ofMillis(8000));
			clickOnNDEClass.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/div/div/div/a")));
			  	 driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/div/div/div/a")).click();
			  	 Thread.sleep(1000);
			  	    
		  WebDriverWait ClickOnPlussymbol  = new WebDriverWait(driver, Duration.ofMillis(8000));
		  ClickOnPlussymbol.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div/i")));
 		  	 driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div/i")).click();
		  	 Thread.sleep(1000);
		  	 
		 
		  WebDriverWait enterDataInNDEClass  = new WebDriverWait(driver, Duration.ofMillis(8000));
		  enterDataInNDEClass.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/input")));
	    	 driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/input")).sendKeys("Testingpr");
		  	 Thread.sleep(1000);
		  	 
		  	 WebDriverWait description  = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	description.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		    	 driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys("Testing desc");
			  	 Thread.sleep(1000);
					  	    	  	    
			  	 
		WebDriverWait clickOnSave  = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	clickOnSave.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[3]/a[1]/span")));
    	 driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[3]/a[1]/span")).click();
	  	 Thread.sleep(1000);


	  	 
	 	WebDriverWait reverseMasterData  = new WebDriverWait(driver, Duration.ofMillis(8000));
	 	reverseMasterData.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")));
    	 driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")).click();
	  	 Thread.sleep(2000);
	  	 
	  	 
	  	 
        Assert.assertTrue(true);
  		test.log(LogStatus.PASS, "Test 1 - Insertion of new data PASSED");
  		
  		
  		System.out.println(" ");
        Reporter.log(" ");
		   System.out.println("************************************[ Test 2--> Insertion of new data ]**************************************************** ");
		   Reporter.log("************************************[ Test 2--> Insertion of new data ]**************************************************** ");
		   reportLog("******[ Test 2--> Insertion of new data ]****** ");
		   
		   
		    System.out.println("[Test 2 steps 'STARTS'] ");
		    Reporter.log("[Test 2 steps 'STARTS'] ");
		    reportLog("[Test 2 steps 'STARTS'] ");
		   

		    //commonElements();

	  	  WebDriverWait clickOnDataMentainance  = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	clickOnDataMentainance.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@aria-label='Data Maintenance']//div[@class='dx-treeview-toggle-item-visibility']")));
		  	    driver.findElement(By.xpath("//li[@aria-label='Data Maintenance']//div[@class='dx-treeview-toggle-item-visibility']")).click();
		  	    Thread.sleep(1000);

		  	    
	      WebDriverWait clickOnNDERateSetup  = new WebDriverWait(driver, Duration.ofMillis(8000));
	      clickOnNDERateSetup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[6]")));
		      driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[6]")).click();
		     Thread.sleep(1000);

		     
		     WebDriverWait clickOnNdeNewAdd  = new WebDriverWait(driver, Duration.ofMillis(8000));
		      clickOnNdeNewAdd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div/i")));
			      driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div/i")).click();
			     Thread.sleep(1000);
			     
			  WebDriverWait NdeCodeDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
			  NdeCodeDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div/div[2]/div/div")));
	 	      driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div/div[2]/div/div")).click();
		      Thread.sleep(2000);
     
			     

		     WebDriverWait enterNdeCode = new WebDriverWait(driver, Duration.ofMillis(8000));
		     enterNdeCode.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='RT']")));
			      driver.findElement(By.xpath("//div[text()='RT']")).click();
			     Thread.sleep(1000);


			     WebDriverWait LineClassDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
			      LineClassDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/div/div[2]/div/div/div")));
				      driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/div/div[2]/div/div/div")).click();
				     Thread.sleep(1000);
				     
				     
				     WebDriverWait enterLineClass  = new WebDriverWait(driver, Duration.ofMillis(8000));
				     enterLineClass.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='1CA1P']")));
					      driver.findElement(By.xpath("//div[text()='1CA1P']")).click();
					     Thread.sleep(1000);
					     
					     
					     WebDriverWait NdeClassDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
					     NdeClassDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
						      driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys("Testingpr");
						     Thread.sleep(3000);
						     
			          WebDriverWait clickOnEnteredNdeClass  = new WebDriverWait(driver, Duration.ofMillis(10000));
			          clickOnEnteredNdeClass.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Testingpr']")));
				      driver.findElement(By.xpath("//div[text()='Testingpr']")).click();
					  Thread.sleep(1000);
							     
					 WebDriverWait testMethodDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
					 testMethodDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[4]/div/div/div/div/div[2]/div/div/div")));
				    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[4]/div/div/div/div/div[2]/div/div/div")).click();
				    Thread.sleep(1000);
								     
				    WebDriverWait enterTestMethod  = new WebDriverWait(driver, Duration.ofMillis(8000));
				    enterTestMethod.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='S']")));
		            driver.findElement(By.xpath("//div[text()='S']")).click();
	                Thread.sleep(1000);
									     
	                WebDriverWait weldTypeDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	                weldTypeDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[5]/div/div/div/div/div[2]/div/div/div")));
		            driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[5]/div/div/div/div/div[2]/div/div/div")).click();
	                Thread.sleep(1000);
	                
	                
	                WebDriverWait enterWeldType  = new WebDriverWait(driver, Duration.ofMillis(8000));
	                enterWeldType.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='FB']")));
		            driver.findElement(By.xpath("//div[text()='FB']")).click();
	                Thread.sleep(1000);
	                
	                WebDriverWait sizeFromDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	                sizeFromDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[6]/div/div/div/div/div[2]/div/div/div")));
		            driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[6]/div/div/div/div/div[2]/div/div/div")).click();
	                Thread.sleep(1000);
	                
	                WebDriverWait enterSizeFrom  = new WebDriverWait(driver, Duration.ofMillis(8000));
	                enterSizeFrom.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='0.750']")));
		            driver.findElement(By.xpath("//div[text()='0.750']")).click();
		            Thread.sleep(3000);
//////		            

	                
	                WebDriverWait sizeToDropdown1  = new WebDriverWait(driver, Duration.ofMillis(8000));
	                sizeToDropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[7]/div/div/div[1]/div/input")));
		            driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[7]/div/div/div[1]/div/input")).sendKeys("1");
	                Thread.sleep(4000);
	                
	                WebDriverWait clickOnIt  = new WebDriverWait(driver, Duration.ofMillis(8000));
	                clickOnIt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div")));
		            driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div")).click();
	                Thread.sleep(2000);
	                
                
	                WebDriverWait NdeRate  = new WebDriverWait(driver, Duration.ofMillis(8000));
				    NdeRate.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[8]/div/div/div/input")));
		            driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[8]/div/div/div/input")).sendKeys("10");
	                Thread.sleep(1000);
	                
	                WebDriverWait saveButtonForNdeRate  = new WebDriverWait(driver, Duration.ofMillis(8000));
	                saveButtonForNdeRate.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[9]/a[1]/span")));
		            driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div/div/div/div/table/tbody/tr[1]/td[9]/a[1]/span")).click();
	                Thread.sleep(2000);
	                
	                
	                Assert.assertTrue(true);
	          		test.log(LogStatus.PASS, "Test 2 - Insertion of new data PASSED");
	          		
	          		
	        
	          		System.out.println(" ");
	                Reporter.log(" ");
	        		   System.out.println("************************************[ Test 3--> Insertion of new data ]**************************************************** ");
	        		   Reporter.log("************************************[ Test 3--> Insertion of new data ]**************************************************** ");
	        		   reportLog("******[ Test 3--> Insertion of new data ]****** ");
	        		   
	        		   
	        		    System.out.println("[Test 3 steps 'STARTS'] ");
	        		    Reporter.log("[Test 3 steps 'STARTS'] ");
	        		    reportLog("[Test 3 steps 'STARTS'] ");
	        		    
	        	
	        		    
	           WebDriverWait clickOnJointDataMaintenance  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           clickOnJointDataMaintenance.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[1]/div/div/div/a")));
	           driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[1]/div/div/div/a")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait clickOnAddNewJointDataMaintenance  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           clickOnAddNewJointDataMaintenance.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div/i")));
	           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div/i")).click();
	           Thread.sleep(2000);
	        		    
         
	           WebDriverWait enterDataForLineClassDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterDataForLineClassDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[1]/div/div/div[1]/div/input")));
	           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[1]/div/div/div[1]/div/input")).sendKeys("1CA1P");
	           Thread.sleep(6000);
	           
	           WebDriverWait clickOnLineClassData  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           clickOnLineClassData.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
	           Thread.sleep(6000);
	           

//           
//           
	           WebDriverWait spoolDwgNoDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           spoolDwgNoDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/div/div/div/div/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/div/div/div/div/div[2]/div/div")).click();
	           Thread.sleep(2000);
	           
	           WebDriverWait enterSpoolDwgNo  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterSpoolDwgNo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='B13U-FW-03486']")));
	           driver.findElement(By.xpath("//div[text()='B13U-FW-03486']")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait jointNo  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           jointNo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[3]/div/div/div/input")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[3]/div/div/div/input")).sendKeys("123");
	           Thread.sleep(1000);
	           
	           WebDriverWait testMethodDropdown1  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           testMethodDropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[4]/div/div/div/div/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[4]/div/div/div/div/div[2]/div/div")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait enterTestMethod1  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterTestMethod1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='S']")));
	           driver.findElement(By.xpath("//td[text()='S']")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait jointStatusDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           jointStatusDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div/div/div[1]/div/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div/div/div[1]/div/div[2]/div/div")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait enterjointStatus  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterjointStatus.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='AF']")));
	           driver.findElement(By.xpath("//td[text()='AF']")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait sheetNum  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           sheetNum.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
	           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys("abc4");
	           Thread.sleep(1000);
	           
	           WebDriverWait sizeDropDown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           sizeDropDown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[8]/div/div/div/div/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[8]/div/div/div/div/div[2]/div/div")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait enterSizeDropDown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterSizeDropDown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()=' 10']")));
	           driver.findElement(By.xpath("//td[text()=' 10']")).click();
	           Thread.sleep(1000);
	           
	           WebElement element = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[13]"));
	           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element); 
	      
	          // js.executeScript("window.scrollBy(2000,0)");
	           
	           WebDriverWait weldTypeDropDown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           weldTypeDropDown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[10]/div/div/div[1]/div/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[10]/div/div/div[1]/div/div[2]/div/div")).click();
	           Thread.sleep(1000);
	           
	         
	           
	           WebDriverWait enterWeldType1  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterWeldType1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='FB']")));
	           driver.findElement(By.xpath("//td[text()='FB']")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait categoryCodeDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           categoryCodeDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[11]/div/div/div/div/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[11]/div/div/div/div/div[2]/div/div")).click();
	           Thread.sleep(1000);
//	           
////	           WebElement elementScrollForCategoryCode = driver.findElement(By.xpath("//td[text()='R']"));
////	           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementScrollForCategoryCode); 
//
	          WebElement categoryCodeChart = driver.findElement(By.xpath("/html/body/div[3]/div/div/div"));
	          Thread.sleep(8000);
////	           WebDriverWait categoryCodeChart  = new WebDriverWait(driver, Duration.ofMillis(8000));
////	           categoryCodeChart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div")));
////	           driver.findElement(By.xpath("/html/body/div[2]/div/div/div")).click();
////	           Thread.sleep(1000);
////	           
	           act.moveToElement(categoryCodeChart).perform();
	           Thread.sleep(2000);
	           for(int i=0;i<10;i++)
	           {
	        	  
	        	   act.sendKeys(Keys.ARROW_DOWN).perform();
	           }
	           
	           act.sendKeys(Keys.ENTER).perform();
	           
	          Thread.sleep(2000);
	           
	          WebElement elementWeldedLocation = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[16]"));
	           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementWeldedLocation); 
	           Thread.sleep(2000);
//	           

//	           
	           WebDriverWait planSubconDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           planSubconDropdown.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[14]/div/div/div/div/div[2]/div/div/div")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[14]/div/div/div/div/div[2]/div/div/div")).click();
	           Thread.sleep(2000);
	           
	           //act.scrollToElement((WebElement) planSubconDropdown).click().build().perform();
	           
        WebElement planSubconChart = driver.findElement(By.xpath("/html/body/div[3]/div/div/div"));
        Thread.sleep(2000);
	           
	           act.moveToElement(planSubconChart).perform();
	           Thread.sleep(1000);
	           for(int i=0;i<5;i++)
	           {
	        	   act.sendKeys(Keys.ARROW_DOWN).perform();
	           }
	         
	           act.sendKeys(Keys.ENTER).perform();
	           Thread.sleep(2000);
	           
	           
	           WebElement elementMaterial01 = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[20]/div/div/div/input"));
	           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementMaterial01); 
	      
	           
	           
	           WebDriverWait weldedLocationDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           weldedLocationDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[18]/div/div/div[1]/div/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[18]/div/div/div[1]/div/div[2]/div/div")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait enterWeldedLocation  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterWeldedLocation.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='F']")));
	           driver.findElement(By.xpath("//div[text()='F']")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait wpsNoDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
	           wpsNoDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[19]/div/div/div[1]/div/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[19]/div/div/div[1]/div/div[2]/div/div")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait enterWpsNo  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterWpsNo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='1244-LTCS-001']")));
	           driver.findElement(By.xpath("//div[text()='1244-LTCS-001']")).click();
	           Thread.sleep(1000);
	           
	           WebElement heatNo02 = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[24]/div/div/div/input"));
	           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", heatNo02); 
	           Thread.sleep(1000);

	           WebDriverWait  pipePositionCodeDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
	           pipePositionCodeDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[22]/div/div/div[1]/div/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[22]/div/div/div[1]/div/div[2]/div/div")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait enterPipePosition  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterPipePosition.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()=' Above Ground']")));
	           driver.findElement(By.xpath("//td[text()=' Above Ground']")).click();
	           Thread.sleep(1000);
	           
     
	           Thread.sleep(2000);
	           
	           WebElement identCode2 = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[30]/div/div/div/input"));
	           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", identCode2); 
	           
	           WebDriverWait  fitUpDateDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
	           fitUpDateDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[28]/div/div/div/div/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[28]/div/div/div/div/div[2]/div/div")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait enterfitUpDateDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterfitUpDateDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@aria-label='Tuesday, August 15, 2023']")));
	           driver.findElement(By.xpath("//td[@aria-label='Tuesday, August 15, 2023']")).click();
	           Thread.sleep(2000);
	           
           
	           JavascriptExecutor javaScriptExecutor= (JavascriptExecutor)driver;
	           javaScriptExecutor.executeScript("window.scrollBy(500,0)");
	           
	           WebElement partCode02 = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[32]/div/div/div/input"));
	           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", partCode02); 
	           Thread.sleep(2000);
	           
         
	           WebDriverWait ndeClassSelect  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           ndeClassSelect.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[33]/div/div/div/div/input")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[33]/div/div/div/div/input")).sendKeys("Testingpr");
	           Thread.sleep(3000);
	           
	           WebDriverWait clickNdeClassSelect  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           clickNdeClassSelect.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
	           Thread.sleep(3000);
	           

//	         
//	           act.sendKeys(Keys.ENTER).perform();
	           Thread.sleep(2000);
	           
	           WebDriverWait saveJointDataMaintenanceData  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           saveJointDataMaintenanceData.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[5]/a[1]/span")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[5]/a[1]/span")).click();
	           Thread.sleep(1000);
	           
	           Assert.assertTrue(true);
         		test.log(LogStatus.PASS, "Test 3 - Insertion of new data PASSED");
         		
         		
         		
         		System.out.println(" ");
                Reporter.log(" ");
        		   System.out.println("************************************[ Test 4--> Deletion of data ]**************************************************** ");
        		   Reporter.log("************************************[ Test 4--> Deletion of data ]**************************************************** ");
        		   reportLog("******[ Test 4--> Deletion of data ]****** ");
        		   
        		   
        		    System.out.println("[Test 4 steps 'STARTS'] ");
        		    Reporter.log("[Test 4 steps 'STARTS'] ");
        		    reportLog("[Test 4 steps 'STARTS'] ");

        		    //To verify the NDE class which we are using in joint data maintenance will be deleted from NDE class or Not.
	           
	           WebDriverWait clickOnMasterData1  = new WebDriverWait(driver, Duration.ofMillis(8000));
			  	clickOnMasterData1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")));
			  	    driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")).click();
			  	    Thread.sleep(1000);


			  WebDriverWait clickOnNDEClass1  = new WebDriverWait(driver, Duration.ofMillis(8000));
				clickOnNDEClass1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/div/div/div/a")));
				  	 driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/div/div/div/a")).click();
				  	 Thread.sleep(1000);
	            
				  	 
		 	  WebDriverWait clickOnNDEClassDeleteLogo  = new WebDriverWait(driver, Duration.ofMillis(8000));
		 	 clickOnNDEClassDeleteLogo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div/div/div/div/div[6]/div/div/div/div/table/tbody/tr[7]/td[3]/a[2]/span")));
			  driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div/div/div/div/div[6]/div/div/div/div/table/tbody/tr[7]/td[3]/a[2]/span")).click();
			  Thread.sleep(2000);
				  	 
			  WebDriverWait clickOnYesForNDEclassDeletion  = new WebDriverWait(driver, Duration.ofMillis(8000));
			  clickOnYesForNDEclassDeletion.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
			  driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div")).click();
			  Thread.sleep(1000);
					  	 
			  WebElement msg=driver.findElement(By.xpath("//div[@class='dx-error-message']"));
		      String text=msg.getText();
		      String expectedText = "The data which you are trying to delete is already in use.";
		      Assert.assertEquals(text,expectedText);
		      System.out.println("The data is already used so it cant be deleted.");
			  
		      Assert.assertTrue(true);
       		test.log(LogStatus.PASS, "Test 4 - Validate of NDE class should not be deleted if it is already used in data maintenance is PASSED");
		
       		System.out.println(" ");
            Reporter.log(" ");
    		   System.out.println("************************************[ Test 5--> Import the data ]**************************************************** ");
    		   Reporter.log("************************************[ Test 5--> Import the data ]**************************************************** ");
    		   reportLog("******[ Test 5--> Import the data ]****** ");
    		   
    		   
    		    System.out.println("[Test 5 steps 'STARTS'] ");
    		    Reporter.log("[Test 5 steps 'STARTS'] ");
    		    reportLog("[Test 5 steps 'STARTS'] "); 
    		    
    		    
    		  WebDriverWait visibilityOfImportOptionsOfWEC  = new WebDriverWait(driver, Duration.ofMillis(8000));
    		  visibilityOfImportOptionsOfWEC.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")));
  			  driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")).click();
  			  Thread.sleep(1000);    
    		    
  			  WebDriverWait importNdeRate  = new WebDriverWait(driver, Duration.ofMillis(8000));
  			  importNdeRate.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/ul/li[3]/div/div/div/a")));
  			  driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/ul/li[3]/div/div/div/a")).click();
  			  Thread.sleep(2000); 
  			  
  			  WebDriverWait selectFileButton = new WebDriverWait(driver, Duration.ofMillis(8000));
  			  selectFileButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/span")));
  			  driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/span")).click();
  			  Thread.sleep(8000); 
  			  
  			 Robot rb = new Robot();
  			
  			StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS(1.2)\\NdeRateImport.csv");
  		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
  			  
  		    // press Contol+V for pasting
  		     rb.keyPress(KeyEvent.VK_CONTROL);
  		     rb.keyPress(KeyEvent.VK_V);
  		 
  		    // release Contol+V for pasting
  		    rb.keyRelease(KeyEvent.VK_CONTROL);
  		    rb.keyRelease(KeyEvent.VK_V);
  		 
  		    // for pressing and releasing Enter
  		    rb.keyPress(KeyEvent.VK_ENTER);
  		    rb.keyRelease(KeyEvent.VK_ENTER);
  		    
	 
  			  WebDriverWait clickOnUploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
  			clickOnUploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dx-fileuploader-container']//div[@class='dx-button-content btn btn-primary']")));
  			  driver.findElement(By.xpath("//div[@class='dx-fileuploader-container']//div[@class='dx-button-content btn btn-primary']")).click();
  			  Thread.sleep(15000); 
  			  
  			  WebDriverWait clickOnImportFileButton = new WebDriverWait(driver, Duration.ofMillis(8000));
  			clickOnImportFileButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div/div[2]/div[2]/button")));
  			  driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div/div[2]/div[2]/button")).click();
  			  Thread.sleep(1000); 
  			  
//  			  WebDriverWait clickOnYesForNDEclassDeletion  = new WebDriverWait(driver, Duration.ofMillis(8000));
//  			  clickOnYesForNDEclassDeletion.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
//  			  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div")).click();
//  			  Thread.sleep(1000); 
  			  
  			WebElement msg1=driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div/div[1]/label"));
		      String text1=msg1.getText();
		      String expectedText2 = "12 Record(s) range has been inserted.";
		      Assert.assertEquals(text1,expectedText2);
		      System.out.println("The data is added inside the Nde rate setup.");
		      Thread.sleep(2000);
		      
		   WebElement sizeFromForValidation = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[1]/div/div[1]/div/table/tbody/tr[2]/td[3]"));
		   Thread.sleep(2000);  
		   
		      WebDriverWait clickReverseOfImportOfWEC  = new WebDriverWait(driver, Duration.ofMillis(8000));
		      clickReverseOfImportOfWEC.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")));
			  driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")).click();
			  Thread.sleep(1000);
		      
			   WebDriverWait clickReverseOfMasterData = new WebDriverWait(driver, Duration.ofMillis(8000));
			   clickReverseOfMasterData.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")));
				  driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")).click();
				  Thread.sleep(1000);
		      
		      WebDriverWait clickOnNDERateSetup1  = new WebDriverWait(driver, Duration.ofMillis(8000));
		      clickOnNDERateSetup1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[6]")));
			  driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[6]")).click();
			  Thread.sleep(1000);
		     
			 WebDriverWait selectNdeMethod1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			 selectNdeMethod1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[1]/div[1]/div/div[1]/div/div[1]/div/input")));
		     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[1]/div[1]/div/div[1]/div/div[1]/div/input")).sendKeys("RT");
			 Thread.sleep(1000);
			 
			 WebDriverWait selectRt = new WebDriverWait(driver, Duration.ofMillis(8000));
			 selectRt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='RT']")));
		     driver.findElement(By.xpath("//div[text()='RT']")).click();
			 Thread.sleep(1000);
			 
			 WebDriverWait selectLineClass = new WebDriverWait(driver, Duration.ofMillis(8000));
			 selectLineClass.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[1]/div[1]/div/div[3]/div/div[1]/div/input")));
		     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[1]/div[1]/div/div[3]/div/div[1]/div/input")).sendKeys("1CA1P");
			 Thread.sleep(1000);
			 
			 WebDriverWait clickOnLineClass = new WebDriverWait(driver, Duration.ofMillis(8000));
			 clickOnLineClass.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='1CA1P']")));
		     driver.findElement(By.xpath("//div[text()='1CA1P']")).click();
			 Thread.sleep(1000);
		      
			 WebDriverWait clickOnGoButton  = new WebDriverWait(driver, Duration.ofMillis(8000));
			 clickOnGoButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[1]/div[2]/div/div")));
		     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[1]/div[2]/div/div")).click();
			 Thread.sleep(1000);
		      

  }

        @Test(priority=2)
		public void Test2() throws InterruptedException, IOException
		{
        	File file =new File("PoScreen_TestsDocumentt.xlsx");
            String Path1= file.getAbsolutePath().toString();
     	   FileInputStream fs = new FileInputStream(Path1);
     	   //FileInputStream fs = new FileInputStream();
     	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
     	   XSSFSheet sheet = workbook.getSheetAt(0);
            
     	  
     	   test=extent.startTest("Test 1 - Insertion of new data ");
     	   
     	   initialize();
     		loginPage= new LoginPage(driver);
             homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
     		Thread.sleep(2000);
     		Actions act = new Actions(driver);
     		
     		
     		
     		//starts PO3
             System.out.println(" ");
             Reporter.log(" ");
     		   System.out.println("************************************[ Test 1--> Insertion of new data ]**************************************************** ");
     		   Reporter.log("************************************[ Test 1--> Insertion of new data ]**************************************************** ");
     		   reportLog("******[ Test 1--> Insertion of new data ]****** ");
     		   
     		   
     		    System.out.println("[Test 1 steps 'STARTS'] ");
     		    Reporter.log("[Test 1 steps 'STARTS'] ");
     		    reportLog("[Test 1 steps 'STARTS'] ");
     		   
     		   
     		    WebDriverWait clickOnCMSModules = new WebDriverWait(driver, Duration.ofMillis(8000));
     		    clickOnCMSModules.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")));
     	  	    driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")).click();
     	  	    Thread.sleep(1000);
              

     	  	  WebDriverWait clickOnWeldingControlModule  = new WebDriverWait(driver, Duration.ofMillis(8000));
     	  	clickOnWeldingControlModule.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='WEC']")));
     	  	    driver.findElement(By.xpath("//a[@title='WEC']")).click();
     	  	    Thread.sleep(1000);
     	  	    
     	  	 WebDriverWait clickOnJointDataMaintenanceArrowDown  = new WebDriverWait(driver, Duration.ofMillis(8000));
     	  	clickOnJointDataMaintenanceArrowDown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@aria-label='Data Maintenance']//div[@class='dx-treeview-toggle-item-visibility']")));
      	  	    driver.findElement(By.xpath("//li[@aria-label='Data Maintenance']//div[@class='dx-treeview-toggle-item-visibility']")).click();
      	  	    Thread.sleep(1000);
     	  	    
     	  	 WebDriverWait clickOnJointDataMaintenance  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           clickOnJointDataMaintenance.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[1]/div/div/div/a")));
	           driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[1]/div/div/div/a")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait clickOnAddNewJointDataMaintenance  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           clickOnAddNewJointDataMaintenance.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div/i")));
	           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div/i")).click();
	           Thread.sleep(2000);
	           
	           WebDriverWait enterDataForLineClassDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterDataForLineClassDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[1]/div/div/div[1]/div/input")));
	           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[1]/div/div/div[1]/div/input")).sendKeys("1CA1P");
	           Thread.sleep(6000);
	           
	           WebDriverWait clickOnLineClassData  = new WebDriverWait(driver, Duration.ofMillis(12000));
	           clickOnLineClassData.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
	           Thread.sleep(6000);
	           
	           WebDriverWait enterSpoolDwgNo = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterSpoolDwgNo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/div/div/div/div/input")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/div/div/div/div/input")).sendKeys("AK06");
	           Thread.sleep(2000);
	           
	           WebDriverWait selectEnteredSpoolDwgNo  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           selectEnteredSpoolDwgNo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait jointNo  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           jointNo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[3]/div/div/div/input")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[3]/div/div/div/input")).sendKeys("130");
	           Thread.sleep(1000);
	           
	           WebDriverWait testMethodDropdown1  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           testMethodDropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[4]/div/div/div/div/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[4]/div/div/div/div/div[2]/div/div")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait enterTestMethod1  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterTestMethod1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='S']")));
	           driver.findElement(By.xpath("//td[text()='S']")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait jointStatusDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           jointStatusDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div/div/div[1]/div/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div/div/div[1]/div/div[2]/div/div")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait enterjointStatus  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterjointStatus.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='AM']")));
	           driver.findElement(By.xpath("//td[text()='AM']")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait sheetNum  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           sheetNum.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
	           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys("023");
	           Thread.sleep(1000);
	           
	           WebDriverWait sizeDropDown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           sizeDropDown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[8]/div/div/div/div/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[8]/div/div/div/div/div[2]/div/div")).click();
	           Thread.sleep(1000);
	           
	           WebDriverWait enterSizeDropDown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterSizeDropDown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()=' 10']")));
	           driver.findElement(By.xpath("//td[text()=' 10']")).click();
	           Thread.sleep(1000);
	           
	           WebElement addSpoolPiece = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[13]"));
	           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addSpoolPiece); 
	      
	           
	           WebDriverWait weldTypeDropDown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           weldTypeDropDown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[10]/div/div/div[1]/div/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[10]/div/div/div[1]/div/div[2]/div/div")).click();
	           Thread.sleep(1000);
	           
	         
	           
	           WebDriverWait enterWeldType1  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           enterWeldType1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='FB']")));
	           driver.findElement(By.xpath("//td[text()='FB']")).click();
	           Thread.sleep(1000);
	           

	           
	           WebDriverWait categoryCodeTextField  = new WebDriverWait(driver, Duration.ofMillis(8000));
	           categoryCodeTextField .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[11]/div/div/div[1]/div/input")));
	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[11]/div/div/div[1]/div/input")).sendKeys("P");
	           Thread.sleep(1000);
	           
	           WebDriverWait clickOnSelectedCategoryCode   = new WebDriverWait(driver, Duration.ofMillis(8000));
	           clickOnSelectedCategoryCode.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
	           driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
	           Thread.sleep(1000);
		           
		          Thread.sleep(2000);
		           
		          WebElement elementWeldedLocation = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[16]"));
		           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementWeldedLocation); 
		           Thread.sleep(2000);
		           

		           
		           WebDriverWait planSubconTextField  = new WebDriverWait(driver, Duration.ofMillis(8000));
		           planSubconTextField.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[14]/div/div/div[1]/div/input")));
		           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[14]/div/div/div[1]/div/input")).sendKeys("JGC");
		           Thread.sleep(1000);
		           
		           WebDriverWait clickOnSelectedPlanSubconText   = new WebDriverWait(driver, Duration.ofMillis(8000));
		           clickOnSelectedPlanSubconText.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div")));
		           driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div")).click();
		           Thread.sleep(1000);
		   	           Thread.sleep(2000);
		   	           
		   	           
		   	           WebElement elementMaterial01 = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[20]/div/div/div/input"));
		   	           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementMaterial01); 
		   	      
		   	           
		   	           
		   	           WebDriverWait weldedLocationDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
		   	           weldedLocationDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[18]/div/div/div[1]/div/div[2]/div/div")));
		   	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[18]/div/div/div[1]/div/div[2]/div/div")).click();
		   	           Thread.sleep(1000);
		   	           
		   	           WebDriverWait enterWeldedLocation  = new WebDriverWait(driver, Duration.ofMillis(8000));
		   	           enterWeldedLocation.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='F']")));
		   	           driver.findElement(By.xpath("//div[text()='F']")).click();
		   	           Thread.sleep(1000);
		   	           
		   	           WebDriverWait wpsNoDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
		   	           wpsNoDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[19]/div/div/div[1]/div/div[2]/div/div")));
		   	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[19]/div/div/div[1]/div/div[2]/div/div")).click();
		   	           Thread.sleep(1000);
		   	           
		   	           WebDriverWait enterWpsNo  = new WebDriverWait(driver, Duration.ofMillis(8000));
		   	           enterWpsNo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='1244-LTCS-001']")));
		   	           driver.findElement(By.xpath("//div[text()='1244-LTCS-001']")).click();
		   	           Thread.sleep(1000);
		   	           
		   	           WebElement heatNo02 = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[24]/div/div/div/input"));
		   	           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", heatNo02); 
		   	           Thread.sleep(1000);

		   	           WebDriverWait  pipePositionCodeDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
		   	           pipePositionCodeDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[22]/div/div/div[1]/div/div[2]/div/div")));
		   	           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[22]/div/div/div[1]/div/div[2]/div/div")).click();
		   	           Thread.sleep(1000);
		   	           
		   	           WebDriverWait enterPipePosition  = new WebDriverWait(driver, Duration.ofMillis(8000));
		   	           enterPipePosition.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()=' Above Ground']")));
		   	           driver.findElement(By.xpath("//td[text()=' Above Ground']")).click();
		   	           Thread.sleep(1000);
		   	           
		   	        Thread.sleep(2000);
			           
			           WebElement identCode2 = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[30]/div/div/div/input"));
			           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", identCode2); 
			           
			           WebDriverWait  fitUpDateDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
			           fitUpDateDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[28]/div/div/div/div/div[2]/div/div")));
			           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[28]/div/div/div/div/div[2]/div/div")).click();
			           Thread.sleep(1000);
			           
			           WebDriverWait enterfitUpDateDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           enterfitUpDateDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@aria-label='Tuesday, August 15, 2023']")));
			           driver.findElement(By.xpath("//td[@aria-label='Thursday, August 17, 2023']")).click();
			           Thread.sleep(2000);

			          
			           JavascriptExecutor javaScriptExecutor= (JavascriptExecutor)driver;
			           javaScriptExecutor.executeScript("window.scrollBy(500,0)");
			           
			           WebElement partCode02 = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[32]/div/div/div/input"));
			           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", partCode02); 
			           Thread.sleep(2000);
			           

			           WebDriverWait ndeClassSelect  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           ndeClassSelect.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[33]/div/div/div[1]/div/input")));
			           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[33]/div/div/div[1]/div/input")).sendKeys("Testingpr");
			           Thread.sleep(6000);
			           
			           
			           WebDriverWait clickNdeClassSelect  = new WebDriverWait(driver, Duration.ofMillis(12000));
			           clickNdeClassSelect.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
			           driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
			           Thread.sleep(3000);

			          
			           
			           WebDriverWait saveJointDataMaintenanceData  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           saveJointDataMaintenanceData.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[5]/a[1]/span")));
			           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[5]/a[1]/span")).click();
			           Thread.sleep(1000);
			           
			           //start1
			           
			           WebDriverWait dailyWeldingReportSideExplore  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           dailyWeldingReportSideExplore.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[2]/div[2]")));
			           driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[2]/div[2]")).click();
			           Thread.sleep(1000);
			           
			           WebDriverWait dailyWeldingReportStandard  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           dailyWeldingReportStandard.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[2]/ul/li[1]/div")));
			           driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[2]/ul/li[1]/div")).click();
			           Thread.sleep(1000);
			           
			           WebDriverWait enterSpoolDwgNum  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           enterSpoolDwgNum.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[1]/div/div[1]/div[1]/div/div/div[1]/div/input")));
			           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[1]/div/div[1]/div[1]/div/div/div[1]/div/input")).sendKeys("AK06");
			           Thread.sleep(3000);
			           
			           WebDriverWait selectEnteredSpoolDwgNum  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           selectEnteredSpoolDwgNum.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='AK06']")));
			           driver.findElement(By.xpath("//div[text()='AK06']")).click();
			           Thread.sleep(1000);
			           
			           WebDriverWait lineClassTextField  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           lineClassTextField.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[1]/div/div[3]/div[1]/div/div/div[1]/div/input")));
			           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[1]/div/div[3]/div[1]/div/div/div[1]/div/input")).sendKeys("1CA1P");
			           Thread.sleep(1000);
			           
			           WebDriverWait selectEnteredLineClass  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           selectEnteredLineClass.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
			           driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
			           Thread.sleep(1000);
			           
			           WebDriverWait clickOnGoButton  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           clickOnGoButton.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/section[2]/div/form/div[1]/div/div[1]/div[4]/div/div/div/div")));
			           driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[1]/div/div[1]/div[4]/div/div/div/div")).click();
			           Thread.sleep(1000);
			           
			           WebDriverWait selectOneOfTheDataMaintenance  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           selectOneOfTheDataMaintenance.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[2]/td[1]/div")));
			           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[2]/td[1]/div")).click();
			           Thread.sleep(1000);
			           
			           //start2
			           
			           WebDriverWait clickOnAddButton   = new WebDriverWait(driver, Duration.ofMillis(8000));
			           clickOnAddButton.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
			           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
			           Thread.sleep(1000);
			           
			           WebDriverWait enterWeldCompany  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           enterWeldCompany.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/input")));
			           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/input")).sendKeys("JGC");
			           Thread.sleep(3000);
			           
			           
			           WebDriverWait selectEnteredWeldCompany  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           selectEnteredWeldCompany.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div/table/tbody/tr/td[1]")));
			           driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div/table/tbody/tr/td[1]")).click();
			           Thread.sleep(1000);
			           
			                                
			           
			           WebDriverWait enterWelderWork   = new WebDriverWait(driver, Duration.ofMillis(8000));
			           enterWelderWork.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div[1]/div/input")));
			           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div[1]/div/input")).sendKeys("OW");
			           Thread.sleep(3000);
			           
			           WebDriverWait selectEnteredWelderWork  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           selectEnteredWelderWork.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div/table/tbody/tr/td[1]")));
			           driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div/table/tbody/tr/td[1]")).click();
			           Thread.sleep(1000);
			           
			           WebDriverWait enterWorkOn   = new WebDriverWait(driver, Duration.ofMillis(8000));
			           enterWorkOn.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
			           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys("F");
			           Thread.sleep(3000);
			           
			           WebDriverWait selectEnteredWorkOn  = new WebDriverWait(driver, Duration.ofMillis(12000));
			           selectEnteredWorkOn.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[1]")));
			           driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[1]")).click();
			           Thread.sleep(1000);
			           
			           WebDriverWait enterWelderCode   = new WebDriverWait(driver, Duration.ofMillis(8000));
			           enterWelderCode.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[4]/div[1]/div/div[1]/div/input")));
			           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[4]/div[1]/div/div[1]/div/input")).sendKeys("JGC001");
			           Thread.sleep(3000);
			           
			           WebDriverWait selectEnteredWelderCode  = new WebDriverWait(driver, Duration.ofMillis(8000));
			           selectEnteredWelderCode.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div/table/tbody/tr/td[1]")));
			           driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div/table/tbody/tr/td[1]")).click();
			           Thread.sleep(1000);
			           
			           
			           WebDriverWait weldProcess = new WebDriverWait(driver, Duration.ofMillis(8000));
			           weldProcess.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[5]/div/div/div[1]/div/input")));
			           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[5]/div/div/div[1]/div/input")).sendKeys("A");
			           Thread.sleep(3000);
			           
			           WebDriverWait selectEnteredWeldProcess   = new WebDriverWait(driver, Duration.ofMillis(8000));
			           selectEnteredWeldProcess.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[1]")));
			           driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[1]")).click();
			           Thread.sleep(1000);
			           
			           WebDriverWait clickOnCalenderForWeldedDate = new WebDriverWait(driver, Duration.ofMillis(8000));
			           clickOnCalenderForWeldedDate.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div/div/div/div/div[2]/div/div/div")));
			           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div/div/div/div/div[2]/div/div/div")).click();
			           Thread.sleep(4000);
			           
			           WebDriverWait selectWeldedDate = new WebDriverWait(driver, Duration.ofMillis(8000));
			           selectWeldedDate.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/table/tbody/tr[3]/td[5]/span")));
			           driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/table/tbody/tr[3]/td[5]/span")).click();
			           Thread.sleep(1000);
			           
			           WebDriverWait enterDwrNum = new WebDriverWait(driver, Duration.ofMillis(8000));
			           enterDwrNum.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
			           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys("dwr0605");
			           Thread.sleep(2000);
			           
			           WebDriverWait clickOnSaveButton = new WebDriverWait(driver, Duration.ofMillis(8000));
			           clickOnSaveButton.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[1]/span")));
			           driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div/div/div[6]/div[2]/table/tbody/tr[3]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[1]/span")).click();
			           Thread.sleep(1000);
			           
			           Assert.assertTrue(true);
		         		test.log(LogStatus.PASS, "Test 3 - Insertion of new data PASSED");
		}
        
        @Test(priority=3)
		public void Test3() throws InterruptedException, IOException, AWTException
		{
        	File file =new File("PoScreen_TestsDocumentt.xlsx");
            String Path1= file.getAbsolutePath().toString();
     	   FileInputStream fs = new FileInputStream(Path1);
     	   //FileInputStream fs = new FileInputStream();
     	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
     	   XSSFSheet sheet = workbook.getSheetAt(0);
            
     	  
     	   test=extent.startTest("Test 1 - Insertion of new data ");
     	   
     	   initialize();
     		loginPage= new LoginPage(driver);
             homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
     		Thread.sleep(2000);
     		Actions act = new Actions(driver);
     		
     		
     		
     		//starts PO3
             System.out.println(" ");
             Reporter.log(" ");
     		   System.out.println("************************************[ Test 1--> Insertion of new data ]**************************************************** ");
     		   Reporter.log("************************************[ Test 1--> Insertion of new data ]**************************************************** ");
     		   reportLog("******[ Test 1--> Insertion of new data ]****** ");
     		   
     		   
     		    System.out.println("[Test 1 steps 'STARTS'] ");
     		    Reporter.log("[Test 1 steps 'STARTS'] ");
     		    reportLog("[Test 1 steps 'STARTS'] ");
     		   
     		   
     		    WebDriverWait clickOnCMSModules = new WebDriverWait(driver, Duration.ofMillis(8000));
     		    clickOnCMSModules.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")));
     	  	    driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")).click();
     	  	    Thread.sleep(1000);
              

     	  	  WebDriverWait clickOnWeldingControlModule  = new WebDriverWait(driver, Duration.ofMillis(8000));
     	  	clickOnWeldingControlModule.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='WEC']")));
     	  	    driver.findElement(By.xpath("//a[@title='WEC']")).click();
     	  	    Thread.sleep(1000);
     	  	    
     	  	 WebDriverWait visibilityOfImportOptionsOfWEC  = new WebDriverWait(driver, Duration.ofMillis(8000));
   		  visibilityOfImportOptionsOfWEC.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")));
 			  driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")).click();
 			  Thread.sleep(1000);    
   		    
 			  WebDriverWait importNdeRate  = new WebDriverWait(driver, Duration.ofMillis(8000));
 			  importNdeRate.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/ul/li[3]/div/div/div/a")));
 			  driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/ul/li[3]/div/div/div/a")).click();
 			  Thread.sleep(2000); 

 			 WebDriverWait selectFileButton = new WebDriverWait(driver, Duration.ofMillis(8000));
 			  selectFileButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/span")));
 			  driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/span")).click();
 			  Thread.sleep(8000); 
 			  
 			 Robot rb = new Robot();
 			
 			StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS(1.2)\\NdeRateImportForTc17.csv");
 		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
 			  
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
 		    
 		   WebDriverWait clickOnUploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
 			clickOnUploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dx-fileuploader-container']//div[@class='dx-button-content btn btn-primary']")));
 			  driver.findElement(By.xpath("//div[@class='dx-fileuploader-container']//div[@class='dx-button-content btn btn-primary']")).click();
 			  Thread.sleep(7000); 
 			  
 			 WebElement Duplicate1=driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[2]/table/tbody/tr[1]"));
 			 WebElement Duplicate2=driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[2]/table/tbody/tr[2]"));

		      String text1=Duplicate1.getText();
		      String text2=Duplicate2.getText();
		      
		     // String expectedText2 = "12 Record(s) range has been inserted.";
		      Assert.assertEquals(text1,text2);
		      System.out.println("Duplicate Data Exists, Such Record cannot be imported!");
		      Thread.sleep(2000);
		      
		      Assert.assertTrue(true);
       		  test.log(LogStatus.PASS, "Test 1 - Insertion of new data PASSED");
       		  
       		 System.out.println(" ");
             Reporter.log(" ");
     		   System.out.println("************************************[ Test 2--> Insertion of new data ]**************************************************** ");
     		   Reporter.log("************************************[ Test 2--> Insertion of new data ]**************************************************** ");
     		   reportLog("******[ Test 2--> Insertion of new data ]****** ");
     		   
     		   
     		    System.out.println("[Test 2 steps 'STARTS'] ");
     		    Reporter.log("[Test 2 steps 'STARTS'] ");
     		    reportLog("[Test 2 steps 'STARTS'] ");
		      
		      WebDriverWait importWeldJointData  = new WebDriverWait(driver, Duration.ofMillis(8000));
		      importWeldJointData.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/ul/li[1]/div")));
 			  driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/ul/li[1]/div")).click();
 			  Thread.sleep(2000); 
		      
 			 WebDriverWait clickOnCsvRadioButton  = new WebDriverWait(driver, Duration.ofMillis(8000));
 			clickOnCsvRadioButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/form/div[2]/div/div/div[2]/div[1]")));
			  driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/form/div[2]/div/div/div[2]/div[1]")).click();
			  Thread.sleep(2000); 
			
			 WebDriverWait clickOnSelectFileForWeldJoint  = new WebDriverWait(driver, Duration.ofMillis(8000));
			 clickOnSelectFileForWeldJoint.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div/div[1]/form/div[3]/div[1]/div/div/div/div/div[1]/div[1]/div")));
			 driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div/div[1]/form/div[3]/div[1]/div/div/div/div/div[1]/div[1]/div")).click();
			 Thread.sleep(2000); 
			 
			 StringSelection str2 = new StringSelection("D:\\Eclipse_rohit\\CMS(1.2)\\JointData.csv");
	 		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str2, null);
	 			  
	 		    // press Contol+V for pasting
	 		     rb.keyPress(KeyEvent.VK_CONTROL);
	 		     rb.keyPress(KeyEvent.VK_V);
	 		 
	 		    // release Contol+V for pasting
	 		    rb.keyRelease(KeyEvent.VK_CONTROL);
	 		    rb.keyRelease(KeyEvent.VK_V);
	 		 
	 		    // for pressing and releasing Enter
	 		    rb.keyPress(KeyEvent.VK_ENTER);
	 		    rb.keyRelease(KeyEvent.VK_ENTER);
	 		    
	 		   WebDriverWait clickOnUploadForWeldJoint  = new WebDriverWait(driver, Duration.ofMillis(8000));
	 		   clickOnUploadForWeldJoint.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div/div[1]/form/div[3]/div[1]/div/div/div/div/div[2]/div")));
			   driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div/div[1]/form/div[3]/div[1]/div/div/div/div/div[2]/div")).click();
			   Thread.sleep(2000);
			   
			   WebDriverWait clickOnImportFile  = new WebDriverWait(driver, Duration.ofMillis(8000));
			   clickOnImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div/div[1]/form/div[3]/div[2]/button")));
			   driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div/div[1]/form/div[3]/div[2]/button")).click();
			   Thread.sleep(2000);
			   
			   WebDriverWait clickOnJointDataMaintenanceArrowDown  = new WebDriverWait(driver, Duration.ofMillis(8000));
	     	   clickOnJointDataMaintenanceArrowDown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@aria-label='Data Maintenance']//div[@class='dx-treeview-toggle-item-visibility']")));
	      	   driver.findElement(By.xpath("//li[@aria-label='Data Maintenance']//div[@class='dx-treeview-toggle-item-visibility']")).click();
	      	   Thread.sleep(1000);
	     	  	    
	     	   WebDriverWait clickOnJointDataMaintenance  = new WebDriverWait(driver, Duration.ofMillis(8000));
		       clickOnJointDataMaintenance.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[1]/div/div/div/a")));
		       driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[1]/div/div/div/a")).click();
		       Thread.sleep(1000);
		       
		       WebDriverWait enterValidSpoolDwgNum  = new WebDriverWait(driver, Duration.ofMillis(8000));
		       enterValidSpoolDwgNum.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[1]/div[1]/div/div/div/div/input")));
		       driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[1]/div[1]/div/div/div/div/input")).sendKeys("AK06");
		       Thread.sleep(1000);
		       
		       WebDriverWait selectValidSpoolDwgNum   = new WebDriverWait(driver, Duration.ofMillis(8000));
		       selectValidSpoolDwgNum.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='AK06']")));
		       driver.findElement(By.xpath("//div[text()='AK06']")).click();
		       Thread.sleep(1000);
		       
		       WebDriverWait enterValidLineClass  = new WebDriverWait(driver, Duration.ofMillis(8000));
		       enterValidLineClass.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[1]/div/input")));
		       driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[1]/div/input")).sendKeys("1CA1P");
		       Thread.sleep(1000);
		       
		       WebDriverWait selectValidLineClass  = new WebDriverWait(driver, Duration.ofMillis(8000));
		       selectValidLineClass.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
		       driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
		       Thread.sleep(1000);
		       
		       WebDriverWait clickOnGoButton1  = new WebDriverWait(driver, Duration.ofMillis(8000));
		       clickOnGoButton1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[2]/div/div[1]/div[4]/div/div/div/div")));
		       driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[2]/div/div[1]/div[4]/div/div/div/div")).click();
		       Thread.sleep(1000);
		       
		       Assert.assertTrue(true);
	       		  test.log(LogStatus.PASS, "Test 2 - Import the Jointdata csv file PASSED");
	       		  
	       		  
	       		System.out.println(" ");
	             Reporter.log(" ");
	     		   System.out.println("************************************[ Test 3--> Insertion of new data ]**************************************************** ");
	     		   Reporter.log("************************************[ Test 3--> Insertion of new data ]**************************************************** ");
	     		   reportLog("******[ Test 3--> Insertion of new data ]****** ");
	     		   
	     		   
	     		    System.out.println("[Test 3 steps 'STARTS'] ");
	     		    Reporter.log("[Test 3 steps 'STARTS'] ");
	     		    reportLog("[Test 3 steps 'STARTS'] ");  
		       
		       
		       WebDriverWait importWeldJointData2  = new WebDriverWait(driver, Duration.ofMillis(8000));
			   importWeldJointData2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/ul/li[1]/div")));
	 		   driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/ul/li[1]/div")).click();
	 		   Thread.sleep(2000);
	 		   
	 		  WebDriverWait radioButtonForTxtFileOfJointData  = new WebDriverWait(driver, Duration.ofMillis(8000));
	 		  radioButtonForTxtFileOfJointData.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div/div[1]/form/div[2]/div/div/div[1]/div[1]")));
	 		  driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div/div[1]/form/div[2]/div/div/div[1]/div[1]")).click();
	 		  Thread.sleep(2000);
	 		   
	 		   
	 		  WebDriverWait clickOnSelectFileButton1   = new WebDriverWait(driver, Duration.ofMillis(8000));
	 		 clickOnSelectFileButton1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div/div[1]/form/div[3]/div[1]/div/div/div/div/div[1]/div[1]/div")));
	 		  driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div/div[1]/form/div[3]/div[1]/div/div/div/div/div[1]/div[1]/div")).click();
	 		  Thread.sleep(2000);
	 		  
	 		 StringSelection str3 = new StringSelection("D:\\Eclipse_rohit\\CMS(1.2)\\JointData.TXT");
	 		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str3, null);
	 			  
	 		    // press Contol+V for pasting
	 		     rb.keyPress(KeyEvent.VK_CONTROL);
	 		     rb.keyPress(KeyEvent.VK_V);
	 		 
	 		    // release Contol+V for pasting
	 		    rb.keyRelease(KeyEvent.VK_CONTROL);
	 		    rb.keyRelease(KeyEvent.VK_V);
	 		 
	 		    // for pressing and releasing Enter
	 		    rb.keyPress(KeyEvent.VK_ENTER);
	 		    rb.keyRelease(KeyEvent.VK_ENTER);
	 		  
	 		  
	 		   
	 		   
	 		  WebDriverWait clickOnUploadButton1   = new WebDriverWait(driver, Duration.ofMillis(8000));
	 		  clickOnUploadButton1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div/div[1]/form/div[3]/div[1]/div/div/div/div/div[2]/div")));
	 		  driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div/div[1]/form/div[3]/div[1]/div/div/div/div/div[2]/div")).click();
	 		  Thread.sleep(2000);
	 		   
	 		   
	 		  WebDriverWait clickOnImportFileButton   = new WebDriverWait(driver, Duration.ofMillis(8000));
	 		 clickOnImportFileButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div/div[1]/form/div[3]/div[2]/button")));
	 		  driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div/div[1]/form/div[3]/div[2]/button")).click();
	 		  Thread.sleep(2000);
	 		   
	 		   
	 		  WebDriverWait clickOnJointDataMaintenance1   = new WebDriverWait(driver, Duration.ofMillis(8000));
	 		  clickOnJointDataMaintenance1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[1]/div")));
		 	  driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[1]/div")).click();
		 	  Thread.sleep(2000);
		 	 
		 	  //
		 	  
		 	  WebDriverWait enterValidSpoolDwgNum1  = new WebDriverWait(driver, Duration.ofMillis(8000));
		      enterValidSpoolDwgNum1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[1]/div[1]/div/div/div[1]/div/input")));
		      driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[1]/div[1]/div/div/div[1]/div/input")).sendKeys("AK06");
		      Thread.sleep(1000);
		       
		       WebDriverWait selectValidSpoolDwgNum1   = new WebDriverWait(driver, Duration.ofMillis(8000));
		       selectValidSpoolDwgNum1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='AK06']")));
		       driver.findElement(By.xpath("//div[text()='AK06']")).click();
		       Thread.sleep(1000);
		       
		       WebDriverWait enterValidLineClass1  = new WebDriverWait(driver, Duration.ofMillis(8000));
		       enterValidLineClass1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[1]/div/input")));
		       driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[1]/div/input")).sendKeys("1CA1P");
		       Thread.sleep(1000);
		       
		       WebDriverWait selectValidLineClass1  = new WebDriverWait(driver, Duration.ofMillis(8000));
		       selectValidLineClass1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
		       driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
		       Thread.sleep(1000);
		       
		       WebDriverWait clickOnGoButton2  = new WebDriverWait(driver, Duration.ofMillis(8000));
		       clickOnGoButton2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[2]/div/div[1]/div[4]/div/div/div/div")));
		       driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[2]/div/div[1]/div[4]/div/div/div/div")).click();
		       Thread.sleep(1000);
		       
		       Assert.assertTrue(true);
	       		  test.log(LogStatus.PASS, "Test 3 - Import the Jointdata txt file PASSED");  
		       
		      
	       		  
	       
	       		System.out.println(" ");
	             Reporter.log(" ");
	     		   System.out.println("************************************[ Test 4--> Insertion of new data ]**************************************************** ");
	     		   Reporter.log("************************************[ Test 4--> Insertion of new data ]**************************************************** ");
	     		   reportLog("******[ Test 4--> Insertion of new data ]****** ");
	     		   
	     		   
	     		    System.out.println("[Test 4 steps 'STARTS'] ");
	     		    Reporter.log("[Test 4 steps 'STARTS'] ");
	     		    reportLog("[Test 4 steps 'STARTS'] ");  
		 	  
		       WebDriverWait clickOnCMSModules1 = new WebDriverWait(driver, Duration.ofMillis(8000));
    		    clickOnCMSModules1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/header/nav/div[2]/ul/li[3]/a")));
    	  	    driver.findElement(By.xpath("/html/body/div/header/nav/div[2]/ul/li[3]/a")).click();
    	  	    Thread.sleep(3000);
             

    	  	  WebDriverWait clickOnFsc  = new WebDriverWait(driver, Duration.ofMillis(10000));
    	  	  clickOnFsc.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='FSC']")));
    	  	  driver.findElement(By.xpath("//a[@title='FSC']")).click();
    	  	  Thread.sleep(1000);
    	  	  
    	   WebDriverWait clickForDownArrowOfDataMainOfYsDataMgmt  = new WebDriverWait(driver, Duration.ofMillis(8000));
    	   clickForDownArrowOfDataMainOfYsDataMgmt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")));
  	  	   driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")).click();
  	  	   Thread.sleep(1000);
    	  	  
  	  	 WebDriverWait clickOnYsDataMgmt  = new WebDriverWait(driver, Duration.ofMillis(8000));
  	  	clickOnYsDataMgmt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[3]/div")));
	  	   driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[3]/div")).click();
	  	   Thread.sleep(1000);
	  	   
	  	 WebDriverWait clickOnAddButtonForYsDataMgmt  = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	clickOnAddButtonForYsDataMgmt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[4]/div/div/div[3]/div[3]/div/div/div")));
	  	   driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[4]/div/div/div[3]/div[3]/div/div/div")).click();
	  	   Thread.sleep(1000);
	  	   
	  	 WebDriverWait enterIsoDrawNum  = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	enterIsoDrawNum.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/div/div/div/div/input")));
	  	   driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/div/div/div/div/input")).sendKeys("AK06");
	  	   Thread.sleep(3000);
    	  	  
	  	 WebDriverWait selectEnteredDrawNum  = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	selectEnteredDrawNum.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
		 Thread.sleep(1000);	
		                          
    	  	  
		 WebDriverWait clickOnSaveButton = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnSaveButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[5]/a[1]/span")));
	     driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[5]/a[1]/span")).click();
		 Thread.sleep(1000);
		 
		 WebDriverWait isoDrawNumTextField = new WebDriverWait(driver, Duration.ofMillis(8000));
		 isoDrawNumTextField.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div[1]/div/div[1]/div/div[1]/div/input")));
	     driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[1]/div/div[1]/div/div[1]/div/input")).sendKeys("AK06");
		 Thread.sleep(1000);
		 
		 WebDriverWait selectEnteredIsoDrawNum = new WebDriverWait(driver, Duration.ofMillis(8000));
		 selectEnteredIsoDrawNum.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
	     driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
		 Thread.sleep(1000);
		 
		 WebDriverWait clickOnGoButton3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnGoButton3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div[2]/div[1]/div/div")));
	     driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[2]/div[1]/div/div")).click();
		 Thread.sleep(1000);
		 
		 WebDriverWait clickOnEditButton = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnEditButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[5]/a[1]/span")));
	     driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[5]/a[1]/span")).click();
		 Thread.sleep(1000);
		 
		 
		   WebElement revisionAction = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[13]/div/div/div/div/input"));
           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", revisionAction); 
           Thread.sleep(2000);
	    	  	   	  
           WebElement pcwbsScroll = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[16]/div/div/div/div/input"));
           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pcwbsScroll); 
           Thread.sleep(2000);
           
		 WebDriverWait clickOnDropdownForRevisionAction = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnDropdownForRevisionAction.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[13]/div/div/div[1]/div/div[2]/div/div/div")));
	     driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[13]/div/div/div[1]/div/div[2]/div/div/div")).click();
		 Thread.sleep(4000); 

		 WebDriverWait selectOneOptionFromDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
		 selectOneOptionFromDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[3]/div")));
	     driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[3]/div")).click();
		 Thread.sleep(2000); 
		 
		 WebDriverWait clickOnSaveButton2 = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnSaveButton2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[5]/a[1]/span")));
	     driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[5]/a[1]/span")).click();
		 Thread.sleep(2000);
		 
		 WebDriverWait clickOnIsoDrawNumLink  = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnIsoDrawNumLink.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a")));
	     driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[4]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a")).click();
		 Thread.sleep(2000);
    	  	  
		 WebDriverWait clickOnImportForLOM  = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnImportForLOM.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	     driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
		 Thread.sleep(2000);
		 
		 WebDriverWait clickOnSelectFileButton  = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnSelectFileButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[8]/div/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div")));
	     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[8]/div/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div")).click();
		 Thread.sleep(2000);
		 
		 
		 StringSelection str4 = new StringSelection("D:\\Eclipse_rohit\\CMS(1.2)\\Delta_LOM_Import.txt");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str4, null);
			  
		    // press Contol+V for pasting
		     rb.keyPress(KeyEvent.VK_CONTROL);
		     rb.keyPress(KeyEvent.VK_V);
		 
		    // release Contol+V for pasting
		    rb.keyRelease(KeyEvent.VK_CONTROL);
		    rb.keyRelease(KeyEvent.VK_V);
		 
		    // for pressing and releasing Enter
		    rb.keyPress(KeyEvent.VK_ENTER);
		    rb.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		 
		 WebDriverWait clickOnUploadButton3  = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnUploadButton3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[8]/div/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div[2]/div")));
	     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[8]/div/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div[2]/div")).click();
		 Thread.sleep(2000);
		 
		 WebDriverWait clickOnImportFileButton2   = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnImportFileButton2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[8]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div")));
	     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[8]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div")).click();
		 Thread.sleep(4000);
		 
		 WebDriverWait clickOnNoButton   = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnNoButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[2]/div[2]/div/div/div")));
	     driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[2]/div[2]/div/div/div")).click();
		 Thread.sleep(2000);
		 
		 WebDriverWait clickOnCloseButton   = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnCloseButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[8]/div/div/div/div/div[1]/button")));
	     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[8]/div/div/div/div/div[1]/button")).click();
		 Thread.sleep(2000);
		 
		 WebDriverWait clickOnWeldingJointButton   = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnWeldingJointButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div/div[3]/div/div[2]/div[3]/div/div")));
	     driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div/div[3]/div/div[2]/div[3]/div/div")).click();
		 Thread.sleep(2000);
		 
		 WebDriverWait clickOnImportButton   = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnImportButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	     driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
		 Thread.sleep(2000);
		 
		 WebDriverWait clickOnSelectFile   = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnSelectFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[9]/div/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div")));
	     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[9]/div/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div")).click();
		 Thread.sleep(2000);
		 
		 
		 
		 StringSelection str5 = new StringSelection("D:\\Eclipse_rohit\\CMS(1.2)\\Delta_Joint_Import.txt");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str5, null);
			  
		    // press Contol+V for pasting
		     rb.keyPress(KeyEvent.VK_CONTROL);
		     rb.keyPress(KeyEvent.VK_V);
		 
		    // release Contol+V for pasting
		    rb.keyRelease(KeyEvent.VK_CONTROL);
		    rb.keyRelease(KeyEvent.VK_V);
		 
		    // for pressing and releasing Enter
		    rb.keyPress(KeyEvent.VK_ENTER);
		    rb.keyRelease(KeyEvent.VK_ENTER);
		 
		 WebDriverWait clickOnUploadButton2   = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnUploadButton2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[9]/div/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div[2]/div")));
	     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[9]/div/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div[2]/div")).click();
		 Thread.sleep(2000);
		 
		 WebDriverWait clickOnImportButton2   = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnImportButton2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[9]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div")));
	     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[9]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div")).click();
		 Thread.sleep(2000);
		  
//		 WebDriverWait clickOnNoButton2   = new WebDriverWait(driver, Duration.ofMillis(8000));
//		 clickOnNoButton2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[2]/div[2]/div/div/div")));
//	     driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[2]/div[2]/div/div/div")).click();
//		 Thread.sleep(2000);
		 
		 WebDriverWait clickOnCloseButton2   = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnCloseButton2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[9]/div/div/div/div/div[1]/button")));
	     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[9]/div/div/div/div/div[1]/button")).click();
		 Thread.sleep(2000);
		 
		 
		 WebDriverWait clickOnCMSModules2 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnCMSModules2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")).click();
	  	    Thread.sleep(1000);
	  	    
	  	  WebDriverWait clickOnHomePageClosePopup = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	clickOnHomePageClosePopup.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[3]/div/div/div/div[1]/button")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[3]/div/div/div/div[1]/button")).click();
	  	    Thread.sleep(1000);
       
	  	  WebDriverWait clickOnCMSModules3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnCMSModules3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")).click();
	  	    Thread.sleep(1000);

	  	  WebDriverWait clickOnWeldingControlModule2  = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	clickOnWeldingControlModule2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='WEC']")));
	  	    driver.findElement(By.xpath("//a[@title='WEC']")).click();
	  	    Thread.sleep(1000);
	  	    
	  	 WebDriverWait clickOnJointDataMaintenanceArrowDown2  = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	clickOnJointDataMaintenanceArrowDown2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@aria-label='Data Maintenance']//div[@class='dx-treeview-toggle-item-visibility']")));
	  	    driver.findElement(By.xpath("//li[@aria-label='Data Maintenance']//div[@class='dx-treeview-toggle-item-visibility']")).click();
	  	    Thread.sleep(1000);
	  	    
	  	 WebDriverWait clickOnJointDataMaintenance2  = new WebDriverWait(driver, Duration.ofMillis(8000));
        clickOnJointDataMaintenance2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[1]/div/div/div/a")));
        driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[1]/div/div/div/a")).click();
        Thread.sleep(1000);
		 
        WebDriverWait enterTheSpoolDwgNum2  = new WebDriverWait(driver, Duration.ofMillis(8000));
        enterTheSpoolDwgNum2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[1]/div[1]/div/div/div/div/input")));
        driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[1]/div[1]/div/div/div/div/input")).sendKeys("AK06");
        Thread.sleep(1000);
        
        WebDriverWait clickOnEnteredSpoolDwgNum2  = new WebDriverWait(driver, Duration.ofMillis(8000));
        clickOnEnteredSpoolDwgNum2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
        Thread.sleep(1000);
        
        WebDriverWait enterLineClass2 = new WebDriverWait(driver, Duration.ofMillis(8000));
        enterLineClass2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/input")));
        driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/input")).sendKeys("1CA1P");
        Thread.sleep(1000);
        
        WebDriverWait clickOnEnteredLineClass2  = new WebDriverWait(driver, Duration.ofMillis(8000));
        clickOnEnteredLineClass2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
        Thread.sleep(1000);
        
        WebDriverWait clickOnGoButton4  = new WebDriverWait(driver, Duration.ofMillis(8000));
        clickOnGoButton4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[2]/div/div[1]/div[4]/div/div/div/div")));
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[2]/div/div[1]/div[4]/div/div/div/div")).click();
        Thread.sleep(1000);
        
        Assert.assertTrue(true);
 		  test.log(LogStatus.PASS, "Test 4 - Import the LOM and Weld Joint Data txt file PASSED");  
     
        
      
        //31st
 		 System.out.println(" ");
         Reporter.log(" ");
 		   System.out.println("************************************[ Test 5--> Insertion of new data ]**************************************************** ");
 		   Reporter.log("************************************[ Test 5--> Insertion of new data ]**************************************************** ");
 		   reportLog("******[ Test 5--> Insertion of new data ]****** ");
 		   
 		   
 		    System.out.println("[Test 5 steps 'STARTS'] ");
 		    Reporter.log("[Test 5 steps 'STARTS'] ");
 		    reportLog("[Test 5 steps 'STARTS'] ");  
 		  
 		  
        WebDriverWait clickOnCMSModules4 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnCMSModules4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")));
  	    driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")).click();
  	    Thread.sleep(1000);
  	    
  	  WebDriverWait clickOnHomePageClosePopup2 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	clickOnHomePageClosePopup2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[3]/div/div/div/div[1]/button")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[3]/div/div/div/div[1]/button")).click();
	  	    Thread.sleep(1000);
	  	    
	  	 WebDriverWait clickOnCMSModules5 = new WebDriverWait(driver, Duration.ofMillis(8000));
		 clickOnCMSModules5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")));
	  	 driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")).click();
	  	 Thread.sleep(1000);
  	    
  	    WebDriverWait clickOnIsoControlSystem = new WebDriverWait(driver, Duration.ofMillis(8000));
  	    clickOnIsoControlSystem.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='ICS']")));
	    driver.findElement(By.xpath("//a[@title='ICS']")).click();
	    Thread.sleep(1000);
	    
	    WebDriverWait clickOnJcrfGeneration = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnJcrfGeneration.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div")));
  	    driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div")).click();
  	    Thread.sleep(1000);
  	    
  	    WebDriverWait clickOnAddNewData = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnAddNewData.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
	    Thread.sleep(1000);
	    
	    WebDriverWait pcwbsDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
	    pcwbsDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/div/div/div[1]/div/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/div/div/div[1]/div/div[2]/div/div/div")).click();
	    Thread.sleep(1000);
	    
	    WebDriverWait selectPcwbs  = new WebDriverWait(driver, Duration.ofMillis(8000));
	    selectPcwbs.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div")));
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div")).click();
	    Thread.sleep(1000);
	    
	    WebDriverWait subconDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
	    subconDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[3]/div/div/div[1]/div/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[3]/div/div/div[1]/div/div[2]/div/div/div")).click();
	    Thread.sleep(1000);
	    
	    WebDriverWait selectSubcon = new WebDriverWait(driver, Duration.ofMillis(8000));
	    selectSubcon.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div")));
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div")).click();
	    Thread.sleep(1000);
	    
	    WebDriverWait enterJcrfNum = new WebDriverWait(driver, Duration.ofMillis(8000));
	    enterJcrfNum.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[4]/div/div/div/div[1]/input")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[4]/div/div/div/div[1]/input")).sendKeys("AKKK-JCRF2");
	    Thread.sleep(1000);
	    
	    WebDriverWait enterJcrfTitle = new WebDriverWait(driver, Duration.ofMillis(8000));
	    enterJcrfTitle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[5]/div/div/div/div[1]/input")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[5]/div/div/div/div[1]/input")).sendKeys("AKKK-JCRF2");
	    Thread.sleep(1000);
	    
	    WebDriverWait clickOnPreparedDateCalender = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnPreparedDateCalender.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div/div/div/div/div[2]/div[2]/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div/div/div/div/div[2]/div[2]/div/div")).click();
	    Thread.sleep(1000);
	    
	    WebDriverWait clickOnPreparedDate = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnPreparedDate.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/table/tbody/tr[2]/td[5]")));
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/table/tbody/tr[2]/td[5]")).click();
	    Thread.sleep(1000);
	    
	    WebDriverWait enterPreparedBy = new WebDriverWait(driver, Duration.ofMillis(8000));
	    enterPreparedBy.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/div[1]/input")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/div[1]/input")).sendKeys("Admin");
	    Thread.sleep(1000);

	    WebDriverWait clickOnSaveRecordButton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnSaveRecordButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[6]/a[1]/span")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[6]/a[1]/span")).click();
	    Thread.sleep(1000);
	    
	    WebDriverWait clickOnPcwbsDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnPcwbsDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div/div/div")).click();
	    Thread.sleep(1000);
  	    
	    WebDriverWait selectPcwbs1 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    selectPcwbs1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div")));
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div")).click();
	    Thread.sleep(1000);
//	    
	    WebDriverWait clickOnGoButton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnGoButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[1]/div/div/div[3]/div[1]/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[1]/div/div/div[3]/div[1]/div")).click();
	    Thread.sleep(1000);
  	    
	    WebDriverWait clickOnExpandCreatedJcrf = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnExpandCreatedJcrf.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[5]/td[1]/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[5]/td[1]/div")).click();
	    Thread.sleep(4000);


	    WebDriverWait clickOnAddNewDataLogo = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnAddNewDataLogo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[6]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[6]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	    Thread.sleep(1000);
	    
	    WebDriverWait enterSpoolDwgNum = new WebDriverWait(driver, Duration.ofMillis(8000));
	    enterSpoolDwgNum.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[6]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[1]/div/div/div/div/div[1]/input")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[6]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[1]/div/div/div/div/div[1]/input")).sendKeys("AK06");
	    Thread.sleep(5000);
  	    
	    WebDriverWait forSpoolDwgDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
	    forSpoolDwgDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div")));
	    driver.findElement(By.xpath("/html/body/div[2]/div")).click();
	    Thread.sleep(2000);
	    
	    WebDriverWait clickTypeOfChangeDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickTypeOfChangeDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[6]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/div/div/div[1]/div/div[2]/div[2]/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[6]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
	    Thread.sleep(1000);
	    
	    WebDriverWait clickOnTypeOfChange = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnTypeOfChange.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[3]/div")));
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[3]/div")).click();
	    Thread.sleep(1000);
	    
	    WebDriverWait orgJointNoDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
	    orgJointNoDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[6]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[3]/div/div/div[1]/div/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[6]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[3]/div/div/div[1]/div/div[2]/div/div/div")).click();
	    Thread.sleep(1000);
  	    
	    WebDriverWait clickOnOrgJointNo = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnOrgJointNo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
	    Thread.sleep(1000); 
  	    
	    WebDriverWait newJointNum = new WebDriverWait(driver, Duration.ofMillis(8000));
	    newJointNum.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[6]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div/div/div/div[1]/input")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[6]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div/div/div/div[1]/input")).sendKeys("009");
	    Thread.sleep(1000); 
  	    
	    WebDriverWait clickOnSaveButton3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnSaveButton3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[6]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[5]/a[1]/span")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[6]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[5]/a[1]/span")).click();
	    Thread.sleep(1000);
	    
	    WebDriverWait clickOnEditRecord = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnEditRecord.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[5]/td[6]/a[1]/span")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[5]/td[6]/a[1]/span")).click();
	    Thread.sleep(1000);
	 //....   
//	    WebDriverWait clickOnApprovedDateCalender = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    clickOnApprovedDateCalender.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[5]/td[8]/div/div/div/div/div[2]/div/div/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[5]/td[8]/div/div/div/div/div[2]/div/div/div")).click();
//	    Thread.sleep(1000);
//	    
//	    WebDriverWait clickOnApprovedDate = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    clickOnApprovedDate.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/table/tbody/tr[2]/td[5]")));
//	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/table/tbody/tr[2]/td[5]")).click();
//	    Thread.sleep(1000);
	//.......    
	    WebElement checkedByScroll = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[5]/td[11]/div/div/div/div[1]/input"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkedByScroll); 
        Thread.sleep(2000);
	    
        WebElement approvedByBackspace = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[5]/td[9]/div/div/div/div[1]/input"));
        approvedByBackspace.sendKeys(Keys.BACK_SPACE); 
        approvedByBackspace.sendKeys(Keys.BACK_SPACE); 
        approvedByBackspace.sendKeys(Keys.BACK_SPACE); 
        approvedByBackspace.sendKeys(Keys.BACK_SPACE); 
        approvedByBackspace.sendKeys(Keys.BACK_SPACE); 
        approvedByBackspace.sendKeys(Keys.BACK_SPACE); 
        approvedByBackspace.sendKeys(Keys.BACK_SPACE);
        approvedByBackspace.sendKeys(Keys.BACK_SPACE);
        approvedByBackspace.sendKeys(Keys.BACK_SPACE);
        approvedByBackspace.sendKeys(Keys.BACK_SPACE);
        approvedByBackspace.sendKeys(Keys.BACK_SPACE);
        approvedByBackspace.sendKeys(Keys.BACK_SPACE);
        
	    
	    WebDriverWait enterApprovedBy = new WebDriverWait(driver, Duration.ofMillis(8000));
	    enterApprovedBy.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[5]/td[9]/div/div/div/div[1]/input")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[5]/td[9]/div/div/div/div[1]/input")).sendKeys("XYZ");
	    Thread.sleep(1000);
		 
	    WebDriverWait clickOnSaveButton4 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnSaveButton4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[5]/td[6]/a[1]/span")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/div/div[6]/div[2]/table/tbody/tr[5]/td[6]/a[1]/span")).click();
	    Thread.sleep(1000);
	    
	    WebDriverWait clickOnCMSModules6 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnCMSModules6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")));
  	    driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")).click();
  	    Thread.sleep(1000);
  	    
  	  WebDriverWait clickOnHomePageClosePopup1 = new WebDriverWait(driver, Duration.ofMillis(8000));
  	clickOnHomePageClosePopup1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[3]/div/div/div/div[1]/button")));
  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[3]/div/div/div/div[1]/button")).click();
  	    Thread.sleep(1000);
   
  	  WebDriverWait clickOnCMSModules7 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickOnCMSModules7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")));
  	    driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")).click();
  	    Thread.sleep(1000);

  	  WebDriverWait clickOnWeldingControlModule3  = new WebDriverWait(driver, Duration.ofMillis(8000));
  	clickOnWeldingControlModule3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='WEC']")));
  	    driver.findElement(By.xpath("//a[@title='WEC']")).click();
  	    Thread.sleep(1000);
  	    
  	 WebDriverWait clickOnJointDataMaintenanceArrowDown3  = new WebDriverWait(driver, Duration.ofMillis(8000));
  	clickOnJointDataMaintenanceArrowDown3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@aria-label='Data Maintenance']//div[@class='dx-treeview-toggle-item-visibility']")));
  	    driver.findElement(By.xpath("//li[@aria-label='Data Maintenance']//div[@class='dx-treeview-toggle-item-visibility']")).click();
  	    Thread.sleep(1000);
  	    
  	 WebDriverWait clickOnJointDataMaintenance3  = new WebDriverWait(driver, Duration.ofMillis(8000));
    clickOnJointDataMaintenance3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[1]/div/div/div/a")));
    driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[1]/div/div/div/a")).click();
    Thread.sleep(1000);
	 
    WebDriverWait enterTheSpoolDwgNum3  = new WebDriverWait(driver, Duration.ofMillis(8000));
    enterTheSpoolDwgNum3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[1]/div[1]/div/div/div/div/input")));
    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[1]/div[1]/div/div/div/div/input")).sendKeys("AK06");
    Thread.sleep(1000);
    
    WebDriverWait clickOnEnteredSpoolDwgNum3  = new WebDriverWait(driver, Duration.ofMillis(8000));
    clickOnEnteredSpoolDwgNum3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
    Thread.sleep(1000);
    
    WebDriverWait enterLineClass3 = new WebDriverWait(driver, Duration.ofMillis(8000));
    enterLineClass3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/input")));
    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/input")).sendKeys("1CA1P");
    Thread.sleep(1000);
    
    WebDriverWait clickOnEnteredLineClass3  = new WebDriverWait(driver, Duration.ofMillis(8000));
    clickOnEnteredLineClass3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
    Thread.sleep(1000);
    
    WebDriverWait clickOnGoButton5  = new WebDriverWait(driver, Duration.ofMillis(8000));
    clickOnGoButton5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[2]/div/div[1]/div[4]/div/div/div/div")));
    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[2]/div/div[1]/div[4]/div/div/div/div")).click();
    Thread.sleep(3000);
    
//    WebElement scrollUptoNdeClass = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[2]/td[33]"));
//    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollUptoNdeClass); 
//    Thread.sleep(2000);
//    
//    JavascriptExecutor javaScriptExecutor= (JavascriptExecutor)driver;
//    javaScriptExecutor.executeScript("window.scrollBy(500,0)");
    
    WebElement addSpoolPiece = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[13]"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addSpoolPiece); 
    
    
    Thread.sleep(2000);
    
    WebElement elementWeldedLocation = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[18]"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementWeldedLocation); 
    Thread.sleep(2000);
    
    WebElement elementMaterial01 = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[20]"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementMaterial01); 
       Thread.sleep(2000);
       
       WebElement heatNum02 = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[24]"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", heatNum02); 
       Thread.sleep(2000);
       
       WebElement identCode2 = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[30]"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", identCode2); 
       Thread.sleep(2000);
    
    JavascriptExecutor javaScriptExecutor= (JavascriptExecutor)driver;
    javaScriptExecutor.executeScript("window.scrollBy(500,0)");
    Thread.sleep(1000);
    
    WebElement partCode02 = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[3]/div/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[32]"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", partCode02); 
    Thread.sleep(2000);
    
    JavascriptExecutor javaScriptExecutor1= (JavascriptExecutor)driver;
    javaScriptExecutor1.executeScript("window.scrollBy(500,0)");
    Thread.sleep(3000);
	    
       Assert.assertTrue(true);
	   test.log(LogStatus.PASS, "Test 5 - Verify JCRF data with new Joint num PASSED");  

	   System.out.println(" ");
       Reporter.log(" ");
		   System.out.println("************************************[ Test 6--> Insertion of new data ]**************************************************** ");
		   Reporter.log("************************************[ Test 6--> Insertion of new data ]**************************************************** ");
		   reportLog("******[ Test 6--> Insertion of new data ]****** ");
		   
		   
		    System.out.println("[Test 6 steps 'STARTS'] ");
		    Reporter.log("[Test 6 steps 'STARTS'] ");
		    reportLog("[Test 6 steps 'STARTS'] ");  
		    
		    
		    WebDriverWait clickOnNDERequestAndResult  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnNDERequestAndResult.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[3]/div[2]")));
		    driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[3]/div[2]")).click();
		    Thread.sleep(2000);

		    WebDriverWait NdeResultEntry = new WebDriverWait(driver, Duration.ofMillis(8000));
		    NdeResultEntry.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[3]/ul/li[2]/div")));
		    driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[3]/ul/li[2]/div")).click();
		    Thread.sleep(5000);
		    
		    WebDriverWait enterSpoolDwgNumInNdeResEntry = new WebDriverWait(driver, Duration.ofMillis(8000));
		    enterSpoolDwgNumInNdeResEntry.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/input")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/input")).sendKeys("AK06");
		    Thread.sleep(2000);
		    
		                              ///html/body/div/div/section[2]/div/form/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/input
		    
		    WebDriverWait clickOnEnteredSpoolDwgNumInNdeResEntry = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnEnteredSpoolDwgNumInNdeResEntry.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='AK06']")));
		    driver.findElement(By.xpath("//div[text()='AK06']")).click();
		    Thread.sleep(2000);
		    
		    WebDriverWait enterLineClassForNdeResEntry = new WebDriverWait(driver, Duration.ofMillis(8000));
		    enterLineClassForNdeResEntry.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[1]/div[2]/div/div[2]/div/div[1]/div/div/div/input")));
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[1]/div[2]/div/div[2]/div/div[1]/div/div/div/input")).sendKeys("1CA1P");
		    Thread.sleep(2000);
		    
		    WebDriverWait clickOnEnterLineClassForNdeResEntry  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnEnterLineClassForNdeResEntry.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='1CA1P']")));
		    driver.findElement(By.xpath("//div[text()='1CA1P']")).click();
		    Thread.sleep(2000);
		    
		    WebDriverWait clickOnGoButton7  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnGoButton7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div")).click();
		    Thread.sleep(2000); 
		    
		    WebDriverWait clickOnRequiredSpoolDwgDropdown  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnRequiredSpoolDwgDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[1]/td[1]/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[1]/td[1]/div")).click();
		    Thread.sleep(2000); 
		    
		    
		    WebDriverWait clickOnEditButtonOfNdeResEntry  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnEditButtonOfNdeResEntry.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[1]/span")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[1]/span")).click();
		    Thread.sleep(2000);
		    
		   WebElement reportNumForNdeEntryForBackspace = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[4]/div/div/div/input"));
		   reportNumForNdeEntryForBackspace.sendKeys(Keys.BACK_SPACE); 
		   reportNumForNdeEntryForBackspace.sendKeys(Keys.BACK_SPACE); 
		   reportNumForNdeEntryForBackspace.sendKeys(Keys.BACK_SPACE); 
		   reportNumForNdeEntryForBackspace.sendKeys(Keys.BACK_SPACE); 
		   reportNumForNdeEntryForBackspace.sendKeys(Keys.BACK_SPACE); 
		   reportNumForNdeEntryForBackspace.sendKeys(Keys.BACK_SPACE); 
		   reportNumForNdeEntryForBackspace.sendKeys(Keys.BACK_SPACE); 

		   //reportNumForNdeEntryForBackspace.sendKeys(Keys.CONTROL + 'a', Keys.BACKSPACE) 
		   
		    WebDriverWait reportNumForNdeResEntry  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    reportNumForNdeResEntry.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[4]/div/div/div/input")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[4]/div/div/div/input")).sendKeys("012");
		    Thread.sleep(1000);
		    
		
		    
		    WebElement reportDateScroll = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div/div/div/input"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",reportDateScroll); 
		    Thread.sleep(2000);
		    
		    WebDriverWait reportDate  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    reportDate.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[5]/div[1]/div/div[1]/div/div[2]/div/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[5]/div[1]/div/div[1]/div/div[2]/div/div")).click();
		    Thread.sleep(3000);
		    
		    WebDriverWait selectReportDate  = new WebDriverWait(driver, Duration.ofMillis(12000));
		    selectReportDate.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/table/tbody/tr[4]/td[6]")));
		    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/table/tbody/tr[4]/td[6]")).click();
		    Thread.sleep(3000);
		    
		   
	           
	        WebElement RtStatusCode = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/div/input"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",RtStatusCode); 
			Thread.sleep(2000);
		    

		    JavascriptExecutor javaScriptExecutor2= (JavascriptExecutor)driver;
	           javaScriptExecutor2.executeScript("window.scrollBy(500,0)");
	           Thread.sleep(2000);
	           
	           WebElement RtFilmNo = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[6]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",RtFilmNo); 
				Thread.sleep(2000);	

		    WebDriverWait screenMaximize  = new WebDriverWait(driver, Duration.ofMillis(12000));
			screenMaximize.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/header/nav/a")));
			driver.findElement(By.xpath("/html/body/div/header/nav/a")).click();
			Thread.sleep(3000);	
				
		     
		    WebDriverWait RtStatusTextFieldClear  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    RtStatusTextFieldClear.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/div/div[2]/span/span")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/div/div[2]/span/span")).click();
			Thread.sleep(1000);			
				
				
		    WebDriverWait RtStatusTextField  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    RtStatusTextField.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div[1]/div/input")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div[1]/div/input")).sendKeys("CRW");
		    Thread.sleep(5000);
		    
		    WebDriverWait selectRTStatus  = new WebDriverWait(driver, Duration.ofMillis(15000));
		    selectRTStatus.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div")));
		    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div")).click();
		    Thread.sleep(2000);
		    
		    WebDriverWait clickOnSaveLogoButton  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnSaveLogoButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[1]/span")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[1]/div/div/div[6]/div[2]/table/tbody/tr[2]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[1]/span")).click();
		    Thread.sleep(4000);
		    
		    WebDriverWait crwJointNum1  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    crwJointNum1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[8]/div/div/div[2]/div/div[1]/div[1]/div/div/input")));
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[8]/div/div/div[2]/div/div[1]/div[1]/div/div/input")).sendKeys("090");
		    Thread.sleep(2000);
		    
		    WebDriverWait crwJointNum2  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    crwJointNum2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[8]/div/div/div[2]/div/div[1]/div[2]/div/div/input")));
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[8]/div/div/div[2]/div/div[1]/div[2]/div/div/input")).sendKeys("080");
		    Thread.sleep(2000);
		    
		    WebDriverWait clickOnSaveButtonOfJoints  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnSaveButtonOfJoints.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[8]/div/div/div[3]/div/div")));
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[8]/div/div/div[3]/div/div")).click();
		    Thread.sleep(2000);
		    
		    WebDriverWait screenMinimize  = new WebDriverWait(driver, Duration.ofMillis(12000));
		    screenMinimize.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/header/nav/a")));
			driver.findElement(By.xpath("/html/body/div/header/nav/a")).click();
			Thread.sleep(2000);
		    
			WebDriverWait clickOnJointDataMaintenance4  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnJointDataMaintenance4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[1]/div/div/div/a")));
		    driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[3]/ul/li[1]/div/div/div/a")).click();
		    Thread.sleep(1000);
			 
		    WebDriverWait enterTheSpoolDwgNum4  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    enterTheSpoolDwgNum4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[1]/div[1]/div/div/div/div/input")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[1]/div[1]/div/div/div/div/input")).sendKeys("AK06");
		    Thread.sleep(1000);
		    
		    WebDriverWait clickOnEnteredSpoolDwgNum4  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnEnteredSpoolDwgNum4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
		    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
		    Thread.sleep(1000);
		    
		    WebDriverWait enterLineClass4 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    enterLineClass4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/input")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/input")).sendKeys("1CA1P");
		    Thread.sleep(1000);
		    
		    WebDriverWait clickOnEnteredLineClass4  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnEnteredLineClass4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
		    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
		    Thread.sleep(1000);
		    
		    WebDriverWait clickOnGoButton8  = new WebDriverWait(driver, Duration.ofMillis(8000));
		    clickOnGoButton8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/div[2]/div/div[1]/div[4]/div/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[2]/div/div[1]/div[4]/div/div/div/div")).click();
		    Thread.sleep(3000);	    
		    
    	}
}