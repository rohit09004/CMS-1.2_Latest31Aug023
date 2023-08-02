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
//	//@Test(priority=1)
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

@Test(priority=1)
public void Test1() throws EncryptedDocumentException, InterruptedException, IOException
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
		
		CSMBase base=new CSMBase();
		base.commonAllElements(driver);
		
		
		//starts PO3
        System.out.println(" ");
        Reporter.log(" ");
		   System.out.println("************************************[ Test 1--> Insertion of new data ]**************************************************** ");
		   Reporter.log("************************************[ Test 1--> Insertion of new data ]**************************************************** ");
		   reportLog("******[ Test 1--> Insertion of new data ]****** ");
		   
		   
		    System.out.println("[Test 1 steps 'STARTS'] ");
		    Reporter.log("[Test 1 steps 'STARTS'] ");
		    reportLog("[Test 1 steps 'STARTS'] ");
		   
         //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
		    WebDriverWait insertSymbole1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    insertSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
	         System.out.println("01.Clicked on 'Insert' button to add new Record");
	         Reporter.log("01.Clicked on 'Insert' button to add new Record");
	         reportLog("01.Clicked on 'Insert' button to add new Record");

			
		    //Inspection and clicking of "PO No." field   	    
		    WebDriverWait poNoField1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    poNoField1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		    String poNoFieldSheet1=sheet.getRow(1).getCell(2).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet1);
		    System.out.println("02.Inserting 'PO No.' field ");
		    Reporter.log("02.Inserting 'PO No.' field ");
		    reportLog("02.Inserting 'PO No.' field ");

//for failing test
		     //driver.findElement(By.xpath("wggsjhwvjgvjgdevwgjv")).click();
		    //reportLog("02.Inserting 'PO No.' fielD  from PO2");

		    
		    //Inspection and clicking of "Company Code" field   	    
		    WebDriverWait companyCodeFieldOptions1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    companyCodeFieldOptions1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
		    String companyCodeField1=sheet.getRow(1).getCell(15).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField1);
		    System.out.println("03.Choosing 'Company code' field ");
		    Reporter.log("03.Choosing 'Company code' field ");
		    reportLog("03.Choosing 'Company code' field ");
		
		
		base.commonCompanyCodeField(driver);
		base.commonElementPODate(driver);
		
		//Inspection and clicking of "Title1" field   	    
	    WebDriverWait title101 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title101.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data01=sheet.getRow(1).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data01);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(1000);
	    
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(2000);

	       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole1= new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(1000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown1 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(1000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping1 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[24]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[24]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(1000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData1=sheet.getRow(1).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData1);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(1000);
  
      //Inspection and clicking of "Ident Code"   	    
  	    WebDriverWait identCodeList1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData1=sheet.getRow(1).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData1);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(1000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action1 = new Actions(driver); 
	    WebElement  element1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action1.moveToElement(element1).click().perform();
	    Thread.sleep(3000);
		   

//		    //Inspection and clicking of "PO Qty."
//		    WebDriverWait poQty11 = new WebDriverWait(driver, Duration.ofMillis(20000));
//		    System.out.println("Po start 1");
//		    poQty11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")));
//		    System.out.println("Po start 2");
//		    //driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).click();
//		    System.out.println("Po start 3");
//		    String poQtyDataaa= sheet.getRow(1).getCell(9).getStringCellValue();
//		    System.out.println(poQtyDataaa);
//		    base.commonPOQtyBackSpace(driver);
//		    //driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(poQtyDataaa);
//		    //driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(Keys.CONTROL + "a" + Keys.CONTROL+"8");
//            Actions act =  new Actions(driver);
//		    act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input"))).click().sendKeys("8").perform();
//            // driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys("8");
//		    System.out.println("10.Inserting 'PO Qty.' field ");
//		    Reporter.log("10.Inserting 'PO Qty.' field ");
//		    reportLog("10.Inserting 'PO Qty.' field ");
//		    Thread.sleep(1000);
	    
	    
	    
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty11 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")));
        String poQtyDataaa= sheet.getRow(1).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act =  new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input"))).click().sendKeys(poQtyDataaa).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
	    
	    base.commonSAVEbuttonCHILD(driver);
	    System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		Thread.sleep(1000);
		
		
		// To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Child grid
	    WebDriverWait deleteButtonChildTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("12.Clicking on Delete button of 'Child' grid ");
	    Reporter.log("12.Clicking on Delete button of 'Child' grid ");
	    reportLog("12.Clicking on Delete button of 'Child' grid ");
	    Thread.sleep(1000);
	    
	    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[20]")));
	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[20]")).click();
	    System.out.println("13.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Reporter.log("13.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    reportLog("13.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Thread.sleep(1000);


    // To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("14.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("14.Clicking on Delete button of 'Parent' grid ");
	    reportLog("14.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(1000);
	 
   //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[20]")));
	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[20]")).click();
	    System.out.println("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(1000);

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

@Test(priority=2)
public void Test2() throws EncryptedDocumentException, InterruptedException, IOException
{
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);

	   test=extent.startTest("Test 2 - Insertion of data as 'NULL' field ");
       
       System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
       driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");
                // https://qacms.jgc.com/CMS_PT/Home/Index?UserId=QWRtaW4=
                // https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=
    	
	
        CSMBase base=new CSMBase();
		
 	
// Scenario 2 start
		System.out.println(" ");
    Reporter.log(" ");
    
       System.out.println("************************************[ Test 2--> Insertion of data as 'NULL' field ]**************************************************** ");
	   Reporter.log("************************************[ Test 2--> Insertion of data as 'NULL' field ]**************************************************** ");
	   reportLog("******[ Scenario 2--> Insertion of data as 'NULL' field ]****** ");
	   
	   System.out.println("[Test 2 steps 'STARTS'] ");
	   Reporter.log("[Test 2 steps 'STARTS'] ");
	   reportLog("[Test 2 steps 'STARTS'] ");
	   
     //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole2 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
         System.out.println("01.Clicked on 'Insert' button to add new Record");
         Reporter.log("01.Clicked on 'Insert' button to add new Record");
         reportLog("01.Clicked on 'Insert' button to add new Record");
		
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField2 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet2=sheet.getRow(2).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet2);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions2 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField2=sheet.getRow(2).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField2);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);
    	 
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title202 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title202.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title2Data02=sheet.getRow(2).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title2Data02);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	   
	    base.commonSAVEbutton(driver);
	    
	  //Inspection and clicking inside "PO No" field for Null data validation   	    
	    WebDriverWait poNoNullValueValidation= new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoNullValueValidation.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div[1]/div/div/input")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div[1]/div/div/input")).click();
	    
	    base.commonSAVEbutton(driver);
	    Thread.sleep(4000);
	    
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);
	    
	    

     System.out.println("[Scenario 2 steps 'ENDS'] ");
	    Reporter.log("[Scenario 2 steps 'ENDS'] ");
	    reportLog("[Scenario 2 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 2--> 'Insertion of data as 'NULL' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 2--> 'Insertion of data as 'NULL' field' is ''PASSED'' ]************************************ ");
	    reportLog("******[ Test 2--> 'Insertion of data as 'NULL' field' is ''PASSED'' ]****** ");
	    System.out.println(" ");
	    Reporter.log(" ");
	    System.out.println(" ");
	    Reporter.log(" ");
	    System.out.println(" ");
	    Reporter.log(" ");
	    
	    Assert.assertTrue(true);
  		test.log(LogStatus.PASS, "Test 2 - Insertion of data as 'NULL' field' is PASSED");
// Scenario 2 ends
}


@Test(priority=3)
public void Test3() throws EncryptedDocumentException, InterruptedException, IOException
{
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   
	   test=extent.startTest("Test 3 - Insertion of new record having field capacity more than provided ");
     
     System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
     driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

     CSMBase base=new CSMBase();
 
	 System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 3--> Insertion of new data having field capacity more than provided ]**************************************************** ");
	   Reporter.log("************************************[ Test 3--> Insertion of new data having field capacity more than provided ]**************************************************** ");
	   reportLog("******[ Test 3--> Insertion of new data having field capacity more than provided ]****** ");
	   
	   System.out.println("[Test 3 steps 'STARTS'] ");
	   Reporter.log("[Test 3 steps 'STARTS'] ");
	   reportLog("[Test 3 steps 'STARTS'] ");
	   
    //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
       System.out.println("01.Clicked on 'Insert' button to add new Record");
       Reporter.log("01.Clicked on 'Insert' button to add new Record");
       reportLog("01.Clicked on 'Insert' button to add new Record");
       
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet3=sheet.getRow(3).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet3);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField3=sheet.getRow(3).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField3);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
        
	    
	    //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title103 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title103.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data03=sheet.getRow(3).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data03);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button     ");
	    Thread.sleep(3000);

	       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData3=sheet.getRow(3).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData3);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);
  
      //Inspection and clicking of "Ident Code"   	    
  	WebDriverWait identCodeList3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData3=sheet.getRow(3).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData3);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action3 = new Actions(driver); 
	    WebElement  element3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action3.moveToElement(element3).click().perform();
	    Thread.sleep(2000);
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty11 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyDataaa= sheet.getRow(3).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act =  new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyDataaa).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    

			    
	    base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		Thread.sleep(2000);
		
		
		// To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Child grid
	    WebDriverWait deleteButtonChildTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("12.Clicking on Delete button of 'Child' grid ");
	    Reporter.log("12.Clicking on Delete button of 'Child' grid ");
	    reportLog("12.Clicking on Delete button of 'Child' grid ");
	    Thread.sleep(2000);
	    
	    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("13.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Reporter.log("13.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    reportLog("13.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);


    // To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("14.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("14.Clicking on Delete button of 'Parent' grid ");
	    reportLog("14.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
   //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    System.out.println("[Test 3 steps 'ENDS'] ");
	    Reporter.log("[Test 3 steps 'ENDS'] ");
	    reportLog("[Test 3 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 3--> 'Insertion of new data having field capacity more than provided' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 3--> 'Insertion of new data having field capacity more than provided' is ''PASSED'' ]************************************ ");
	    Reporter.log("******[ Test 3--> 'Insertion of new data having field capacity more than provided' is ''PASSED'' ]****** ");
	    System.out.println(" ");
	    Reporter.log(" ");
		System.out.println(" ");
	    Reporter.log(" ");
	 
	    Assert.assertTrue(true);
  		test.log(LogStatus.PASS, "Test 3 - Insertion of new data having field capacity more than provided is PASSED");
	    
}

@Test(priority=4)
public void Test4() throws EncryptedDocumentException, InterruptedException, IOException
{
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
    
	   test=extent.startTest("Test 4 - Insertion of new record for non-exsisting data ");
     
     System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
     driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");


     CSMBase base=new CSMBase();
  
	
	 System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 4--> Insertion of new record for non-exsisting data ]**************************************************** ");
	   Reporter.log("************************************[ Test 4--> Insertion of new record for non-exsisting data ]**************************************************** ");
	   reportLog("******[ Test 4--> Insertion of new record for non-exsisting data ]****** ");
	   
	   System.out.println("[Test 4 steps 'STARTS'] ");
	   Reporter.log("[Test 4 steps 'STARTS'] ");
	   reportLog("[Test 4 steps 'STARTS'] ");
	   
      //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole4 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
       System.out.println("01.Clicked on 'Insert' button to add new Record");
       Reporter.log("01.Clicked on 'Insert' button to add new Record");
       reportLog("01.Clicked on 'Insert' button to add new Record");
       
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField4 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet4=sheet.getRow(4).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet4);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title104 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title104.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data04=sheet.getRow(4).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data04);
	    System.out.println("03.Inserting 'Title1' field ");
	    Reporter.log("03.Inserting 'Title1' field ");
	    reportLog("03.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	    
     	    
	    WebDriverWait companyCodeFieldOptions4 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField4=sheet.getRow(4).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField4);
	    
	    //commonCompanyCodeField(driver);
	    System.out.println("04.Choosing 'Company code' field ");
	    Reporter.log("04.Choosing 'Company code' field ");
	    reportLog("04.Choosing 'Company code' field ");
	    
      System.out.println("[Test 4 steps 'ENDS'] ");
	    Reporter.log("[Test 4 steps 'ENDS'] ");
	    reportLog("[Test 4 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 4--> 'Insertion of new record for non-exsisting data' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 4]--> 'Insertion of new record for non-exsisting data' is ''PASSED'' ]************************************ ");
	    reportLog("******[ Test 4]--> 'Insertion of new record for non-exsisting data' is ''PASSED'' ]****** ");
	    Reporter.log(" ");
        System.out.println(" ");
	    Reporter.log(" ");
        System.out.println(" ");
	    Reporter.log(" ");

	    Assert.assertTrue(true);
  		test.log(LogStatus.PASS, "Test 4 - Insertion of new record for non-exsisting data is PASSED");
	    
}
@Test(priority=5)
public void Test55() throws EncryptedDocumentException, InterruptedException, IOException
{
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
    
	   test=extent.startTest("Test 5 - Insertion of new record as BULK records ");
     
     System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
     driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");


     CSMBase base=new CSMBase();
	
	 System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 5--> Insertion of new record as BULK records ]**************************************************** ");
	   Reporter.log("************************************[ Test 5--> Insertion of new record as BULK records ]**************************************************** ");
	   reportLog("******[ Test 5--> Insertion of new record as BULK records ]****** ");
	   
	   System.out.println("[Test 5 steps 'STARTS'] ");
	   Reporter.log("[Test 5 steps 'STARTS'] ");
	   reportLog("[Test 5 steps 'STARTS'] ");
	   
      //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
       System.out.println("01.Clicked on 'Insert' button to add new Record");
       Reporter.log("01.Clicked on 'Insert' button to add new Record");
       reportLog("01.Clicked on 'Insert' button to add new Record");
       
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet5=sheet.getRow(5).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet5);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField5=sheet.getRow(5).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField5);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title105 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title105.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data05=sheet.getRow(5).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data05);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
//for failing test
	   
	    // driver.findElement(By.xpath("wggsjhwvjgvjgdevwgjv")).click();
	    //reportLog("02.Inserting 'PO No.' field  from PO2");
	    
	    
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);

	  //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo5 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData5=sheet.getRow(5).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData5);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);
  
      //Inspection and clicking of "Ident Code"   	    
  	WebDriverWait identCodeList5 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData5=sheet.getRow(5).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData5);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action5 = new Actions(driver); 
	    WebElement  element5 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    // /html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div
	    action5.moveToElement(element5).click().perform();
	    Thread.sleep(2000);
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty11 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyDataaa= sheet.getRow(5).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act =  new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyDataaa).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//        base.commonPOQtyBackSpace(driver);
//       Thread.sleep(2000);
//		String poQtyData5= sheet.getRow(5).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData5);
//	    System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	    
			    
	    base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		Thread.sleep(2000);
		
//child data 1
		//Inspection and clicking of "Insert" Button for Child grid under PO Screen
		WebDriverWait insertChildSymbolee5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertChildSymbolee5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	    System.out.println("12.Clicked on 'Insert' button to add new CHILD Record");
	    Reporter.log("12.Clicked on 'Insert' button to add new CHILD Record");
	    reportLog("12.Clicked on 'Insert' button to add new CHILD Record");
	    Thread.sleep(2000);		    
	    
	    //Inspection and clicking of "Discipline Code"   	    
	    WebDriverWait disciplineCodeDropdownn5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    disciplineCodeDropdownn5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	    Thread.sleep(2000);
	    
	    //Inspection and clicking of particular "Discipline Code"    	    
	    WebDriverWait disciplineCodeDropdownPipingg5= new WebDriverWait(driver, Duration.ofMillis(8000));
	    disciplineCodeDropdownPipingg5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
	    System.out.println("13.Choosing 'Displine code' ");
	    Reporter.log("13.Choosing 'Displine code' ");
	    reportLog("13.Choosing 'Displine code' ");
	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo51 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo51.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData51=sheet.getRow(6).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData51);
		System.out.println("14.Inserting 'Item No.' field ");
		Reporter.log("14.Inserting 'Item No.' field ");
		reportLog("14.Inserting 'Item No.' field ");
		Thread.sleep(2000);
  
      //Inspection and clicking of "Ident Code"   	    
  	WebDriverWait identCodeList51 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList51.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData51=sheet.getRow(6).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData51);
	    System.out.println("15.Selecting 'Ident Code' field ");
	    Reporter.log("15.Selecting 'Ident Code' field ");
	    reportLog("15.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action51 = new Actions(driver); 
	    WebElement  element51= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action51.moveToElement(element51).click().perform();
	    Thread.sleep(2000);
		    
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty51 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty51.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyDataa= sheet.getRow(5).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions actt =  new Actions(driver);
	    actt.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyDataa).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty51 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty51.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//	    base.commonPOQtyBackSpace(driver);
//      Thread.sleep(2000);
//		String poQtyData51= sheet.getRow(6).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData51);
//	    System.out.println("16.Inserting 'PO Qty.' field ");
//	    Reporter.log("16.Inserting 'PO Qty.' field ");
//	    reportLog("16.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	    
			    
	    base.commonSAVEbuttonCHILD(driver);
		System.out.println("17.Cliking on 'SAVE' button ");
		Reporter.log("17.Cliking on 'SAVE' button ");
		reportLog("17.Cliking on 'SAVE' button ");
		Thread.sleep(2000);
		
		
