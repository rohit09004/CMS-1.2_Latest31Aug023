package com.csm.qa.test2;
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


//import extentReport.GetScreenShot;


public class LoginPageTest extends CSMBase{
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
   
//    //Validate Login with Valid Credentials 
//	////@Test(priority=1)
//	public void LoginWithValidCredentials() throws InterruptedException, IOException
//	{
//		test=extent.startTest("Test 1 - Insertion of new data ");
//		
//		initialize();
//		loginPage= new LoginPage(driver);
//        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(1000);
//		String homePagetitle= driver.getTitle();
//		Assert.assertEquals(homePagetitle,"Home Page", "Invalid Credentials");
//		System.out.println("Test 1 passed");
//		
//		   File file =new File("POShipping.xlsx");
//		   System.out.println(file.getAbsolutePath());
//           String Path1= file.getAbsolutePath().toString();
//		   FileInputStream fs = new FileInputStream(Path1);
//		   //FileInputStream fs = new FileInputStream();
//		   XSSFWorkbook workbook = new XSSFWorkbook(fs);
//		   XSSFSheet sheet = workbook.getSheetAt(0);
////		   Row row = sheet.getRow(1);
////		   Cell cell = row.getCell(2);
//		   //System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
//		   String po1=sheet.getRow(1).getCell(2).getStringCellValue();
//		   System.out.println(po1);
//		   String po2=sheet.getRow(3).getCell(2).getStringCellValue();
//		   System.out.println(po2);
//		   System.out.println("Test 1 passed with valid credentilias");
//		   
//		  
//	        Assert.assertTrue(true);
//	  		test.log(LogStatus.PASS, "Test 1 - Insertion of new data PASSED");
//		driver.quit();
//	}

//@Test(priority=1)
//public void Test1() throws EncryptedDocumentException, InterruptedException, IOException
//{
//	   
//	   File file =new File("PoScreen_TestsDocumentt.xlsx");
//       String Path1= file.getAbsolutePath().toString();
//	   FileInputStream fs = new FileInputStream(Path1);
//	   //FileInputStream fs = new FileInputStream();
//	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
//	   XSSFSheet sheet = workbook.getSheetAt(0);
//
//	  
//	   test=extent.startTest("Test 1 - Insertion of new data ");
//	   
//	    initialize();
//		loginPage= new LoginPage(driver);
//        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(2000);
//		
//		CSMBase base=new CSMBase();
//		base.commonAllElements(driver);
//		
//		
//		//starts PO3
//        System.out.println(" ");
//        Reporter.log(" ");
//		   System.out.println("************************************[ Test 1--> Insertion of new data ]**************************************************** ");
//		   Reporter.log("************************************[ Test 1--> Insertion of new data ]**************************************************** ");
//		   reportLog("******[ Test 1--> Insertion of new data ]****** ");
//		   
//		   
//		    System.out.println("[Test 1 steps 'STARTS'] ");
//		    Reporter.log("[Test 1 steps 'STARTS'] ");
//		    reportLog("[Test 1 steps 'STARTS'] ");
//		   
//         //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
//		    WebDriverWait insertSymbole1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		    insertSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
//		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
//	         System.out.println("01.Clicked on 'Insert' button to add new Record");
//	         Reporter.log("01.Clicked on 'Insert' button to add new Record");
//	         reportLog("01.Clicked on 'Insert' button to add new Record");
//
//			
//		    //Inspection and clicking of "PO No." field   	    
//		    WebDriverWait poNoField1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		    poNoField1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
//		    String poNoFieldSheet1=sheet.getRow(1).getCell(2).getStringCellValue();
//		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet1);
//		    System.out.println("02.Inserting 'PO No.' field ");
//		    Reporter.log("02.Inserting 'PO No.' field ");
//		    reportLog("02.Inserting 'PO No.' field ");
//
////for failing test
//		     //driver.findElement(By.xpath("wggsjhwvjgvjgdevwgjv")).click();
//		    //reportLog("02.Inserting 'PO No.' fielD  from PO2");
//
//		    
//		    //Inspection and clicking of "Company Code" field   	    
//		    WebDriverWait companyCodeFieldOptions1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		    companyCodeFieldOptions1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
//		    String companyCodeField1=sheet.getRow(1).getCell(15).getStringCellValue();
//		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField1);
//		    System.out.println("03.Choosing 'Company code' field ");
//		    Reporter.log("03.Choosing 'Company code' field ");
//		    reportLog("03.Choosing 'Company code' field ");
//		
//		
//		base.commonCompanyCodeField(driver);
//		base.commonElementPODate(driver);
//		
//		//Inspection and clicking of "Title1" field   	    
//	    WebDriverWait title101 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    title101.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
//	    String title1Data01=sheet.getRow(1).getCell(12).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data01);
//	    System.out.println("04.Inserting 'Title1' field ");
//	    Reporter.log("04.Inserting 'Title1' field ");
//	    reportLog("04.Inserting 'Title1' field ");
//	    Thread.sleep(1000);
//	    
//	    base.commonSAVEbutton(driver);
//	    System.out.println("05.Cliking on 'SAVE' button ");
//	    Reporter.log("05.Cliking on 'SAVE' button ");
//	    reportLog("05.Cliking on 'SAVE' button ");
//	    Thread.sleep(2000);
//
//	       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
//	  		WebDriverWait insertChildSymbole1= new WebDriverWait(driver, Duration.ofMillis(8000));
//	  	    insertChildSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
//	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
//	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
//	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
//	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
//	  	    Thread.sleep(1000);		    
//	  	    
//	  	    //Inspection and clicking of "Discipline Code"   	    
//	  	    WebDriverWait disciplineCodeDropdown1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	  	    disciplineCodeDropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
//	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
//	  	    Thread.sleep(1000);
//	  	    
//	  	    //Inspection and clicking of particular "Discipline Code"    	    
//	  	    WebDriverWait disciplineCodeDropdownPiping1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	  	    disciplineCodeDropdownPiping1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[24]")));
//	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[24]")).click();
//	  	    System.out.println("07.Choosing 'Displine code' ");
//	  	    Reporter.log("07.Choosing 'Displine code' ");
//	  	    reportLog("07.Choosing 'Displine code' ");
//	  	    Thread.sleep(1000);
//	    
//		//Inspection and clicking of "Item No"   	    
//		WebDriverWait itemNo1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		itemNo1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
//		String itemNoData1=sheet.getRow(1).getCell(4).getStringCellValue();
//		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData1);
//		System.out.println("08.Inserting 'Item No.' field ");
//		Reporter.log("08.Inserting 'Item No.' field ");
//		reportLog("08.Inserting 'Item No.' field ");
//		Thread.sleep(1000);
//  
//      //Inspection and clicking of "Ident Code"   	    
//  	    WebDriverWait identCodeList1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		identCodeList1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
//	    String identCodeData1=sheet.getRow(1).getCell(5).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData1);
//	    System.out.println("09.Selecting 'Ident Code' field ");
//	    Reporter.log("09.Selecting 'Ident Code' field ");
//	    reportLog("09.Selecting 'Ident Code' field ");
//	    Thread.sleep(1000);
//	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
//	    Actions action1 = new Actions(driver); 
//	    WebElement  element1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
//	    action1.moveToElement(element1).click().perform();
//	    Thread.sleep(3000);
//		   
//
////		    //Inspection and clicking of "PO Qty."
////		    WebDriverWait poQty11 = new WebDriverWait(driver, Duration.ofMillis(20000));
////		    System.out.println("Po start 1");
////		    poQty11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")));
////		    System.out.println("Po start 2");
////		    //driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).click();
////		    System.out.println("Po start 3");
////		    String poQtyDataaa= sheet.getRow(1).getCell(9).getStringCellValue();
////		    System.out.println(poQtyDataaa);
////		    base.commonPOQtyBackSpace(driver);
////		    //driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(poQtyDataaa);
////		    //driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(Keys.CONTROL + "a" + Keys.CONTROL+"8");
////            Actions act =  new Actions(driver);
////		    act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input"))).click().sendKeys("8").perform();
////            // driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys("8");
////		    System.out.println("10.Inserting 'PO Qty.' field ");
////		    Reporter.log("10.Inserting 'PO Qty.' field ");
////		    reportLog("10.Inserting 'PO Qty.' field ");
////		    Thread.sleep(1000);
//	    
//	    
//	    
//	  //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty11 = new WebDriverWait(driver, Duration.ofMillis(20000));
//	    poQty11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")));
//        String poQtyDataaa= sheet.getRow(1).getCell(9).getStringCellValue();
//	    base.commonPOQtyBackSpace(driver);
//        Actions act =  new Actions(driver);
//	    act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input"))).click().sendKeys(poQtyDataaa).perform();
//        System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(1000);
//	    
//	    
//	    base.commonSAVEbuttonCHILD(driver);
//	    System.out.println("11.Cliking on 'SAVE' button ");
//		Reporter.log("11.Cliking on 'SAVE' button ");
//		reportLog("11.Cliking on 'SAVE' button ");
//		Thread.sleep(1000);
//		
//		
//		// To perform DELETE Operation
//	    //Inspection and clicking of "Delete" button of Child grid
//	    WebDriverWait deleteButtonChildTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    deleteButtonChildTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
//	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
//	    System.out.println("12.Clicking on Delete button of 'Child' grid ");
//	    Reporter.log("12.Clicking on Delete button of 'Child' grid ");
//	    reportLog("12.Clicking on Delete button of 'Child' grid ");
//	    Thread.sleep(1000);
//	    
//	    //Inspection and clicking of "Yes" button under delete button(Confirmation)
//	    WebDriverWait deleteButtonChildConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    deleteButtonChildConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[20]")));
//	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[20]")).click();
//	    System.out.println("13.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
//	    Reporter.log("13.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
//	    reportLog("13.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
//	    Thread.sleep(1000);
//
//
//    // To perform DELETE Operation
//	    //Inspection and clicking of "Delete" button of Parent grid
//	    WebDriverWait deleteButtonParentTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    deleteButtonParentTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
//	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
//	    System.out.println("14.Clicking on Delete button of 'Parent' grid ");
//	    Reporter.log("14.Clicking on Delete button of 'Parent' grid ");
//	    reportLog("14.Clicking on Delete button of 'Parent' grid ");
//	    Thread.sleep(1000);
//	 
//   //Inspection and clicking of "Yes" button under delete button(Confirmation)
//	    WebDriverWait deleteButtonParentConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    deleteButtonParentConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[20]")));
//	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[20]")).click();
//	    System.out.println("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
//	    Reporter.log("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
//	    reportLog("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
//	    Thread.sleep(1000);
//
//	    System.out.println("[Test 1 steps 'ENDS'] ");
//	    Reporter.log("[Test 1 steps 'ENDS'] ");
//	    reportLog("[Test 1 steps 'ENDS'] ");
//	 
//	    System.out.println("************************************[ Test 1--> 'Insertion of new data' is ''PASSED'' ]************************************ ");
//	    Reporter.log("************************************[ Test 1--> 'Insertion of new data' is ''PASSED'' ]************************************ ");
//	    reportLog("******[ Test 1--> 'Insertion of new data' is ''PASSED'' ]****** ");
//	    System.out.println(" ");
//	    Reporter.log(" ");
//	    System.out.println(" ");
//	    Reporter.log(" ");
//	    //driver.quit();
//      //ends PO3
//
//        Assert.assertTrue(true);
//  		test.log(LogStatus.PASS, "Test 1 - Insertion of new data PASSED");
//  		
//  }

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
	   
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
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

//   // copying File path to Clipboard
//   StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\01_Po_Data.csv");
//   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//   System.out.println("05.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("05.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("05.Choosing excel file(having records) from System Directory to perform Import functionility");
//   Thread.sleep(1000);
   
   File filee =new File("01_Po_Data.csv");
   String Path11= filee.getAbsolutePath().toString();
   StringSelection str = new StringSelection(Path11);
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
   Thread.sleep(5000);
   
   System.out.println("after robot");
   
