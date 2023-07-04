package com.csm.qa.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
   
    //Validate Login with Valid Credentials 
	//@Test(priority=1)
	public void LoginWithValidCredentials() throws InterruptedException, IOException
	{
		test=extent.startTest("Test 1 - Insertion of new data ");
		
		initialize();
		loginPage= new LoginPage(driver);
        homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(1000);
		String homePagetitle= driver.getTitle();
		Assert.assertEquals(homePagetitle,"Home Page", "Invalid Credentials");
		System.out.println("Test 1 passed");
		
		   File file =new File("POShipping.xlsx");
		   System.out.println(file.getAbsolutePath());
           String Path1= file.getAbsolutePath().toString();
		   FileInputStream fs = new FileInputStream(Path1);
		   //FileInputStream fs = new FileInputStream();
		   XSSFWorkbook workbook = new XSSFWorkbook(fs);
		   XSSFSheet sheet = workbook.getSheetAt(0);
//		   Row row = sheet.getRow(1);
//		   Cell cell = row.getCell(2);
		   //System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
		   String po1=sheet.getRow(1).getCell(2).getStringCellValue();
		   System.out.println(po1);
		   String po2=sheet.getRow(3).getCell(2).getStringCellValue();
		   System.out.println(po2);
		   System.out.println("Test 1 passed with valid credentilias");
		   
		  
	        Assert.assertTrue(true);
	  		test.log(LogStatus.PASS, "Test 1 - Insertion of new data PASSED");
		driver.quit();
	}

@Test(priority=6)
public void Test6() throws EncryptedDocumentException, InterruptedException, IOException
{
	   
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   //FileInputStream fs = new FileInputStream();
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   String po1=sheet.getRow(1).getCell(2).getStringCellValue();
	   System.out.println(po1);
	   String po2=sheet.getRow(3).getCell(2).getStringCellValue();
	   System.out.println(po2);
	   System.out.println("Test 1 passed with valid credentilias");
	   
	   test=extent.startTest("Test 6 - Insertion of new data ");
	   
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
	    Thread.sleep(10000);
		   

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
  		test.log(LogStatus.PASS, "Test 6 - Insertion of new data PASSED");
  		
  }

//@Test(priority=7)
public void Test7() throws EncryptedDocumentException, InterruptedException, IOException
{
	   
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   //FileInputStream fs = new FileInputStream();
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   String po1=sheet.getRow(1).getCell(2).getStringCellValue();
	   System.out.println(po1);
	   String po2=sheet.getRow(3).getCell(2).getStringCellValue();
	   System.out.println(po2);
	   System.out.println("Test 1 passed with valid credentilias");
	   
	   test=extent.startTest("Test 6 - Insertion of new data ");
	   
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
		System.out.println("Test 6 passed with invalid credentials");  
		
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
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input"))); 
	    driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).click();
	    String poQtyDataa= sheet.getRow(1).getCell(9).getStringCellValue();
	    System.out.println(poQtyDataa);
	    base.commonPOQtyBackSpace(driver);
	    //driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(poQtyDataa);
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
  		test.log(LogStatus.PASS, "Test 6 - Insertion of new data PASSED");
  		
  }

//@Test(priority=8)
public void Test8() throws EncryptedDocumentException, InterruptedException, IOException
{
	   
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   //FileInputStream fs = new FileInputStream();
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   String po1=sheet.getRow(1).getCell(2).getStringCellValue();
	   System.out.println(po1);
	   String po2=sheet.getRow(3).getCell(2).getStringCellValue();
	   System.out.println(po2);
	   System.out.println("Test 1 passed with valid credentilias");
	   
	   test=extent.startTest("Test 6 - Insertion of new data ");
	   
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
		System.out.println("Test 6 passed with invalid credentials");  
		
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
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input"))); 
	    driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).click();
	    String poQtyDataa= sheet.getRow(1).getCell(9).getStringCellValue();
	    System.out.println(poQtyDataa);
	    base.commonPOQtyBackSpace(driver);
	    //driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(poQtyDataa);
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
  		test.log(LogStatus.PASS, "Test 6 - Insertion of new data PASSED");
  		
  }