//child data 2
		//Inspection and clicking of "Insert" Button for Child grid under PO Screen
		WebDriverWait insertChildSymbole52 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertChildSymbole52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	    System.out.println("18.Clicked on 'Insert' button to add new CHILD Record");
	    Reporter.log("18.Clicked on 'Insert' button to add new CHILD Record");
	    reportLog("18.Clicked on 'Insert' button to add new CHILD Record");
	    Thread.sleep(2000);		    
	    
	    //Inspection and clicking of "Discipline Code"   	    
	    WebDriverWait disciplineCodeDropdown52 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    disciplineCodeDropdown52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	    Thread.sleep(2000);
	    
	    //Inspection and clicking of particular "Discipline Code"    	    
	    WebDriverWait disciplineCodeDropdownPiping52 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    disciplineCodeDropdownPiping52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
	    System.out.println("19.Choosing 'Displine code' ");
	    Reporter.log("19.Choosing 'Displine code' ");
	    reportLog("19.Choosing 'Displine code' ");
	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo52 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData52=sheet.getRow(7).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData52);
		System.out.println("20.Inserting 'Item No.' field ");
		Reporter.log("20.Inserting 'Item No.' field ");
		reportLog("20.Inserting 'Item No.' field ");
		Thread.sleep(2000);
  
      //Inspection and clicking of "Ident Code"   	    
     	WebDriverWait identCodeList52 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData52=sheet.getRow(7).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData52);
	    System.out.println("21.Selecting 'Ident Code' field ");
	    Reporter.log("21.Selecting 'Ident Code' field ");
	    reportLog("21.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action52 = new Actions(driver); 
	    WebElement  element52= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action52.moveToElement(element52).click().perform();
	    Thread.sleep(2000);
		    
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData52= sheet.getRow(7).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act52 =  new Actions(driver);
        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//        base.commonPOQtyBackSpace(driver);
//        Thread.sleep(2000);
//		String poQtyData52= sheet.getRow(7).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData52);
//	    System.out.println("22.Inserting 'PO Qty.' field ");
//	    Reporter.log("22.Inserting 'PO Qty.' field ");
//	    reportLog("22.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	    
			    
	    base.commonSAVEbuttonCHILD(driver);
		System.out.println("23.Cliking on 'SAVE' button ");
		Reporter.log("23.Cliking on 'SAVE' button ");
		reportLog("23.Cliking on 'SAVE' button ");
		Thread.sleep(2000);
		
        // To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Child grid
	    WebDriverWait deleteButtonChildTest5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildTest5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[4]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[4]")).click();
	    System.out.println("24.Clicking on Delete button of 'Child' grid ");
	    Reporter.log("24.Clicking on Delete button of 'Child' grid ");
	    reportLog("24.Clicking on Delete button of 'Child' grid ");
	    Thread.sleep(2000);
	    
	    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmTest5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmTest5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
	    System.out.println("25.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Reporter.log("25.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    reportLog("25.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    
	    
	    //Inspection and clicking of "Delete" button of Child grid
	    WebDriverWait deleteButtonChild1Test5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChild1Test5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[3]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[3]")).click();
	    System.out.println("26.Clicking on Delete button of 'Child' grid ");
	    Reporter.log("26.Clicking on Delete button of 'Child' grid ");
	    reportLog("26.Clicking on Delete button of 'Child' grid ");
	    Thread.sleep(2000);
	    
	    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirm1Test5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirm1Test5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
	    System.out.println("27.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Reporter.log("27.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    reportLog("27.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    
        //Inspection and clicking of "Delete" button of Child grid
	    WebDriverWait deleteButtonChild2Test5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChild2Test5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("28.Clicking on Delete button of 'Child' grid ");
	    Reporter.log("28.Clicking on Delete button of 'Child' grid ");
	    reportLog("28.Clicking on Delete button of 'Child' grid ");
	    Thread.sleep(2000);
	    
	    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirm2Test5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirm2Test5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
	    System.out.println("29.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Reporter.log("29.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    reportLog("29.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);

        // To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("30.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("30.Clicking on Delete button of 'Parent' grid ");
	    reportLog("30.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
        //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest5 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
	    System.out.println("31.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("31.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("31.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    System.out.println("[Test 5 steps 'ENDS'] ");
	    Reporter.log("[Test 5 steps 'ENDS'] ");
	    reportLog("[Test 5 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 5--> 'Insertion of new record as BULK records' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 5--> 'Insertion of new record as BULK records' is ''PASSED'' ]************************************ ");
	    reportLog("******[ Test 5--> 'Insertion of new record as BULK records' is ''PASSED'' ]****** ");
	    Reporter.log(" ");
        System.out.println(" ");
	    Reporter.log(" ");
        System.out.println(" ");
	    Reporter.log(" ");
	    
	    Assert.assertTrue(true);
  		test.log(LogStatus.PASS, "Test 5 - Insertion of new record as BULK records is PASSED");
	    
}

@Test(priority=6)
public void Test6() throws EncryptedDocumentException, InterruptedException, IOException
{
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   
	   test=extent.startTest("Test 6 - Insertion of new record with duplicate data validation ");
     
      System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
      driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

      CSMBase base=new CSMBase();
	
	   System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 6--> Insertion of new record with duplicate data validation ]**************************************************** ");
	   Reporter.log("************************************[ Test 6--> Insertion of new record with duplicate data validation ]**************************************************** ");
	   reportLog("******[ Test 6--> Insertion of new record with duplicate data validation ]****** ");
	   
	   System.out.println("[Test 6 steps 'STARTS'] ");
	   Reporter.log("[Test 6 steps 'STARTS'] ");
	   reportLog("[Test 6 steps 'STARTS'] ");
	   
      //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole6 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
       System.out.println("01.Clicked on 'Insert' button to add new Record");
       Reporter.log("01.Clicked on 'Insert' button to add new Record");
       reportLog("01.Clicked on 'Insert' button to add new Record");
       
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField6 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet6=sheet.getRow(8).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet6);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions6 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField6=sheet.getRow(8).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField6);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title106 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title106.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data06=sheet.getRow(8).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data06);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);
	    

	  //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole6 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown6 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping6 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo6= new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData6=sheet.getRow(8).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData6);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);
  
      //Inspection and clicking of "Ident Code"   	    
  	WebDriverWait identCodeList6 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData6=sheet.getRow(8).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData6);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action6 = new Actions(driver); 
	    WebElement  element6 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action6.moveToElement(element6).click().perform();
	    Thread.sleep(2000);
		   
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData52= sheet.getRow(8).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act52 =  new Actions(driver);
        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty6 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    base.commonPOQtyBackSpace(driver);
//      Thread.sleep(2000);
//		String poQtyData6= sheet.getRow(8).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData6);
//	    System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	    
			    
	    base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		Thread.sleep(2000);
		
		
		
		
		 //For duplicate data 
	    //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymboleduplicate6 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymboleduplicate6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
       System.out.println("12.Clicked on 'Insert' button to add new Record for duplicate data validation");
       Reporter.log("12.Clicked on 'Insert' button to add new Record for duplicate data validation");
       reportLog("12.Clicked on 'Insert' button to add new Record for duplicate data validation");
       
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoFieldduplicate6 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoFieldduplicate6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheetduplicate6=sheet.getRow(9).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheetduplicate6);
	    System.out.println("13.Inserting 'PO No.' field ");
	    Reporter.log("13.Inserting 'PO No.' field ");
	    reportLog("13.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptionsduplicate6 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptionsduplicate6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeFieldduplicate6=sheet.getRow(9).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeFieldduplicate6);
	    System.out.println("14.Choosing 'Company code' field ");
	    Reporter.log("14.Choosing 'Company code' field ");
	    reportLog("14.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	  
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title1duplicate6 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title1duplicate6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Dataduplicate6=sheet.getRow(9).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Dataduplicate6);
	    System.out.println("15.Inserting 'Title1' field ");
	    Reporter.log("15.Inserting 'Title1' field ");
	    reportLog("15.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("16.Cliking on 'SAVE' button ");
	    Reporter.log("16.Cliking on 'SAVE' button ");
	    reportLog("16.Cliking on 'SAVE' button ");
	    Thread.sleep(4000);
		
		
 	// To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Child grid
	    WebDriverWait deleteButtonChildTest6 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildTest6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("17.Clicking on Delete button of 'Child' grid ");
	    Reporter.log("17.Clicking on Delete button of 'Child' grid ");
	    reportLog("17.Clicking on Delete button of 'Child' grid ");
	    Thread.sleep(4000);
	    
	    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmTest6 = new WebDriverWait(driver, Duration.ofMillis(12000));
	    deleteButtonChildConfirmTest6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div")).click();
	    System.out.println("18.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Reporter.log("18.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    reportLog("18.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    
	    

      // To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest6 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("19.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("19.Clicking on Delete button of 'Parent' grid ");
	    reportLog("19.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
     //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest6 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div")).click();
	    System.out.println("20.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("20.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("20.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    System.out.println("[Test 6 steps 'ENDS'] ");
	    Reporter.log("[Test 6 steps 'ENDS'] ");
	    reportLog("[Test 6 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 6--> 'Insertion of new record with duplicate data validation' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 6--> 'Insertion of new record with duplicate data validation' is ''PASSED'' ]************************************ ");
	    reportLog("******[ Test 6--> 'Insertion of new record with duplicate data validation' is ''PASSED'' ]****** ");
	    Reporter.log(" ");
	    System.out.println(" ");
        Reporter.log(" ");
	    System.out.println(" ");
	    Reporter.log(" ");
	   
	    Assert.assertTrue(true);
  		test.log(LogStatus.PASS, "Test 6 - Insertion of new record with duplicate data validation is PASSED");
	    
}
@Test(priority=7)
public void Test7() throws EncryptedDocumentException, InterruptedException, IOException
{

	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   
	   test=extent.startTest("Test 7 - Insertion of new record with Leading space and Trailing space ");
     
     System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
     driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");
    
     CSMBase base=new CSMBase();
	
	   System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 7--> Insertion of new record with Leading space and Trailing space ]**************************************************** ");
	   Reporter.log("************************************[ Test 7--> Insertion of new record with Leading space and Trailing space ]**************************************************** ");
	   reportLog("******[ Test 7--> Insertion of new record with Leading space and Trailing space ]****** ");
	   
	   System.out.println("[Test 7 steps 'STARTS'] ");
	   Reporter.log("[Test 7 steps 'STARTS'] ");
	   reportLog("[Test 7 steps 'STARTS'] ");
	   
     //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole7 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
      System.out.println("01.Clicked on 'Insert' button to add new Record");
      Reporter.log("01.Clicked on 'Insert' button to add new Record");
      reportLog("01.Clicked on 'Insert' button to add new Record");
      
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField7 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet7=sheet.getRow(10).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet7);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions7 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField7=sheet.getRow(10).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField7);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title107 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title107.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data07=sheet.getRow(10).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data07);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);
	    

	  //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole7 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown7 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping7 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo7 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData7=sheet.getRow(10).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData7);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);
 
     //Inspection and clicking of "Ident Code"   	    
 	WebDriverWait identCodeList7 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData7=sheet.getRow(10).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData7);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action7 = new Actions(driver); 
	    WebElement  element7 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action7.moveToElement(element7).click().perform();
	    Thread.sleep(2000);
		    
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData52= sheet.getRow(10).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act52 =  new Actions(driver);
        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty7 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    base.commonPOQtyBackSpace(driver);
//     Thread.sleep(2000);
//		String poQtyData7= sheet.getRow(10).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData7);
//	    System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	    
			    
	    base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		Thread.sleep(2000);
		
		
		
		
//For trailing space data 
	    //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymboleduplicate7 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymboleduplicate7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
      System.out.println("12.Clicked on 'Insert' button to add new Record ");
      Reporter.log("12.Clicked on 'Insert' button to add new Record ");
      reportLog("12.Clicked on 'Insert' button to add new Record ");
      
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoFieldduplicate7 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoFieldduplicate7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheetduplicate7=sheet.getRow(11).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheetduplicate7);
	    System.out.println("13.Inserting 'PO No.' field ");
	    Reporter.log("13.Inserting 'PO No.' field ");
	    reportLog("13.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptionsduplicate7 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptionsduplicate7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeFieldduplicate7=sheet.getRow(11).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeFieldduplicate7);
	    System.out.println("14.Choosing 'Company code' field ");
	    Reporter.log("14.Choosing 'Company code' field ");
	    reportLog("14.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	  
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title1duplicate7 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title1duplicate7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Dataduplicate7=sheet.getRow(11).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Dataduplicate7);
	    System.out.println("15.Inserting 'Title1' field ");
	    Reporter.log("15.Inserting 'Title1' field ");
	    reportLog("15.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("16.Cliking on 'SAVE' button ");
	    Reporter.log("16.Cliking on 'SAVE' button ");
	    reportLog("16.Cliking on 'SAVE' button ");
	    Thread.sleep(4000);
		
		

	    //Inspection and clicking of "Delete" button of Child grid
	    WebDriverWait deleteButtonChildTest7 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildTest7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("17.Clicking on Delete button of 'Child' grid ");
	    Reporter.log("17.Clicking on Delete button of 'Child' grid ");
	    reportLog("17.Clicking on Delete button of 'Child' grid ");
	    Thread.sleep(2000);
	    
	    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmTest7 = new WebDriverWait(driver, Duration.ofMillis(12000));
	    deleteButtonChildConfirmTest7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div")).click();
	    System.out.println("18.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Reporter.log("18.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    reportLog("18.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    
	    

     // To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest7 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("19.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("19.Clicking on Delete button of 'Parent' grid ");
	    reportLog("19.Clicking on Delete button of 'Parent' grid ");	
	    Thread.sleep(2000);
	 
    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest7 = new WebDriverWait(driver, Duration.ofMillis(12000));
	    deleteButtonParentConfirmTest7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div")).click();
	    System.out.println("20.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("20.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("20.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    System.out.println("[Test 7 steps 'ENDS'] ");
	    Reporter.log("[Test 7 steps 'ENDS'] ");
	    reportLog("[Test 7 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 7--> 'Insertion of new record with Leading space and Trailing space' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 7--> 'Insertion of new record with Leading space and Trailing space' is ''PASSED'' ]************************************ ");
	    reportLog("******[ Test 7--> 'Insertion of new record with Leading space and Trailing space' is ''PASSED'' ]****** ");
	    Reporter.log(" ");
        System.out.println(" ");
	    Reporter.log(" ");
        System.out.println(" ");
	    Reporter.log(" ");
	    
	    Assert.assertTrue(true);
  		test.log(LogStatus.PASS, "Test 7 - Insertion of new record with Leading space and Trailing space is PASSED");
	    
}
@Test(priority=8)
public void Test88() throws EncryptedDocumentException, InterruptedException, IOException
{
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   test=extent.startTest("Test 8 - Updating particular record with new data(Updatation operation) ");
     
     System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
     driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

     CSMBase base=new CSMBase();
	
	 System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 8--> Updating particular record with new data(Updatation operation) ]**************************************************** ");
	   Reporter.log("************************************[ Test 8--> Updating particular record with new data(Updatation operation) ]**************************************************** ");
	   reportLog("*****[ Test 8--> Updating particular record with new data(Updatation operation) ]***** ");
	   
	   System.out.println("[Test 8 steps 'STARTS'] ");
	   Reporter.log("[Test 8 steps 'STARTS'] ");
	   reportLog("[Test 8 steps 'STARTS'] ");
	   
      //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole8 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
       System.out.println("01.Clicked on 'Insert' button to add new Record");
       Reporter.log("01.Clicked on 'Insert' button to add new Record");
       reportLog("01.Clicked on 'Insert' button to add new Record");
       
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField8 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet8=sheet.getRow(12).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet8);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions8 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField8=sheet.getRow(12).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField8);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title108 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title108.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data8=sheet.getRow(12).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data8);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);
	    
     
	  //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole8 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown8 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping8 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo8 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData8=sheet.getRow(12).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData8);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);
  
      //Inspection and clicking of "Ident Code"   	    
  	WebDriverWait identCodeList8 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData8=sheet.getRow(12).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData8);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action8 = new Actions(driver); 
	    WebElement  element8 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action8.moveToElement(element8).click().perform();
	    Thread.sleep(2000);
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData52= sheet.getRow(12).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act52 =  new Actions(driver);
        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty8 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    base.commonPOQtyBackSpace(driver);
//        Thread.sleep(2000);
//		String poQtyData8= sheet.getRow(12).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData8);
//	    System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	    
			    
	    base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		Thread.sleep(2000);
		
		
		// For Updadtation Code
		// Clicking on Edit button of Parent data
      WebDriverWait insertSymboleUpdate8 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymboleUpdate8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[8]/a[1]/span")));
      driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[8]/a[1]/span")).click();
      System.out.println("12. Clicking on Edit button for Parent record ");
		Reporter.log("12. Clicking on Edit button for Parent record ");
		reportLog("12. Clicking on Edit button for Parent record ");
	    
	    
	  //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptionsUpdate8 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptionsUpdate8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
     Thread.sleep(1000);
	    String companyCodeFieldUpdate8=sheet.getRow(13).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeFieldUpdate8);
	    System.out.println("13.Updatating 'Company code' field ");
	    Reporter.log("13.Updatating 'Company code' field ");
	    reportLog("13.Updatating 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title1Update08 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title1Update08.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(1000);
	    String title1DataUpdate08=sheet.getRow(13).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1DataUpdate08);
	    System.out.println("14.Updatating 'Title1' field ");
	    Reporter.log("14.Updatating 'Title1' field ");
	    reportLog("14.Updatating 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("15.Cliking on 'SAVE' button ");
	    Reporter.log("15.Cliking on 'SAVE' button ");
	    reportLog("15.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);
	    
	    
	    
	    //Updating Child Record
	 // Clicking on Edit button of Child data
      WebDriverWait insertSymboleUpdatee8 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymboleUpdatee8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[1]/span")));
      driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[1]/span")).click();
      System.out.println("16.Clicking on Edit button for Child record ");
	    Reporter.log("16.Clicking on Edit button for Child record ");
	    reportLog("16.Clicking on Edit button for Child record ");
      
	    
	  //Inspection and clicking of "Item No"   	    
		WebDriverWait itemNoUpdate8 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNoUpdate8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
      String itemNoDataUpdate8=sheet.getRow(13).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoDataUpdate8);
		System.out.println("17.Updatating 'Item No.' field ");
		Reporter.log("17.Updatating 'Item No.' field ");
		reportLog("17.Updatating 'Item No.' field ");
		Thread.sleep(2000);
  
      //Inspection and clicking of "Ident Code"   	    
  	WebDriverWait identCodeListUpdate8 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeListUpdate8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
    
	    String identCodeDataUpdate81=sheet.getRow(13).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(identCodeDataUpdate81);
	    System.out.println("18.Updatating 'Ident Code' field ");
	    Reporter.log("18.Updatating 'Ident Code' field ");
	    reportLog("18.Updatating 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions actionUpdate8 = new Actions(driver); 
	    WebElement  elementUpdate8= driver.findElement(By.xpath("//div[@class='dx-item-content dx-list-item-content']"));
	                                                           ///html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div
	    System.out.println("18.1.Action button-trial ");
	    actionUpdate8.moveToElement(elementUpdate8).click().perform();
	    Thread.sleep(2000);
		    
	    base.commonSAVEbuttonCHILD(driver);
	    Thread.sleep(2000);
	    
	 
	    
    //Inspection and clicking of "Delete" button of Child grid
	    WebDriverWait deleteButtonChildTest8 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildTest8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("19.Clicking on Delete button of 'Child' grid ");
	    Reporter.log("19.Clicking on Delete button of 'Child' grid ");
	    reportLog("19.Clicking on Delete button of 'Child' grid ");
	    Thread.sleep(2000);
	    
	    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmTest8 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmTest8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
	    System.out.println("20.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Reporter.log("20.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    reportLog("20.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    
	    

      // To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest8 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("21.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("21.Clicking on Delete button of 'Parent' grid ");
	    reportLog("21.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
     //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest8 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
	    System.out.println("22.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("22.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("22.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    System.out.println("[Test 8 steps 'ENDS'] ");
	    Reporter.log("[Test 8 steps 'ENDS'] ");
	    reportLog("[Test 8 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 8--> 'Updating particular record with new data(Updatation operation)' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 8--> 'Updating particular record with new data(Updatation operation)' is ''PASSED'' ]************************************ ");
	    reportLog("******[ Test 8--> 'Updating particular record with new data(Updatation operation)' is ''PASSED'' ]****** ");
	    Reporter.log(" ");
        System.out.println(" ");
	    Reporter.log(" ");
        System.out.println(" ");
	    Reporter.log(" ");
	    
	    Assert.assertTrue(true);
  		test.log(LogStatus.PASS, "Test 8 - Updating particular record with new data(Updatation operation) is PASSED");
	    
}
@Test(priority=9)
public void Test99() throws EncryptedDocumentException, InterruptedException, IOException
{
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   
	   test=extent.startTest("Test 9 - Insertion of new data, to print REPORT ");
     
     System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
     driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

     CSMBase base=new CSMBase();
  
	
	System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Scenario 9--> Insertion of new data, to print REPORT. ]**************************************************** ");
	   Reporter.log("************************************[ Scenario 9--> Insertion of new data, to print REPORT. ]**************************************************** ");
	   reportLog("******[ Scenario 9--> Insertion of new data, to print REPORT. ]****** ");
	   System.out.println("[Scenario 9 steps 'STARTS'] ");
	   Reporter.log("[Scenario 9 steps 'STARTS'] ");
	   reportLog("[Scenario 9 steps 'STARTS'] ");
	   
     //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
      System.out.println("01.Clicked on 'Insert' button to add new Record");
      Reporter.log("01.Clicked on 'Insert' button to add new Record");
      reportLog("01.Clicked on 'Insert' button to add new Record");
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet9=sheet.getRow(14).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet9);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField9=sheet.getRow(14).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField9);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title109 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title109.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data9=sheet.getRow(14).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data9);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);
	    
    
	  //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo9 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData9=sheet.getRow(14).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData9);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);
 
     //Inspection and clicking of "Ident Code"   	    
 	WebDriverWait identCodeList9 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData9=sheet.getRow(14).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData9);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action9 = new Actions(driver); 
	    WebElement  element9 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action9.moveToElement(element9).click().perform();
	    Thread.sleep(2000);
		    
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData52= sheet.getRow(14).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act52 =  new Actions(driver);
        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty9 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    base.commonPOQtyBackSpace(driver);
//     Thread.sleep(2000);
//		String poQtyData9= sheet.getRow(14).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData9);
//	    System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	    
			    
	    base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		Thread.sleep(2000);
		
			    
//Inserting child data to print REPORT
		//Inspection and clicking of "Insert" Button for Child grid under PO Screen
		WebDriverWait insertChildSymboleReport9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertChildSymboleReport9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	    System.out.println("12.Clicked on 'Insert' button to add new CHILD Record");
	    Reporter.log("12.Clicked on 'Insert' button to add new CHILD Record");
	    reportLog("12.Clicked on 'Insert' button to add new CHILD Record");
	    Thread.sleep(2000);		    
	    
	    //Inspection and clicking of "Discipline Code"   	    
	    WebDriverWait disciplineCodeDropdownReport9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    disciplineCodeDropdownReport9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div/div[2]/div/div/div")).click();
	    Thread.sleep(2000);
	    
	    //Inspection and clicking of particular "Discipline Code"    	    
	    WebDriverWait disciplineCodeDropdownPipingReport9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    disciplineCodeDropdownPipingReport9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")));
	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")).click();
	    System.out.println("13.Choosing 'Displine code' ");
	    Reporter.log("13.Choosing 'Displine code' ");
	    reportLog("13.Choosing 'Displine code' ");
	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo51Report9 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo51Report9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData51Report9=sheet.getRow(15).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData51Report9);
		System.out.println("14.Inserting 'Item No.' field ");
		Reporter.log("14.Inserting 'Item No.' field ");
		reportLog("14.Inserting 'Item No.' field ");
		Thread.sleep(2000);
 
     //Inspection and clicking of "Ident Code"   	    
 	WebDriverWait identCodeList51Report9 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList51Report9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData51Report9=sheet.getRow(15).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData51Report9);
	    System.out.println("15.Selecting 'Ident Code' field ");
	    Reporter.log("15.Selecting 'Ident Code' field ");
	    reportLog("15.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action51Report9 = new Actions(driver); 
	    WebElement  element51Report9= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action51Report9.moveToElement(element51Report9).click().perform();
	    Thread.sleep(2000);
		    
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty522 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty522.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData522= sheet.getRow(15).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act522 =  new Actions(driver);
        act522.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData522).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty51Report9 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty51Report9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    base.commonPOQtyBackSpace(driver);
//     Thread.sleep(2000);
//		String poQtyData51Report9= sheet.getRow(15).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData51Report9);
//	    System.out.println("16.Inserting 'PO Qty.' field ");
//	    Reporter.log("16.Inserting 'PO Qty.' field ");
//	    reportLog("16.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	    
			    
	    base.commonSAVEbuttonCHILD(driver);
		System.out.println("17.Cliking on 'SAVE' button ");
		Reporter.log("17.Cliking on 'SAVE' button ");
		reportLog("17.Cliking on 'SAVE' button ");
		Thread.sleep(2000);
		
// To print Report 
	    WebDriverWait printReportt9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    printReportt9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[3]/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[3]/div/div")).click();
	    System.out.println("18.Cliking on 'Print' button to print Report");
		Reporter.log("18.Cliking on 'Print' button to print Report");
		reportLog("18.Cliking on 'Print' button to print Report");
		Thread.sleep(9000);
		


     // To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonChilddTest9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChilddTest9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[3]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[3]")).click();
	    System.out.println("19.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("19.Clicking on Delete button of 'Parent' grid ");
	    reportLog("19.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmmTest9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmmTest9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
	    System.out.println("20.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("20.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("20.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    
	  //Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonChildddTest9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildddTest9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("21.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("21.Clicking on Delete button of 'Parent' grid ");
	    reportLog("21.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmmmTest9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmmmTest9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
	    System.out.println("22.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("22.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("22.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    
	    //Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("23.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("23.Clicking on Delete button of 'Parent' grid ");
	    reportLog("23.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest9 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
	    System.out.println("24.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("24.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("24.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    
	
	    
	    System.out.println("[Test 9 steps 'ENDS'] ");
	    Reporter.log("[Test 9 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 9--> 'Insertion of new data, to print REPORT' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 9--> 'Insertion of new data, to print REPORT' is ''PASSED'' ]************************************ ");
	    reportLog("******[ Test 9--> 'Insertion of new data, to print REPORT' is ''PASSED'' ]****** ");
	    Reporter.log(" ");
        System.out.println(" ");
	    Reporter.log(" ");
        System.out.println(" ");
	    Reporter.log(" ");
	    
	    Assert.assertTrue(true);
  		test.log(LogStatus.PASS, "Test 9 - Insertion of new data, to print REPORT is PASSED");
	    
}
@Test(priority=10)
public void Test100() throws EncryptedDocumentException, InterruptedException, IOException
{
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 
	   test=extent.startTest("Test 10 - Insertion of new data, to validate search bar disappearing or not! ");
     
     System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
     driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

     CSMBase base=new CSMBase();
     
	 System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 10--> Insertion of new data, to validate search bar disappearing or not!. ]**************************************************** ");
	   Reporter.log("************************************[ Test 10--> Insertion of new data, to validate search bar disappearing or not!. ]**************************************************** ");
	   reportLog("*****[ Test 10--> Insertion of new data, to validate search bar disappearing or not!. ]******** ");
	   
	   System.out.println("[Test 10 steps 'STARTS'] ");
	   Reporter.log("[Test 10 steps 'STARTS'] ");
	   reportLog("[Test 10 steps 'STARTS'] ");
	   
      //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
       System.out.println("01.Clicked on 'Insert' button to add new Record");
       Reporter.log("01.Clicked on 'Insert' button to add new Record");
       reportLog("01.Clicked on 'Insert' button to add new Record");
       
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet10=sheet.getRow(16).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet10);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField10=sheet.getRow(16).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField10);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title110 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title110.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data10=sheet.getRow(16).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data10);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);
	    
     
	  //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo10 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData10=sheet.getRow(16).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData10);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);
  
      //Inspection and clicking of "Ident Code"   	    
  	WebDriverWait identCodeList10 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData10=sheet.getRow(16).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData10);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action10 = new Actions(driver); 
	    WebElement  element10 = driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[23]"));
	    action10.moveToElement(element10).click().perform();
	    Thread.sleep(2000);
		    
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty522 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty522.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData522= sheet.getRow(16).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act522 =  new Actions(driver);
        act522.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData522).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty10 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    base.commonPOQtyBackSpace(driver);
//      Thread.sleep(2000);
//		String poQtyData10= sheet.getRow(16).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData10);
//	    System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	    
			    
	    base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		Thread.sleep(2000);
		
			    
//Inserting child data, to validate search bar disappearing or not!.
		//Inspection and clicking of "Insert" Button for Child grid under PO Screen
		WebDriverWait insertChildSymboleReport10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertChildSymboleReport10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	    System.out.println("12.Clicked on 'Insert' button to add new CHILD Record");
	    Reporter.log("12.Clicked on 'Insert' button to add new CHILD Record");
	    reportLog("12.Clicked on 'Insert' button to add new CHILD Record");
	    Thread.sleep(2000);		    
	    
	    //Inspection and clicking of "Discipline Code"   	    
	    WebDriverWait disciplineCodeDropdownReport10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    disciplineCodeDropdownReport10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	    Thread.sleep(2000);
	    
	    //Inspection and clicking of particular "Discipline Code"    	    
	    WebDriverWait disciplineCodeDropdownPipingReport10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    disciplineCodeDropdownPipingReport10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
	    System.out.println("13.Choosing 'Displine code' ");
	    Reporter.log("13.Choosing 'Displine code' ");
	    reportLog("13.Choosing 'Displine code' ");
	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo51Report10 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo51Report10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData51Report10=sheet.getRow(17).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData51Report10);
		System.out.println("14.Inserting 'Item No.' field ");
		Reporter.log("14.Inserting 'Item No.' field ");
		reportLog("14.Inserting 'Item No.' field ");
		Thread.sleep(2000);
  
      //Inspection and clicking of "Ident Code"   	    
  	WebDriverWait identCodeList51Report10 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList51Report10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData51Report10=sheet.getRow(17).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData51Report10);
	    System.out.println("15.Selecting 'Ident Code' field ");
	    Reporter.log("15.Selecting 'Ident Code' field ");
	    reportLog("15.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action51Report10 = new Actions(driver); 
	    WebElement  element51Report10= driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[23]"));
	                                                             // /html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div/div
	    action51Report10.moveToElement(element51Report10).click().perform();
	    Thread.sleep(2000);
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData52= sheet.getRow(17).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act52 =  new Actions(driver);
        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty51Report10 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty51Report10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    base.commonPOQtyBackSpace(driver);
//        Thread.sleep(2000);
//		String poQtyData51Report10= sheet.getRow(17).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData51Report10);
//	    System.out.println("16.Inserting 'PO Qty.' field ");
//	    Reporter.log("16.Inserting 'PO Qty.' field ");
//	    reportLog("16.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	    
			    
	    base.commonSAVEbuttonCHILD(driver);
		System.out.println("17.Cliking on 'SAVE' button ");
		Reporter.log("17.Cliking on 'SAVE' button ");
		reportLog("17.Cliking on 'SAVE' button ");
		Thread.sleep(2000);
		
		// Clicking on Edit button to validate search bar disappearence 
		WebDriverWait disappearSearchBars10 = new WebDriverWait(driver, Duration.ofMillis(8000));
		disappearSearchBars10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[1]/span")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[1]/span")).click();
	    Thread.sleep(4000);
	    
	 // Clicking on Edit button to validating search bar disappearing or not! 
		WebDriverWait undoChnages10 = new WebDriverWait(driver, Duration.ofMillis(8000));
		undoChnages10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[2]/span")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[2]/span")).click();
	    System.out.println("18. Clicking on Edit button to validating search bar disappearing or not ");
	    Reporter.log("18.Clicking on Edit button to validating search bar disappearing or not ");
	    reportLog("18.Clicking on Edit button to validating search bar disappearing or not ");
	    Thread.sleep(1000);
	    
      // To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonChilddTest10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChilddTest10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[3]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[3]")).click();
	    System.out.println("19.Clicking on Delete button of 'Child' grid ");
	    Reporter.log("19.Clicking on Delete button of 'Child' grid ");
	    reportLog("19.Clicking on Delete button of 'Child' grid ");
	    Thread.sleep(2000);
	 
     //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmmTest10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmmTest10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
	    System.out.println("20.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Reporter.log("20.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    reportLog("20.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    
	  //Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonChildddTest10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildddTest10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("21.Clicking on Delete button of 'Child' grid ");
	    Reporter.log("21.Clicking on Delete button of 'Child' grid ");
	    reportLog("21.Clicking on Delete button of 'Child' grid ");
	    Thread.sleep(2000);
	 
     //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmmmTest10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmmmTest10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
	    System.out.println("22.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Reporter.log("22.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    reportLog("22.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    
	    //Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("23.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("23.Clicking on Delete button of 'Parent' grid ");
	    reportLog("23.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
     //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest10 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
	    System.out.println("24.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("24.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("24.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    
        System.out.println("[Test 10 steps 'ENDS'] ");
	    Reporter.log("[Test 10 steps 'ENDS'] ");
	    reportLog("[Test 10 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 10--> 'Insertion of new data, to validate search bar disappearing or not!' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 10--> 'Insertion of new data, to validate search bar disappearing or not!' is ''PASSED'' ]************************************ ");
	    reportLog("******[ Test 10--> 'Insertion of new data, to validate search bar disappearing or not!' is ''PASSED'' ]****** ");
	    Reporter.log(" ");
	    System.out.println(" ");
	    Reporter.log(" ");
        System.out.println(" ");
	    Reporter.log(" ");
	   
	    Assert.assertTrue(true);
  		test.log(LogStatus.PASS, "Test 10 - Insertion of new data, to validate search bar disappearing or not! is PASSED");
	    
} 



@Test(priority=11)
public void Test11() throws EncryptedDocumentException, InterruptedException, IOException
{
     	File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 
	   
	   test=extent.startTest("Test 11 - Insertion of new data, to validate search bar disappearing or not! ");
             
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
         driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");
         
        	
         CSMBase base=new CSMBase();
        
 	      //starts PO3
          System.out.println(" ");
          Reporter.log(" ");
		   System.out.println("************************************[ Test 11--> To validate NULL data validation(Validation is 'Discipline code is required') by inserting 'NULL' data inside 'Discipline code' field ]**************************************************** ");
		   Reporter.log("************************************[ Test 11--> To validate NULL data validation(Validation is 'Discipline code is required') by inserting 'NULL' data inside 'Discipline code' field ]**************************************************** ");
		   reportLog("******[ Test 11--> To validate NULL data validation(Validation is 'Discipline code is required') by inserting 'NULL' data inside 'Discipline code' field ]****** ");
		   
		   
		    System.out.println("[Test 11 steps 'STARTS'] ");
		    Reporter.log("[Test 11 steps 'STARTS'] ");
		    reportLog("[Test 11 steps 'STARTS'] ");
		   
           //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
		    WebDriverWait insertSymbole1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    insertSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
	         System.out.println("01.Clicked on 'Insert' button to add new Record");
	         Reporter.log("01.Clicked on 'Insert' button to add new Record");
	         reportLog("01.Clicked on 'Insert' button to add new Record");

			
		    //Inspection and clicking of "PO No." field   	    
		    WebDriverWait poNoField1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    poNoField1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		    String poNoFieldSheet1=sheet.getRow(18).getCell(2).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet1);
		    System.out.println("02.Inserting 'PO No.' field ");
		    Reporter.log("02.Inserting 'PO No.' field ");
		    reportLog("02.Inserting 'PO No.' field ");

    
		    //Inspection and clicking of "Company Code" field   	    
		    WebDriverWait companyCodeFieldOptions1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    companyCodeFieldOptions1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
		    String companyCodeField1=sheet.getRow(18).getCell(15).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField1);
		    System.out.println("03.Choosing 'Company code' field ");
		    Reporter.log("03.Choosing 'Company code' field ");
		    reportLog("03.Choosing 'Company code' field ");
		    
		     
		    base.commonCompanyCodeField(driver);
    	 
		    base.commonElementPODate(driver);
		    
		  //Inspection and clicking of "Title1" field   	    
		    WebDriverWait title101 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    title101.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
		    String title1Data01=sheet.getRow(18).getCell(12).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data01);
		    System.out.println("04.Inserting 'Title1' field ");
		    Reporter.log("04.Inserting 'Title1' field ");
		    reportLog("04.Inserting 'Title1' field ");
		    Thread.sleep(2000);
		    
		    base.commonSAVEbutton(driver);
		    System.out.println("05.Cliking on 'SAVE' button ");
		    Reporter.log("05.Cliking on 'SAVE' button ");
		    reportLog("05.Cliking on 'SAVE' button ");
		    Thread.sleep(3000);

		       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
		  		WebDriverWait insertChildSymbole1= new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    insertChildSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
		  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Thread.sleep(2000);		    
		  	    
		  	   
		    
			//Inspection and clicking of "Item No"   	    
			WebDriverWait itemNo1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			itemNo1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
			String itemNoData1=sheet.getRow(18).getCell(4).getStringCellValue();
			driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData1);
			System.out.println("08.Inserting 'Item No.' field ");
			Reporter.log("08.Inserting 'Item No.' field ");
			reportLog("08.Inserting 'Item No.' field ");
			Thread.sleep(2000);
	  
	      //Inspection and clicking of "Ident Code"   	    
	  	    WebDriverWait identCodeList1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			identCodeList1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
		    String identCodeData1=sheet.getRow(18).getCell(5).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData1);
		    System.out.println("09.Selecting 'Ident Code' field ");
		    Reporter.log("09.Selecting 'Ident Code' field ");
		    reportLog("09.Selecting 'Ident Code' field ");
		    Thread.sleep(2000);
		    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
		    Actions action1 = new Actions(driver); 
		    WebElement  element1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
		    action1.moveToElement(element1).click().perform();
		    Thread.sleep(2000);
			    
		  //Inspection and clicking of "PO Qty."
		    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
		    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
	        String poQtyData52= sheet.getRow(18).getCell(9).getStringCellValue();
		    base.commonPOQtyBackSpace(driver);
	        Actions act52 =  new Actions(driver);
	        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
	        System.out.println("10.Inserting 'PO Qty.' field ");
		    Reporter.log("10.Inserting 'PO Qty.' field ");
		    reportLog("10.Inserting 'PO Qty.' field ");
		    Thread.sleep(1000);
		    
//		    //Inspection and clicking of "PO Qty."
//		    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//		    base.commonPOQtyBackSpace(driver);
//	        Thread.sleep(2000);
//			String poQtyData1= sheet.getRow(18).getCell(9).getStringCellValue();
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData1);
//		    System.out.println("10.Inserting 'PO Qty.' field ");
//		    Reporter.log("10.Inserting 'PO Qty.' field ");
//		    reportLog("10.Inserting 'PO Qty.' field ");
//		    Thread.sleep(2000);
		    
		    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown1 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    System.out.println("11.Choosing 'Displine code'as NULL data");
      	    Reporter.log("11.Choosing 'Displine code'as NULL data");
	  	    reportLog("11.Choosing 'Displine code'as NULL data");
	  	    Thread.sleep(2000);
	  	    
            base.commonSAVEbuttonCHILD(driver);
            
           //Inspection and clicking inside "Discipline Code" to show NULL value validation  
            WebDriverWait disciplineCodeDropdownPiping1 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div[1]/div/div[1]/div/input")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div[1]/div/div[1]/div/input")).click();
	  	    
	  	   base.commonSAVEbuttonCHILD(driver);
	  	   Thread.sleep(4000); 
	  	   
			System.out.println("12.Cliking on 'SAVE' button ");
			Reporter.log("12.Cliking on 'SAVE' button ");
			reportLog("12.Cliking on 'SAVE' button ");
			Thread.sleep(6000);
			
            // To perform DELETE Operation
		    //Inspection and clicking of "Delete" button of Parent grid
		    WebDriverWait deleteButtonParentTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
		    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
		    System.out.println("13.Clicking on Delete button of 'Parent' grid ");
		    Reporter.log("13.Clicking on Delete button of 'Parent' grid ");
		    reportLog("13.Clicking on Delete button of 'Parent' grid ");
		    Thread.sleep(2000);
		 
	   //Inspection and clicking of "Yes" button under delete button(Confirmation)
		    WebDriverWait deleteButtonParentConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
		    driver.findElement(By.xpath("//span[text()='Yes']")).click();
		    System.out.println("14.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Reporter.log("14.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    reportLog("14.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Thread.sleep(2000);

		    System.out.println("[Test 11 steps 'ENDS'] ");
		    Reporter.log("[Test 11 steps 'ENDS'] ");
		    reportLog("[Test 11 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 11--> 'To validate NULL data validation(Validation is 'Discipline code is required') by inserting 'NULL' data inside 'Discipline code' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 11--> 'To validate NULL data validation(Validation is 'Discipline code is required') by inserting 'NULL' data inside 'Discipline code' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 11--> 'To validate NULL data validation(Validation is 'Discipline code is required') by inserting 'NULL' data inside 'Discipline code' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
          //ends PO3
          
        Assert.assertTrue(true);
  		test.log(LogStatus.PASS, "Test 11 - To validate NULL data validation(Validation is 'Discipline code is required') by inserting 'NULL' data inside 'Discipline code' field is PASSED");
 		    		    
}

@Test(priority=12)
public void Test12() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 

	   test=extent.startTest("Test 12 - Inserting Non exsisting data inside 'Discipline code' field ");
         
         
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
         driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");
         
        	
         CSMBase base=new CSMBase();
         
          //starts PO3
          System.out.println(" ");
          Reporter.log(" ");
		   System.out.println("************************************[ Test 12--> Inserting Non exsisting data inside 'Discipline code' field ]**************************************************** ");
		   Reporter.log("************************************[ Test 12--> Inserting Non exsisting data inside 'Discipline code' field ]**************************************************** ");
		   reportLog("******[ Test 12--> Inserting Non exsisting data inside 'Discipline code' field ]****** ");
		   
		   
		    System.out.println("[Test 12 steps 'STARTS'] ");
		    Reporter.log("[Test 12 steps 'STARTS'] ");
		    reportLog("[Test 12 steps 'STARTS'] ");
		   
           //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
		    WebDriverWait insertSymbole1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    insertSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
	         System.out.println("01.Clicked on 'Insert' button to add new Record");
	         Reporter.log("01.Clicked on 'Insert' button to add new Record");
	         reportLog("01.Clicked on 'Insert' button to add new Record");

			
		    //Inspection and clicking of "PO No." field   	    
		    WebDriverWait poNoField1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    poNoField1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		    String poNoFieldSheet1=sheet.getRow(19).getCell(2).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet1);
		    System.out.println("02.Inserting 'PO No.' field ");
		    Reporter.log("02.Inserting 'PO No.' field ");
		    reportLog("02.Inserting 'PO No.' field ");

           //Inspection and clicking of "Company Code" field   	    
		    WebDriverWait companyCodeFieldOptions1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    companyCodeFieldOptions1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
		    String companyCodeField1=sheet.getRow(19).getCell(15).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField1);
		    System.out.println("03.Choosing 'Company code' field ");
		    Reporter.log("03.Choosing 'Company code' field ");
		    reportLog("03.Choosing 'Company code' field ");
		    
           base.commonCompanyCodeField(driver);
    	 
		    base.commonElementPODate(driver);
		    
		  //Inspection and clicking of "Title1" field   	    
		    WebDriverWait title101 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    title101.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
		    String title1Data01=sheet.getRow(19).getCell(12).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data01);
		    System.out.println("04.Inserting 'Title1' field ");
		    Reporter.log("04.Inserting 'Title1' field ");
		    reportLog("04.Inserting 'Title1' field ");
		    Thread.sleep(2000);
		    
		    base.commonSAVEbutton(driver);
		    System.out.println("05.Cliking on 'SAVE' button ");
		    Reporter.log("05.Cliking on 'SAVE' button ");
		    reportLog("05.Cliking on 'SAVE' button ");
		    Thread.sleep(3000);

		       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
		  		WebDriverWait insertChildSymbole1= new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    insertChildSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
		  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Thread.sleep(2000);		    
		  	    
		  	   
		    
			//Inspection and clicking of "Item No"   	    
			WebDriverWait itemNo1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			itemNo1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
			String itemNoData1=sheet.getRow(19).getCell(4).getStringCellValue();
			driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData1);
			System.out.println("07.Inserting 'Item No.' field ");
			Reporter.log("07.Inserting 'Item No.' field ");
			reportLog("07.Inserting 'Item No.' field ");
			Thread.sleep(2000);
	  
	      //Inspection and clicking of "Ident Code"   	    
	  	    WebDriverWait identCodeList1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			identCodeList1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
		    String identCodeData1=sheet.getRow(19).getCell(5).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData1);
		    System.out.println("08.Selecting 'Ident Code' field ");
		    Reporter.log("08.Selecting 'Ident Code' field ");
		    reportLog("08.Selecting 'Ident Code' field ");
		    Thread.sleep(2000);
		    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
		    Actions action1 = new Actions(driver); 
		    WebElement  element1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
		    action1.moveToElement(element1).click().perform();
		    Thread.sleep(2000);
			   
		  //Inspection and clicking of "PO Qty."
		    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
		    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
	        String poQtyData52= sheet.getRow(19).getCell(9).getStringCellValue();
		    base.commonPOQtyBackSpace(driver);
	        Actions act52 =  new Actions(driver);
	        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
	        System.out.println("10.Inserting 'PO Qty.' field ");
		    Reporter.log("10.Inserting 'PO Qty.' field ");
		    reportLog("10.Inserting 'PO Qty.' field ");
		    Thread.sleep(1000);
		    