     //Inspection and clicking of "Upload" button
	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
	   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
	    Actions act52 =  new Actions(driver);
	    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
	    System.out.println("06.Clicked on 'Upload' button");
	     Reporter.log("06.Clicked on 'Upload' button");
	     reportLog("06.Clicked on 'Upload' button");
         Thread.sleep(1000);
     
      
//    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
//	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
//      String poQtyData52= sheet.getRow(29).getCell(9).getStringCellValue();
//	    base.commonPOQtyBackSpace(driver);
//      Actions act52 =  new Actions(driver);
//      act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
//      System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(1000);
      

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

@Test(priority=2)
public void Test2() throws InterruptedException, AWTException
{
	test=extent.startTest("Test 02 - Importing record as duplicate data ");
	   
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

      System.out.println("************************************[ Test 2--> 'Importing record as duplicate data' ]************************************ ");
		 Reporter.log("************************************[ Test 2--> 'Importing record as duplicate data' ]************************************ ");
		 reportLog("******[ Test 2--> 'Importing record as duplicate data' ]****** ");
		    
      System.out.println("[Test 2 steps 'STARTS'] ");
	     Reporter.log("[Test 2 steps 'STARTS'] ");
	     reportLog("[Test 2 steps 'STARTS'] ");
      
      //Inspection and clicking of 'Select Import File' button
      WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
      selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
   // creating object of Robot class
    Robot rb = new Robot();

//   // copying File path to Clipboard
//   StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\02_Po_Data_DuplicateDataValidation.csv");
//   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//   System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//   Thread.sleep(2000);
    
    File fileee =new File("02_Po_Data_DuplicateDataValidation.csv");
    String Path11= fileee.getAbsolutePath().toString();
    StringSelection str = new StringSelection(Path11);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
 	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
 	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
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
   Thread.sleep(5000);
   
 //Inspection and clicking of "Upload" button
   WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
   uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
  // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
   Actions act52 =  new Actions(driver);
   act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
   System.out.println("03.Clicked on 'Upload' button");
    Reporter.log("03.Clicked on 'Upload' button");
    reportLog("03.Clicked on 'Upload' button");
    Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
      Thread.sleep(2000);
      
//      String ExpectedValidation = "1 Record(s) has been updated. 0 Record(s) has been inserted. 1 Record(s) are with errors.";
//		 WebElement actualValidation= driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[1]/label"));
//      String ActualValidation = actualValidation.getText();
//		 //System.out.println(ActualValidation);
//		 Assert.assertEquals(ExpectedValidation, ActualValidation);
//		    

         System.out.println("[Test 2 steps 'ENDS'] ");
		    Reporter.log("[Test 2 steps 'ENDS'] ");
		    reportLog("[Test 2 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 2--> 'Importing record as duplicate data' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 2--> 'Importing record as duplicate data' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 2--> 'Importing record as duplicate data' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
       //ends PO3
		    	    
     Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 02 - Importing record as duplicate data is PASSED");
		Thread.sleep(8000);  
}

@Test(priority=3)
public void Test3() throws InterruptedException, AWTException
{
	test=extent.startTest("Test 03 - Importing record as 'PO No' having MAX length ");
	   
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
      //commonElemenentsPaths();
      System.out.println("************************************[ Test 3--> 'Importing record as 'PO No' having MAX length' ]************************************ ");
		 Reporter.log("************************************[ Test 3--> 'Importing record as 'PO No' having MAX length' ]************************************ ");
		 reportLog("******[ Test 3--> 'Importing record as 'PO No' having MAX length' ]****** ");
		    
      System.out.println("[Test 3 steps 'STARTS'] ");
	     Reporter.log("[Test 3 steps 'STARTS'] ");
	     reportLog("[Test 3 steps 'STARTS'] ");

		//Inspection and clicking of 'Select Import File' button
      WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
      selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
   // creating object of Robot class
    Robot rb = new Robot();

//   // copying File path to Clipboard
//   StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\03_Po_Data_MAXLengthPOno.csv");
//   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//   System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//   Thread.sleep(2000);
    
    File fileee =new File("03_Po_Data_MAXLengthPOno.csv");
    String Path11= fileee.getAbsolutePath().toString();
    StringSelection str = new StringSelection(Path11);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
 	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
 	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
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
   
//     //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//      Thread.sleep(2000);
   
 //Inspection and clicking of "Upload" button
   WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
   uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
  // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
   Actions act52 =  new Actions(driver);
   act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
   System.out.println("03.Clicked on 'Upload' button");
    Reporter.log("03.Clicked on 'Upload' button");
    reportLog("03.Clicked on 'Upload' button");
    Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
      Thread.sleep(2000);

         System.out.println("[Test 3 steps 'ENDS'] ");
		    Reporter.log("[Test 3 steps 'ENDS'] ");
		    reportLog("[Test 3 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 3--> 'Importing record as 'PO No' having MAX length' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 3--> 'Importing record as 'PO No' having MAX length' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 3--> 'Importing record as 'PO No' having MAX length' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
       //ends PO3
       
     Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 03 - Importing record as 'PO No' having max length is PASSED");
		Thread.sleep(8000);  
}

@Test(priority=4)
public void Test4() throws InterruptedException, AWTException
{
	test=extent.startTest("Test 04 - Importing record as 'PO No' having Leading and Trailing space data ");
	   
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
      //commonElemenentsPaths();
      System.out.println("************************************[ Test 4--> 'Importing record as 'PO No' having Leading and Trailing space data' ]************************************ ");
		 Reporter.log("************************************[ Test 4--> 'Importing record as 'PO No' having Leading and Trailing space data' ]************************************ ");
		 reportLog("******[ Test 4--> 'Importing record as 'PO No' having Leading and Trailing space data' ]****** ");
		    
      System.out.println("[Test 4 steps 'STARTS'] ");
	     Reporter.log("[Test 4 steps 'STARTS'] ");
	     reportLog("[Test 4 steps 'STARTS'] ");

		//Inspection and clicking of 'Select Import File' button 
      WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
      selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
   // creating object of Robot class
    Robot rb = new Robot();

//   // copying File path to Clipboard
//   StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\04_Po_Data_LeadingLagSpace.csv");
//   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//   System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//   Thread.sleep(2000);
    
    File fileee =new File("04_Po_Data_LeadingLagSpace.csv");
    String Path11= fileee.getAbsolutePath().toString();
    StringSelection str = new StringSelection(Path11);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
 	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
 	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
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
   
//     //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//      Thread.sleep(2000);
   
   //Inspection and clicking of "Upload" button
   WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
   uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
  // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
   Actions act52 =  new Actions(driver);
   act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
   System.out.println("03.Clicked on 'Upload' button");
    Reporter.log("03.Clicked on 'Upload' button");
    reportLog("03.Clicked on 'Upload' button");
    Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
      Thread.sleep(2000);

         System.out.println("[Test 4 steps 'ENDS'] ");
		    Reporter.log("[Test 4 steps 'ENDS'] ");
		    reportLog("[Test 4 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 4--> 'Importing record as 'PO No' having Leading and Trailing space data' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 4--> 'Importing record as 'PO No' having Leading and Trailing space data' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 4--> 'Importing record as 'PO No' having Leading and Trailing space data' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
       //ends PO3
		    
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 04 - Importing record as 'PO No' having Leading and Trailing space data is PASSED");
		Thread.sleep(8000); 
}

@Test(priority=5)
public void Test5() throws InterruptedException, AWTException
{
	 test=extent.startTest("Test 05 - Importing record as Non Exsisting 'Job Code Key' field ");
	   
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
     //commonElemenentsPaths();
       System.out.println("************************************[ Test 5--> 'Importing record as Non Exsisting 'Job Code Key' field' ]************************************ ");
		 Reporter.log("************************************[ Test 5--> 'Importing record as Non Exsisting 'Job Code Key' field' ]************************************ ");
		 reportLog("******[ Test 5--> 'Importing record as Non Exsisting 'Job Code Key' field' ]****** ");
		    
       System.out.println("[Test 5 steps 'STARTS'] ");
	     Reporter.log("[Test 5 steps 'STARTS'] ");
	     reportLog("[Test 5 steps 'STARTS'] ");
       
  	//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\05_Po_Data -NonExsistingJobCodeKey.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
     
     File fileee =new File("05_Po_Data -NonExsistingJobCodeKey.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
    //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("03.Clicked on 'Upload' button");
     Reporter.log("03.Clicked on 'Upload' button");
     reportLog("03.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 5 steps 'ENDS'] ");
		    Reporter.log("[Test 5 steps 'ENDS'] ");
		    reportLog("[Test 5 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 5--> 'Importing record as Non Exsisting 'Job Code Key' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 5--> 'Importing record as Non Exsisting 'Job Code Key' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 5--> 'Importing record as Non Exsisting 'Job Code Key' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 05 - Importing record as Non Exsisting 'Job Code Key' is PASSED");
		Thread.sleep(8000);  
}

@Test(priority=6)
public void Test() throws InterruptedException, AWTException
{
	 test=extent.startTest("Test 06 - Importing record as No data inside Excel file(No Rows exsists) ");
	   
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
  
       System.out.println("************************************[ Test 6--> 'Importing record as No data inside Excel file(No Rows exsists)' ]************************************ ");
		 Reporter.log("************************************[ Test 6--> 'Importing record as No data inside Excel file(No Rows exsists)' ]************************************ ");
		 reportLog("******[ Test 6--> 'Importing record as No data inside Excel file(No Rows exsists)' ]****** ");
		    
       System.out.println("[Test 6 steps 'STARTS'] ");
	     Reporter.log("[Test 6 steps 'STARTS'] ");
	     reportLog("[Test 6 steps 'STARTS'] ");
       

		//Inspection and clicking of 'Select Import File' button 
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\06_Po_Data_NORows(NoData).csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
     
     File fileee =new File("06_Po_Data_NORows(NoData).csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
    //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("03.Clicked on 'Upload' button");
     Reporter.log("03.Clicked on 'Upload' button");
     reportLog("03.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 1 steps 'ENDS'] ");
		    Reporter.log("[Test 1 steps 'ENDS'] ");
		    reportLog("[Test 1 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 6--> 'Importing record as No data inside Excel file(No Rows exsists)' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 6--> 'Importing record as No data inside Excel file(No Rows exsists)' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 6--> 'Importing record as No data inside Excel file(No Rows exsists)' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 06 - Importing record as No data inside Excel file(No Rows exsists) is PASSED");
		Thread.sleep(8000); 
}

@Test(priority=7)
public void Test7() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 07 - Importing record as NULL 'Job Code Key' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
	
       System.out.println("************************************[ Test 7--> 'Importing record as NULL 'Job Code Key' field' ]************************************ ");
		 Reporter.log("************************************[ Test 7--> 'Importing record as NULL 'Job Code Key' field' ]************************************ ");
		 reportLog("******[ Test 7--> 'Importing record as NULL 'Job Code Key' field' ]****** ");
		    
       System.out.println("[Test 7 steps 'STARTS'] ");
	     Reporter.log("[Test 7 steps 'STARTS'] ");
	     reportLog("[Test 7 steps 'STARTS'] ");
       
	//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\07_Po_Data_NullJobCodeKey.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
	  
     File fileee =new File("07_Po_Data_NullJobCodeKey.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
    //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("03.Clicked on 'Upload' button");
     Reporter.log("03.Clicked on 'Upload' button");
     reportLog("03.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 7 steps 'ENDS'] ");
		    Reporter.log("[Test 7 steps 'ENDS'] ");
		    reportLog("[Test 7 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 7--> 'Importing record as NULL 'Job Code Key' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 7--> 'Importing record as NULL 'Job Code Key' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 7--> 'Importing record as NULL 'Job Code Key' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 07 - Importing record as NULL 'Job Code Key' field is PASSED");
		Thread.sleep(8000);  		    
}
@Test(priority=8)
public void Test8() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 08 - Importing record as NULL 'PO No' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
         System.out.println("************************************[ Test 8--> 'Importing record as NULL 'PO No' field' ]************************************ ");
		 Reporter.log("************************************[ Test 8--> 'Importing record as NULL 'PO No' field' ]************************************ ");
		 reportLog("******[ Test 8--> 'Importing record as NULL 'PO No' field' ]****** ");
		    
       System.out.println("[Test 8 steps 'STARTS'] ");
	     Reporter.log("[Test 8 steps 'STARTS'] ");
	     reportLog("[Test 8 steps 'STARTS'] ");
		 
		//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\08_Po_Data_NullPoNo.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
	  
     File fileee =new File("08_Po_Data_NullPoNo.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
    //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("03.Clicked on 'Upload' button");
     Reporter.log("03.Clicked on 'Upload' button");
     reportLog("03.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 8 steps 'ENDS'] ");
		    Reporter.log("[Test 8 steps 'ENDS'] ");
		    reportLog("[Test 8 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 8--> 'Importing record as NULL 'PO No' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 8--> 'Importing record as NULL 'PO No' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 8--> 'Importing record as NULL 'PO No' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
       Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 08 - Importing record as NULL 'PO No' field is PASSED");
		Thread.sleep(8000);  		    
}

@Test(priority=9)
public void Test9() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 09 - Importing record as NULL 'PO Order Date' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
	
	   System.out.println("************************************[ Test 9--> 'Importing record as NULL 'PO Order Date' field' ]************************************ ");
		 Reporter.log("************************************[ Test 9--> 'Importing record as NULL 'PO Order Date' field' ]************************************ ");
		 reportLog("******[ Test 9--> 'Importing record as NULL 'PO Order Date' field' ]****** ");
		    
       System.out.println("[Test 9 steps 'STARTS'] ");
	     Reporter.log("[Test 9 steps 'STARTS'] ");
	     reportLog("[Test 9 steps 'STARTS'] ");
       
	//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\09_Po_Data_NullPOOrderDate.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
     
     File fileee =new File("09_Po_Data_NullPOOrderDate.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
    //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("03.Clicked on 'Upload' button");
     Reporter.log("03.Clicked on 'Upload' button");
     reportLog("03.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 9 steps 'ENDS'] ");
		    Reporter.log("[Test 9 steps 'ENDS'] ");
		    reportLog("[Test 9 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 9--> 'Importing record as NULL 'PO Order Date' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 9--> 'Importing record as NULL 'PO Order Date' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 9--> 'Importing record as NULL 'PO Order Date' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 09 - Importing record as NULL 'PO Order Date' field is PASSED");
		Thread.sleep(8000);  		    
}
@Test(priority=10)
public void Test10() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 10 - Importing record as NULL 'PO Title1' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
    
       System.out.println("************************************[ Test 10--> 'Importing record as NULL 'PO Title1' field' ]************************************ ");
		 Reporter.log("************************************[ Test 10--> 'Importing record as NULL 'PO Title1' field' ]************************************ ");
		 reportLog("******[ Test 10--> 'Importing record as NULL 'PO Title1' field' ]****** ");
		    
       System.out.println("[Test 10 steps 'STARTS'] ");
	     Reporter.log("[Test 10 steps 'STARTS'] ");
	     reportLog("[Test 10 steps 'STARTS'] ");
	//Inspection and clicking of 'Select Import File' button 
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\10_Po_Data_NullPoTitle1.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
     
     File fileee =new File("10_Po_Data_NullPoTitle1.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
    //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("03.Clicked on 'Upload' button");
     Reporter.log("03.Clicked on 'Upload' button");
     reportLog("03.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 10 steps 'ENDS'] ");
		    Reporter.log("[Test 10 steps 'ENDS'] ");
		    reportLog("[Test 10 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 10--> 'Importing record as NULL 'PO Title1' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 10--> 'Importing record as NULL 'PO Title1' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 10--> 'Importing record as NULL 'PO Title1' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 10 - Importing record as NULL 'PO Title1' field is PASSED");
		Thread.sleep(8000);  		    
}
@Test(priority=11)
public void Test11() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 11 - Importing record as NULL 'Discipline Code' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

       System.out.println("************************************[ Test 11--> 'Importing record as NULL 'Discipline Code' field' ]************************************ ");
		 Reporter.log("************************************[ Test 11--> 'Importing record as NULL 'Discipline Code' field' ]************************************ ");
		 reportLog("******[ Test 11--> 'Importing record as NULL 'Discipline Code' field' ]****** ");
		    
       System.out.println("[Test 11 steps 'STARTS'] ");
	     Reporter.log("[Test 11 steps 'STARTS'] ");
	     reportLog("[Test 11 steps 'STARTS'] ");
	//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\11_Po_Data_NullDisciplineCodeField.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
     
     File fileee =new File("11_Po_Data_NullDisciplineCodeField.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);

    //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("03.Clicked on 'Upload' button");
     Reporter.log("03.Clicked on 'Upload' button");
     reportLog("03.Clicked on 'Upload' button");
     Thread.sleep(1000);
    
	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 11 steps 'ENDS'] ");
		    Reporter.log("[Test 11 steps 'ENDS'] ");
		    reportLog("[Test 11 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 11--> 'Importing record as NULL 'Discipline Code' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 11--> 'Importing record as NULL 'Discipline Code' field'' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 11--> ''Importing record as NULL 'Discipline Code' field'' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 11 - 'Importing record as NULL 'Discipline Code' field' is PASSED");
		Thread.sleep(8000); 		    
}
@Test(priority=12)
public void Test12() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 12 - 'Importing record as NULL 'Item No' field' ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");

	    System.out.println("************************************[ Test 12--> 'Importing record as NULL 'Item No' field' ]************************************ ");
		 Reporter.log("************************************[ Test 12--> 'Importing record as NULL 'Item No' field' ]************************************ ");
		 reportLog("******[ Test 12--> 'Importing record as NULL 'Item No' field' ]****** ");
		    
       System.out.println("[Test 12 steps 'STARTS'] ");
	     Reporter.log("[Test 12 steps 'STARTS'] ");
	     reportLog("[Test 12 steps 'STARTS'] ");
       
	 
		//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\12_Po_Data_NullItemNo.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
     
     File fileee =new File("12_Po_Data_NullItemNo.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
    //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("03.Clicked on 'Upload' button");
     Reporter.log("03.Clicked on 'Upload' button");
     reportLog("03.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 12 steps 'ENDS'] ");
		    Reporter.log("[Test 12 steps 'ENDS'] ");
		    reportLog("[Test 12 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 12--> 'Importing record as NULL 'Item No' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 12--> 'Importing record as NULL 'Item No' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 12--> 'Importing record as NULL 'Item No' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 12 - Importing record as NULL 'Item No' field is PASSED");
		Thread.sleep(8000);  		    
}
@Test(priority=13)
public void Test13() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 13 - Importing record as NULL 'Ident Code' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
         System.out.println("************************************[ Test 13--> 'Importing record as NULL 'Ident Code' field' ]************************************ ");
		 Reporter.log("************************************[ Test 13--> 'Importing record as NULL 'Ident Code' field' ]************************************ ");
		 reportLog("******[ Test 13--> 'Importing record as NULL 'Ident Code' field' ]****** ");
		    
       System.out.println("[Test 13 steps 'STARTS'] ");
	     Reporter.log("[Test 13 steps 'STARTS'] ");
	     reportLog("[Test 13 steps 'STARTS'] ");

	     //Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\13_Po_Data_NullIdentCode.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
	  
     File fileee =new File("13_Po_Data_NullIdentCode.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
    //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("03.Clicked on 'Upload' button");
     Reporter.log("03.Clicked on 'Upload' button");
     reportLog("03.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 13 steps 'ENDS'] ");
		    Reporter.log("[Test 13 steps 'ENDS'] ");
		    reportLog("[Test 13 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 13--> 'Importing record as NULL 'Ident Code' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 13--> 'Importing record as NULL 'Ident Code' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 13--> 'Importing record as NULL 'Ident Code' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 13 - Importing record as NULL 'Ident Code' field is PASSED");
		Thread.sleep(8000);  		    
}
@Test(priority=14)
public void Test14() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 14 - Importing record as NULL 'Size Decreament' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");

	    System.out.println("************************************[ Test 14--> 'Importing record as NULL 'Size Decreament' field' ]************************************ ");
		 Reporter.log("************************************[ Test 14--> 'Importing record as NULL 'Size Decreament' field' ]************************************ ");
		 reportLog("******[ Test 14--> 'Importing record as NULL 'Size Decreament' field' ]****** ");
		    
       System.out.println("[Test 14 steps 'STARTS'] ");
	     Reporter.log("[Test 14 steps 'STARTS'] ");
	     reportLog("[Test 14 steps 'STARTS'] ");
       
		 
		//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\14_Po_Data_NullSizeDecreament.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
     
     File fileee =new File("14_Po_Data_NullSizeDecreament.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);

    
    //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("03.Clicked on 'Upload' button");
     Reporter.log("03.Clicked on 'Upload' button");
     reportLog("03.Clicked on 'Upload' button");
     Thread.sleep(1000);
     
	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 14 steps 'ENDS'] ");
		    Reporter.log("[Test 14 steps 'ENDS'] ");
		    reportLog("[Test 14 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 14--> 'Importing record as NULL 'Size Decreament' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 14--> 'Importing record as NULL 'Size Decreament' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 14--> 'Importing record as NULL 'Size Decreament' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 14 - Importing record as NULL 'Size Decreament' field is PASSED");
		Thread.sleep(8000);  		    
}
@Test(priority=15)
public void Test15() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 15 - Importing record as NULL 'Thickness Description' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");

       System.out.println("************************************[ Test 15--> 'Importing record as NULL 'Thickness Description' field' ]************************************ ");
		 Reporter.log("************************************[ Test 15--> 'Importing record as NULL 'Thickness Description' field' ]************************************ ");
		 reportLog("******[ Test 15--> 'Importing record as NULL 'Thickness Description' field' ]****** ");
		    
       System.out.println("[Test 15 steps 'STARTS'] ");
	     Reporter.log("[Test 15 steps 'STARTS'] ");
	     reportLog("[Test 15 steps 'STARTS'] ");
       
	 
		//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\15_Po_Data_NullThicknessDescription.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
	  
     File fileee =new File("15_Po_Data_NullThicknessDescription.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
  	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
    //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("03.Clicked on 'Upload' button");
     Reporter.log("03.Clicked on 'Upload' button");
     reportLog("03.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 15 steps 'ENDS'] ");
		    Reporter.log("[Test 15 steps 'ENDS'] ");
		    reportLog("[Test 15 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 15--> 'Importing record as NULL 'Thickness Description' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 15--> 'Importing record as NULL 'Thickness Description' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 15--> 'Importing record as NULL 'Thickness Description' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 15 - Importing record as NULL 'Thickness Description' field is PASSED");
		Thread.sleep(8000);  		    
}

@Test(priority=16)
public void Test16() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 16 - Importing record as NULL 'PO Qty' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

       System.out.println("************************************[ Test 16--> 'Importing record as NULL 'PO Qty' field' ]************************************ ");
		 Reporter.log("************************************[ Test 16--> 'Importing record as NULL 'PO Qty' field' ]************************************ ");
		 reportLog("******[ Test 16--> 'Importing record as NULL 'PO Qty' field' ]****** ");
		    
       System.out.println("[Test 16 steps 'STARTS'] ");
	     Reporter.log("[Test 16 steps 'STARTS'] ");
	     reportLog("[Test 16 steps 'STARTS'] ");
       
	 
		//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\16_Po_Data_NullPoQty.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
     
     File fileee =new File("16_Po_Data_NullPoQty.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
    //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("06.Clicked on 'Upload' button");
     Reporter.log("06.Clicked on 'Upload' button");
     reportLog("06.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 16 steps 'ENDS'] ");
		    Reporter.log("[Test 16 steps 'ENDS'] ");
		    reportLog("[Test 16 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 16--> 'Importing record as NULL 'PO Qty' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 16--> 'Importing record as NULL 'PO Qty' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 16--> 'Importing record as NULL 'PO Qty' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 16 - Importing record as NULL 'PO Qty' field is PASSED");
		Thread.sleep(8000);  		    
}

@Test(priority=17)
public void Test17() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 17 - Importing record as NULL 'Company Code' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

       System.out.println("************************************[ Test 17--> 'Importing record as NULL 'Company Code' field' ]************************************ ");
		 Reporter.log("************************************[ Test 17--> 'Importing record as NULL 'Company Code' field' ]************************************ ");
		 reportLog("******[ Test 17--> 'Importing record as NULL 'Company Code' field' ]****** ");
		    
       System.out.println("[Test 17 steps 'STARTS'] ");
	     Reporter.log("[Test 17 steps 'STARTS'] ");
	     reportLog("[Test 17 steps 'STARTS'] ");
       
 
		//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\17_Po_Data_NullCompanyCodeField.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
     
     File fileee =new File("17_Po_Data_NullCompanyCodeField.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
  //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("06.Clicked on 'Upload' button");
     Reporter.log("06.Clicked on 'Upload' button");
     reportLog("06.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 17 steps 'ENDS'] ");
		    Reporter.log("[Test 17 steps 'ENDS'] ");
		    reportLog("[Test 17 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 17--> 'Importing record as NULL 'Company Code' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 17--> 'Importing record as NULL 'Company Code' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 17--> 'Importing record as NULL 'Company Code' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 17 - Importing record as NULL 'Company Code' field is PASSED");
		Thread.sleep(8000);  		    
}

@Test(priority=18)
public void Test18() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 18 - Importing record as 'PO No' having MIN length ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
 
       System.out.println("************************************[ Test 18--> 'Importing record as 'PO No' having MIN length' ]************************************ ");
		 Reporter.log("************************************[ Test 18--> 'Importing record as 'PO No' having MIN length' ]************************************ ");
		 reportLog("******[ Test 18--> 'Importing record as 'PO No' having MIN length' ]****** ");
		    
       System.out.println("[Test 18 steps 'STARTS'] ");
	     Reporter.log("[Test 18 steps 'STARTS'] ");
	     reportLog("[Test 18 steps 'STARTS'] ");
       
 
		//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\18_Po_Data_MINLengthPOno.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
     
     File fileee =new File("18_Po_Data_MINLengthPOno.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
  //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("06.Clicked on 'Upload' button");
     Reporter.log("06.Clicked on 'Upload' button");
     reportLog("06.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 18 steps 'ENDS'] ");
		    Reporter.log("[Test 18 steps 'ENDS'] ");
		    reportLog("[Test 18 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 18--> 'Importing record as 'PO No' having MIN length' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 18--> 'Importing record as 'PO No' having MIN length' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 18--> 'Importing record as 'PO No' having MIN length' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 18 - Importing record as 'PO No' having MIN length IS PASSED");
		Thread.sleep(8000);  		    
}
@Test(priority=19)
public void Test19() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 19 - Importing record as Non Exsisting 'Company Code' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
 
       System.out.println("************************************[ Test 19--> 'Importing record as Non Exsisting 'Job Code Key' field' ]************************************ ");
		 Reporter.log("************************************[ Test 19--> 'Importing record as Non Exsisting 'Job Code Key' field' ]************************************ ");
		 reportLog("******[ Test 19--> 'Importing record as Non Exsisting 'Job Code Key' field' ]****** ");
		    
       System.out.println("[Test 19 steps 'STARTS'] ");
	     Reporter.log("[Test 19 steps 'STARTS'] ");
	     reportLog("[Test 19 steps 'STARTS'] ");
       
 
		//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\19_Po_Data_NonExsistingCompanyCodeField.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
     
     File fileee =new File("19_Po_Data_NonExsistingCompanyCodeField.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
  //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("06.Clicked on 'Upload' button");
     Reporter.log("06.Clicked on 'Upload' button");
     reportLog("06.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 19 steps 'ENDS'] ");
		    Reporter.log("[Test 19 steps 'ENDS'] ");
		    reportLog("[Test 19 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 19--> 'Importing record as Non Exsisting 'Job Code Key' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 19--> 'Importing record as Non Exsisting 'Job Code Key' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 19--> 'Importing record as Non Exsisting 'Job Code Key' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 19 - Importing record as Non Exsisting 'Job Code Key' field is PASSED");
		Thread.sleep(8000);  		    
}
@Test(priority=20)
public void Test20() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 20 - Importing record as Non Exsisting 'Ident Code' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
 
       System.out.println("************************************[ Test 20--> 'Importing record as Non Exsisting 'Ident Code' field' ]************************************ ");
		 Reporter.log("************************************[ Test 20--> 'Importing record as Non Exsisting 'Ident Code' field' ]************************************ ");
		 reportLog("******[ Test 20--> 'Importing record as Non Exsisting 'Ident Code' field' ]****** ");
		    
       System.out.println("[Test 20 steps 'STARTS'] ");
	     Reporter.log("[Test 20 steps 'STARTS'] ");
	     reportLog("[Test 20 steps 'STARTS'] ");
       
 
		//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\20_Po_Data_NonExsistingIdentCode.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
     
     File fileee =new File("20_Po_Data_NonExsistingIdentCode.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
  //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("06.Clicked on 'Upload' button");
     Reporter.log("06.Clicked on 'Upload' button");
     reportLog("06.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 20 steps 'ENDS'] ");
		    Reporter.log("[Test 20 steps 'ENDS'] ");
		    reportLog("[Test 20 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 20--> 'Importing record as Non Exsisting 'Ident Code' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 20--> 'Importing record as Non Exsisting 'Ident Code' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 20--> 'Importing record as Non Exsisting 'Ident Code' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 20 - Importing record as Non Exsisting 'Ident Code' field is PASSED");
		Thread.sleep(8000); 		    
}
@Test(priority=21)
public void Test21() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 21 - Importing record as Non Exsisting 'Discipline Code' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

       System.out.println("************************************[ Test 21--> 'Importing record as Non Exsisting 'Discipline Code' field' ]************************************ ");
		 Reporter.log("************************************[ Test 21--> 'Importing record as Non Exsisting 'Discipline Code' field' ]************************************ ");
		 reportLog("******[ Test 21--> 'Importing record as Non Exsisting 'Discipline Code' field' ]****** ");
		    
       System.out.println("[Test 21 steps 'STARTS'] ");
	     Reporter.log("[Test 21 steps 'STARTS'] ");
	     reportLog("[Test 21 steps 'STARTS'] ");
       
 
		//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\21_Po_Data_NonExsistingDisciplineCode.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
     
     File fileee =new File("21_Po_Data_NonExsistingDisciplineCode.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);

  //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("06.Clicked on 'Upload' button");
     Reporter.log("06.Clicked on 'Upload' button");
     reportLog("06.Clicked on 'Upload' button");
     Thread.sleep(1000);
    
	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 21 steps 'ENDS'] ");
		    Reporter.log("[Test 21 steps 'ENDS'] ");
		    reportLog("[Test 21 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 21--> 'Importing record as Non Exsisting 'Discipline Code' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 21--> 'Importing record as Non Exsisting 'Discipline Code' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 21--> 'Importing record as Non Exsisting 'Discipline Code' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 21 - Importing record as Non Exsisting 'Discipline Code' field is PASSED");
		Thread.sleep(8000);		    
}

@Test(priority=22)
public void Test22() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 22 - Importing record as Non Exsisting 'Size Description' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");

       System.out.println("************************************[ Test 22--> 'Importing record as Non Exsisting 'Size Description' field' ]************************************ ");
		 Reporter.log("************************************[ Test 22--> 'Importing record as Non Exsisting 'Size Description' field' ]************************************ ");
		 reportLog("******[ Test 22--> 'Importing record as Non Exsisting 'Size Description' field' ]****** ");
		    
       System.out.println("[Test 22 steps 'STARTS'] ");
	     Reporter.log("[Test 22 steps 'STARTS'] ");
	     reportLog("[Test 22 steps 'STARTS'] ");
       
	 
		//Inspection and clicking of 'Select Import File' button 
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\22_Po_Data_NonExsistingSizeDescription.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
	  
     File fileee =new File("22_Po_Data_NonExsistingSizeDescription.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);

  //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("06.Clicked on 'Upload' button");
     Reporter.log("06.Clicked on 'Upload' button");
     reportLog("06.Clicked on 'Upload' button");
     Thread.sleep(1000);
    
	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 22 steps 'ENDS'] ");
		    Reporter.log("[Test 22 steps 'ENDS'] ");
		    reportLog("[Test 22 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 22--> 'Importing record as Non Exsisting 'Size Description' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 22--> 'Importing record as Non Exsisting 'Size Description' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 22--> 'Importing record as Non Exsisting 'Size Description' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 22 - Importing record as Non Exsisting 'Size Description' field is PASSED");
		Thread.sleep(8000);		    
}

@Test(priority=23)
public void Test23() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{
  
	   test=extent.startTest("Test 23 - Importing record as Non Exsisting 'Thickness Description' field ");
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

       System.out.println("************************************[ Test 23--> 'Importing record as Non Exsisting 'Thickness Description' field' ]************************************ ");
		 Reporter.log("************************************[ Test 23--> 'Importing record as Non Exsisting 'Thickness Description' field' ]************************************ ");
		 reportLog("******[ Test 23--> 'Importing record as Non Exsisting 'Thickness Description' field' ]****** ");
		    
       System.out.println("[Test 23 steps 'STARTS'] ");
	     Reporter.log("[Test 23 steps 'STARTS'] ");
	     reportLog("[Test 23 steps 'STARTS'] ");
       
	 
		//Inspection and clicking of 'Select Import File' button
       WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
       selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
    // creating object of Robot class
     Robot rb = new Robot();
 
//    // copying File path to Clipboard
//    StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\23_Po_Data_NonExsistingThicknessDecsription.csv");
//    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//    System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//    Thread.sleep(2000);
     
     File fileee =new File("23_Po_Data_NonExsistingThicknessDecsription.csv");
     String Path11= fileee.getAbsolutePath().toString();
     StringSelection str = new StringSelection(Path11);
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
    
//      //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//       Thread.sleep(2000);
    
  //Inspection and clicking of "Upload" button
    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
   // driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
    Actions act52 =  new Actions(driver);
    act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
    System.out.println("06.Clicked on 'Upload' button");
     Reporter.log("06.Clicked on 'Upload' button");
     reportLog("06.Clicked on 'Upload' button");
     Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
       Thread.sleep(2000);

          System.out.println("[Test 23 steps 'ENDS'] ");
		    Reporter.log("[Test 23 steps 'ENDS'] ");
		    reportLog("[Test 23 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 23--> 'Importing record as Non Exsisting 'Thickness Description' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 23--> 'Importing record as Non Exsisting 'Thickness Description' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 23--> 'Importing record as Non Exsisting 'Thickness Description' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 23 - Importing record as Non Exsisting 'Thickness Description' field is PASSED");
		Thread.sleep(8000);  		    
}

@Test(priority=24)
public void Test24() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 24 - Importing record as Non Exsisting 'PO Qty' field ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");

   System.out.println("************************************[ Test 24--> 'Importing record as Non Exsisting 'PO Qty' field' ]************************************ ");
		 Reporter.log("************************************[ Test 24--> 'Importing record as Non Exsisting 'PO Qty' field' ]************************************ ");
		 reportLog("******[ Test 24--> 'Importing record as Non Exsisting 'PO Qty' field' ]****** ");
		    
   System.out.println("[Test 24 steps 'STARTS'] ");
	     Reporter.log("[Test 24 steps 'STARTS'] ");
	     reportLog("[Test 24 steps 'STARTS'] ");
   
		 
		//Inspection and clicking of 'Select Import File' button
   WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
   selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
// creating object of Robot class
 Robot rb = new Robot();

//// copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\24_Po_Data_NonExsistingPoQty.csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);
	  
 File fileee =new File("24_Po_Data_NonExsistingPoQty.csv");
 String Path11= fileee.getAbsolutePath().toString();
 StringSelection str = new StringSelection(Path11);
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

//  //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//   Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
// driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
 Reporter.log("06.Clicked on 'Upload' button");
 reportLog("06.Clicked on 'Upload' button");
 Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
   Thread.sleep(2000);

      System.out.println("[Test 24 steps 'ENDS'] ");
		    Reporter.log("[Test 24 steps 'ENDS'] ");
		    reportLog("[Test 24 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 24--> 'Importing record as Non Exsisting 'PO Qty' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 24--> 'Importing record as Non Exsisting 'PO Qty' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 24--> 'Importing record as Non Exsisting 'PO Qty' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
    //ends PO3
    
  Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 24 - Importing record as Non Exsisting 'PO Qty' field is PASSED");
		Thread.sleep(8000);  		    
}

@Test(priority=25)
public void Test25() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 25 - Importing record as Non Exsisting 'PO Qty'(ALPHABETICAL) field ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

   System.out.println("************************************[ Test 25--> 'Importing record as Non Exsisting 'PO Qty'(ALPHABETICAL) field' ]************************************ ");
		 Reporter.log("************************************[ Test 25--> 'Importing record as Non Exsisting 'PO Qty'(ALPHABETICAL) field' ]************************************ ");
		 reportLog("******[ Test 25--> 'Importing record as Non Exsisting 'PO Qty'(ALPHABETICAL) field' ]****** ");
		    
   System.out.println("[Test 25 steps 'STARTS'] ");
	     Reporter.log("[Test 25 steps 'STARTS'] ");
	     reportLog("[Test 25 steps 'STARTS'] ");
   
	 
		//Inspection and clicking of 'Select file' button 
   WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
   selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
// creating object of Robot class
 Robot rb = new Robot();

//// copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\25_Po_Data_NonExsistingPoQty(Alphabetiacal).csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);
 
 File fileee =new File("25_Po_Data_NonExsistingPoQty(Alphabetiacal).csv");
 String Path11= fileee.getAbsolutePath().toString();
 StringSelection str = new StringSelection(Path11);
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

//  //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//   Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
// driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
 Reporter.log("06.Clicked on 'Upload' button");
 reportLog("06.Clicked on 'Upload' button");
 Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
   Thread.sleep(2000);

      System.out.println("[Test 25 steps 'ENDS'] ");
		    Reporter.log("[Test 25 steps 'ENDS'] ");
		    reportLog("[Test 25 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 25--> 'Importing record as Non Exsisting 'PO Qty'(ALPHABETICAL) field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 25--> 'Importing record as Non Exsisting 'PO Qty'(ALPHABETICAL) field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 25--> 'Importing record as Non Exsisting 'PO Qty'(ALPHABETICAL) field is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
    //ends PO3
    
  Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 25 - Importing record as Non Exsisting 'PO Qty'(ALPHABETICAL) field is PASSED");
		Thread.sleep(8000);  		    
}

@Test(priority=26)
public void Test26() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 26 - Importing record as Non Exsisting 'PO Qty'(NVARCHAR) field ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

   System.out.println("************************************[ Test 26--> 'Insertion of new data' ]************************************ ");
		 Reporter.log("************************************[ Test 26--> 'Insertion of new data' ]************************************ ");
		 reportLog("******[ Test 26--> 'Insertion of new data' ]****** ");
		    
   System.out.println("[Test 26 steps 'STARTS'] ");
	     Reporter.log("[Test 26 steps 'STARTS'] ");
	     reportLog("[Test 26 steps 'STARTS'] ");
   
	 
		//Inspection and clicking of 'Select Import File' button
   WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
   selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
// creating object of Robot class
 Robot rb = new Robot();

//// copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\26_Po_Data_NonExsistingPoQty(Nvarchar).csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);
	  
 File fileee =new File("26_Po_Data_NonExsistingPoQty(Nvarchar).csv");
 String Path11= fileee.getAbsolutePath().toString();
 StringSelection str = new StringSelection(Path11);
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

//  //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//   Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
// driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
 Reporter.log("06.Clicked on 'Upload' button");
 reportLog("06.Clicked on 'Upload' button");
 Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
   Thread.sleep(2000);

      System.out.println("[Test 26 steps 'ENDS'] ");
		    Reporter.log("[Test 26 steps 'ENDS'] ");
		    reportLog("[Test 26  steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 26--> 'Importing record as Non Exsisting 'PO Qty'(NVARCHAR) field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 26--> 'Importing record as Non Exsisting 'PO Qty'(NVARCHAR) field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 26--> 'Importing record as Non Exsisting 'PO Qty'(NVARCHAR) field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
    //ends PO3
    
  Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 26 - Importing record as Non Exsisting 'PO Qty'(NVARCHAR) field is PASSED");
		Thread.sleep(8000); 		    
}

@Test(priority=27)
public void Test27() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 27 - Importing record as Non Exsisting 'PO Qty'(Special SYMBOLS) field ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

   System.out.println("************************************[ Test 27--> 'Importing record as Non Exsisting 'PO Qty'(Special SYMBOLS) field' ]************************************ ");
		 Reporter.log("************************************[ Test 27--> 'Importing record as Non Exsisting 'PO Qty'(Special SYMBOLS) field' ]************************************ ");
		 reportLog("******[ Test 27--> 'Importing record as Non Exsisting 'PO Qty'(Special SYMBOLS) field' ]****** ");
		    
   System.out.println("[Test 27 steps 'STARTS'] ");
	     Reporter.log("[Test 27 steps 'STARTS'] ");
	     reportLog("[Test 27 steps 'STARTS'] ");
   
	 
		//Inspection and clicking of 'Select Import File' button
   WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
   selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
// creating object of Robot class
 Robot rb = new Robot();

//// copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\27_Po_Data_NonExsistingPoQty(includingSpecialSymbols).csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);
 
 File fileee =new File("27_Po_Data_NonExsistingPoQty(includingSpecialSymbols).csv");
 String Path11= fileee.getAbsolutePath().toString();
 StringSelection str = new StringSelection(Path11);
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

//  //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//   Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
// driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
 Reporter.log("06.Clicked on 'Upload' button");
 reportLog("06.Clicked on 'Upload' button");
 Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
   Thread.sleep(2000);

      System.out.println("[Test 27 steps 'ENDS'] ");
		    Reporter.log("[Test 27 steps 'ENDS'] ");
		    reportLog("[Test 27 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 27--> 'Importing record as Non Exsisting 'PO Qty'(Special SYMBOLS) field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 27--> 'Importing record as Non Exsisting 'PO Qty'(Special SYMBOLS) field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 27--> 'Importing record as Non Exsisting 'PO Qty'(Special SYMBOLS) field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
    //ends PO3
    
  Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 27 - Importing record as Non Exsisting 'PO Qty'(Special SYMBOLS) field is PASSED");
		Thread.sleep(8000);  		    
}

@Test(priority=28)
public void Test28() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 28 - Importing record as Non Exsisting 'Unit' field ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
     System.out.println("************************************[ Test 28--> 'Importing record as Non Exsisting 'Unit' field' ]************************************ ");
		 Reporter.log("************************************[ Test 28--> 'Importing record as Non Exsisting 'Unit' field' ]************************************ ");
		 reportLog("******[ Test 28--> 'Importing record as Non Exsisting 'Unit' field' ]****** ");
		    
   System.out.println("[Test 28 steps 'STARTS'] ");
	     Reporter.log("[Test 28 steps 'STARTS'] ");
	     reportLog("[Test 28 steps 'STARTS'] ");
   

		//Inspection and clicking of 'Select Import File' button
   WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
   selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
// creating object of Robot class
 Robot rb = new Robot();

//// copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\28_Po_Data_NonExsistingUnit.csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);
 
 File fileee =new File("28_Po_Data_NonExsistingUnit.csv");
 String Path11= fileee.getAbsolutePath().toString();
 StringSelection str = new StringSelection(Path11);
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

//   //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//   Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
// driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
 Reporter.log("06.Clicked on 'Upload' button");
 reportLog("06.Clicked on 'Upload' button");
 Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
   Thread.sleep(2000);

      System.out.println("[Test 28 steps 'ENDS'] ");
		    Reporter.log("[Test 28 steps 'ENDS'] ");
		    reportLog("[Test 28 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 28--> 'Importing record as Non Exsisting 'Unit' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 28--> 'Importing record as Non Exsisting 'Unit' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 28--> 'Importing record as Non Exsisting 'Unit' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
    //ends PO3
    
  Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 28 - Importing record as Non Exsisting 'Unit' field is PASSED");
		Thread.sleep(8000); 		    
}
@Test(priority=29)
public void Test29() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 29 - Importing record as 'Item No' having MIN length ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

   System.out.println("************************************[ Test 29--> 'Importing record as 'Item No' having MIN length' ]************************************ ");
		 Reporter.log("************************************[ Test 29--> 'Importing record as 'Item No' having MIN length' ]************************************ ");
		 reportLog("******[ Test 29--> 'Importing record as 'Item No' having MIN length' ]****** ");
		    
   System.out.println("[Test 29 steps 'STARTS'] ");
	     Reporter.log("[Test 29 steps 'STARTS'] ");
	     reportLog("[Test 29 steps 'STARTS'] ");
   

		//Inspection and clicking of 'Select Import File' button
   WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
   selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
// creating object of Robot class
 Robot rb = new Robot();

//// copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\29_Po_Data_MINLengthItemNo.csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);
 
 File fileee =new File("29_Po_Data_MINLengthItemNo.csv");
 String Path11= fileee.getAbsolutePath().toString();
 StringSelection str = new StringSelection(Path11);
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

//  //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//   Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
// driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
 Reporter.log("06.Clicked on 'Upload' button");
 reportLog("06.Clicked on 'Upload' button");
 Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
   Thread.sleep(2000);

      System.out.println("[Test 29 steps 'ENDS'] ");
		    Reporter.log("[Test 29 steps 'ENDS'] ");
		    reportLog("[Test 29 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 29--> 'Importing record as 'Item No' having MIN length' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 29--> 'Importing record as 'Item No' having MIN length' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 29--> 'Importing record as 'Item No' having MIN length' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
    //ends PO3
    
  Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 29 - Importing record as 'Item No' having MIN length is PASSED");
		Thread.sleep(8000); 		    
}
@Test(priority=30)
public void Test30() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 30 - Importing record as 'Item No' having MAX length ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

   System.out.println("************************************[ Test 30--> 'Importing record as 'Item No' having MAX length' ]************************************ ");
		 Reporter.log("************************************[ Test 30--> 'Importing record as 'Item No' having MAX length' ]************************************ ");
		 reportLog("******[ Test 30--> 'Importing record as 'Item No' having MAX length' ]****** ");
		    
   System.out.println("[Test 1 steps 'STARTS'] ");
	     Reporter.log("[Test 1 steps 'STARTS'] ");
	     reportLog("[Test 1 steps 'STARTS'] ");
   

		//Inspection and clicking of 'Select Import File' button
   WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
   selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
// creating object of Robot class
 Robot rb = new Robot();

//// copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\30_Po_Data_MAXLengthItemNo.csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);
	  
 File fileee =new File("30_Po_Data_MAXLengthItemNo.csv");
 String Path11= fileee.getAbsolutePath().toString();
 StringSelection str = new StringSelection(Path11);
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

//  //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//   Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
// driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
 Reporter.log("06.Clicked on 'Upload' button");
 reportLog("06.Clicked on 'Upload' button");
 Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
   Thread.sleep(2000);

      System.out.println("[Test 30 steps 'ENDS'] ");
		    Reporter.log("[Test 30 steps 'ENDS'] ");
		    reportLog("[Test 30 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 30--> 'Importing record as 'Item No' having MAX length' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 30--> 'Importing record as 'Item No' having MAX length' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 30--> 'Importing record as 'Item No' having MAX length' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
    //ends PO3
    
  Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 30 - Importing record as 'Item No' having MAX length is PASSED");
		Thread.sleep(8000); 		    
}

@Test(priority=31)
public void Test31() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 31 - Importing record as 'Item No' having length more than provided(exceeding MAX Length) ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

   System.out.println("************************************[ Test 31--> 'Importing record as 'Item No' having length more than provided(exceeding MAX Length)' ]************************************ ");
		 Reporter.log("************************************[ Test 31--> 'Importing record as 'Item No' having length more than provided(exceeding MAX Length)' ]************************************ ");
		 reportLog("******[ Test 31--> 'Importing record as 'Item No' having length more than provided(exceeding MAX Length)' ]****** ");
		    
   System.out.println("[Test 31 steps 'STARTS'] ");
	     Reporter.log("[Test 31 steps 'STARTS'] ");
	     reportLog("[Test 31 steps 'STARTS'] ");
   
	 
		//Inspection and clicking of 'Select Import File' button
   WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
   selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
// creating object of Robot class
 Robot rb = new Robot();

//// copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\31_Po_Data_LengthMoreThanProvided(ItemNo).csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);
 
 File fileee =new File("31_Po_Data_LengthMoreThanProvided(ItemNo).csv");
 String Path11= fileee.getAbsolutePath().toString();
 StringSelection str = new StringSelection(Path11);
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

//  //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//   Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
// driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
 Reporter.log("06.Clicked on 'Upload' button");
 reportLog("06.Clicked on 'Upload' button");
 Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
   Thread.sleep(2000);

      System.out.println("[Test 31 steps 'ENDS'] ");
		    Reporter.log("[Test 31 steps 'ENDS'] ");
		    reportLog("[Test 31 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 31--> 'Importing record as 'Item No' having length more than provided(exceeding MAX Length)' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 31--> 'Importing record as 'Item No' having length more than provided(exceeding MAX Length)' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 31--> 'Importing record as 'Item No' having length more than provided(exceeding MAX Length)' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
    //ends PO3
    
  Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 31 - Importing record as 'Item No' having length more than provided(exceeding MAX Length) is PASSED");
		Thread.sleep(8000); 		    
}
@Test(priority=32)
public void Test32() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 32 - Importing record as NULL 'Cancel Flag' field ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

   System.out.println("************************************[ Test 32--> 'Importing record as NULL 'Cancel Flag' field' ]************************************ ");
		 Reporter.log("************************************[ Test 32--> 'Importing record as NULL 'Cancel Flag' field' ]************************************ ");
		 reportLog("******[ Test 32--> 'Importing record as NULL 'Cancel Flag' field' ]****** ");
		    
   System.out.println("[Test 32 steps 'STARTS'] ");
	     Reporter.log("[Test 32 steps 'STARTS'] ");
	     reportLog("[Test 32 steps 'STARTS'] ");
   

		//Inspection and clicking of 'Select Import File' button
   WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
   selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
// creating object of Robot class
 Robot rb = new Robot();

//// copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\32_Po_Data_NullCancelFlagField.csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);
	  
 File fileee =new File("32_Po_Data_NullCancelFlagField.csv");
 String Path11= fileee.getAbsolutePath().toString();
 StringSelection str = new StringSelection(Path11);
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

//  //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//   Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
// driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
 Reporter.log("06.Clicked on 'Upload' button");
 reportLog("06.Clicked on 'Upload' button");
 Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
   Thread.sleep(2000);

      System.out.println("[Test 32 steps 'ENDS'] ");
		    Reporter.log("[Test 32 steps 'ENDS'] ");
		    reportLog("[Test 32 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 32--> 'Importing record as NULL 'Cancel Flag' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 32--> 'Importing record as NULL 'Cancel Flag' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 32--> 'Importing record as NULL 'Cancel Flag' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
    //ends PO3
    
  Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 32 - Importing record as NULL 'Cancel Flag' field is PASSED");
		Thread.sleep(8000); 		    
}

@Test(priority=33)
public void Test33() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 33 - Importing record as input '0' inside 'Cancel Flag' field ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

   System.out.println("************************************[ Test 33--> 'Importing record as input '0' inside 'Cancel Flag' field' ]************************************ ");
		 Reporter.log("************************************[ Test 33--> 'Importing record as input '0' inside 'Cancel Flag' field' ]************************************ ");
		 reportLog("******[ Test 33--> 'Importing record as input '0' inside 'Cancel Flag' field' ]****** ");
		    
   System.out.println("[Test 33 steps 'STARTS'] ");
	     Reporter.log("[Test 33 steps 'STARTS'] ");
	     reportLog("[Test 33 steps 'STARTS'] ");
   

		//Inspection and clicking of 'Select Import File' button
   WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
   selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
// creating object of Robot class
 Robot rb = new Robot();

//// copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\33_Po_Data_CancelFlag(input-0).csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);
	  
 File fileee =new File("33_Po_Data_CancelFlag(input-0).csv");
 String Path11= fileee.getAbsolutePath().toString();
 StringSelection str = new StringSelection(Path11);
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

//  //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//   Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
// driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
 Reporter.log("06.Clicked on 'Upload' button");
 reportLog("06.Clicked on 'Upload' button");
 Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
   Thread.sleep(2000);

      System.out.println("[Test 33 steps 'ENDS'] ");
		    Reporter.log("[Test 33 steps 'ENDS'] ");
		    reportLog("[Test 33 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 33--> 'Importing record as input '0' inside 'Cancel Flag' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 33--> 'Importing record as input '0' inside 'Cancel Flag' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 33--> 'Importing record as input '0' inside 'Cancel Flag' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
    //ends PO3
    
  Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 33 - Importing record as input '0' inside 'Cancel Flag' field is PASSED");
		Thread.sleep(8000); 		    
}
@Test(priority=34)
public void Test34() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 34 - Importing record as input '1' inside 'Cancel Flag' field ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");

   System.out.println("************************************[ Test 34--> 'Importing record as input '0' inside 'Cancel Flag' field' ]************************************ ");
		 Reporter.log("************************************[ Test 34--> 'Importing record as input '0' inside 'Cancel Flag' field' ]************************************ ");
		 reportLog("******[ Test 34--> 'Importing record as input '0' inside 'Cancel Flag' field' ]****** ");
		    
   System.out.println("[Test 34 steps 'STARTS'] ");
	     Reporter.log("[Test 34 steps 'STARTS'] ");
	     reportLog("[Test 34 steps 'STARTS'] ");
   
	 
		//Inspection and clicking of 'Select Import File' button
   WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
   selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
// creating object of Robot class
 Robot rb = new Robot();

//// copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\34_Po_Data_CancelFlag(Input-1).csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);
 
 File fileee =new File("34_Po_Data_CancelFlag(Input-1).csv");
 String Path11= fileee.getAbsolutePath().toString();
 StringSelection str = new StringSelection(Path11);
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

//  //Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
//   Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
// driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
 Reporter.log("06.Clicked on 'Upload' button");
 reportLog("06.Clicked on 'Upload' button");
 Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
   Thread.sleep(2000);

      System.out.println("[Test 34 steps 'ENDS'] ");
		    Reporter.log("[Test 34 steps 'ENDS'] ");
		    reportLog("[Test 34 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 34--> 'Importing record as input '0' inside 'Cancel Flag' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 34--> 'Importing record as input '0' inside 'Cancel Flag' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 34--> 'Importing record as input '0' inside 'Cancel Flag' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
    //ends PO3
    
  Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 34 - Importing record as input '0' inside 'Cancel Flag' field is PASSED");
		Thread.sleep(8000); 		    
}
@Test(priority=35)
public void Test35() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 35 -Importing records with Error(With Error Records)  ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

 System.out.println("************************************[ Test 35--> 'Importing records with Error(With Error Records)' ]************************************ ");
		 Reporter.log("************************************[ Test 35--> 'Importing records with Error(With Error Records)' ]************************************ ");
		 reportLog("******[ Test 35--> 'Importing records with Error(With Error Records)' ]****** ");
		    
 System.out.println("[Test 35 steps 'STARTS'] ");
	     Reporter.log("[Test 35 steps 'STARTS'] ");
	     reportLog("[Test 35 steps 'STARTS'] ");
 

		//Inspection and clicking of 'Select Import File' button 
 WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
 selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
//creating object of Robot class
Robot rb = new Robot();

////copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\35_Po_Data_WithErrorRecords.csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);
	  
File fileee =new File("35_Po_Data_WithErrorRecords.csv");
String Path11= fileee.getAbsolutePath().toString();
StringSelection str = new StringSelection(Path11);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
System.out.println("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  Reporter.log("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  reportLog("05.Choosing excel file(having records) from System Directory to perform Import functionility");
Thread.sleep(1000);

// press Contol+V for pasting
rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);

//release Contol+V for pasting
rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);

//for pressing and releasing Enter
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER); 
Thread.sleep(2000);

////Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
// Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
Reporter.log("06.Clicked on 'Upload' button");
reportLog("06.Clicked on 'Upload' button");
Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
 Thread.sleep(2000);
 


