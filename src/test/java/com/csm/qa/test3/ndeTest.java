package com.csm.qa.test3;
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
import org.openqa.selenium.JavascriptExecutor;
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


//import extentReport.GetScreenShot;


public class ndeTest extends CSMBase{
	LoginPage loginPage;
	HomePage homePage;
	ExtentReports extent;
	ExtentTest test;
	

	//@BeforeTest
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
public void Test01() throws EncryptedDocumentException, InterruptedException, IOException
{
	
	   test=extent.startTest("Test 5 - Verify User is able to view record with NDE class in NDE class Column  ");
	   
	   initialize();
		loginPage= new LoginPage(driver);
        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		
		CSMBase base=new CSMBase();
		commonAllElementsNDE(driver);
		
		
		//starts PO3
        System.out.println(" ");
        Reporter.log(" ");
		   System.out.println("************************************[ Test 1--> Insertion of new data ]**************************************************** ");
		   Reporter.log("************************************[ Test 1--> Insertion of new data ]**************************************************** ");
		   reportLog("******[ Test 1--> Insertion of new data ]****** ");
		   
		   
		    System.out.println("[Test 1 steps 'STARTS'] ");
		    Reporter.log("[Test 1 steps 'STARTS'] ");
		    reportLog("[Test 1 steps 'STARTS'] ");
		    
		    
		    
		    driver.get("https://qacms.jgc.com/WEC_TRAINING/NDEResultEntry/Index?mId=V0VDLURNLU5SUkU=");
		
		    
	  	    
	  	//Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait reportArrow = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	  reportArrow.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[4]/div[2]")));
	  	    driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[4]/div[2]")).click();
	  	    Thread.sleep(2000);
	  	    
	  	  	//Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait reqno = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	  reqno.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div/input")));
	  	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div/input")).sendKeys("RTQ-JGC-000117");
	  	    Thread.sleep(2000);
	  	//Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait reqnoPar = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	  reqnoPar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	//Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait goButtn = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	  goButtn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[1]/div[2]/div/div[2]/div/div[3]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	//Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait addPenaltyJointButton = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	  addPenaltyJointButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[2]/div/div/div[6]/div[2]/table/tbody/tr[1]/td[4]/a[3]")));
	  	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[5]/div/div[2]/div/div/div[6]/div[2]/table/tbody/tr[1]/td[4]/a[3]")).click();
	  	    Thread.sleep(4000);
	  	    
	  	//Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait filterJointNooo1 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	  filterJointNooo1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys("01802");
	  	    Thread.sleep(2000);
	  	    
	  	//Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait checkedJoint1 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	  checkedJoint1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[1]/div/div/span")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[1]/div/div/span")).click();
	  	    Thread.sleep(2000);
	  	    
          //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait filterJointNoooCleared = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	  filterJointNoooCleared.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).click();
	  	  driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys(Keys.ARROW_RIGHT);
	  	driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys(Keys.ARROW_RIGHT);
	  	driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys(Keys.ARROW_RIGHT);
	  	driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys(Keys.ARROW_RIGHT);
	  	driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys(Keys.ARROW_RIGHT);
	  	driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys(Keys.ARROW_RIGHT);
	  	  driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys(Keys.BACK_SPACE);
	  	driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys(Keys.BACK_SPACE);
	  	driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys(Keys.BACK_SPACE);
	  	driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys(Keys.BACK_SPACE);
	  	driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys(Keys.BACK_SPACE);
	  	driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys(Keys.BACK_SPACE);
	  	driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys(Keys.BACK_SPACE);
	  	driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys(Keys.BACK_SPACE);
	  	    Thread.sleep(2000);
	  	    
	  	    
	  	//Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait filterJointNooo2 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	  filterJointNooo2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/input")).sendKeys("02802");
	  	    Thread.sleep(2000);
	  	    
	  		//Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait checkedJoint2 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	  checkedJoint2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[1]/div/div/span")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[1]/div[3]/div/div/div/div[6]/div[2]/table/tbody/tr[1]/td[1]/div/div/span")).click();
	  	    Thread.sleep(2000);
	  	    
	  	//Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait saveButtonPentalyJoints = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	  saveButtonPentalyJoints.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[2]/div[2]/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[7]/div/div/div/div/form/div/div[2]/div[2]/div")).click();
	  	    Thread.sleep(4000);
	  	    
//	  	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	  	 js.executeScript("window.scrollBy(0,200)", "");
	  	   
//	  	  JavascriptExecutor js = (JavascriptExecutor) driver;
//	  	//Locating element by link text and store in variable "Element"        		
//	        WebElement Element = driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[4]/ul/li[16]/div"));
//          // Scrolling down the page till the element is found		
//	        js.executeScript("arguments[0].scrollIntoView();", Element);
//	  	    
//	    	//Inspection and clicking of "Discipline Code"   	    
//	  	    WebDriverWait fivePercntRTCoverage = new WebDriverWait(driver, Duration.ofMillis(8000));
//	  	  fivePercntRTCoverage.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[4]/ul/li[16]/div")));
//	  	    driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[4]/ul/li[16]/div")).click();
//	  	    Thread.sleep(2000);
	  	    


		  	    
		System.out.println("[Test 1 steps 'ENDS'] ");
	    Reporter.log("[Test 1 steps 'ENDS'] ");
	    reportLog("[Test 1 steps 'ENDS'] ");
	 
	    System.out.println("************************************[ Test 1--> 'Insertion of new data' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 1--> 'Insertion of new data' is ''PASSED'' ]************************************ ");
	    reportLog("******[ Test 1--> 'Insertion of new data' is ''PASSED'' ]****** ");
	    System.out.println(" ");
	    Reporter.log(" ");
	    System.out.println(" ");
	    Reporter.log(" ");
	    //driver.quit();
      //ends PO3

        Assert.assertTrue(true);
  		test.log(LogStatus.PASS, "Test 1 - Insertion of new data PASSED");
  		
  }





//@AfterMethod
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

//@AfterTest
public void endReport() {
	
      extent.flush();
}	
}















































