//		    //Inspection and clicking of "PO Qty."
//		    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//		    base.commonPOQtyBackSpace(driver);
//	        Thread.sleep(2000);
//			String poQtyData1= sheet.getRow(19).getCell(9).getStringCellValue();
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData1);
//		    System.out.println("09.Inserting 'PO Qty.' field ");
//		    Reporter.log("09.Inserting 'PO Qty.' field ");
//		    reportLog("09.Inserting 'PO Qty.' field ");
//		    Thread.sleep(2000);
		    
		    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown1 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    System.out.println("10.Clicking 'Discipline Code' field dropdown ");
		    Reporter.log("10.Clicking 'Discipline Code' field dropdown ");
		    reportLog("10.Clicking 'Discipline Code' field dropdown ");
            Thread.sleep(2000);
	  	    
    	   //Inspection and clicking of "Item No"   	    
			WebDriverWait disciplineCodeDropdownPiping1A = new WebDriverWait(driver, Duration.ofMillis(8000));
			disciplineCodeDropdownPiping1A.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div[1]/div/div[1]/div/input")));
			String disciplineCodeDropdownPiping1AA=sheet.getRow(19).getCell(3).getStringCellValue();
			driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div[1]/div/div[1]/div/input")).click();
			driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div[1]/div/div[1]/div/input")).sendKeys(disciplineCodeDropdownPiping1AA);
			System.out.println("11.Choosing 'Displine code'as Non exsisting data");
			Reporter.log("11.Choosing 'Displine code'as Non exsisting data");
			reportLog("11.Choosing 'Displine code'as Non exsisting data");
			Thread.sleep(7000);
	  	    
	  	   base.commonSAVEbuttonCHILD(driver);
	  	   Thread.sleep(4000); 
	  	   
			System.out.println("12.Cliking on 'SAVE' button ");
			Reporter.log("12.Cliking on 'SAVE' button ");
			reportLog("12.Cliking on 'SAVE' button ");
			Thread.sleep(6000);
			
            // To perform DELETE Operation
		    //Inspection and clicking of "Delete" button of Parent grid
		    WebDriverWait deleteButtonParentTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
		    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
		    System.out.println("13.Clicking on Delete button of 'Parent' grid ");
		    Reporter.log("13.Clicking on Delete button of 'Parent' grid ");
		    reportLog("13.Clicking on Delete button of 'Parent' grid ");
		    Thread.sleep(2000);
		 
	   //Inspection and clicking of "Yes" button under delete button(Confirmation)
		    WebDriverWait deleteButtonParentConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
		    driver.findElement(By.xpath("//span[text()='Yes']")).click();
		    System.out.println("14.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Reporter.log("14.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    reportLog("14.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Thread.sleep(2000);

		    System.out.println("[Test 12 steps 'ENDS'] ");
		    Reporter.log("[Test 12 steps 'ENDS'] ");
		    reportLog("[Test 12 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 12--> 'Inserting Non exsisting data inside 'Discipline code' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 12--> 'Inserting Non exsisting data inside 'Discipline code' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 12--> 'Inserting Non exsisting data inside 'Discipline code' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
          //ends PO3
          
        Assert.assertTrue(true);
  		test.log(LogStatus.PASS, "Test 12 - Inserting Non exsisting data inside 'Discipline code' field is PASSED");
 		    		    
}

@Test(priority=13)
public void Test13() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 

	   test=extent.startTest("Test 13 - Inserting NULL data inside 'PO Qty' field  ");
       
       
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
       driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");
       
      	
       CSMBase base=new CSMBase();
       
        
        //starts PO3
        System.out.println(" ");
        Reporter.log(" ");
		   System.out.println("************************************[ Test 13--> Inserting NULL data inside 'PO Qty' field  ]**************************************************** ");
		   Reporter.log("************************************[ Test 13--> Inserting NULL data inside 'PO Qty' field  ]**************************************************** ");
		   reportLog("******[ Test 13--> Inserting NULL data inside 'PO Qty' field  ]****** ");
		   
		   
		    System.out.println("[Test 13 steps 'STARTS'] ");
		    Reporter.log("[Test 13 steps 'STARTS'] ");
		    reportLog("[Test 13 steps 'STARTS'] ");
		   
         //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
		    WebDriverWait insertSymbole1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    insertSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
	         System.out.println("01.Clicked on 'Insert' button to add new Record");
	         Reporter.log("01.Clicked on 'Insert' button to add new Record");
	         reportLog("01.Clicked on 'Insert' button to add new Record");

           //Inspection and clicking of "PO No." field   	    
		    WebDriverWait poNoField1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    poNoField1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		    String poNoFieldSheet1=sheet.getRow(20).getCell(2).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet1);
		    System.out.println("02.Inserting 'PO No.' field ");
		    Reporter.log("02.Inserting 'PO No.' field ");
		    reportLog("02.Inserting 'PO No.' field ");

           //Inspection and clicking of "Company Code" field   	    
		    WebDriverWait companyCodeFieldOptions1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    companyCodeFieldOptions1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
		    String companyCodeField1=sheet.getRow(20).getCell(15).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField1);
		    System.out.println("03.Choosing 'Company code' field ");
		    Reporter.log("03.Choosing 'Company code' field ");
		    reportLog("03.Choosing 'Company code' field ");
		    
		     
		    base.commonCompanyCodeField(driver);
  	 
		    base.commonElementPODate(driver);
		    
		  //Inspection and clicking of "Title1" field   	    
		    WebDriverWait title101 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    title101.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
		    String title1Data01=sheet.getRow(20).getCell(12).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data01);
		    System.out.println("04.Inserting 'Title1' field ");
		    Reporter.log("04.Inserting 'Title1' field ");
		    reportLog("04.Inserting 'Title1' field ");
		    Thread.sleep(2000);
		    
		    base.commonSAVEbutton(driver);
		    System.out.println("05.Cliking on 'SAVE' button ");
		    Reporter.log("05.Cliking on 'SAVE' button ");
		    reportLog("05.Cliking on 'SAVE' button ");
		    Thread.sleep(3000);

		       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
		  		WebDriverWait insertChildSymbole1= new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    insertChildSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
		  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Thread.sleep(2000);		    
		  	    
		  	   
		  	  //Inspection and clicking of "Discipline Code"   	    
		  	    WebDriverWait disciplineCodeDropdown1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    disciplineCodeDropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
		  	    Thread.sleep(2000);
		  	    
		  	    //Inspection and clicking of particular "Discipline Code"    	    
		  	    WebDriverWait disciplineCodeDropdownPiping1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    disciplineCodeDropdownPiping1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
		  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
		  	    System.out.println("07.Choosing 'Displine code' ");
		  	    Reporter.log("07.Choosing 'Displine code' ");
		  	    reportLog("07.Choosing 'Displine code' ");
		  	    Thread.sleep(2000);
		  	    
		  	    
		    
			//Inspection and clicking of "Item No"   	    
			WebDriverWait itemNo1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			itemNo1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
			String itemNoData1=sheet.getRow(20).getCell(4).getStringCellValue();
			driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData1);
			System.out.println("08.Inserting 'Item No.' field ");
			Reporter.log("08.Inserting 'Item No.' field ");
			reportLog("08.Inserting 'Item No.' field ");
			Thread.sleep(2000);
	  
	      //Inspection and clicking of "Ident Code"   	    
	  	    WebDriverWait identCodeList1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			identCodeList1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
		    String identCodeData1=sheet.getRow(20).getCell(5).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData1);
		    System.out.println("09.Selecting 'Ident Code' field ");
		    Reporter.log("09.Selecting 'Ident Code' field ");
		    reportLog("09.Selecting 'Ident Code' field ");
		    Thread.sleep(2000);
		    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
		    Actions action1 = new Actions(driver); 
		    WebElement  element1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
		    action1.moveToElement(element1).click().perform();
		    Thread.sleep(2000);
			    
		  //Inspection and clicking of "PO Qty."
		    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
		    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
	        String poQtyData52= sheet.getRow(20).getCell(9).getStringCellValue();
		    base.commonPOQtyBackSpace(driver);
	        Actions act52 =  new Actions(driver);
	        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
	        System.out.println("10.Inserting 'PO Qty.' field ");
		    Reporter.log("10.Inserting 'PO Qty.' field ");
		    reportLog("10.Inserting 'PO Qty.' field ");
		    Thread.sleep(1000);
		    