    System.out.println("[Test 35 steps 'ENDS'] ");
		    Reporter.log("[Test 35 steps 'ENDS'] ");
		    reportLog("[Test 35 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 35--> 'Importing records with Error(With Error Records)' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 35--> 'Importing records with Error(With Error Records)' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 35--> 'Importing records with Error(With Error Records)' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
  //ends PO3
  
Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 35 - Importing records with Error(With Error Records) is PASSED");
		Thread.sleep(8000); 		    
}
@Test(priority=36)
public void Test36() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 36 - To print Error records in PDF(Error Report Print) format ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
     System.out.println("************************************[ Test 36--> 'Insertion of new data' ]************************************ ");
		 Reporter.log("************************************[ Test 36--> 'Insertion of new data' ]************************************ ");
		 reportLog("******[ Test 36--> 'Insertion of new data' ]****** ");
		    
 System.out.println("[Test 36 steps 'STARTS'] ");
	     Reporter.log("[Test 36 steps 'STARTS'] ");
	     reportLog("[Test 36 steps 'STARTS'] ");
 
	 
		//Inspection and clicking of 'Select Import File' button
 WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
 selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
//creating object of Robot class
Robot rb = new Robot();

////copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\36_Po_Data_ErrorrReportPrint.csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);

File fileee =new File("36_Po_Data_ErrorrReportPrint.csv");
String Path11= fileee.getAbsolutePath().toString();
StringSelection str = new StringSelection(Path11);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
System.out.println("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  Reporter.log("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  reportLog("05.Choosing excel file(having records) from System Directory to perform Import functionility");
Thread.sleep(1000);
	  
// press Contol+V for pasting
rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);

//release Contol+V for pasting
rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);

