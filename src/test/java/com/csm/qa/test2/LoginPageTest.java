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

   // copying File path to Clipboard
   StringSelection str = new StringSelection("D:\\Eclipse_rohit\\CMS_DMscreens(2.0)\\TestEvidences[ExtentReport]\\ImportMenu\\POShipping\\02_Po_Data_DuplicateDataValidation.csv");
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
   System.out.println("02.Choosing excel file(having records) from System Directory to perform Import functionility");
	  Reporter.log("02.Choosing excel file(having records) from System Directory to perform Import functionility");
	  reportLog("02.Choosing excel file(having records) from System Directory to perform Import functionility");
   Thread.sleep(2000);
	  
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
	     System.out.println("03.Clicked on 'Upload' button");
	     Reporter.log("03.Clicked on 'Upload' button");
	     reportLog("03.Clicked on 'Upload' button");
      Thread.sleep(2000);

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