//		    //Inspection and clicking of "PO Qty."
//		    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//		    base.commonPOQtyBackSpace(driver);
//	        Thread.sleep(2000);
//			String poQtyData1= sheet.getRow(20).getCell(9).getStringCellValue();
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData1);
//		    System.out.println("10.Inserting 'PO Qty.' field ");
//		    Reporter.log("10.Inserting 'PO Qty.' field ");
//		    reportLog("10.Inserting 'PO Qty.' field ");
//		    Thread.sleep(2000);
		    
		    
            base.commonSAVEbuttonCHILD(driver);
	  	   Thread.sleep(4000); 
	  	   
			System.out.println("11.Cliking on 'SAVE' button ");
			Reporter.log("11.Cliking on 'SAVE' button ");
			reportLog("11.Cliking on 'SAVE' button ");
			Thread.sleep(6000);
			
          // To perform DELETE Operation
		    //Inspection and clicking of "Delete" button of Parent grid
		    WebDriverWait deleteButtonParentTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
		    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
		    System.out.println("12.Clicking on Delete button of 'Parent' grid ");
		    Reporter.log("12.Clicking on Delete button of 'Parent' grid ");
		    reportLog("12.Clicking on Delete button of 'Parent' grid ");
		    Thread.sleep(2000);
		 
	   //Inspection and clicking of "Yes" button under delete button(Confirmation)
		    WebDriverWait deleteButtonParentConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
		    driver.findElement(By.xpath("//span[text()='Yes']")).click();
		    System.out.println("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Reporter.log("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    reportLog("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Thread.sleep(2000);

		    System.out.println("[Test 13 steps 'ENDS'] ");
		    Reporter.log("[Test 13 steps 'ENDS'] ");
		    reportLog("[Test 13 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 13--> 'Inserting NULL data inside 'PO Qty' field ' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 13--> 'Inserting NULL data inside 'PO Qty' field ' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 13--> 'Inserting NULL data inside 'PO Qty' field ' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
        //ends PO3
        
      Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 13 - Inserting NULL data inside 'PO Qty' field  is PASSED");
		    		    
}

@Test(priority=14)
public void Test14() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 

	   test=extent.startTest("Test 14 - Inserting ALPHABETICAL data inside 'PO Qty' field ");
     
     
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
     driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");
     
    	
     CSMBase base=new CSMBase();
     
      //starts PO3
      System.out.println(" ");
      Reporter.log(" ");
		   System.out.println("************************************[ Test 14--> Inserting ALPHABETICAL data inside 'PO Qty' field ]**************************************************** ");
		   Reporter.log("************************************[ Test 14--> Inserting ALPHABETICAL data inside 'PO Qty' field ]**************************************************** ");
		   reportLog("******[ Test 14--> Inserting ALPHABETICAL data inside 'PO Qty' field ]****** ");
		   
		   
		    System.out.println("[Test 14 steps 'STARTS'] ");
		    Reporter.log("[Test 14 steps 'STARTS'] ");
		    reportLog("[Test 14 steps 'STARTS'] ");
		   
       //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
		    WebDriverWait insertSymbole1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    insertSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
	         System.out.println("01.Clicked on 'Insert' button to add new Record");
	         Reporter.log("01.Clicked on 'Insert' button to add new Record");
	         reportLog("01.Clicked on 'Insert' button to add new Record");

         //Inspection and clicking of "PO No." field   	    
		    WebDriverWait poNoField1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    poNoField1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		    String poNoFieldSheet1=sheet.getRow(21).getCell(2).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet1);
		    System.out.println("02.Inserting 'PO No.' field ");
		    Reporter.log("02.Inserting 'PO No.' field ");
		    reportLog("02.Inserting 'PO No.' field ");

         //Inspection and clicking of "Company Code" field   	    
		    WebDriverWait companyCodeFieldOptions1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    companyCodeFieldOptions1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
		    String companyCodeField1=sheet.getRow(21).getCell(15).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField1);
		    System.out.println("03.Choosing 'Company code' field ");
		    Reporter.log("03.Choosing 'Company code' field ");
		    reportLog("03.Choosing 'Company code' field ");
		    
		     
		    base.commonCompanyCodeField(driver);
	 
		    base.commonElementPODate(driver);
		    
		  //Inspection and clicking of "Title1" field   	    
		    WebDriverWait title101 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    title101.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
		    String title1Data01=sheet.getRow(21).getCell(12).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data01);
		    System.out.println("04.Inserting 'Title1' field ");
		    Reporter.log("04.Inserting 'Title1' field ");
		    reportLog("04.Inserting 'Title1' field ");
		    Thread.sleep(2000);
		    
		    base.commonSAVEbutton(driver);
		    System.out.println("05.Cliking on 'SAVE' button ");
		    Reporter.log("05.Cliking on 'SAVE' button ");
		    reportLog("05.Cliking on 'SAVE' button ");
		    Thread.sleep(3000);

		       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
		  		WebDriverWait insertChildSymbole1= new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    insertChildSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
		  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Thread.sleep(2000);		    
		  	    
		  	   
		  	  //Inspection and clicking of "Discipline Code"   	    
		  	    WebDriverWait disciplineCodeDropdown1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    disciplineCodeDropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
		  	    Thread.sleep(2000);
		  	    
		  	    //Inspection and clicking of particular "Discipline Code"    	    
		  	    WebDriverWait disciplineCodeDropdownPiping1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    disciplineCodeDropdownPiping1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
		  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
		  	    System.out.println("07.Choosing 'Displine code' ");
		  	    Reporter.log("07.Choosing 'Displine code' ");
		  	    reportLog("07.Choosing 'Displine code' ");
		  	    Thread.sleep(2000);
		  	    
		  	    
		    
			//Inspection and clicking of "Item No"   	    
			WebDriverWait itemNo1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			itemNo1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
			String itemNoData1=sheet.getRow(21).getCell(4).getStringCellValue();
			driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData1);
			System.out.println("08.Inserting 'Item No.' field ");
			Reporter.log("08.Inserting 'Item No.' field ");
			reportLog("08.Inserting 'Item No.' field ");
			Thread.sleep(2000);
	  
	      //Inspection and clicking of "Ident Code"   	    
	  	    WebDriverWait identCodeList1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			identCodeList1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
		    String identCodeData1=sheet.getRow(21).getCell(5).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData1);
		    System.out.println("09.Selecting 'Ident Code' field ");
		    Reporter.log("09.Selecting 'Ident Code' field ");
		    reportLog("09.Selecting 'Ident Code' field ");
		    Thread.sleep(2000);
		    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
		    Actions action1 = new Actions(driver); 
		    WebElement  element1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
		    action1.moveToElement(element1).click().perform();
		    Thread.sleep(2000);
			    
		  //Inspection and clicking of "PO Qty."
		    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
		    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
	        String poQtyData52= sheet.getRow(21).getCell(9).getStringCellValue();
		    base.commonPOQtyBackSpace(driver);
	        Actions act52 =  new Actions(driver);
	        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
	        System.out.println("10.Inserting 'PO Qty.' field ");
		    Reporter.log("10.Inserting 'PO Qty.' field ");
		    reportLog("10.Inserting 'PO Qty.' field ");
		    Thread.sleep(1000);
		    
//		    //Inspection and clicking of "PO Qty."
//		    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//		    base.commonPOQtyBackSpace(driver);
//	        Thread.sleep(2000);
//			String poQtyData1= sheet.getRow(21).getCell(9).getStringCellValue();
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData1);
//		    System.out.println("10.Inserting 'PO Qty.' field ");
//		    Reporter.log("10.Inserting 'PO Qty.' field ");
//		    reportLog("10.Inserting 'PO Qty.' field ");
//		    Thread.sleep(2000);
		    
		    
           base.commonSAVEbuttonCHILD(driver);
	  	   Thread.sleep(4000); 
	  	   
			System.out.println("11.Cliking on 'SAVE' button ");
			Reporter.log("11.Cliking on 'SAVE' button ");
			reportLog("11.Cliking on 'SAVE' button ");
			Thread.sleep(6000);
			
        // To perform DELETE Operation
		    //Inspection and clicking of "Delete" button of Parent grid
		    WebDriverWait deleteButtonParentTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
		    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
		    System.out.println("12.Clicking on Delete button of 'Parent' grid ");
		    Reporter.log("12.Clicking on Delete button of 'Parent' grid ");
		    reportLog("12.Clicking on Delete button of 'Parent' grid ");
		    Thread.sleep(2000);
		 
	   //Inspection and clicking of "Yes" button under delete button(Confirmation)
		    WebDriverWait deleteButtonParentConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
		    driver.findElement(By.xpath("//span[text()='Yes']")).click();
		    System.out.println("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Reporter.log("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    reportLog("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Thread.sleep(2000);

		    System.out.println("[Test 14 steps 'ENDS'] ");
		    Reporter.log("[Test 14 steps 'ENDS'] ");
		    reportLog("[Test 14 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 14--> 'Inserting ALPHABETICAL data inside 'PO Qty' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 14--> 'Inserting ALPHABETICAL data inside 'PO Qty' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 14--> 'Inserting ALPHABETICAL data inside 'PO Qty' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
      //ends PO3
      
    Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 14 - Insertion of new data PASSED");
		    		    
}

@Test(priority=15)
public void Test15() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 

	   test=extent.startTest("Test 15 - Inserting NVARCHAR data inside 'PO Qty' field ");
   
   
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
   driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");
   
  	
   CSMBase base=new CSMBase();
    
    //starts PO3
    System.out.println(" ");
    Reporter.log(" ");
		   System.out.println("************************************[ Test 15--> Inserting NVARCHAR data inside 'PO Qty' field ]**************************************************** ");
		   Reporter.log("************************************[ Test 15--> Inserting NVARCHAR data inside 'PO Qty' field ]**************************************************** ");
		   reportLog("******[ Test 15--> Inserting NVARCHAR data inside 'PO Qty' field ]****** ");
		   
		   
		    System.out.println("[Test 15 steps 'STARTS'] ");
		    Reporter.log("[Test 15 steps 'STARTS'] ");
		    reportLog("[Test 15 steps 'STARTS'] ");
		   
     //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
		    WebDriverWait insertSymbole1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    insertSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
	         System.out.println("01.Clicked on 'Insert' button to add new Record");
	         Reporter.log("01.Clicked on 'Insert' button to add new Record");
	         reportLog("01.Clicked on 'Insert' button to add new Record");

       //Inspection and clicking of "PO No." field   	    
		    WebDriverWait poNoField1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    poNoField1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		    String poNoFieldSheet1=sheet.getRow(22).getCell(2).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet1);
		    System.out.println("02.Inserting 'PO No.' field ");
		    Reporter.log("02.Inserting 'PO No.' field ");
		    reportLog("02.Inserting 'PO No.' field ");

       //Inspection and clicking of "Company Code" field   	    
		    WebDriverWait companyCodeFieldOptions1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    companyCodeFieldOptions1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
		    String companyCodeField1=sheet.getRow(22).getCell(15).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField1);
		    System.out.println("03.Choosing 'Company code' field ");
		    Reporter.log("03.Choosing 'Company code' field ");
		    reportLog("03.Choosing 'Company code' field ");
		    
		     
		    base.commonCompanyCodeField(driver);
	 
		    base.commonElementPODate(driver);
		    
		  //Inspection and clicking of "Title1" field   	    
		    WebDriverWait title101 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    title101.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
		    String title1Data01=sheet.getRow(22).getCell(12).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data01);
		    System.out.println("04.Inserting 'Title1' field ");
		    Reporter.log("04.Inserting 'Title1' field ");
		    reportLog("04.Inserting 'Title1' field ");
		    Thread.sleep(2000);
		    
		    base.commonSAVEbutton(driver);
		    System.out.println("05.Cliking on 'SAVE' button ");
		    Reporter.log("05.Cliking on 'SAVE' button ");
		    reportLog("05.Cliking on 'SAVE' button ");
		    Thread.sleep(3000);

		       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
		  		WebDriverWait insertChildSymbole1= new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    insertChildSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
		  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Thread.sleep(2000);		    
		  	    
		  	   
		  	  //Inspection and clicking of "Discipline Code"   	    
		  	    WebDriverWait disciplineCodeDropdown1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    disciplineCodeDropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
		  	    Thread.sleep(2000);
		  	    
		  	    //Inspection and clicking of particular "Discipline Code"    	    
		  	    WebDriverWait disciplineCodeDropdownPiping1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    disciplineCodeDropdownPiping1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
		  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
		  	    System.out.println("07.Choosing 'Displine code' ");
		  	    Reporter.log("07.Choosing 'Displine code' ");
		  	    reportLog("07.Choosing 'Displine code' ");
		  	    Thread.sleep(2000);
		  	    
		  	    
		    
			//Inspection and clicking of "Item No"   	    
			WebDriverWait itemNo1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			itemNo1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
			String itemNoData1=sheet.getRow(22).getCell(4).getStringCellValue();
			driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData1);
			System.out.println("08.Inserting 'Item No.' field ");
			Reporter.log("08.Inserting 'Item No.' field ");
			reportLog("08.Inserting 'Item No.' field ");
			Thread.sleep(2000);
	  
	      //Inspection and clicking of "Ident Code"   	    
	  	    WebDriverWait identCodeList1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			identCodeList1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
		    String identCodeData1=sheet.getRow(22).getCell(5).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData1);
		    System.out.println("09.Selecting 'Ident Code' field ");
		    Reporter.log("09.Selecting 'Ident Code' field ");
		    reportLog("09.Selecting 'Ident Code' field ");
		    Thread.sleep(2000);
		    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
		    Actions action1 = new Actions(driver); 
		    WebElement  element1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
		    action1.moveToElement(element1).click().perform();
		    Thread.sleep(2000);
			    
		  //Inspection and clicking of "PO Qty."
		    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
		    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
	        String poQtyData52= sheet.getRow(22).getCell(9).getStringCellValue();
		    base.commonPOQtyBackSpace(driver);
	        Actions act52 =  new Actions(driver);
	        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
	        System.out.println("10.Inserting 'PO Qty.' field ");
		    Reporter.log("10.Inserting 'PO Qty.' field ");
		    reportLog("10.Inserting 'PO Qty.' field ");
		    Thread.sleep(1000);
		    