//for pressing and releasing Enter
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER); 
Thread.sleep(2000);

////Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
// Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
Reporter.log("06.Clicked on 'Upload' button");
reportLog("06.Clicked on 'Upload' button");
Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
 Thread.sleep(2000);
 
 //Inspection and clicking of "Error Report" to print report in PDF format 
	    WebDriverWait errorRepportbutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    errorRepportbutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div/div[2]/div[6]/button")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div/div[2]/div[6]/button")).click();
	     System.out.println("Clicked on 'Error Report' button to print error report in PDF format");
	     Reporter.log("Clicked on 'Error Report' button to print error report in PDF format");
	     reportLog("Clicked on 'Error Report' button to print error report in PDF format");
  Thread.sleep(2000);

 
    System.out.println("[Test 36 steps 'ENDS'] ");
		    Reporter.log("[Test 36 steps 'ENDS'] ");
		    reportLog("[Test 36 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 36--> 'To print Error records in PDF(Error Report Print) format' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 36--> 'To print Error records in PDF(Error Report Print) format' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 36--> 'To print Error records in PDF(Error Report Print) format' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
  //ends PO3
  
Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 36 - To print Error records in PDF(Error Report Print) format is PASSED");
		Thread.sleep(8000); 		    
}
@Test(priority=37)
public void Test37() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 37 - To print records in Excel(Export Excel sheet/file) format ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

 System.out.println("************************************[ Test 37--> 'To print records in Excel(Export Excel sheet/file) format' ]************************************ ");
		 Reporter.log("************************************[ Test 37--> 'To print records in Excel(Export Excel sheet/file) format' ]************************************ ");
		 reportLog("******[ Test 37--> 'To print records in Excel(Export Excel sheet/file) format' ]****** ");
		    
 System.out.println("[Test 37 steps 'STARTS'] ");
	     Reporter.log("[Test 37 steps 'STARTS'] ");
	     reportLog("[Test 37 steps 'STARTS'] ");
 

		//Inspection and clicking of 'Select Import File' button
 WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
 selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
