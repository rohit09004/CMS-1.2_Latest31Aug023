package com.csm.qa.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.csm.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSMBase {
	
	public static WebDriver driver;
	public static  Properties prop;
	ExtentReports extent;
	ExtentTest test;
	public static Sheet sh;
	
	public CSMBase()
	{
		try
		{
		   prop = new Properties();
           File file =new File("configg.txt");
		 // System.out.println(file.getAbsolutePath());
           String Path1= file.getAbsolutePath().toString();
		   FileInputStream fs = new FileInputStream(Path1);
		   prop.load(fs);
        }catch(FileNotFoundException e)
		{
	    	e.printStackTrace();
		
		}catch(IOException e) {
		
			e.printStackTrace();
		}	
	}
	// read the property
	public static void initialize() throws InterruptedException
	{
	 
        WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.pageload_wait));
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.implicit_wait));
		 driver.get(prop.getProperty("url"));//url is launched 
    }
	
	//Method for adding logs passed from test cases
		 public void reportLog(String message) {    
			extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		    test.log(LogStatus.INFO, message);//For extentTest HTML report
		    //logger.info("Message: " + message);
		    //Reporter.log(message);

		}
		
		public static void commonAllElements(WebDriver driver) throws EncryptedDocumentException, IOException{
			
		    //Inspection and clicking of "CMS" tab 	    
		    WebDriverWait cmstab_wait = new WebDriverWait(driver, Duration.ofMillis(8000));
		    cmstab_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")));
		    driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/a")).click();

		    //Inspection and clicking of "MAC" tab
		    WebDriverWait idctab_wait = new WebDriverWait(driver, Duration.ofMillis(8000));
		    idctab_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/ul/li[1]/ul/li[3]/a")));
		    driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[2]/ul/li[1]/ul/li[3]/a")).click();
		    
		  //Inspection and clicking of "Select Store Location" 
		    WebDriverWait macjobcodeList = new WebDriverWait(driver, Duration.ofMillis(8000));
		    macjobcodeList.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div/div")).click();
		    
		    //Inspection and clicking particular Store Location
		    WebDriverWait macjobcodeListOption = new WebDriverWait(driver, Duration.ofMillis(8000));
		    macjobcodeListOption.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[8]/div")));
		    driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[8]/div")).click();

		    //Inspection and clicking of "SAVE" Button
		    WebDriverWait saveButton = new WebDriverWait(driver, Duration.ofMillis(8000));
		    saveButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div")));
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div")).click();

		  //Inspection and clicking of "CLOSE" Button
		    WebDriverWait closeButton = new WebDriverWait(driver, Duration.ofMillis(8000));
		    closeButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[1]/div[2]/div")));
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[1]/div[2]/div")).click();

		    //Inspection and clicking of "DATA MAINTAINCE" menu
		    WebDriverWait dataMainatinceArrow = new WebDriverWait(driver, Duration.ofMillis(8000));
		    dataMainatinceArrow.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")));
		    driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/div[2]")).click();

		  //Inspection and clicking of "Receiving Data" under Data Maintainance
		    WebDriverWait receivingDataOptions = new WebDriverWait(driver, Duration.ofMillis(8000));
		    receivingDataOptions.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/div[2]")));
		    driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/div[2]")).click();

		  //Inspection and clicking of "PO" Screen
		    WebDriverWait poScreen = new WebDriverWait(driver, Duration.ofMillis(8000));
		    poScreen.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/ul/li[1]/div")));
		    driver.findElement(By.xpath("/html/body/div/aside/div/section/div[2]/div/div/div/div/div[1]/ul/li[2]/ul/li[2]/ul/li[1]/div")).click();

		  
		    
		}
		public void commonParentInsertionButton(WebDriver driver) {

			 //Inspection and clicking of "Insert" Button for Parent grid under PO Screen
		     WebDriverWait insertSymbole = new WebDriverWait(driver, Duration.ofMillis(8000));
			 insertSymbole.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")));
		     driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div/div/div[4]/div/div/div[3]/div[2]/div/div/div")).click();
	    }
	     public void commonElementsChildInsertion(WebDriver driver) throws InterruptedException {
			
			//Inspection and clicking of "Insert" Button for Child grid under PO Screen
			WebDriverWait insertChildSymbole = new WebDriverWait(driver, Duration.ofMillis(8000));
		    insertChildSymbole.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[4]/div/div/div[3]/div[1]/div/div/div")).click();
		    System.out.println("06.Clicked on 'Insert' button to add new CHILD Record");
		  //  Reporter.log("06.Clicked on 'Insert' button to add new CHILD Record");
		    reportLog("06.Clicked on 'Insert' button to add new CHILD Record");
		    Thread.sleep(2000);		    
		    
		    //Inspection and clicking of "Discipline Code"   	    
		    WebDriverWait disciplineCodeDropdown = new WebDriverWait(driver, Duration.ofMillis(8000));
		    disciplineCodeDropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[1]/div/div/div/div/div[2]/div/div/div")).click();
		    Thread.sleep(2000);
		    
		    //Inspection and clicking of particular "Discipline Code"    	    
		    WebDriverWait disciplineCodeDropdownPiping = new WebDriverWait(driver, Duration.ofMillis(8000));
		    disciplineCodeDropdownPiping.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[6]/div")));
		    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[6]/div")).click();
		    System.out.println("07.Choosing 'Displine code' ");
		    //Reporter.log("07.Choosing 'Displine code' ");
		    reportLog("07.Choosing 'Displine code' ");
		    Thread.sleep(2000);
	   }
		public void commonElementPODate(WebDriver driver) throws InterruptedException {
			//Inspection and clicking of "PO Order Date"   	    
		    WebDriverWait poorderDate = new WebDriverWait(driver, Duration.ofMillis(8000));
		    poorderDate.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/div/div[2]/div/div/div")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]/div/div/div[1]/div/div[2]/div/div/div")).click();
		    Thread.sleep(2000);

		  //Inspection and clicking of particular "PO Order Date"    	    
		    WebDriverWait poorderParticularDate = new WebDriverWait(driver, Duration.ofMillis(8000));
		    poorderParticularDate.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/table/tbody/tr[3]/td[4]")));
		    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/table/tbody/tr[3]/td[4]")).click();
		    Thread.sleep(2000);
			
		}
		public void commonSAVEbutton(WebDriver driver) throws InterruptedException {

		    //Inspection and clicking of "SAVE" Button inside Parent grid   	    
		    WebDriverWait saveButtonPO = new WebDriverWait(driver, Duration.ofMillis(8000));
		    saveButtonPO.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[8]/a[1]/span")));
		    driver.findElement(By.xpath("/html/body/div/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[8]/a[1]/span")).click();
		    Thread.sleep(2000);
			
		}
	    public void commonSAVEbuttonCHILD(WebDriver driver) throws InterruptedException {

			 //Inspection and clicking of "SAVE" Button inside Child grid 
		      WebDriverWait saveButtonChildd = new WebDriverWait(driver, Duration.ofMillis(8000));
		      saveButtonChildd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[1]/span")));
			  driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[1]/span")).click();
			  Thread.sleep(4000);
	   }
		public void commonPOQtyBackSpace(WebDriver driver) {
			 driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		     driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		     driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		     driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		    // driver.findElement(By.xpath("//*[@id=\"dxPoDetailGrid\"]/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys("8");
		     
		}
		public void commonPOQtyBackSpaceCatchBlock(WebDriver driver) {
			 driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		     driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/form/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td/div/div/div[6]/div[1]/div/div/div/table/tbody/tr[1]/td[7]/div[1]/div/div/input")).sendKeys("8");
		     
		}
		
		public void commonCompanyCodeField(WebDriver driver) {
			 //Inspection and clicking of particular "Company Code" field   
		      WebDriverWait companyCodeField = new WebDriverWait(driver, Duration.ofMillis(8000));
		      companyCodeField.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")));
		      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div/div")).click();
		}
	
	
	
	
	
}