//		    //Inspection and clicking of "PO Qty."
//		    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//		    base.commonPOQtyBackSpace(driver);
//	        Thread.sleep(2000);
//			String poQtyData1= sheet.getRow(22).getCell(9).getStringCellValue();
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData1);
//		    System.out.println("10.Inserting 'PO Qty.' field ");
//		    Reporter.log("10.Inserting 'PO Qty.' field ");
//		    reportLog("10.Inserting 'PO Qty.' field ");
//		    Thread.sleep(2000);
		    
		    
           base.commonSAVEbuttonCHILD(driver);
	  	   Thread.sleep(4000); 
	  	   
			System.out.println("11.Cliking on 'SAVE' button ");
			Reporter.log("11.Cliking on 'SAVE' button ");
			reportLog("11.Cliking on 'SAVE' button ");
			Thread.sleep(6000);
			
      // To perform DELETE Operation
			//Inspection and clicking of "Delete" button of Parent grid
		    WebDriverWait deleteButtonChildTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonChildTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
		    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
		    System.out.println("12.Clicking on Delete button of 'Parent' grid ");
		    Reporter.log("12.Clicking on Delete button of 'Parent' grid ");
		    reportLog("12.Clicking on Delete button of 'Parent' grid ");
		    Thread.sleep(2000);
		 
	   //Inspection and clicking of "Yes" button under delete button(Confirmation)
		    WebDriverWait deleteButtonChildConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonChildConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
		    driver.findElement(By.xpath("//span[text()='Yes']")).click();
		    System.out.println("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Reporter.log("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    reportLog("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Thread.sleep(2000);
			
		    //Inspection and clicking of "Delete" button of Parent grid
		    WebDriverWait deleteButtonParentTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
		    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
		    System.out.println("14.Clicking on Delete button of 'Parent' grid ");
		    Reporter.log("14.Clicking on Delete button of 'Parent' grid ");
		    reportLog("14.Clicking on Delete button of 'Parent' grid ");
		    Thread.sleep(2000);
		 
	   //Inspection and clicking of "Yes" button under delete button(Confirmation)
		    WebDriverWait deleteButtonParentConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
		    driver.findElement(By.xpath("//span[text()='Yes']")).click();
		    System.out.println("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Reporter.log("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    reportLog("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Thread.sleep(2000);

		    System.out.println("[Test 15 steps 'ENDS'] ");
		    Reporter.log("[Test 15 steps 'ENDS'] ");
		    reportLog("[Test 15 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 15--> 'Inserting NVARCHAR data inside 'PO Qty' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 15--> 'Inserting NVARCHAR data inside 'PO Qty' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 15--> 'Inserting NVARCHAR data inside 'PO Qty' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
    //ends PO3
    
  Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 15 - Inserting NVARCHAR data inside 'PO Qty' field is PASSED");
		    		    
}
@Test(priority=16)
public void Test16() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 

	   test=extent.startTest("Test 16 - Inserting MIN Length data inside 'PO Qty' field ");
 
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
 driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");
 
	
 CSMBase base=new CSMBase();
    
  //starts PO3
  System.out.println(" ");
  Reporter.log(" ");
		   System.out.println("************************************[ Test 16--> Inserting MIN Length data inside 'PO Qty' field ]**************************************************** ");
		   Reporter.log("************************************[ Test 16--> Inserting MIN Length data inside 'PO Qty' field ]**************************************************** ");
		   reportLog("******[ Test 16--> Inserting MIN Length data inside 'PO Qty' field ]****** ");
		   
		   
		    System.out.println("[Test 16 steps 'STARTS'] ");
		    Reporter.log("[Test 16 steps 'STARTS'] ");
		    reportLog("[Test 16 steps 'STARTS'] ");
		   
   //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
		    WebDriverWait insertSymbole1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    insertSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
	         System.out.println("01.Clicked on 'Insert' button to add new Record");
	         Reporter.log("01.Clicked on 'Insert' button to add new Record");
	         reportLog("01.Clicked on 'Insert' button to add new Record");

     //Inspection and clicking of "PO No." field   	    
		    WebDriverWait poNoField1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    poNoField1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		    String poNoFieldSheet1=sheet.getRow(23).getCell(2).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet1);
		    System.out.println("02.Inserting 'PO No.' field ");
		    Reporter.log("02.Inserting 'PO No.' field ");
		    reportLog("02.Inserting 'PO No.' field ");

     //Inspection and clicking of "Company Code" field   	    
		    WebDriverWait companyCodeFieldOptions1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    companyCodeFieldOptions1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
		    String companyCodeField1=sheet.getRow(23).getCell(15).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField1);
		    System.out.println("03.Choosing 'Company code' field ");
		    Reporter.log("03.Choosing 'Company code' field ");
		    reportLog("03.Choosing 'Company code' field ");
		    
		     
		    base.commonCompanyCodeField(driver);
	 
		    base.commonElementPODate(driver);
		    
		  //Inspection and clicking of "Title1" field   	    
		    WebDriverWait title101 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    title101.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
		    String title1Data01=sheet.getRow(23).getCell(12).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data01);
		    System.out.println("04.Inserting 'Title1' field ");
		    Reporter.log("04.Inserting 'Title1' field ");
		    reportLog("04.Inserting 'Title1' field ");
		    Thread.sleep(2000);
		    
		    base.commonSAVEbutton(driver);
		    System.out.println("05.Cliking on 'SAVE' button ");
		    Reporter.log("05.Cliking on 'SAVE' button ");
		    reportLog("05.Cliking on 'SAVE' button ");
		    Thread.sleep(3000);

		       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
		  		WebDriverWait insertChildSymbole1= new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    insertChildSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
		  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Thread.sleep(2000);		    
		  	    
		  	   
		  	  //Inspection and clicking of "Discipline Code"   	    
		  	    WebDriverWait disciplineCodeDropdown1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    disciplineCodeDropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
		  	    Thread.sleep(2000);
		  	    
		  	    //Inspection and clicking of particular "Discipline Code"    	    
		  	    WebDriverWait disciplineCodeDropdownPiping1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    disciplineCodeDropdownPiping1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
		  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
		  	    System.out.println("07.Choosing 'Displine code' ");
		  	    Reporter.log("07.Choosing 'Displine code' ");
		  	    reportLog("07.Choosing 'Displine code' ");
		  	    Thread.sleep(2000);
		  	    
		  	    
		    
			//Inspection and clicking of "Item No"   	    
			WebDriverWait itemNo1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			itemNo1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
			String itemNoData1=sheet.getRow(23).getCell(4).getStringCellValue();
			driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData1);
			System.out.println("08.Inserting 'Item No.' field ");
			Reporter.log("08.Inserting 'Item No.' field ");
			reportLog("08.Inserting 'Item No.' field ");
			Thread.sleep(2000);
	  
	      //Inspection and clicking of "Ident Code"   	    
	  	    WebDriverWait identCodeList1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			identCodeList1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
		    String identCodeData1=sheet.getRow(23).getCell(5).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData1);
		    System.out.println("09.Selecting 'Ident Code' field ");
		    Reporter.log("09.Selecting 'Ident Code' field ");
		    reportLog("09.Selecting 'Ident Code' field ");
		    Thread.sleep(2000);
		    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
		    Actions action1 = new Actions(driver); 
		    WebElement  element1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
		    action1.moveToElement(element1).click().perform();
		    Thread.sleep(2000);
			    
		  //Inspection and clicking of "PO Qty."
		    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
		    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
	        String poQtyData52= sheet.getRow(23).getCell(9).getStringCellValue();
		    base.commonPOQtyBackSpace(driver);
	        Actions act52 =  new Actions(driver);
	        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
	        System.out.println("10.Inserting 'PO Qty.' field ");
		    Reporter.log("10.Inserting 'PO Qty.' field ");
		    reportLog("10.Inserting 'PO Qty.' field ");
		    Thread.sleep(1000);
		    
//		    //Inspection and clicking of "PO Qty."
//		    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//            driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//            Thread.sleep(1000);
//			String poQtyData1= sheet.getRow(23).getCell(9).getStringCellValue();
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData1);
//		    System.out.println("10.Inserting 'PO Qty.' field ");
//		    Reporter.log("10.Inserting 'PO Qty.' field ");
//		    reportLog("10.Inserting 'PO Qty.' field ");
//		    Thread.sleep(1000);
		    
		    
           base.commonSAVEbuttonCHILD(driver);
	  	   Thread.sleep(2000); 
	  	   
			System.out.println("11.Cliking on 'SAVE' button ");
			Reporter.log("11.Cliking on 'SAVE' button ");
			reportLog("11.Cliking on 'SAVE' button ");
			Thread.sleep(6000);
			
    // To perform DELETE Operation
			//Inspection and clicking of "Delete" button of Parent grid
		    WebDriverWait deleteButtonChildTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonChildTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
		    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
		    System.out.println("12.Clicking on Delete button of 'Parent' grid ");
		    Reporter.log("12.Clicking on Delete button of 'Parent' grid ");
		    reportLog("12.Clicking on Delete button of 'Parent' grid ");
		    Thread.sleep(2000);
		 
	   //Inspection and clicking of "Yes" button under delete button(Confirmation)
		    WebDriverWait deleteButtonChildConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonChildConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
		    driver.findElement(By.xpath("//span[text()='Yes']")).click();
		    System.out.println("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Reporter.log("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    reportLog("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Thread.sleep(2000);
			
		    //Inspection and clicking of "Delete" button of Parent grid
		    WebDriverWait deleteButtonParentTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
		    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
		    System.out.println("14.Clicking on Delete button of 'Parent' grid ");
		    Reporter.log("14.Clicking on Delete button of 'Parent' grid ");
		    reportLog("14.Clicking on Delete button of 'Parent' grid ");
		    Thread.sleep(2000);
		 
	   //Inspection and clicking of "Yes" button under delete button(Confirmation)
		    WebDriverWait deleteButtonParentConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
		    driver.findElement(By.xpath("//span[text()='Yes']")).click();
		    System.out.println("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Reporter.log("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    reportLog("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Thread.sleep(2000);

		    System.out.println("[Test 16 steps 'ENDS'] ");
		    Reporter.log("[Test 16 steps 'ENDS'] ");
		    reportLog("[Test 16 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 16--> 'Inserting MIN Length data inside 'PO Qty' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 16--> 'Inserting MIN Length data inside 'PO Qty' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 16--> 'Inserting MIN Length data inside 'PO Qty' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
  //ends PO3
  
Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 16 - Inserting MIN Length data inside 'PO Qty' field is PASSED");
		    		    
}

@Test(priority=17)
public void Test17() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 
 
	   test=extent.startTest("Test 17 - Inserting MAX Length data inside 'PO Qty' field ");


	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

	
CSMBase base=new CSMBase();

//starts PO3
System.out.println(" ");
Reporter.log(" ");
		   System.out.println("************************************[ Test 17--> Inserting MAX Length data inside 'PO Qty' field ]**************************************************** ");
		   Reporter.log("************************************[ Test 17--> Inserting MAX Length data inside 'PO Qty' field ]**************************************************** ");
		   reportLog("******[ Test 17--> Inserting MAX Length data inside 'PO Qty' field ]****** ");
		   
		   
		    System.out.println("[Test 17 steps 'STARTS'] ");
		    Reporter.log("[Test 17 steps 'STARTS'] ");
		    reportLog("[Test 17 steps 'STARTS'] ");
		   
 //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
		    WebDriverWait insertSymbole1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    insertSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
	         System.out.println("01.Clicked on 'Insert' button to add new Record");
	         Reporter.log("01.Clicked on 'Insert' button to add new Record");
	         reportLog("01.Clicked on 'Insert' button to add new Record");

   //Inspection and clicking of "PO No." field   	    
		    WebDriverWait poNoField1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    poNoField1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		    String poNoFieldSheet1=sheet.getRow(24).getCell(2).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet1);
		    System.out.println("02.Inserting 'PO No.' field ");
		    Reporter.log("02.Inserting 'PO No.' field ");
		    reportLog("02.Inserting 'PO No.' field ");

   //Inspection and clicking of "Company Code" field   	    
		    WebDriverWait companyCodeFieldOptions1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    companyCodeFieldOptions1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
		    String companyCodeField1=sheet.getRow(24).getCell(15).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField1);
		    System.out.println("03.Choosing 'Company code' field ");
		    Reporter.log("03.Choosing 'Company code' field ");
		    reportLog("03.Choosing 'Company code' field ");
		    
		     
		    base.commonCompanyCodeField(driver);
	 
		    base.commonElementPODate(driver);
		    
		  //Inspection and clicking of "Title1" field   	    
		    WebDriverWait title101 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    title101.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
		    String title1Data01=sheet.getRow(24).getCell(12).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data01);
		    System.out.println("04.Inserting 'Title1' field ");
		    Reporter.log("04.Inserting 'Title1' field ");
		    reportLog("04.Inserting 'Title1' field ");
		    Thread.sleep(2000);
		    
		    base.commonSAVEbutton(driver);
		    System.out.println("05.Cliking on 'SAVE' button ");
		    Reporter.log("05.Cliking on 'SAVE' button ");
		    reportLog("05.Cliking on 'SAVE' button ");
		    Thread.sleep(3000);

		       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
		  		WebDriverWait insertChildSymbole1= new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    insertChildSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
		  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Thread.sleep(2000);		    
		  	    
		  	   
		  	  //Inspection and clicking of "Discipline Code"   	    
		  	    WebDriverWait disciplineCodeDropdown1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    disciplineCodeDropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
		  	    Thread.sleep(2000);
		  	    
		  	    //Inspection and clicking of particular "Discipline Code"    	    
		  	    WebDriverWait disciplineCodeDropdownPiping1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    disciplineCodeDropdownPiping1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
		  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
		  	    System.out.println("07.Choosing 'Displine code' ");
		  	    Reporter.log("07.Choosing 'Displine code' ");
		  	    reportLog("07.Choosing 'Displine code' ");
		  	    Thread.sleep(2000);
		  	    
		  	    
		    
			//Inspection and clicking of "Item No"   	    
			WebDriverWait itemNo1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			itemNo1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
			String itemNoData1=sheet.getRow(24).getCell(4).getStringCellValue();
			driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData1);
			System.out.println("08.Inserting 'Item No.' field ");
			Reporter.log("08.Inserting 'Item No.' field ");
			reportLog("08.Inserting 'Item No.' field ");
			Thread.sleep(2000);
	  
	      //Inspection and clicking of "Ident Code"   	    
	  	    WebDriverWait identCodeList1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			identCodeList1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
		    String identCodeData1=sheet.getRow(24).getCell(5).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData1);
		    System.out.println("09.Selecting 'Ident Code' field ");
		    Reporter.log("09.Selecting 'Ident Code' field ");
		    reportLog("09.Selecting 'Ident Code' field ");
		    Thread.sleep(2000);
		    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
		    Actions action1 = new Actions(driver); 
		    WebElement  element1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
		    action1.moveToElement(element1).click().perform();
		    Thread.sleep(2000);
			    
		  //Inspection and clicking of "PO Qty."
		    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
		    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
	        String poQtyData52= sheet.getRow(24).getCell(9).getStringCellValue();
		    base.commonPOQtyBackSpace(driver);
	        Actions act52 =  new Actions(driver);
	        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
	        System.out.println("10.Inserting 'PO Qty.' field ");
		    Reporter.log("10.Inserting 'PO Qty.' field ");
		    reportLog("10.Inserting 'PO Qty.' field ");
		    Thread.sleep(1000);
		    
//		    //Inspection and clicking of "PO Qty."
//		    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//            driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//            driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
//            String poQtyData1= sheet.getRow(24).getCell(9).getStringCellValue();
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData1);
//		   Thread.sleep(1000);
		    
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.ARROW_LEFT);
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.ARROW_LEFT);
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.ARROW_LEFT);
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.ARROW_LEFT);
		    Thread.sleep(1000);
		    String poQtyMaxData= sheet.getRow(25).getCell(9).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyMaxData);
		   
         
		    
		    System.out.println("10.Inserting 'PO Qty.' field ");
		    Reporter.log("10.Inserting 'PO Qty.' field ");
		    reportLog("10.Inserting 'PO Qty.' field ");
		    Thread.sleep(1000);
		    
		    
           base.commonSAVEbuttonCHILD(driver);
	  	   Thread.sleep(2000); 
	  	   
			System.out.println("11.Cliking on 'SAVE' button ");
			Reporter.log("11.Cliking on 'SAVE' button ");
			reportLog("11.Cliking on 'SAVE' button ");
			Thread.sleep(5000);
			
  // To perform DELETE Operation
			//Inspection and clicking of "Delete" button of Parent grid
		    WebDriverWait deleteButtonChildTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonChildTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
		    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
		    System.out.println("12.Clicking on Delete button of 'Parent' grid ");
		    Reporter.log("12.Clicking on Delete button of 'Parent' grid ");
		    reportLog("12.Clicking on Delete button of 'Parent' grid ");
		    Thread.sleep(2000);
		 
	   //Inspection and clicking of "Yes" button under delete button(Confirmation)
		    WebDriverWait deleteButtonChildConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonChildConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
		    driver.findElement(By.xpath("//span[text()='Yes']")).click();
		    System.out.println("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Reporter.log("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    reportLog("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Thread.sleep(2000);
			
		    //Inspection and clicking of "Delete" button of Parent grid
		    WebDriverWait deleteButtonParentTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
		    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
		    System.out.println("14.Clicking on Delete button of 'Parent' grid ");
		    Reporter.log("14.Clicking on Delete button of 'Parent' grid ");
		    reportLog("14.Clicking on Delete button of 'Parent' grid ");
		    Thread.sleep(2000);
		 
	   //Inspection and clicking of "Yes" button under delete button(Confirmation)
		    WebDriverWait deleteButtonParentConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
		    driver.findElement(By.xpath("//span[text()='Yes']")).click();
		    System.out.println("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Reporter.log("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    reportLog("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Thread.sleep(2000);

		    System.out.println("[Test 17 steps 'ENDS'] ");
		    Reporter.log("[Test 17 steps 'ENDS'] ");
		    reportLog("[Test 17 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 17--> 'Inserting MAX Length data inside 'PO Qty' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 17--> 'Inserting MAX Length data inside 'PO Qty' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 17--> 'Inserting MAX Length data inside 'PO Qty' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
//ends PO3

Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 17 - Inserting MAX Length data inside 'PO Qty' field is PASSED");
		    		    
}

@Test(priority=18)
public void Test18() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 
 
	   test=extent.startTest("Test 18 - Inserting NULL data inside 'Ident Code' field ");
 
 
	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
 driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");
 
	
 CSMBase base=new CSMBase();
  
  //starts PO3
  System.out.println(" ");
  Reporter.log(" ");
		   System.out.println("************************************[ Test 18--> Inserting NULL data inside 'Ident Code' field ]**************************************************** ");
		   Reporter.log("************************************[ Test 18--> Inserting NULL data inside 'Ident Code' field ]**************************************************** ");
		   reportLog("******[ Test 18--> Inserting NULL data inside 'Ident Code' field ]****** ");
		   
		   
		    System.out.println("[Test 18 steps 'STARTS'] ");
		    Reporter.log("[Test 18 steps 'STARTS'] ");
		    reportLog("[Test 18 steps 'STARTS'] ");
		   
   //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
		    WebDriverWait insertSymbole1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    insertSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
	         System.out.println("01.Clicked on 'Insert' button to add new Record");
	         Reporter.log("01.Clicked on 'Insert' button to add new Record");
	         reportLog("01.Clicked on 'Insert' button to add new Record");

     //Inspection and clicking of "PO No." field   	    
		    WebDriverWait poNoField1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    poNoField1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		    String poNoFieldSheet1=sheet.getRow(26).getCell(2).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet1);
		    System.out.println("02.Inserting 'PO No.' field ");
		    Reporter.log("02.Inserting 'PO No.' field ");
		    reportLog("02.Inserting 'PO No.' field ");

     //Inspection and clicking of "Company Code" field   	    
		    WebDriverWait companyCodeFieldOptions1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    companyCodeFieldOptions1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
		    String companyCodeField1=sheet.getRow(26).getCell(15).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField1);
		    System.out.println("03.Choosing 'Company code' field ");
		    Reporter.log("03.Choosing 'Company code' field ");
		    reportLog("03.Choosing 'Company code' field ");
		    
		     
		    base.commonCompanyCodeField(driver);
	 
		    base.commonElementPODate(driver);
		    
		  //Inspection and clicking of "Title1" field   	    
		    WebDriverWait title101 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    title101.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
		    String title1Data01=sheet.getRow(26).getCell(12).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data01);
		    System.out.println("04.Inserting 'Title1' field ");
		    Reporter.log("04.Inserting 'Title1' field ");
		    reportLog("04.Inserting 'Title1' field ");
		    Thread.sleep(2000);
		    
		    base.commonSAVEbutton(driver);
		    System.out.println("05.Cliking on 'SAVE' button ");
		    Reporter.log("05.Cliking on 'SAVE' button ");
		    reportLog("05.Cliking on 'SAVE' button ");
		    Thread.sleep(3000);

		       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
		  		WebDriverWait insertChildSymbole1= new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    insertChildSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
		  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Thread.sleep(2000);		    
		  	    
		  	   
		  	  //Inspection and clicking of "Discipline Code"   	    
		  	    WebDriverWait disciplineCodeDropdown1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    disciplineCodeDropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
		  	    Thread.sleep(2000);
		  	    
		  	    //Inspection and clicking of particular "Discipline Code"    	    
		  	    WebDriverWait disciplineCodeDropdownPiping1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    disciplineCodeDropdownPiping1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
		  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
		  	    System.out.println("07.Choosing 'Displine code' ");
		  	    Reporter.log("07.Choosing 'Displine code' ");
		  	    reportLog("07.Choosing 'Displine code' ");
		  	    Thread.sleep(2000);
		  	    
		  	    
		    
			//Inspection and clicking of "Item No"   	    
			WebDriverWait itemNo1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			itemNo1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
			String itemNoData1=sheet.getRow(26).getCell(4).getStringCellValue();
			driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData1);
			System.out.println("08.Inserting 'Item No.' field ");
			Reporter.log("08.Inserting 'Item No.' field ");
			reportLog("08.Inserting 'Item No.' field ");
			Thread.sleep(2000);
	  
	
			
	      //Inspection and clicking of "Ident Code"   	    
	  	    WebDriverWait identCodeList1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			identCodeList1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
		    String identCodeData1=sheet.getRow(26).getCell(5).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData1);
		    System.out.println("09.Selecting 'Ident Code' field ");
		    Reporter.log("09.Selecting 'Ident Code' field ");
		    reportLog("09.Selecting 'Ident Code' field ");
		    Thread.sleep(2000);
		    
		  //Inspection and clicking of "PO Qty."
		    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
		    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
	        String poQtyData52= sheet.getRow(26).getCell(9).getStringCellValue();
		    base.commonPOQtyBackSpace(driver);
	        Actions act52 =  new Actions(driver);
	        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
	        System.out.println("10.Inserting 'PO Qty.' field ");
		    Reporter.log("10.Inserting 'PO Qty.' field ");
		    reportLog("10.Inserting 'PO Qty.' field ");
		    Thread.sleep(1000);
		    