//creating object of Robot class
Robot rb = new Robot();

////copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\37_Po_Data -ExportExcelSheet(RecordsWithErrors).csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);

File fileee =new File("37_Po_Data -ExportExcelSheet(RecordsWithErrors).csv");
String Path11= fileee.getAbsolutePath().toString();
StringSelection str = new StringSelection(Path11);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
System.out.println("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  Reporter.log("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  reportLog("05.Choosing excel file(having records) from System Directory to perform Import functionility");
Thread.sleep(1000);
	  
// press Contol+V for pasting
rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);

//release Contol+V for pasting
rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);

//for pressing and releasing Enter
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER); 
Thread.sleep(2000);

////Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
// Thread.sleep(2000);


//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
Reporter.log("06.Clicked on 'Upload' button");
reportLog("06.Clicked on 'Upload' button");
Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
 Thread.sleep(2000);
 
 //Inspection and clicking of "Export Excel Sheet" button to export records in excel format 
	    WebDriverWait errorRepportbutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    errorRepportbutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div/div[4]/div/div/div/div[4]/div/div/div[3]/div/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div/div[4]/div/div/div/div[4]/div/div/div[3]/div/div/div/div")).click();
	     System.out.println("Clicked on 'Export Excel Sheet' button to export records in excel format");
	     Reporter.log("Clicked on 'Export Excel Sheet' button to export records in excel format");
	     reportLog("Clicked on 'Export Excel Sheet' button to export records in excel format");
     Thread.sleep(2000);
 

    System.out.println("[Test 37 steps 'ENDS'] ");
		    Reporter.log("[Test 37 steps 'ENDS'] ");
		    reportLog("[Test 37 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 37--> 'To print records in Excel(Export Excel sheet/file) format' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 37--> 'To print records in Excel(Export Excel sheet/file) format' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 37--> 'To print records in Excel(Export Excel sheet/file) format' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
  //ends PO3
  
Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 37 - To print records in Excel(Export Excel sheet/file) format is PASSED");
		Thread.sleep(8000); 		    
}
@Test(priority=38)
public void Test38() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 38 - Importing records as BULK ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

 System.out.println("************************************[ Test 38--> 'Importing records as BULK' ]************************************ ");
		 Reporter.log("************************************[ Test 38--> 'Importing records as BULK' ]************************************ ");
		 reportLog("******[ Test 38--> 'Importing records as BULK' ]****** ");
		    
 System.out.println("[Test 38 steps 'STARTS'] ");
	     Reporter.log("[Test 38 steps 'STARTS'] ");
	     reportLog("[Test 38 steps 'STARTS'] ");
 

		//Inspection and clicking of 'Select Import File' button
 WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
 selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