//@Test(priority=9)
public void Test9() throws EncryptedDocumentException, InterruptedException, IOException
{
	   
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   //FileInputStream fs = new FileInputStream();
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   String po1=sheet.getRow(1).getCell(2).getStringCellValue();
	   System.out.println(po1);
	   String po2=sheet.getRow(3).getCell(2).getStringCellValue();
	   System.out.println(po2);
	   System.out.println("Test 1 passed with valid credentilias");
	   
	   test=extent.startTest("Test 6 - Insertion of new data ");
	   
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
		System.out.println("Test 6 passed with invalid credentials");  
		
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
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input"))); 
	    driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).click();
	    String poQtyDataa= sheet.getRow(1).getCell(9).getStringCellValue();
	    System.out.println(poQtyDataa);
	    base.commonPOQtyBackSpace(driver);
	    //driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(poQtyDataa);
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
  		test.log(LogStatus.PASS, "Test 6 - Insertion of new data PASSED");
  		
  }

//@Test(priority=10)
public void Test10() throws EncryptedDocumentException, InterruptedException, IOException
{
	   
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   //FileInputStream fs = new FileInputStream();
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   String po1=sheet.getRow(1).getCell(2).getStringCellValue();
	   System.out.println(po1);
	   String po2=sheet.getRow(3).getCell(2).getStringCellValue();
	   System.out.println(po2);
	   System.out.println("Test 1 passed with valid credentilias");
	   
	   test=extent.startTest("Test 6 - Insertion of new data ");
	   
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
		System.out.println("Test 6 passed with invalid credentials");  
		
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
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input"))); 
	    driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).click();
	    String poQtyDataa= sheet.getRow(1).getCell(9).getStringCellValue();
	    System.out.println(poQtyDataa);
	    base.commonPOQtyBackSpace(driver);
	    //driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(poQtyDataa);
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
  		test.log(LogStatus.PASS, "Test 6 - Insertion of new data PASSED");
  		
  }

//@Test(priority=11)
public void Test11() throws EncryptedDocumentException, InterruptedException, IOException
{
	   
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   //FileInputStream fs = new FileInputStream();
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   String po1=sheet.getRow(1).getCell(2).getStringCellValue();
	   System.out.println(po1);
	   String po2=sheet.getRow(3).getCell(2).getStringCellValue();
	   System.out.println(po2);
	   System.out.println("Test 1 passed with valid credentilias");
	   
	   test=extent.startTest("Test 6 - Insertion of new data ");
	   
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
		System.out.println("Test 6 passed with invalid credentials");  
		
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
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input"))); 
	    driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).click();
	    String poQtyDataa= sheet.getRow(1).getCell(9).getStringCellValue();
	    System.out.println(poQtyDataa);
	    base.commonPOQtyBackSpace(driver);
	    //driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(poQtyDataa);
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
  		test.log(LogStatus.PASS, "Test 6 - Insertion of new data PASSED");
  		
  }

//@Test(priority=12)
public void Test12() throws EncryptedDocumentException, InterruptedException, IOException
{
	   
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   //FileInputStream fs = new FileInputStream();
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   String po1=sheet.getRow(1).getCell(2).getStringCellValue();
	   System.out.println(po1);
	   String po2=sheet.getRow(3).getCell(2).getStringCellValue();
	   System.out.println(po2);
	   System.out.println("Test 1 passed with valid credentilias");
	   
	   test=extent.startTest("Test 6 - Insertion of new data ");
	   
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
		System.out.println("Test 6 passed with invalid credentials");  
		
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
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input"))); 
	    driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).click();
	    String poQtyDataa= sheet.getRow(1).getCell(9).getStringCellValue();
	    System.out.println(poQtyDataa);
	    base.commonPOQtyBackSpace(driver);
	    //driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(poQtyDataa);
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
  		test.log(LogStatus.PASS, "Test 6 - Insertion of new data PASSED");
  		
  }