//			 //Inspection and clicking of "PO Qty."
//		    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//		    base.commonPOQtyBackSpace(driver);
//	        Thread.sleep(2000);
//			String poQtyData1= sheet.getRow(26).getCell(9).getStringCellValue();
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData1);
//		    System.out.println("10.Inserting 'PO Qty.' field ");
//		    Reporter.log("10.Inserting 'PO Qty.' field ");
//		    reportLog("10.Inserting 'PO Qty.' field ");
//		    Thread.sleep(2000);
		    
		    
           base.commonSAVEbuttonCHILD(driver);
         //Inspection and clicking inside "Ident Code" field  	    
	  	    WebDriverWait identCodeListNull = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	   identCodeListNull.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).click();
			base.commonSAVEbuttonCHILD(driver);
			Thread.sleep(2000);
			
			System.out.println("11.Cliking on 'SAVE' button ");
			Reporter.log("11.Cliking on 'SAVE' button ");
			reportLog("11.Cliking on 'SAVE' button ");
			Thread.sleep(6000);
			
    
			// To perform DELETE Operation
		    //Inspection and clicking of "Delete" button of Parent grid
		    WebDriverWait deleteButtonParentTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
		    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
		    System.out.println("12.Clicking on Delete button of 'Parent' grid ");
		    Reporter.log("12.Clicking on Delete button of 'Parent' grid ");
		    reportLog("12.Clicking on Delete button of 'Parent' grid ");
		    Thread.sleep(2000);
		 
	   //Inspection and clicking of "Yes" button under delete button(Confirmation)
		    WebDriverWait deleteButtonParentConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
		    driver.findElement(By.xpath("//span[text()='Yes']")).click();
		    System.out.println("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Reporter.log("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    reportLog("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Thread.sleep(2000);

		    System.out.println("[Test 18 steps 'ENDS'] ");
		    Reporter.log("[Test 18 steps 'ENDS'] ");
		    reportLog("[Test 18 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 18--> 'Inserting NULL data inside 'Ident Code' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 18--> 'Inserting NULL data inside 'Ident Code' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 18--> 'Inserting NULL data inside 'Ident Code' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
  //ends PO3
  
Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 18 - Inserting NULL data inside 'Ident Code' field is PASSED");
		    		    
}
@Test(priority=19)
public void Test19() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 
 
	   test=extent.startTest("Test 19 - Inserting Non Exsisting data inside 'Ident Code' field ");


	   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

	
CSMBase base=new CSMBase();


//starts PO3
System.out.println(" ");
Reporter.log(" ");
		   System.out.println("************************************[ Test 19--> Inserting Non Exsisting data inside 'Ident Code' field ]**************************************************** ");
		   Reporter.log("************************************[ Test 19--> Inserting Non Exsisting data inside 'Ident Code' field ]**************************************************** ");
		   reportLog("******[ Test 19--> Inserting Non Exsisting data inside 'Ident Code' field ]****** ");
		   
		   
		    System.out.println("[Test 19 steps 'STARTS'] ");
		    Reporter.log("[Test 19 steps 'STARTS'] ");
		    reportLog("[Test 19 steps 'STARTS'] ");
		   
 //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
		    WebDriverWait insertSymbole1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    insertSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
	         System.out.println("01.Clicked on 'Insert' button to add new Record");
	         Reporter.log("01.Clicked on 'Insert' button to add new Record");
	         reportLog("01.Clicked on 'Insert' button to add new Record");

   //Inspection and clicking of "PO No." field   	    
		    WebDriverWait poNoField1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    poNoField1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		    String poNoFieldSheet1=sheet.getRow(27).getCell(2).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet1);
		    System.out.println("02.Inserting 'PO No.' field ");
		    Reporter.log("02.Inserting 'PO No.' field ");
		    reportLog("02.Inserting 'PO No.' field ");

   //Inspection and clicking of "Company Code" field   	    
		    WebDriverWait companyCodeFieldOptions1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    companyCodeFieldOptions1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
		    String companyCodeField1=sheet.getRow(27).getCell(15).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField1);
		    System.out.println("03.Choosing 'Company code' field ");
		    Reporter.log("03.Choosing 'Company code' field ");
		    reportLog("03.Choosing 'Company code' field ");
		    
		     
		    base.commonCompanyCodeField(driver);
	 
		    base.commonElementPODate(driver);
		    
		  //Inspection and clicking of "Title1" field   	    
		    WebDriverWait title101 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    title101.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
		    String title1Data01=sheet.getRow(27).getCell(12).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data01);
		    System.out.println("04.Inserting 'Title1' field ");
		    Reporter.log("04.Inserting 'Title1' field ");
		    reportLog("04.Inserting 'Title1' field ");
		    Thread.sleep(2000);
		    
		    base.commonSAVEbutton(driver);
		    System.out.println("05.Cliking on 'SAVE' button ");
		    Reporter.log("05.Cliking on 'SAVE' button ");
		    reportLog("05.Cliking on 'SAVE' button ");
		    Thread.sleep(3000);

		       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
		  		WebDriverWait insertChildSymbole1= new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    insertChildSymbole1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
		  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
		  	    Thread.sleep(2000);		    
		  	    
		  	   
		  	  //Inspection and clicking of "Discipline Code"   	    
		  	    WebDriverWait disciplineCodeDropdown1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    disciplineCodeDropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
		  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
		  	    Thread.sleep(2000);
		  	    
		  	    //Inspection and clicking of particular "Discipline Code"    	    
		  	    WebDriverWait disciplineCodeDropdownPiping1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		  	    disciplineCodeDropdownPiping1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
		  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
		  	    System.out.println("07.Choosing 'Displine code' ");
		  	    Reporter.log("07.Choosing 'Displine code' ");
		  	    reportLog("07.Choosing 'Displine code' ");
		  	    Thread.sleep(2000);
		  	    
		  	    
		    
			//Inspection and clicking of "Item No"   	    
			WebDriverWait itemNo1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			itemNo1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
			String itemNoData1=sheet.getRow(27).getCell(4).getStringCellValue();
			driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData1);
			System.out.println("08.Inserting 'Item No.' field ");
			Reporter.log("08.Inserting 'Item No.' field ");
			reportLog("08.Inserting 'Item No.' field ");
			Thread.sleep(2000);
	  
			//Inspection and clicking of "PO Qty."
		    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
		    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
	        String poQtyData52= sheet.getRow(27).getCell(9).getStringCellValue();
		    base.commonPOQtyBackSpace(driver);
	        Actions act52 =  new Actions(driver);
	        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
	        System.out.println("10.Inserting 'PO Qty.' field ");
		    Reporter.log("10.Inserting 'PO Qty.' field ");
		    reportLog("10.Inserting 'PO Qty.' field ");
		    Thread.sleep(1000);
			
//			 //Inspection and clicking of "PO Qty."
//		    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//		    base.commonPOQtyBackSpace(driver);
//	        Thread.sleep(2000);
//			String poQtyData1= sheet.getRow(27).getCell(9).getStringCellValue();
//		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData1);
//		    System.out.println("09.Inserting 'PO Qty.' field ");
//		    Reporter.log("09.Inserting 'PO Qty.' field ");
//		    reportLog("09.Inserting 'PO Qty.' field ");
//		    Thread.sleep(2000);
		    
			
	      //Inspection and clicking of "Ident Code"   	    
	  	    WebDriverWait identCodeList1 = new WebDriverWait(driver, Duration.ofMillis(8000));
			identCodeList1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
		    String identCodeData1=sheet.getRow(27).getCell(5).getStringCellValue();
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData1);
		    System.out.println("10.Selecting 'Ident Code' field ");
		    Reporter.log("10.Selecting 'Ident Code' field ");
		    reportLog("10.Selecting 'Ident Code' field ");
		    Thread.sleep(6000);
    
         base.commonSAVEbuttonCHILD(driver);
       //Inspection and clicking inside "Ident Code" field  	    
	  	    WebDriverWait identCodeListNull = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	   identCodeListNull.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).click();
			base.commonSAVEbuttonCHILD(driver);
			
			
			System.out.println("11.Cliking on 'SAVE' button ");
			Reporter.log("11.Cliking on 'SAVE' button ");
			reportLog("11.Cliking on 'SAVE' button ");
			Thread.sleep(3000);
			
  
			// To perform DELETE Operation
		    //Inspection and clicking of "Delete" button of Parent grid
		    WebDriverWait deleteButtonParentTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
		    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
		    System.out.println("12.Clicking on Delete button of 'Parent' grid ");
		    Reporter.log("12.Clicking on Delete button of 'Parent' grid ");
		    reportLog("12.Clicking on Delete button of 'Parent' grid ");
		    Thread.sleep(2000);
		 
	   //Inspection and clicking of "Yes" button under delete button(Confirmation)
		    WebDriverWait deleteButtonParentConfirmTest1 = new WebDriverWait(driver, Duration.ofMillis(8000));
		    deleteButtonParentConfirmTest1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
		    driver.findElement(By.xpath("//span[text()='Yes']")).click();
		    System.out.println("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Reporter.log("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    reportLog("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
		    Thread.sleep(2000);

		    System.out.println("[Test 19 steps 'ENDS'] ");
		    Reporter.log("[Test 19 steps 'ENDS'] ");
		    reportLog("[Test 19 steps 'ENDS'] ");
		 
		    System.out.println("************************************[ Test 19--> 'Inserting Non Exsisting data inside 'Ident Code' field' is ''PASSED'' ]************************************ ");
		    Reporter.log("************************************[ Test 19--> 'Inserting Non Exsisting data inside 'Ident Code' field' is ''PASSED'' ]************************************ ");
		    reportLog("******[ Test 19--> 'Inserting Non Exsisting data inside 'Ident Code' field' is ''PASSED'' ]****** ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    System.out.println(" ");
		    Reporter.log(" ");
		    //driver.quit();
//ends PO3

Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 19 - Inserting Non Exsisting data inside 'Ident Code' field is PASSED");
		    		    
}

@Test(priority=20)
public void Test20() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 
  
	   test=extent.startTest("Test 20 - Inserting NULL data inside 'Company Code' field ");
   
   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
   driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

	
   CSMBase base=new CSMBase();

	
	 System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 20-->  Inserting NULL data inside 'Company Code' field ]**************************************************** ");
	   Reporter.log("************************************[ Test 20-->  Inserting NULL data inside 'Company Code' field ]**************************************************** ");
	   reportLog("******[ Test 20-->  Inserting NULL data inside 'Company Code' field ]****** ");
	   
	   System.out.println("[Test 20 steps 'STARTS'] ");
	   Reporter.log("[Test 20 steps 'STARTS'] ");
	   reportLog("[Test 20 steps 'STARTS'] ");
	   
    //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole4 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
     System.out.println("01.Clicked on 'Insert' button to add new Record");
     Reporter.log("01.Clicked on 'Insert' button to add new Record");
     reportLog("01.Clicked on 'Insert' button to add new Record");
     
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField4 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet4=sheet.getRow(28).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet4);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title104 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title104.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data04=sheet.getRow(28).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data04);
	    System.out.println("03.Inserting 'Title1' field ");
	    Reporter.log("03.Inserting 'Title1' field ");
	    reportLog("03.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	    
   	    
	    WebDriverWait companyCodeFieldOptions4 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField4=sheet.getRow(28).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField4);
	    Thread.sleep(3000);
	    
	    //commonCompanyCodeField(driver);
	    System.out.println("04.Choosing 'Company code' field ");
	    Reporter.log("04.Choosing 'Company code' field ");
	    reportLog("04.Choosing 'Company code' field ");
	    
	    base.commonSAVEbutton(driver);
	    WebDriverWait companyCodeFieldNullVal = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldNullVal.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).click();
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(4000);
	    
        System.out.println("[Test 20 steps 'ENDS'] ");
	    Reporter.log("[Test 20 steps 'ENDS'] ");
	    reportLog("[Test 20 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 20--> 'Insertion of new record for non-exsisting data' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 20--> 'Insertion of new record for non-exsisting data' is ''PASSED'' ]************************************ ");
	    reportLog("******[ Test 20--> 'Insertion of new record for non-exsisting data' is ''PASSED'' ]****** ");
	    Reporter.log(" ");
        System.out.println(" ");
	    Reporter.log(" ");
      System.out.println(" ");
	    Reporter.log(" ");

	    Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 20 -  Inserting NULL data inside 'Company Code' field is PASSED");
	    
}


@Test(priority=21)
public void Test21() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 

	   test=extent.startTest("Test 21 - Insertion of NULL data inside 'Item No' field ");
   
   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
   driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

	
   CSMBase base=new CSMBase();

	
	 System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 21--> Insertion of NULL data inside 'Item No' field ]**************************************************** ");
	   Reporter.log("************************************[ Test 21--> Insertion of NULL data inside 'Item No' field ]**************************************************** ");
	   reportLog("******[ Test 21--> Insertion of NULL data inside 'Item No' field ]****** ");
	   
	   System.out.println("[Test 21 steps 'STARTS'] ");
	   Reporter.log("[Test 21 steps 'STARTS'] ");
	   reportLog("[Test 21 steps 'STARTS'] ");
	   
  //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
     System.out.println("01.Clicked on 'Insert' button to add new Record");
     Reporter.log("01.Clicked on 'Insert' button to add new Record");
     reportLog("01.Clicked on 'Insert' button to add new Record");
     
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet3=sheet.getRow(29).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet3);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField3=sheet.getRow(29).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField3);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title103 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title103.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data03=sheet.getRow(29).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data03);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);

	       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData3=sheet.getRow(29).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData3);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);

    //Inspection and clicking of "Ident Code"   	    
	WebDriverWait identCodeList3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData3=sheet.getRow(29).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData3);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action3 = new Actions(driver); 
	    WebElement  element3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action3.moveToElement(element3).click().perform();
	    Thread.sleep(2000);
		    
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData52= sheet.getRow(29).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act52 =  new Actions(driver);
        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty3 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    base.commonPOQtyBackSpace(driver);
//        Thread.sleep(2000);
//		String poQtyData3= sheet.getRow(29).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData3);
//	    System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	    
        base.commonSAVEbuttonCHILD(driver);
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).click();
		
		base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		
		Thread.sleep(3000);
		
        // To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("12.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("12.Clicking on Delete button of 'Parent' grid ");
	    reportLog("12.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
        //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    System.out.println("[Test 21 steps 'ENDS'] ");
	    Reporter.log("[Test 21 steps 'ENDS'] ");
	    reportLog("[Test 21 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 21--> 'Insertion of NULL data inside 'Item No' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 21--> 'Insertion of NULL data inside 'Item No' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("******[ Test 21--> 'Insertion of NULL data inside 'Item No' field' is ''PASSED'' ]****** ");
	    System.out.println(" ");
	    Reporter.log(" ");
		System.out.println(" ");
	    Reporter.log(" ");
	 
	    Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 21 - Insertion of new data having field capacity more than provided is PASSED");
	    
}
@Test(priority=22)
public void Test22() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 
  
	   test=extent.startTest("Test 22 - Insertion of Numeric data inside 'Item No' field ");
 
 System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
 driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

	
	CSMBase base=new CSMBase();
//base.po_ReceivingDataDataMaintenanceScenario1(driver);

	
	 System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 22--> Insertion of Numeric data inside 'Item No' field ]**************************************************** ");
	   Reporter.log("************************************[ Test 22--> Insertion of Numeric data inside 'Item No' field ]**************************************************** ");
	   reportLog("******[ Test 22--> Insertion of Numeric data inside 'Item No' field ]****** ");
	   
	   System.out.println("[Test 22 steps 'STARTS'] ");
	   Reporter.log("[Test 22 steps 'STARTS'] ");
	   reportLog("[Test 22 steps 'STARTS'] ");
	   
//Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
   System.out.println("01.Clicked on 'Insert' button to add new Record");
   Reporter.log("01.Clicked on 'Insert' button to add new Record");
   reportLog("01.Clicked on 'Insert' button to add new Record");
   
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet3=sheet.getRow(30).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet3);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField3=sheet.getRow(30).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField3);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title103 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title103.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data03=sheet.getRow(30).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data03);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);

	       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData3=sheet.getRow(30).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData3);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);

  //Inspection and clicking of "Ident Code"   	    
	WebDriverWait identCodeList3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData3=sheet.getRow(30).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData3);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action3 = new Actions(driver); 
	    WebElement  element3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action3.moveToElement(element3).click().perform();
	    Thread.sleep(2000);
		
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData52= sheet.getRow(30).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act52 =  new Actions(driver);
        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty3 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    base.commonPOQtyBackSpace(driver);
//      Thread.sleep(2000);
//		String poQtyData3= sheet.getRow(30).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData3);
//	    System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	
		base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		
		Thread.sleep(3000);
		
      // To perform DELETE Operation
		//Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonChildTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("12.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("12.Clicking on Delete button of 'Parent' grid ");
	    reportLog("12.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
      //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	   
		
		//Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("14.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("14.Clicking on Delete button of 'Parent' grid ");
	    reportLog("14.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
      //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);

		
	     System.out.println("[Test 22 steps 'ENDS'] ");
	    Reporter.log("[Test 22 steps 'ENDS'] ");
	    reportLog("[Test 22 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 22--> 'Insertion of Numeric data inside 'Item No' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 22--> 'Insertion of Numeric data inside 'Item No' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("******[ Test 22--> 'Insertion of Numeric data inside 'Item No' field' is ''PASSED'' ]****** ");
	    System.out.println(" ");
	    Reporter.log(" ");
		System.out.println(" ");
	    Reporter.log(" ");
	 
	    Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 22 - Insertion of Numeric data inside 'Item No' field is PASSED");
	    
}

@Test(priority=23)
public void Test23() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 
 
	   test=extent.startTest("Test 23 - Insertion of ALPHABETICAL data inside 'Item No' field ");

System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

	
	CSMBase base=new CSMBase();
//base.po_ReceivingDataDataMaintenanceScenario1(driver);

	
	 System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 23--> Insertion of ALPHABETICAL data inside 'Item No' field ]**************************************************** ");
	   Reporter.log("************************************[ Test 23--> Insertion of ALPHABETICAL data inside 'Item No' field ]**************************************************** ");
	   reportLog("******[ Test 23--> Insertion of ALPHABETICAL data inside 'Item No' field ]****** ");
	   
	   System.out.println("[Test 23 steps 'STARTS'] ");
	   Reporter.log("[Test 23 steps 'STARTS'] ");
	   reportLog("[Test 23 steps 'STARTS'] ");
	   
//Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
 System.out.println("01.Clicked on 'Insert' button to add new Record");
 Reporter.log("01.Clicked on 'Insert' button to add new Record");
 reportLog("01.Clicked on 'Insert' button to add new Record");
 
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet3=sheet.getRow(31).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet3);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField3=sheet.getRow(31).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField3);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title103 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title103.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data03=sheet.getRow(31).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data03);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);

	       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData3=sheet.getRow(31).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData3);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);

//Inspection and clicking of "Ident Code"   	    
	WebDriverWait identCodeList3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData3=sheet.getRow(31).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData3);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action3 = new Actions(driver); 
	    WebElement  element3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action3.moveToElement(element3).click().perform();
	    Thread.sleep(2000);
	    
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData52= sheet.getRow(31).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act52 =  new Actions(driver);
        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
		    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty3 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    base.commonPOQtyBackSpace(driver);