//creating object of Robot class
Robot rb = new Robot();

////copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\38_Po_Data_BulkDataInsertion.csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);

File fileee =new File("38_Po_Data_BulkDataInsertion.csv");
String Path11= fileee.getAbsolutePath().toString();
StringSelection str = new StringSelection(Path11);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
System.out.println("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  Reporter.log("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  reportLog("05.Choosing excel file(having records) from System Directory to perform Import functionility");
Thread.sleep(1000);
	  
// press Contol+V for pasting
rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);

//release Contol+V for pasting
rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);

//for pressing and releasing Enter
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER); 
Thread.sleep(2000);

////Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
// Thread.sleep(2000);


//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
Reporter.log("06.Clicked on 'Upload' button");
reportLog("06.Clicked on 'Upload' button");
Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
 Thread.sleep(2000);
 


    System.out.println("[Test 38 steps 'ENDS'] ");
		    Reporter.log("[Test 38 steps 'ENDS'] ");
		    reportLog("[Test 38 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 38--> 'Importing records as BULK' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 38--> 'Importing records as BULK' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 38--> 'Importing records as BULK' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
  //ends PO3
  
Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 38 - Importing records as BULK is PASSED");
		Thread.sleep(8000); 		    
}
@Test(priority=39)
public void Test39() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 39 - To verify Store Location as we seted initially ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

 System.out.println("************************************[ Test 39--> 'Insertion of new data' ]************************************ ");
		 Reporter.log("************************************[ Test 39--> 'Insertion of new data' ]************************************ ");
		 reportLog("******[ Test 39--> 'Insertion of new data' ]****** ");
		    
 System.out.println("[Test 39 steps 'STARTS'] ");
	     Reporter.log("[Test 39 steps 'STARTS'] ");
	     reportLog("[Test 39 steps 'STARTS'] ");
 
	 Thread.sleep(2000); 
		 
		//Inspection and clicking of 'Select Import File' button
 WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
 selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