//@Test(priority=13)
public void Test13() throws EncryptedDocumentException, InterruptedException, IOException
{
	   
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   //FileInputStream fs = new FileInputStream();
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   String po1=sheet.getRow(1).getCell(2).getStringCellValue();
	   System.out.println(po1);
	   String po2=sheet.getRow(3).getCell(2).getStringCellValue();
	   System.out.println(po2);
	   System.out.println("Test 1 passed with valid credentilias");
	   
	   test=extent.startTest("Test 6 - Insertion of new data ");
	   
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
		System.out.println("Test 6 passed with invalid credentials");  
		
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
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input"))); 
	    driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).click();
	    String poQtyDataa= sheet.getRow(1).getCell(9).getStringCellValue();
	    System.out.println(poQtyDataa);
	    base.commonPOQtyBackSpace(driver);
	    //driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(poQtyDataa);
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
  		test.log(LogStatus.PASS, "Test 6 - Insertion of new data PASSED");
  		
  }

//@Test(priority=14)
public void Test14() throws EncryptedDocumentException, InterruptedException, IOException
{
	   
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   //FileInputStream fs = new FileInputStream();
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   String po1=sheet.getRow(1).getCell(2).getStringCellValue();
	   System.out.println(po1);
	   String po2=sheet.getRow(3).getCell(2).getStringCellValue();
	   System.out.println(po2);
	   System.out.println("Test 1 passed with valid credentilias");
	   
	   test=extent.startTest("Test 6 - Insertion of new data ");
	   
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
		System.out.println("Test 6 passed with invalid credentials");  
		
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
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input"))); 
	    driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).click();
	    String poQtyDataa= sheet.getRow(1).getCell(9).getStringCellValue();
	    System.out.println(poQtyDataa);
	    base.commonPOQtyBackSpace(driver);
	    //driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(poQtyDataa);
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
  		test.log(LogStatus.PASS, "Test 6 - Insertion of new data PASSED");
  		
  }

//@Test(priority=15)
public void Test15() throws EncryptedDocumentException, InterruptedException, IOException
{
	   
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   //FileInputStream fs = new FileInputStream();
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   String po1=sheet.getRow(1).getCell(2).getStringCellValue();
	   System.out.println(po1);
	   String po2=sheet.getRow(3).getCell(2).getStringCellValue();
	   System.out.println(po2);
	   System.out.println("Test 1 passed with valid credentilias");
	   
	   test=extent.startTest("Test 6 - Insertion of new data ");
	   
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
		System.out.println("Test 6 passed with invalid credentials");  
		
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
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input"))); 
	    driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).click();
	    String poQtyDataa= sheet.getRow(1).getCell(9).getStringCellValue();
	    System.out.println(poQtyDataa);
	    base.commonPOQtyBackSpace(driver);
	    //driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(poQtyDataa);
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
  		test.log(LogStatus.PASS, "Test 6 - Insertion of new data PASSED");
  		
  }

//@Test(priority=16)
public void Test16() throws EncryptedDocumentException, InterruptedException, IOException
{
	   
	   File file =new File("PoScreen_TestsDocumentt.xlsx");
       String Path1= file.getAbsolutePath().toString();
	   FileInputStream fs = new FileInputStream(Path1);
	   //FileInputStream fs = new FileInputStream();
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   String po1=sheet.getRow(1).getCell(2).getStringCellValue();
	   System.out.println(po1);
	   String po2=sheet.getRow(3).getCell(2).getStringCellValue();
	   System.out.println(po2);
	   System.out.println("Test 1 passed with valid credentilias");
	   
	   test=extent.startTest("Test 6 - Insertion of new data ");
	   
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
		System.out.println("Test 6 passed with invalid credentials");  
		
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
		    
	    //Inspection and clicking of "PO Qty."
	    WebDriverWait poQty1 = new WebDriverWait(driver, Duration.ofMillis(20000));
	    poQty1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input"))); 
	    driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).click();
	    String poQtyDataa= sheet.getRow(1).getCell(9).getStringCellValue();
	    System.out.println(poQtyDataa);
	    base.commonPOQtyBackSpace(driver);
	    //driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(poQtyDataa);
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
  		test.log(LogStatus.PASS, "Test 6 - Insertion of new data PASSED");
  		
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