//        Thread.sleep(2000);
//		String poQtyData3= sheet.getRow(31).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData3);
//	    System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	
		base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		
		Thread.sleep(3000);
		
    // To perform DELETE Operation
		//Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonChildTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("12.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("12.Clicking on Delete button of 'Parent' grid ");
	    reportLog("12.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	   
		
		//Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("14.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("14.Clicking on Delete button of 'Parent' grid ");
	    reportLog("14.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);

		
	     System.out.println("[Test 23 steps 'ENDS'] ");
	    Reporter.log("[Test 23 steps 'ENDS'] ");
	    reportLog("[Test 23 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 23--> 'Insertion of ALPHABETICAL data inside 'Item No' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 23--> 'Insertion of ALPHABETICAL data inside 'Item No' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("******[ Test 23--> 'Insertion of ALPHABETICAL data inside 'Item No' field' is ''PASSED'' ]****** ");
	    System.out.println(" ");
	    Reporter.log(" ");
		System.out.println(" ");
	    Reporter.log(" ");
	 
	    Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 23 -Insertion of ALPHABETICAL data inside 'Item No' field is PASSED");
	    
}

@Test(priority=24)
public void Test24() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 
  
	   test=extent.startTest("Test 24 - Insertion of NVARCHAR(including Special Symbols) data inside 'Item No' field ");

System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

	
	CSMBase base=new CSMBase();
//base.po_ReceivingDataDataMaintenanceScenario1(driver);

	
	 System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 24--> Insertion of NVARCHAR(including Special Symbols) data inside 'Item No' field ]**************************************************** ");
	   Reporter.log("************************************[ Test 24--> Insertion of NVARCHAR(including Special Symbols) data inside 'Item No' field ]**************************************************** ");
	   reportLog("******[ Test 24--> Insertion of NVARCHAR(including Special Symbols) data inside 'Item No' field ]****** ");
	   
	   System.out.println("[Test 24 steps 'STARTS'] ");
	   Reporter.log("[Test 24 steps 'STARTS'] ");
	   reportLog("[Test 24 steps 'STARTS'] ");
	   
//Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
 System.out.println("01.Clicked on 'Insert' button to add new Record");
 Reporter.log("01.Clicked on 'Insert' button to add new Record");
 reportLog("01.Clicked on 'Insert' button to add new Record");
 
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet3=sheet.getRow(32).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet3);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField3=sheet.getRow(32).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField3);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title103 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title103.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data03=sheet.getRow(32).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data03);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);

	       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData3=sheet.getRow(32).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData3);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);

//Inspection and clicking of "Ident Code"   	    
	WebDriverWait identCodeList3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData3=sheet.getRow(32).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData3);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action3 = new Actions(driver); 
	    WebElement  element3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action3.moveToElement(element3).click().perform();
	    Thread.sleep(2000);
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData52= sheet.getRow(32).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act52 =  new Actions(driver);
        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty3 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    base.commonPOQtyBackSpace(driver);
//        Thread.sleep(2000);
//		String poQtyData3= sheet.getRow(32).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData3);
//	    System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	
		base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		
		Thread.sleep(3000);
		
    // To perform DELETE Operation
		//Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonChildTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("12.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("12.Clicking on Delete button of 'Parent' grid ");
	    reportLog("12.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	   
		
		//Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("14.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("14.Clicking on Delete button of 'Parent' grid ");
	    reportLog("14.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);

		
	    System.out.println("[Test 24 steps 'ENDS'] ");
	    Reporter.log("[Test 24 steps 'ENDS'] ");
	    reportLog("[Test 24 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 24--> 'Insertion of NVARCHAR(including Special Symbols) data inside 'Item No' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 24--> 'Insertion of NVARCHAR(including Special Symbols) data inside 'Item No' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("******[ Test 24--> 'Insertion of NVARCHAR(including Special Symbols) data inside 'Item No' field' is ''PASSED'' ]****** ");
	    System.out.println(" ");
	    Reporter.log(" ");
		System.out.println(" ");
	    Reporter.log(" ");
	 
	    Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 24 - Insertion of NVARCHAR(including Special Symbols) data inside 'Item No' field is PASSED");
	    
}

@Test(priority=25)
public void Test25() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 
 
	   test=extent.startTest("Test 25 - Insertion of MIN(Decimal type of) length data inside 'Item No' field ");

System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

	
	CSMBase base=new CSMBase();
//base.po_ReceivingDataDataMaintenanceScenario1(driver);

	
	 System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 25--> Insertion of MIN(Decimal type of) length data inside 'Item No' field ]**************************************************** ");
	   Reporter.log("************************************[ Test 25--> Insertion of MIN(Decimal type of) length data inside 'Item No' fieldd ]**************************************************** ");
	   reportLog("******[ Test 25--> Insertion of MIN(Decimal type of) length data inside 'Item No' field ]****** ");
	   
	   System.out.println("[Test 25 steps 'STARTS'] ");
	   Reporter.log("[Test 25 steps 'STARTS'] ");
	   reportLog("[Test 25 steps 'STARTS'] ");
	   
//Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
System.out.println("01.Clicked on 'Insert' button to add new Record");
Reporter.log("01.Clicked on 'Insert' button to add new Record");
reportLog("01.Clicked on 'Insert' button to add new Record");

	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet3=sheet.getRow(33).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet3);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField3=sheet.getRow(33).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField3);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title103 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title103.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data03=sheet.getRow(33).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data03);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);

	       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData3=sheet.getRow(33).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData3);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);

//Inspection and clicking of "Ident Code"   	    
	WebDriverWait identCodeList3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData3=sheet.getRow(33).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData3);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action3 = new Actions(driver); 
	    WebElement  element3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action3.moveToElement(element3).click().perform();
	    Thread.sleep(2000);
		    
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData52= sheet.getRow(33).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act52 =  new Actions(driver);
        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty3 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    base.commonPOQtyBackSpace(driver);
//        Thread.sleep(2000);
//		String poQtyData3= sheet.getRow(33).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData3);
//	    System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
		
		base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		
		Thread.sleep(3000);
		
  // To perform DELETE Operation
		//Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonChildTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("12.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("12.Clicking on Delete button of 'Parent' grid ");
	    reportLog("12.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
  //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	   
		
		//Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("14.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("14.Clicking on Delete button of 'Parent' grid ");
	    reportLog("14.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
  //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);

		
	    System.out.println("[Test 25 steps 'ENDS'] ");
	    Reporter.log("[Test 25 steps 'ENDS'] ");
	    reportLog("[Test 25 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 25--> 'Insertion of MIN(Decimal type of) length data inside 'Item No' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 25--> 'Insertion of MIN(Decimal type of) length data inside 'Item No' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("******[ Test 25--> 'Insertion of MIN(Decimal type of) length data inside 'Item No' field' is ''PASSED'' ]****** ");
	    System.out.println(" ");
	    Reporter.log(" ");
		System.out.println(" ");
	    Reporter.log(" ");
	 
	    Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 25 - Insertion of MIN(Decimal type of) length data inside 'Item No' field is PASSED");
	    
}

@Test(priority=26)
public void Test26() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 
  
	   test=extent.startTest("Test 26 - Insertion of MAX length data inside 'Item No' field ");

System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

	
	CSMBase base=new CSMBase();
//base.po_ReceivingDataDataMaintenanceScenario1(driver);

	
	 System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 26--> Insertion of MAX length data inside 'Item No' field ]**************************************************** ");
	   Reporter.log("************************************[ Test 26--> Insertion of MAX length data inside 'Item No' field ]**************************************************** ");
	   reportLog("******[ Test 26--> Insertion of MAX length data inside 'Item No' field ]****** ");
	   
	   System.out.println("[Test 26 steps 'STARTS'] ");
	   Reporter.log("[Test 26 steps 'STARTS'] ");
	   reportLog("[Test 26 steps 'STARTS'] ");
	   
//Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
System.out.println("01.Clicked on 'Insert' button to add new Record");
Reporter.log("01.Clicked on 'Insert' button to add new Record");
reportLog("01.Clicked on 'Insert' button to add new Record");

	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet3=sheet.getRow(34).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet3);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField3=sheet.getRow(34).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField3);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title103 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title103.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data03=sheet.getRow(34).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data03);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);

	       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData3=sheet.getRow(34).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData3);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);

//Inspection and clicking of "Ident Code"   	    
	WebDriverWait identCodeList3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData3=sheet.getRow(34).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData3);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action3 = new Actions(driver); 
	    WebElement  element3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action3.moveToElement(element3).click().perform();
	    Thread.sleep(2000);
		 
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData52= sheet.getRow(34).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act52 =  new Actions(driver);
        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty3 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    base.commonPOQtyBackSpace(driver);
//        Thread.sleep(2000);
//		String poQtyData3= sheet.getRow(34).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData3);
//	    System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
	
		base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		
		Thread.sleep(3000);
		
// To perform DELETE Operation
		//Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonChildTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("12.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("12.Clicking on Delete button of 'Parent' grid ");
	    reportLog("12.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
//Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	   
		
		//Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("14.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("14.Clicking on Delete button of 'Parent' grid ");
	    reportLog("14.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
//Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);

		
	    System.out.println("[Test 26 steps 'ENDS'] ");
	    Reporter.log("[Test 26 steps 'ENDS'] ");
	    reportLog("[Test 26 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 26--> 'Insertion of MAX length data inside 'Item No' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 26--> 'Insertion of MAX length data inside 'Item No' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("******[ Test 26--> 'Insertion of MAX length data inside 'Item No' field' is ''PASSED'' ]****** ");
	    System.out.println(" ");
	    Reporter.log(" ");
		System.out.println(" ");
	    Reporter.log(" ");
	 
	    Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 26 - Insertion of MAX length data inside 'Item No' field is PASSED");
	    
}

@Test(priority=27)
public void Test27() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 
  
	   test=extent.startTest("Test 27 - Insertion of data having field capacity more than provided inside 'Item No' field ");

System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

	
	CSMBase base=new CSMBase();
//base.po_ReceivingDataDataMaintenanceScenario1(driver);

	
	 System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 27--> Insertion of data having field capacity more than provided inside 'Item No' field ]**************************************************** ");
	   Reporter.log("************************************[ Test 27--> Insertion of data having field capacity more than provided inside 'Item No' field ]**************************************************** ");
	   reportLog("******[ Test 27--> Insertion of data having field capacity more than provided inside 'Item No' field ]****** ");
	   
	   System.out.println("[Test 27 steps 'STARTS'] ");
	   Reporter.log("[Test 27 steps 'STARTS'] ");
	   reportLog("[Test 27 steps 'STARTS'] ");
	   
//Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
System.out.println("01.Clicked on 'Insert' button to add new Record");
Reporter.log("01.Clicked on 'Insert' button to add new Record");
reportLog("01.Clicked on 'Insert' button to add new Record");

	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet3=sheet.getRow(35).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet3);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField3=sheet.getRow(35).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField3);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title103 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title103.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data03=sheet.getRow(35).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data03);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);

	       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData3=sheet.getRow(35).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData3);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);

//Inspection and clicking of "Ident Code"   	    
	WebDriverWait identCodeList3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData3=sheet.getRow(35).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData3);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action3 = new Actions(driver); 
	    WebElement  element3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action3.moveToElement(element3).click().perform();
	    Thread.sleep(2000);
		    
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData52= sheet.getRow(35).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act52 =  new Actions(driver);
        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty3 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poQty3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
//	    base.commonPOQtyBackSpace(driver);
//        Thread.sleep(2000);
//		String poQtyData3= sheet.getRow(35).getCell(9).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData3);
//	    System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(2000);
     
	    base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		
		Thread.sleep(3000);
		
//To perform DELETE Operation
		//Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonChildTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("12.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("12.Clicking on Delete button of 'Parent' grid ");
	    reportLog("12.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
//Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("13.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	   
		
		//Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("14.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("14.Clicking on Delete button of 'Parent' grid ");
	    reportLog("14.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
//Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);

		
	    System.out.println("[Test 27 steps 'ENDS'] ");
	    Reporter.log("[Test 27 steps 'ENDS'] ");
	    reportLog("[Test 27 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 27--> 'Insertion of data having field capacity more than provided inside 'Item No' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 27--> 'Insertion of data having field capacity more than provided inside 'Item No' field' is ''PASSED'' ]************************************ ");
	    Reporter.log("******[ Test 27--> 'Insertion of data having field capacity more than provided inside 'Item No' field' is ''PASSED'' ]****** ");
	    System.out.println(" ");
	    Reporter.log(" ");
		System.out.println(" ");
	    Reporter.log(" ");
	 
	    Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 27 - Insertion of data having field capacity more than provided inside 'Item No' field is PASSED");
	    
}

@Test(priority=28)
public void Test28() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 
  
	   test=extent.startTest("Test 28 - Validate NULL data validation(Validation is 'Required') by inserting 'NULL' data inside 'PO No' field by directly clicking on 'Go' button ");

System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

	
	   CSMBase base=new CSMBase();
       //base.po_ReceivingDataDataMaintenanceScenario1(driver);

	
	   System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 28--> Validate NULL data validation(Validation is 'Required') by inserting 'NULL' data inside 'PO No' field by directly clicking on 'Go' button ]**************************************************** ");
	   Reporter.log("************************************[ Test 28--> Validate NULL data validation(Validation is 'Required') by inserting 'NULL' data inside 'PO No' field by directly clicking on 'Go' button ]**************************************************** ");
	   reportLog("******[ Test 28--> Validate NULL data validation(Validation is 'Required') by inserting 'NULL' data inside 'PO No' field by directly clicking on 'Go' button ]****** ");
	   
	   System.out.println("[Test 28 steps 'STARTS'] ");
	   Reporter.log("[Test 28 steps 'STARTS'] ");
	   reportLog("[Test 28 steps 'STARTS'] ");
	   
        //Inspection and clicking of "Go" Button 
	    WebDriverWait clickingGOButton = new WebDriverWait(driver, Duration.ofMillis(8000));
	    clickingGOButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[2]/div/div")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[2]/div/div")).click();
        System.out.println("01.Clicked on 'Go' button");
        Reporter.log("01.Clicked on 'Go' button");
        reportLog("01.Clicked on 'Go' button");
        
       //Inspection and clicking of "PO NO:" Field 
	    WebDriverWait poNoField = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[1]/div/div/div[1]/div/input")));
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[1]/div/div/div[1]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[2]/div[1]/div/div/div[1]/div/input")).click();
        System.out.println("02.Clicked inside 'PO No:' field to see 'Required' field validation(as we not select particular 'PO No') ");
        Reporter.log("02.Clicked inside 'PO No:' field to see 'Required' field validation(as we not select particular 'PO No') ");
        reportLog("02.Clicked inside 'PO No:' field to see 'Required' field validation(as we not select particular 'PO No') ");

	    System.out.println("[Test 28 steps 'ENDS'] ");
	    Reporter.log("[Test 28 steps 'ENDS'] ");
	    reportLog("[Test 28 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 28--> 'Validate NULL data validation(Validation is 'Required') by inserting 'NULL' data inside 'PO No' field by directly clicking on 'Go' button' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 28--> 'Validate NULL data validation(Validation is 'Required') by inserting 'NULL' data inside 'PO No' field by directly clicking on 'Go' button' is ''PASSED'' ]************************************ ");
	    Reporter.log("******[ Test 28--> 'Validate NULL data validation(Validation is 'Required') by inserting 'NULL' data inside 'PO No' field by directly clicking on 'Go' button' is ''PASSED'' ]****** ");
	    System.out.println(" ");
	    Reporter.log(" ");
		System.out.println(" ");
	    Reporter.log(" ");
	 
	    Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 28 - Validate NULL data validation(Validation is 'Required') by inserting 'NULL' data inside 'PO No' field by directly clicking on 'Go' button is PASSED");
	    
}

@Test(priority=29)
public void Test29() throws EncryptedDocumentException, InterruptedException, IOException
{
	File file =new File("PoScreen_TestsDocumentt.xlsx");
    String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0); 
  
	   test=extent.startTest("Test 29 - Validating the inserted record(Parent and Child records) able to see  inside Excel file format ");
   
   System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
		
   driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");

	
	CSMBase base=new CSMBase();