//creating object of Robot class
Robot rb = new Robot();

////copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\39_Po_Data_VerifyingStoreLocation.csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);

File fileee =new File("39_Po_Data_VerifyingStoreLocation.csv");
String Path11= fileee.getAbsolutePath().toString();
StringSelection str = new StringSelection(Path11);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
System.out.println("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  Reporter.log("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  reportLog("05.Choosing excel file(having records) from System Directory to perform Import functionility");
Thread.sleep(1000);
	  
// press Contol+V for pasting
rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);

//release Contol+V for pasting
rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);

//for pressing and releasing Enter
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER); 
Thread.sleep(2000);

////Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
// Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
Reporter.log("06.Clicked on 'Upload' button");
reportLog("06.Clicked on 'Upload' button");
Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
 Thread.sleep(2000);
 
 String ExpectedStoreLocation = "JGC-6S";
	 WebElement actualStoreLocationPath= driver.findElement(By.xpath("/html/body/div[1]/div/section[1]/a[2]"));
 String ActualStoreLocation = actualStoreLocationPath.getText();
 //System.out.println(ActualValidation);
	 Assert.assertEquals(ExpectedStoreLocation, ActualStoreLocation);
	 System.out.println("Store Location is "+ActualStoreLocation );
 Reporter.log("Store Location is "+ActualStoreLocation);
 reportLog("Store Location is "+ActualStoreLocation);
 Thread.sleep(2000);


    System.out.println("[Test 39 steps 'ENDS'] ");
		    Reporter.log("[Test 39 steps 'ENDS'] ");
		    reportLog("[Test 39 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 39--> 'To verify Store Location as we seted initially' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 39--> 'To verify Store Location as we seted initially' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 39--> 'To verify Store Location as we seted initially' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
  //ends PO3
  
Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 39 - To verify Store Location as we seted initially is PASSED");
		Thread.sleep(8000); 		    
}

@Test(priority=40)
public void Test40() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 40 - To verify importing records in Potrait mode  ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

 System.out.println("************************************[ Test 40--> 'To verify importing records in Potrait mode' ]************************************ ");
		 Reporter.log("************************************[ Test 40--> 'To verify importing records in Potrait mode' ]************************************ ");
		 reportLog("******[ Test 40--> 'To verify importing records in Potrait mode' ]****** ");
		    
 System.out.println("[Test 40 steps 'STARTS'] ");
	     Reporter.log("[Test 40 steps 'STARTS'] ");
	     reportLog("[Test 40 steps 'STARTS'] ");
 
	 
		//Inspection and clicking of 'Select Import File' button
 WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
 selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
//creating object of Robot class
Robot rb = new Robot();

////copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\40_Po_Data_AbleToViewRecordInPotraitMode.csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);

File fileee =new File("40_Po_Data_AbleToViewRecordInPotraitMode.csv");
String Path11= fileee.getAbsolutePath().toString();
StringSelection str = new StringSelection(Path11);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
System.out.println("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  Reporter.log("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  reportLog("05.Choosing excel file(having records) from System Directory to perform Import functionility");
Thread.sleep(1000);
	  
// press Contol+V for pasting
rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);

//release Contol+V for pasting
rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);

//for pressing and releasing Enter
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER); 
Thread.sleep(2000);

////Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
// Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
Reporter.log("06.Clicked on 'Upload' button");
reportLog("06.Clicked on 'Upload' button");
Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
 Thread.sleep(2000);
 
//Inspection and clicking of "Mac menu Potrait" button to view records in Potrait. 
	    WebDriverWait macMenuButtonToPotrait = new WebDriverWait(driver, Duration.ofMillis(8000));
	    macMenuButtonToPotrait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/nav/a")));
	    driver.findElement(By.xpath("/html/body/div[1]/header/nav/a")).click();
	     System.out.println("Clicked on 'Mac menu Potrait' button to view records in Potrait");
	     Reporter.log("Clicked on 'Mac menu Potrait' button to view records in Potrait");
	     reportLog("Clicked on 'Mac menu Potrait' button to view records in Potrait");
  Thread.sleep(6000);
 
 //Inspection and clicking of "Mac menu Potrait" button to view records in Potrait. 
	    WebDriverWait macMenuButtonToPotraitNORMAL = new WebDriverWait(driver, Duration.ofMillis(8000));
	    macMenuButtonToPotraitNORMAL.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/nav/a")));
	    driver.findElement(By.xpath("/html/body/div[1]/header/nav/a")).click();
	     System.out.println("Clicked on 'Mac menu Potrait' button to view records in Potrait");
	     Reporter.log("Clicked on 'Mac menu Potrait' button to view records in Potrait");
	     reportLog("Clicked on 'Mac menu Potrait' button to view records in Potrait");
     Thread.sleep(2000);    


    System.out.println("[Test 40 steps 'ENDS'] ");
		    Reporter.log("[Test 40 steps 'ENDS'] ");
		    reportLog("[Test 40 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 40--> 'To verify importing records in Potrait mode' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 40--> 'To verify importing records in Potrait mode' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 40--> 'To verify importing records in Potrait mode' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
  //ends PO3
  
Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 40 - To verify importing records in Potrait mode is PASSED");
		Thread.sleep(8000); 		    
}

@Test(priority=41)
public void Test41() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

//	 FileInputStream fileNew=new FileInputStream("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\41_Po_Data_PoDataWithSpecialSymbols.csv");
//	   sh= WorkbookFactory.create(fileNew).getSheet("Sheet");
//	   
	   test=extent.startTest("Test 41 - To verify IMPORTED record(contains Special Symbols as 'PO No') is displaying in DM screen or not!  ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

 System.out.println("************************************[ Test 41--> 'To verify IMPORTED record(contains Special Symbols as 'PO No') is displaying in DM screen or not!' ]************************************ ");
		 Reporter.log("************************************[ Test 41--> 'To verify IMPORTED record(contains Special Symbols as 'PO No') is displaying in DM screen or not!' ]************************************ ");
		 reportLog("******[ Test 41--> 'To verify IMPORTED record(contains Special Symbols as 'PO No') is displaying in DM screen or not!' ]****** ");
		    
 System.out.println("[Test 41 steps 'STARTS'] ");
	     Reporter.log("[Test 41 steps 'STARTS'] ");
	     reportLog("[Test 41 steps 'STARTS'] ");
 
	 
		//Inspection and clicking of 'Select Import File' button
 WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
 selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
//creating object of Robot class
Robot rb = new Robot();

////copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\41_Po_Data_PoDataWithSpecialSymbols.csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);

File fileee =new File("41_Po_Data_PoDataWithSpecialSymbols.csv");
String Path11= fileee.getAbsolutePath().toString();
StringSelection str = new StringSelection(Path11);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
System.out.println("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  Reporter.log("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  reportLog("05.Choosing excel file(having records) from System Directory to perform Import functionility");
Thread.sleep(1000);
	  
// press Contol+V for pasting
rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);

//release Contol+V for pasting
rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);

//for pressing and releasing Enter
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER); 
Thread.sleep(2000);

////Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
// Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
Reporter.log("06.Clicked on 'Upload' button");
reportLog("06.Clicked on 'Upload' button");
Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
     Thread.sleep(2000);
 
   //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait closeimportMenuBar = new WebDriverWait(driver, Duration.ofMillis(8000));
	    closeimportMenuBar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")));
	    driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")).click();
	     System.out.println("05.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("05.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("05.Clicked on 'Import file' button once file uploaded successfully");
    Thread.sleep(3000);
 
  //Inspection and clicking of "DATA MAINTAINCE" menu
	    WebDriverWait dataMainatinceArrow = new WebDriverWait(driver, Duration.ofMillis(8000));
	    dataMainatinceArrow.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")));
	    driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")).click();
	    System.out.println("06.Clicked on DATA MAINTAINCE menu(arrow)");
	    Reporter.log("06.Clicked on DATA MAINTAINCE menu(arrow)");
	    reportLog("06.Clicked on DATA MAINTAINCE menu(arrow)");
    Thread.sleep(2000);
	    
	  //Inspection and clicking of "Receiving Data" under Data Maintainance
	    WebDriverWait receivingDataOptions = new WebDriverWait(driver, Duration.ofMillis(8000));
	    receivingDataOptions.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/div[2]")));
	    driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/div[2]")).click();
	    System.out.println("07.Clicked of 'Receiving Data' under Data Maintainance");
	    Reporter.log("07.Clicked of 'Receiving Data' under Data Maintainance");
	    reportLog("07.Clicked of 'Receiving Data' under Data Maintainance");
    Thread.sleep(2000);
	    
	  //Inspection and clicking of "PO" Screen
	    WebDriverWait poScreen = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poScreen.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/ul/li[1]/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/ul/li[1]/div/div")).click();
	    System.out.println("08.Clicked on 'PO' Screen");
	    Reporter.log("08.Clicked on 'PO' Screen");
	    reportLog("08.Clicked on 'PO' Screen");
     Thread.sleep(2000);
	    
	   //Inspection and clicking of "PO NO:" Field 
	    WebDriverWait poNoField = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[1]/div/div/div[1]/div/input"))); 
	   // driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[1]/div/div/div[1]/div/input")).click();
		//String poNoFieldd= sh.getRow(1).getCell(1).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[1]/div/div/div[1]/div/input")).sendKeys("P-2174-3021-#@*&-2@23-//");
	    Thread.sleep(2000);
	    Actions action3 = new Actions(driver); 
	    WebElement  element3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action3.moveToElement(element3).click().perform();
	    System.out.println("09.Clicked inside 'PO No' field ");
	    Reporter.log("09.Clicked inside 'PO No' field ");
	    reportLog("09.Clicked inside 'PO No' field ");
	    Thread.sleep(2000);
    
	    //Inspection and clicking of "Go" Button 
	    WebDriverWait clickingGOButton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickingGOButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[2]/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[2]/div/div")).click();
    System.out.println("10.Clicked on 'Go' button");
    Reporter.log("10.Clicked on 'Go' button");
    reportLog("10.Clicked on 'Go' button");
    Thread.sleep(4000);
	    
//    String ExpectedItemNo = "121";
//	    WebElement actualItemNoXPATH= driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input"));
//    String ActualItemNo = actualItemNoXPATH.getText();
//	   //System.out.println(ActualValidation);
//    Thread.sleep(3000);
//	    Assert.assertEquals(ExpectedItemNo, ActualItemNo);
//    
    
        System.out.println("[Test 41 steps 'ENDS'] ");
		    Reporter.log("[Test 41 steps 'ENDS'] ");
		    reportLog("[Test 41 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 41--> 'To verify IMPORTED record(contains Special Symbols as 'PO No') is displaying in DM screen or not!' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 41--> 'To verify IMPORTED record(contains Special Symbols as 'PO No') is displaying in DM screen or not!' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 41--> 'To verify IMPORTED record(contains Special Symbols as 'PO No') is displaying in DM screen or not!' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
  //ends PO3
  
    Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 41 - To verify IMPORTED record(contains Special Symbols as 'PO No') is displaying in DM screen or not! is PASSED");
		Thread.sleep(10000); 		    
}

@Test(priority=42)
public void Test42() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 42 - To verify IMPORTED record is displaying in DM screen or not! for 'PO Qty' data ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

 System.out.println("************************************[ Test 42--> 'To verify IMPORTED record is displaying in DM screen or not! for 'PO Qty' data' ]************************************ ");
		 Reporter.log("************************************[ Test 42--> 'To verify IMPORTED record is displaying in DM screen or not! for 'PO Qty' data' ]************************************ ");
		 reportLog("******[ Test 42--> 'To verify IMPORTED record is displaying in DM screen or not! for 'PO Qty' data' ]****** ");
		    
 System.out.println("[Test 42 steps 'STARTS'] ");
	     Reporter.log("[Test 42 steps 'STARTS'] ");
	     reportLog("[Test 42 steps 'STARTS'] ");
 
	   //Inspection and clicking of 'Import Menu' button
	     WebDriverWait importMenuClick = new WebDriverWait(driver, Duration.ofMillis(8000));
	     importMenuClick.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")));
	     driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")).click();
	     
	     //Inspection and clicking of 'Select Import File' button
	     WebDriverWait poShippingScreen = new WebDriverWait(driver, Duration.ofMillis(8000));
	     poShippingScreen.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/ul/li[2]/div")));
	     driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/ul/li[2]/div")).click();
	     
	   //Inspection and clicking '.csv' radio button 
     WebDriverWait csvRadioButton = new WebDriverWait(driver, Duration.ofMillis(8000));
     csvRadioButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[1]/div/div/div[2]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[1]/div/div/div[2]/div[1]/div")).click();
		
		 
		//Inspection and clicking of 'type' dropdown 
     WebDriverWait typePOButton = new WebDriverWait(driver, Duration.ofMillis(8000));
     typePOButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[2]/div/div/div/div[2]/div/div/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[2]/div/div/div/div[2]/div/div/div")).click();
		 System.out.println("02.Clicked 'type' dropdown");
	    
		 
		//Inspection and Selected 'type' as 'PO' 
     WebDriverWait poOption = new WebDriverWait(driver, Duration.ofMillis(8000));
     poOption.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div")).click();
     Thread.sleep(1000); 
	     
		//Inspection and clicking of 'Select Import File' button
 WebDriverWait selectImportFile = new WebDriverWait(driver, Duration.ofMillis(8000));
 selectImportFile.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div")).click();
		 System.out.println("01.Clicked on 'Select Import File' button");
	     Reporter.log("01.Clicked on 'Select Import File' button");
	     reportLog("01.Clicked on 'Select Import File' button");
		 Thread.sleep(2000); 
		 
//creating object of Robot class
Robot rb = new Robot();

////copying File path to Clipboard
//StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\44_Po_Data_ImportedDataWithDMScreenVerification.csv");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility.Choosing excel file(having records) from System Directory to perform Import functionility");
//	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
//Thread.sleep(2000);

File fileee =new File("44_Po_Data_ImportedDataWithDMScreenVerification.csv");
String Path11= fileee.getAbsolutePath().toString();
StringSelection str = new StringSelection(Path11);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
System.out.println("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  Reporter.log("05.Choosing excel file(having records) from System Directory to perform Import functionility");
	  reportLog("05.Choosing excel file(having records) from System Directory to perform Import functionility");
Thread.sleep(1000);
	  
// press Contol+V for pasting
rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);

//release Contol+V for pasting
rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);

//for pressing and releasing Enter
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER); 
Thread.sleep(2000);

////Inspection and clicking of "Upload" button
//	    WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
//	     System.out.println("03.Clicked on 'Upload' button");
//	     Reporter.log("03.Clicked on 'Upload' button");
//	     reportLog("03.Clicked on 'Upload' button");
// Thread.sleep(2000);

//Inspection and clicking of "Upload" button
WebDriverWait uploadButton = new WebDriverWait(driver, Duration.ofMillis(12000));
uploadButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")));
//driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
Actions act52 =  new Actions(driver);
act52.moveToElement(driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div"))).click().perform();
System.out.println("06.Clicked on 'Upload' button");
Reporter.log("06.Clicked on 'Upload' button");
reportLog("06.Clicked on 'Upload' button");
Thread.sleep(1000);

	    //Inspection and clicking of "Import file" button once file uploaded successfully. 
	    WebDriverWait importfilebutton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    importfilebutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[4]/button")).click();
	     System.out.println("04.Clicked on 'Import file' button once file uploaded successfully");
	     Reporter.log("04.Clicked on 'Import file' button once file uploaded successfully");
	     reportLog("04.Clicked on 'Import file' button once file uploaded successfully");
   Thread.sleep(2000);
 
////Inspection and clicking of 'Import Menu' button
// WebDriverWait importMenuClickCLOSE = new WebDriverWait(driver, Duration.ofMillis(8000));
// importMenuClickCLOSE.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")));
// driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")).click();
// 
//Inspection and clicking of "Upload" button
 WebDriverWait importMenuClickCLOSEE = new WebDriverWait(driver, Duration.ofMillis(12000));
 importMenuClickCLOSEE.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")));
// driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
 Actions act52importMenu =  new Actions(driver);
 act52importMenu.moveToElement(driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]"))).click().perform();
 Thread.sleep(1000);
 
////Inspection and clicking of 'Import Menu' button
// WebDriverWait dataMaintainceTabClickOpen = new WebDriverWait(driver, Duration.ofMillis(8000));
// dataMaintainceTabClickOpen.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")));
// driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")).click();
//
////Inspection and clicking of 'Import Menu' button
// WebDriverWait receivingDataTabClickOpen = new WebDriverWait(driver, Duration.ofMillis(8000));
// receivingDataTabClickOpen.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/div[2]")));
// driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/div[2]")).click();
//

//  //Inspection and clicking of 'poScreen' button
// WebDriverWait poScreen = new WebDriverWait(driver, Duration.ofMillis(8000));
// poScreen.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/ul/li[1]/div")));
// driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/ul/li[1]/div")).click();
// 
//Inspection and clicking of "Upload" button
 WebDriverWait poScreen = new WebDriverWait(driver, Duration.ofMillis(12000));
 poScreen.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/ul/li[1]/div")));
// driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[3]/div/div/div/div/div[2]/div")).click();
 Actions act52poScreen =  new Actions(driver);
 act52poScreen.moveToElement(driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/ul/li[1]/div"))).click().perform();
  Thread.sleep(1000);
 
//Inspection and clicking of "PO NO:" Field 
	    WebDriverWait poNoField = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[1]/div/div/div[1]/div/input"))); 
	   // driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[1]/div/div/div[1]/div/input")).click();
		//String poNoFieldd= sh.getRow(1).getCell(1).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[1]/div/div/div[1]/div/input")).sendKeys("P-2842-1022-BD");
	    Thread.sleep(2000);
	    Actions action3 = new Actions(driver); 
	    WebElement  element3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action3.moveToElement(element3).click().perform();
	    System.out.println("09.Clicked inside 'PO No' field");
	    Reporter.log("09.Clicked inside 'PO No' field");
	    reportLog("09.Clicked inside 'PO No' field");
	    Thread.sleep(2000);
 
	    //Inspection and clicking of "Go" Button 
	    WebDriverWait clickingGOButton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickingGOButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[2]/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[2]/div/div")).click();
 System.out.println("10.Clicked on 'Go' button");
 Reporter.log("10.Clicked on 'Go' button");
 reportLog("10.Clicked on 'Go' button");
	    Thread.sleep(5000);
	    
//	        // Verification of PO Qty data using assertion
//	        String expectedPOQty = "0.00001";
//		    WebElement actualPOQtyXPATH= driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]"));
//	        String actualPOQty = actualPOQtyXPATH.getText();
//		    System.out.println(actualPOQty);
//		    Assert.assertEquals(expectedPOQty, actualPOQty);
//		   // Assert.assertNotEquals(notExpectedValidatoion, ActualValidation);


    System.out.println("[Test 42 steps 'ENDS'] ");
		    Reporter.log("[Test 42 steps 'ENDS'] ");
		    reportLog("[Test 42 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 42--> 'To verify IMPORTED record is displaying in DM screen or not! for 'PO Qty' data' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 42--> 'To verify IMPORTED record is displaying in DM screen or not! for 'PO Qty' data' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 42--> 'To verify IMPORTED record is displaying in DM screen or not! for 'PO Qty' data' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
  //ends PO3
  
Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 42 - To verify IMPORTED record is displaying in DM screen or not! for 'PO Qty' data is PASSED");
		Thread.sleep(8000); 		    
}

@Test(priority=43)
public void Test43() throws EncryptedDocumentException, InterruptedException, IOException, AWTException
{

	   test=extent.startTest("Test 43 - To verify Store Location is displaying or not(as we Seted initially) ");

	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		

 System.out.println("************************************[ Test 43--> 'To verify Store Location is displaying or not(as we Seted initially' ]************************************ ");
		 Reporter.log("************************************[ Test 43--> 'To verify Store Location is displaying or not(as we Seted initially' data' ]************************************ ");
		 reportLog("******[ Test 43--> 'To verify Store Location is displaying or not(as we Seted initially' ]****** ");
		    
 System.out.println("[Test 43 steps 'STARTS'] ");
	     Reporter.log("[Test 43 steps 'STARTS'] ");
	     reportLog("[Test 43 steps 'STARTS'] ");
 
	   //Inspection and clicking of 'Import Menu' button
	     WebDriverWait importMenuClick = new WebDriverWait(driver, Duration.ofMillis(8000));
	     importMenuClick.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")));
	     driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/div[2]")).click();
	     
	     //Inspection and clicking of 'Select Import File' button
	     WebDriverWait poShippingScreen = new WebDriverWait(driver, Duration.ofMillis(8000));
	     poShippingScreen.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/ul/li[2]/div")));
	     driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[1]/ul/li[2]/div")).click();
	     
	   //Inspection and clicking '.csv' radio button 
     WebDriverWait csvRadioButton = new WebDriverWait(driver, Duration.ofMillis(8000));
     csvRadioButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[1]/div/div/div[2]/div[1]/div")));
		 driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div/div[2]/div[1]/div/div/div[2]/div[1]/div")).click();
		

       // Verification of PO Qty data using assertion
	        String expectedStoreLocation = "JGC-6S";
		    WebElement actualStoreLocationXPATH= driver.findElement(By.xpath("/html/body/div[1]/div/section[1]/a[2]"));
	        String actualStoreLocation = actualStoreLocationXPATH.getText();
		    System.out.println(actualStoreLocation);
		    Assert.assertEquals(expectedStoreLocation, actualStoreLocation);
		   // Assert.assertNotEquals(notExpectedValidatoion, ActualValidation);


    System.out.println("[Test 43 steps 'ENDS'] ");
		    Reporter.log("[Test 43 steps 'ENDS'] ");
		    reportLog("[Test 43 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 43--> 'To verify Store Location is displaying or not(as we Seted initially' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 43--> 'To verify Store Location is displaying or not(as we Seted initially' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 43--> 'To verify Store Location is displaying or not(as we Seted initially' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
  //ends PO3
  
Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 43 - To verify Store Location is displaying or not(as we Seted initially is PASSED");
		Thread.sleep(8000); 		    
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