//base.po_ReceivingDataDataMaintenanceScenario1(driver);

	
	 System.out.println(" ");
	   Reporter.log("");
	   System.out.println("************************************[ Test 29--> Validating the inserted record(Parent and Child records) able to see  inside Excel file format ]**************************************************** ");
	   Reporter.log("************************************[ Test 29--> Validating the inserted record(Parent and Child records) able to see  inside Excel file format ]**************************************************** ");
	   reportLog("******[ Test 29--> Validating the inserted record(Parent and Child records) able to see  inside Excel file format ]****** ");
	   
	   System.out.println("[Test 29 steps 'STARTS'] ");
	   Reporter.log("[Test 29 steps 'STARTS'] ");
	   reportLog("[Test 29 steps 'STARTS'] ");
	   
  //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
	    WebDriverWait insertSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    insertSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
     System.out.println("01.Clicked on 'Insert' button to add new Record");
     Reporter.log("01.Clicked on 'Insert' button to add new Record");
     reportLog("01.Clicked on 'Insert' button to add new Record");
     
	    //Inspection and clicking of "PO No." field   	    
	    WebDriverWait poNoField3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    poNoField3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
	    String poNoFieldSheet3=sheet.getRow(37).getCell(2).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet3);
	    System.out.println("02.Inserting 'PO No.' field ");
	    Reporter.log("02.Inserting 'PO No.' field ");
	    reportLog("02.Inserting 'PO No.' field ");
	    
	    //Inspection and clicking of "Company Code" field   	    
	    WebDriverWait companyCodeFieldOptions3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    companyCodeFieldOptions3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
	    String companyCodeField3=sheet.getRow(37).getCell(15).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField3);
	    System.out.println("03.Choosing 'Company code' field ");
	    Reporter.log("03.Choosing 'Company code' field ");
	    reportLog("03.Choosing 'Company code' field ");
	    
	    base.commonCompanyCodeField(driver);        
	    base.commonElementPODate(driver);
	    
	  //Inspection and clicking of "Title1" field   	    
	    WebDriverWait title103 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    title103.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
	    String title1Data03=sheet.getRow(37).getCell(12).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data03);
	    System.out.println("04.Inserting 'Title1' field ");
	    Reporter.log("04.Inserting 'Title1' field ");
	    reportLog("04.Inserting 'Title1' field ");
	    Thread.sleep(2000);
	
	    base.commonSAVEbutton(driver);
	    System.out.println("05.Cliking on 'SAVE' button ");
	    Reporter.log("05.Cliking on 'SAVE' button ");
	    reportLog("05.Cliking on 'SAVE' button ");
	    Thread.sleep(3000);

	       //Inspection and clicking of "Insert" Button for Child grid under PO Screen
	  		WebDriverWait insertChildSymbole3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    insertChildSymbole3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
	  	    Thread.sleep(2000);		    
	  	    
	  	    //Inspection and clicking of "Discipline Code"   	    
	  	    WebDriverWait disciplineCodeDropdown3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdown3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
	  	    Thread.sleep(2000);
	  	    
	  	    //Inspection and clicking of particular "Discipline Code"    	    
	  	    WebDriverWait disciplineCodeDropdownPiping3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	  	    disciplineCodeDropdownPiping3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")));
	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[7]")).click();
	  	    System.out.println("07.Choosing 'Displine code' ");
	  	    Reporter.log("07.Choosing 'Displine code' ");
	  	    reportLog("07.Choosing 'Displine code' ");
	  	    Thread.sleep(2000);
	    
		//Inspection and clicking of "Item No"   	    
		WebDriverWait itemNo3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		itemNo3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
		String itemNoData3=sheet.getRow(37).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData3);
		System.out.println("08.Inserting 'Item No.' field ");
		Reporter.log("08.Inserting 'Item No.' field ");
		reportLog("08.Inserting 'Item No.' field ");
		Thread.sleep(2000);

      //Inspection and clicking of "Ident Code"   	    
	   WebDriverWait identCodeList3 = new WebDriverWait(driver, Duration.ofMillis(8000));
		identCodeList3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
	    String identCodeData3=sheet.getRow(37).getCell(5).getStringCellValue();
	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData3);
	    System.out.println("09.Selecting 'Ident Code' field ");
	    Reporter.log("09.Selecting 'Ident Code' field ");
	    reportLog("09.Selecting 'Ident Code' field ");
	    Thread.sleep(2000);
	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
	    Actions action3 = new Actions(driver); 
	    WebElement  element3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
	    action3.moveToElement(element3).click().perform();
	    Thread.sleep(2000);
		    
	  //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
        String poQtyData52= sheet.getRow(37).getCell(9).getStringCellValue();
	    base.commonPOQtyBackSpace(driver);
        Actions act52 =  new Actions(driver);
        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
        System.out.println("10.Inserting 'PO Qty.' field ");
	    Reporter.log("10.Inserting 'PO Qty.' field ");
	    reportLog("10.Inserting 'PO Qty.' field ");
	    Thread.sleep(1000);
	    

	    base.commonSAVEbuttonCHILD(driver);
		System.out.println("11.Cliking on 'SAVE' button ");
		Reporter.log("11.Cliking on 'SAVE' button ");
		reportLog("11.Cliking on 'SAVE' button ");
		Thread.sleep(2000);
	
        // To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Child grid
	    WebDriverWait deleteButtonChildTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
	    System.out.println("12.Clicking on Delete button of 'Child' grid ");
	    Reporter.log("12.Clicking on Delete button of 'Child' grid ");
	    reportLog("12.Clicking on Delete button of 'Child' grid ");
	    Thread.sleep(2000);
	    
	    //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonChildConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonChildConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("13.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Reporter.log("13.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    reportLog("13.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);


  // To perform DELETE Operation
	    //Inspection and clicking of "Delete" button of Parent grid
	    WebDriverWait deleteButtonParentTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
	    System.out.println("14.Clicking on Delete button of 'Parent' grid ");
	    Reporter.log("14.Clicking on Delete button of 'Parent' grid ");
	    reportLog("14.Clicking on Delete button of 'Parent' grid ");
	    Thread.sleep(2000);
	 
 //Inspection and clicking of "Yes" button under delete button(Confirmation)
	    WebDriverWait deleteButtonParentConfirmTest3 = new WebDriverWait(driver, Duration.ofMillis(8000));
	    deleteButtonParentConfirmTest3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    System.out.println("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Reporter.log("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    reportLog("15.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
	    Thread.sleep(2000);
	    System.out.println("[Test 29 steps 'ENDS'] ");
	    Reporter.log("[Test 29 steps 'ENDS'] ");
	    reportLog("[Test 29 steps 'ENDS'] ");
	    System.out.println("************************************[ Test 29--> 'Validating the inserted record(Parent and Child records) able to see  inside Excel file format' is ''PASSED'' ]************************************ ");
	    Reporter.log("************************************[ Test 29--> 'Validating the inserted record(Parent and Child records) able to see  inside Excel file format' is ''PASSED'' ]************************************ ");
	    Reporter.log("******[ Test 29--> 'Validating the inserted record(Parent and Child records) able to see  inside Excel file format' is ''PASSED'' ]****** ");
	    System.out.println(" ");
	    Reporter.log(" ");
		System.out.println(" ");
	    Reporter.log(" ");
	 
	    Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test 29 - Validating the inserted record(Parent and Child records) able to see  inside Excel file format is PASSED");
	    
}

//@Test(priority=30)
//public void Test30() throws EncryptedDocumentException, InterruptedException, IOException
//{
//	File file =new File("PoScreen_TestsDocumentt.xlsx");
//    String Path1= file.getAbsolutePath().toString();
//	   FileInputStream fs = new FileInputStream(Path1);
//	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
//	   XSSFSheet sheet = workbook.getSheetAt(0); 
//
//	   test=extent.startTest("Test 30 - Validate to filter out particular record from list ");
//   
//   System.setProperty("webdriver.chrome.driver",
//				"D:\\Eclipse_rohit\\EclipseSetup_Library\\chromedriver\\chromedriver.exe");
//		
//   driver.get("https://qacms.jgc.com/MAC_PT/PODataMaintenance/Index?mId=TUFDLUQtUE8=");
//  	
//	
//	CSMBase base=new CSMBase();
//// basepo_ReceivingDataDataMaintenanceScenario1(driver);
//
//	
//	 System.out.println(" ");
//	   Reporter.log("");
//	   System.out.println("************************************[ Test 30--> Validate to filter out particular record from list ]**************************************************** ");
//	   Reporter.log("************************************[ Test 30--> Validate to filter out particular record from list ]**************************************************** ");
//	   reportLog("******[ Test 30--> Validate to filter out particular record from list ]****** ");
//	   
//	   System.out.println("[Test 30 steps 'STARTS'] ");
//	   Reporter.log("[Test 30 steps 'STARTS'] ");
//	   reportLog("[Test 30 steps 'STARTS'] ");
//	   
//    //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
//	    WebDriverWait insertSymbole5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    insertSymbole5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
//     System.out.println("01.Clicked on 'Insert' button to add new Record");
//     Reporter.log("01.Clicked on 'Insert' button to add new Record");
//     reportLog("01.Clicked on 'Insert' button to add new Record");
//     
//	    //Inspection and clicking of "PO No." field   	    
//	    WebDriverWait poNoField5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    poNoField5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
//	    String poNoFieldSheet5=sheet.getRow(38).getCell(2).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(poNoFieldSheet5);
//	    System.out.println("02.Inserting 'PO No.' field ");
//	    Reporter.log("02.Inserting 'PO No.' field ");
//	    reportLog("02.Inserting 'PO No.' field ");
//	    
//	    //Inspection and clicking of "Company Code" field   	    
//	    WebDriverWait companyCodeFieldOptions5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    companyCodeFieldOptions5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")));
//	    String companyCodeField5=sheet.getRow(38).getCell(15).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/div/div/div/div/input")).sendKeys(companyCodeField5);
//	    System.out.println("03.Choosing 'Company code' field ");
//	    Reporter.log("03.Choosing 'Company code' field ");
//	    reportLog("03.Choosing 'Company code' field ");
//	    
//	    base.commonCompanyCodeField(driver);        
//	    base.commonElementPODate(driver);
//	    
//	  //Inspection and clicking of "Title1" field   	    
//	    WebDriverWait title105 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    title105.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")));
//	    String title1Data05=sheet.getRow(38).getCell(12).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/div/div/div/input")).sendKeys(title1Data05);
//	    System.out.println("04.Inserting 'Title1' field ");
//	    Reporter.log("04.Inserting 'Title1' field ");
//	    reportLog("04.Inserting 'Title1' field ");
//	    Thread.sleep(2000);
//	
//   
//	    base.commonSAVEbutton(driver);
//	    System.out.println("05.Cliking on 'SAVE' button ");
//	    Reporter.log("05.Cliking on 'SAVE' button ");
//	    reportLog("05.Cliking on 'SAVE' button ");
//	    Thread.sleep(3000);
//
//	  //Inspection and clicking of "Insert" Button for Child grid under PO Screen
//	  		WebDriverWait insertChildSymbole5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	  	    insertChildSymbole5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
//	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
//	  	    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
//	  	    Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
//	  	    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
//	  	    Thread.sleep(2000);		    
//	  	    
//	  	    //Inspection and clicking of "Discipline Code"   	    
//	  	    WebDriverWait disciplineCodeDropdown5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	  	    disciplineCodeDropdown5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
//	  	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
//	  	    Thread.sleep(2000);
//	  	    
//	  	    //Inspection and clicking of particular "Discipline Code"    	    
//	  	    WebDriverWait disciplineCodeDropdownPiping5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	  	    disciplineCodeDropdownPiping5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
//	  	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
//	  	    System.out.println("07.Choosing 'Displine code' ");
//	  	    Reporter.log("07.Choosing 'Displine code' ");
//	  	    reportLog("07.Choosing 'Displine code' ");
//	  	    Thread.sleep(2000);
//	    
//		//Inspection and clicking of "Item No"   	    
//		WebDriverWait itemNo5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		itemNo5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
//		String itemNoData5=sheet.getRow(38).getCell(4).getStringCellValue();
//		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData5);
//		System.out.println("08.Inserting 'Item No.' field ");
//		Reporter.log("08.Inserting 'Item No.' field ");
//		reportLog("08.Inserting 'Item No.' field ");
//		Thread.sleep(2000);
//
//    //Inspection and clicking of "Ident Code"   	    
//	WebDriverWait identCodeList5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		identCodeList5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
//	    String identCodeData5=sheet.getRow(38).getCell(5).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData5);
//	    System.out.println("09.Selecting 'Ident Code' field ");
//	    Reporter.log("09.Selecting 'Ident Code' field ");
//	    reportLog("09.Selecting 'Ident Code' field ");
//	    Thread.sleep(2000);
//	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
//	    Actions action5 = new Actions(driver); 
//	    WebElement  element5 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
//	    // /html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div
//	    action5.moveToElement(element5).click().perform();
//	    Thread.sleep(2000);
//		    
//	  //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(20000));
//	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
//        String poQtyData52= sheet.getRow(38).getCell(9).getStringCellValue();
//	    base.commonPOQtyBackSpace(driver);
//        Actions act52 =  new Actions(driver);
//        act52.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData52).perform();
//        System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(1000);
//	    
////	    //Inspection and clicking of "PO Qty."
////	    WebDriverWait poQty5 = new WebDriverWait(driver, Duration.ofMillis(8000));
////	    poQty5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
////        base.commonPOQtyBackSpace(driver);
////        Thread.sleep(2000);
////		String poQtyData5= sheet.getRow(38).getCell(9).getStringCellValue();
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData5);
////	    System.out.println("10.Inserting 'PO Qty.' field ");
////	    Reporter.log("10.Inserting 'PO Qty.' field ");
////	    reportLog("10.Inserting 'PO Qty.' field ");
////	    Thread.sleep(2000);
//	    
//			    
//	    base.commonSAVEbuttonCHILD(driver);
//		System.out.println("11.Cliking on 'SAVE' button ");
//		Reporter.log("11.Cliking on 'SAVE' button ");
//		reportLog("11.Cliking on 'SAVE' button ");
//		Thread.sleep(2000);
//		
////child data 1
//		//Inspection and clicking of "Insert" Button for Child grid under PO Screen
//		WebDriverWait insertChildSymbolee5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    insertChildSymbolee5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
//	    System.out.println("12.Clicked on 'Insert' button to add new CHILD Record");
//	    Reporter.log("12.Clicked on 'Insert' button to add new CHILD Record");
//	    reportLog("12.Clicked on 'Insert' button to add new CHILD Record");
//	    Thread.sleep(2000);		    
//	    
//	    //Inspection and clicking of "Discipline Code"   	    
//	    WebDriverWait disciplineCodeDropdownn5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    disciplineCodeDropdownn5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
//	    Thread.sleep(2000);
//	    
//	    //Inspection and clicking of particular "Discipline Code"    	    
//	    WebDriverWait disciplineCodeDropdownPipingg5= new WebDriverWait(driver, Duration.ofMillis(8000));
//	    disciplineCodeDropdownPipingg5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
//	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
//	    System.out.println("13.Choosing 'Displine code' ");
//	    Reporter.log("13.Choosing 'Displine code' ");
//	    reportLog("13.Choosing 'Displine code' ");
//	    Thread.sleep(2000);
//	    
//		//Inspection and clicking of "Item No"   	    
//		WebDriverWait itemNo51 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		itemNo51.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
//		String itemNoData51=sheet.getRow(39).getCell(4).getStringCellValue();
//		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData51);
//		System.out.println("14.Inserting 'Item No.' field ");
//		Reporter.log("14.Inserting 'Item No.' field ");
//		reportLog("14.Inserting 'Item No.' field ");
//		Thread.sleep(2000);
//
//    //Inspection and clicking of "Ident Code"   	    
//	WebDriverWait identCodeList51 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		identCodeList51.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
//	    String identCodeData51=sheet.getRow(39).getCell(5).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData51);
//	    System.out.println("15.Selecting 'Ident Code' field ");
//	    Reporter.log("15.Selecting 'Ident Code' field ");
//	    reportLog("15.Selecting 'Ident Code' field ");
//	    Thread.sleep(2000);
//	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
//	    Actions action51 = new Actions(driver); 
//	    WebElement  element51= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
//	    action51.moveToElement(element51).click().perform();
//	    Thread.sleep(2000);
//		    
//	    //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty522 = new WebDriverWait(driver, Duration.ofMillis(20000));
//	    poQty522.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
//        String poQtyData522= sheet.getRow(39).getCell(9).getStringCellValue();
//	    base.commonPOQtyBackSpace(driver);
//        Actions act522 =  new Actions(driver);
//        act522.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData522).perform();
//        System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(1000);
//	    
////	    //Inspection and clicking of "PO Qty."
////	    WebDriverWait poQty51 = new WebDriverWait(driver, Duration.ofMillis(8000));
////	    poQty51.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
////	    base.commonPOQtyBackSpace(driver);
////        Thread.sleep(2000);
////		String poQtyData51= sheet.getRow(39).getCell(9).getStringCellValue();
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData51);
////	    System.out.println("16.Inserting 'PO Qty.' field ");
////	    Reporter.log("16.Inserting 'PO Qty.' field ");
////	    reportLog("16.Inserting 'PO Qty.' field ");
////	    Thread.sleep(2000);
//	    
//			    
//	    base.commonSAVEbuttonCHILD(driver);
//		System.out.println("17.Cliking on 'SAVE' button ");
//		Reporter.log("17.Cliking on 'SAVE' button ");
//		reportLog("17.Cliking on 'SAVE' button ");
//		Thread.sleep(2000);
//		
//		
////child data 2
//		//Inspection and clicking of "Insert" Button for Child grid under PO Screen
//		WebDriverWait insertChildSymbole52 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    insertChildSymbole52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
//	    System.out.println("18.Clicked on 'Insert' button to add new CHILD Record");
//	    Reporter.log("18.Clicked on 'Insert' button to add new CHILD Record");
//	    reportLog("18.Clicked on 'Insert' button to add new CHILD Record");
//	    Thread.sleep(2000);		    
//	    
//	    //Inspection and clicking of "Discipline Code"   	    
//	    WebDriverWait disciplineCodeDropdown52 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    disciplineCodeDropdown52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
//	    Thread.sleep(2000);
//	    
//	    //Inspection and clicking of particular "Discipline Code"    	    
//	    WebDriverWait disciplineCodeDropdownPiping52 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    disciplineCodeDropdownPiping52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")));
//	    driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[6]")).click();
//	    System.out.println("19.Choosing 'Displine code' ");
//	    Reporter.log("19.Choosing 'Displine code' ");
//	    reportLog("19.Choosing 'Displine code' ");
//	    Thread.sleep(2000);
//	    
//		//Inspection and clicking of "Item No"   	    
//		WebDriverWait itemNo52 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		itemNo52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")));
//		String itemNoData52=sheet.getRow(40).getCell(4).getStringCellValue();
//		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/div/div/input")).sendKeys(itemNoData52);
//		System.out.println("20.Inserting 'Item No.' field ");
//		Reporter.log("20.Inserting 'Item No.' field ");
//		reportLog("20.Inserting 'Item No.' field ");
//		Thread.sleep(2000);
//
//    //Inspection and clicking of "Ident Code"   	    
//   	WebDriverWait identCodeList52 = new WebDriverWait(driver, Duration.ofMillis(8000));
//		identCodeList52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")));
//	    String identCodeData52=sheet.getRow(40).getCell(5).getStringCellValue();
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/div/div[1]/div/input")).sendKeys(identCodeData52);
//	    System.out.println("21.Selecting 'Ident Code' field ");
//	    Reporter.log("21.Selecting 'Ident Code' field ");
//	    reportLog("21.Selecting 'Ident Code' field ");
//	    Thread.sleep(2000);
//	    //Inspection and clicking a particular "Ident Code" once inserted inside field(Showing blue color ident code data i.e Existing data)  
//	    Actions action52 = new Actions(driver); 
//	    WebElement  element52= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div"));
//	    action52.moveToElement(element52).click().perform();
//	    Thread.sleep(2000);
//		    
//	  //Inspection and clicking of "PO Qty."
//	    WebDriverWait poQty523 = new WebDriverWait(driver, Duration.ofMillis(20000));
//	    poQty523.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")));
//        String poQtyData523= sheet.getRow(40).getCell(9).getStringCellValue();
//	    base.commonPOQtyBackSpace(driver);
//        Actions act523 =  new Actions(driver);
//        act523.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))).click().sendKeys(poQtyData523).perform();
//        System.out.println("10.Inserting 'PO Qty.' field ");
//	    Reporter.log("10.Inserting 'PO Qty.' field ");
//	    reportLog("10.Inserting 'PO Qty.' field ");
//	    Thread.sleep(1000);
//	    
////	    //Inspection and clicking of "PO Qty."
////	    WebDriverWait poQty52 = new WebDriverWait(driver, Duration.ofMillis(8000));
////	    poQty52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input"))); 
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).click();
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(Keys.BACK_SPACE);
////        base.commonPOQtyBackSpace(driver);
////        Thread.sleep(2000);
////		String poQtyData52= sheet.getRow(40).getCell(9).getStringCellValue();
////	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div/div/div/input")).sendKeys(poQtyData52);
////	    System.out.println("22.Inserting 'PO Qty.' field ");
////	    Reporter.log("22.Inserting 'PO Qty.' field ");
////	    reportLog("22.Inserting 'PO Qty.' field ");
////	    Thread.sleep(2000);
//	    
//			    
//	    base.commonSAVEbuttonCHILD(driver);
//		System.out.println("23.Cliking on 'SAVE' button ");
//		Reporter.log("23.Cliking on 'SAVE' button ");
//		reportLog("23.Cliking on 'SAVE' button ");
//		Thread.sleep(2000);
//		
//		 
//		// Search bar data filtering
//		WebDriverWait searcbBarFilterOut = new WebDriverWait(driver, Duration.ofMillis(8000));
//		searcbBarFilterOut.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[5]/div[2]/table/tbody/tr[2]/td[2]/div/div[2]/div/div/input")));
//		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[5]/div[2]/table/tbody/tr[2]/td[2]/div/div[2]/div/div/input")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[5]/div[2]/table/tbody/tr[2]/td[2]/div/div[2]/div/div/input")).sendKeys("0321");
//	    Thread.sleep(6000);
//	    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[5]/div[2]/table/tbody/tr[2]/td[2]/div/div[2]/div/div/input")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[5]/div[2]/table/tbody/tr[2]/td[2]/div/div[2]/div/div/input")).clear();
//	    Thread.sleep(2000);
//	    
//        // To perform DELETE Operation
//	    //Inspection and clicking of "Delete" button of Child grid
//	    WebDriverWait deleteButtonChildTest5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    deleteButtonChildTest5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[4]")));
//	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[4]")).click();
//	    System.out.println("24.Clicking on Delete button of 'Child' grid ");
//	    Reporter.log("24.Clicking on Delete button of 'Child' grid ");
//	    reportLog("24.Clicking on Delete button of 'Child' grid ");
//	    Thread.sleep(2000);
//	    
//	    //Inspection and clicking of "Yes" button under delete button(Confirmation)
//	    WebDriverWait deleteButtonChildConfirmTest5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    deleteButtonChildConfirmTest5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
//	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
//	    System.out.println("25.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
//	    Reporter.log("25.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
//	    reportLog("25.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
//	    Thread.sleep(2000);
//	    
//	    
//	    //Inspection and clicking of "Delete" button of Child grid
//	    WebDriverWait deleteButtonChild1Test5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    deleteButtonChild1Test5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[3]")));
//	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[3]")).click();
//	    System.out.println("26.Clicking on Delete button of 'Child' grid ");
//	    Reporter.log("26.Clicking on Delete button of 'Child' grid ");
//	    reportLog("26.Clicking on Delete button of 'Child' grid ");
//	    Thread.sleep(2000);
//	    
//	    //Inspection and clicking of "Yes" button under delete button(Confirmation)
//	    WebDriverWait deleteButtonChildConfirm1Test5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    deleteButtonChildConfirm1Test5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
//	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
//	    System.out.println("27.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
//	    Reporter.log("27.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
//	    reportLog("27.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
//	    Thread.sleep(2000);
//	    
//      //Inspection and clicking of "Delete" button of Child grid
//	    WebDriverWait deleteButtonChild2Test5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    deleteButtonChild2Test5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[2]")));
//	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[2]")).click();
//	    System.out.println("28.Clicking on Delete button of 'Child' grid ");
//	    Reporter.log("28.Clicking on Delete button of 'Child' grid ");
//	    reportLog("28.Clicking on Delete button of 'Child' grid ");
//	    Thread.sleep(2000);
//	    
//	    //Inspection and clicking of "Yes" button under delete button(Confirmation)
//	    WebDriverWait deleteButtonChildConfirm2Test5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    deleteButtonChildConfirm2Test5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
//	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
//	    System.out.println("29.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
//	    Reporter.log("29.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
//	    reportLog("29.Clicking on Delete button of 'Child' grid for confirmation(YES/NO) ");
//	    Thread.sleep(2000);
//
//      // To perform DELETE Operation
//	    //Inspection and clicking of "Delete" button of Parent grid
//	    WebDriverWait deleteButtonParentTest5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    deleteButtonParentTest5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Delete this record'])[1]")));
//	    driver.findElement(By.xpath("(//span[@title='Delete this record'])[1]")).click();
//	    System.out.println("30.Clicking on Delete button of 'Parent' grid ");
//	    Reporter.log("30.Clicking on Delete button of 'Parent' grid ");
//	    reportLog("30.Clicking on Delete button of 'Parent' grid ");
//	    Thread.sleep(2000);
//	 
//      //Inspection and clicking of "Yes" button under delete button(Confirmation)
//	    WebDriverWait deleteButtonParentConfirmTest5 = new WebDriverWait(driver, Duration.ofMillis(8000));
//	    deleteButtonParentConfirmTest5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='dx-button-content'])[17]")));
//	    driver.findElement(By.xpath("(//div[@class='dx-button-content'])[17]")).click();
//	    System.out.println("31.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
//	    Reporter.log("31.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
//	    reportLog("31.Clicking on Delete button of 'Parent' grid for confirmation(YES/NO) ");
//	    Thread.sleep(2000);
//	    System.out.println("[Test 30 steps 'ENDS'] ");
//	    Reporter.log("[Test 30 steps 'ENDS'] ");
//	    reportLog("[Test 30 steps 'ENDS'] ");
//	    System.out.println("************************************[ Test 30--> 'Validate to filter out particular record from list' is ''PASSED'' ]************************************ ");
//	    Reporter.log("************************************[ Test 30--> 'Validate to filter out particular record from list' is ''PASSED'' ]************************************ ");
//	    reportLog("******[ Test 30--> 'Validate to filter out particular record from list' is ''PASSED'' ]****** ");
//	    Reporter.log(" ");
//      System.out.println(" ");
//	    Reporter.log(" ");
//      System.out.println(" ");
//	    Reporter.log(" ");
//	    
//	    Assert.assertTrue(true);
//		test.log(LogStatus.PASS, "Test 30 - Validate to filter out particular record from list is PASSED");
//	    
//}


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















































































