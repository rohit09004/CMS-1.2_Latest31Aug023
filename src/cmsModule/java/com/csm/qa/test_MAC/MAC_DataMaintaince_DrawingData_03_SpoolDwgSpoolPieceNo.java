package com.csm.qa.test_MAC;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class MAC_DataMaintaince_DrawingData_03_SpoolDwgSpoolPieceNo {

	
	
	 public static String capture(WebDriver driver,String screenShotName) throws IOException
	    {
		    Random randVar = new Random();
		    int randomVar=randVar.nextInt(1000);
	        TakesScreenshot ts = (TakesScreenshot)driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        String dest = System.getProperty("user.dir") +"\\TestEvidences[ExtentReport]\\PO\\"+screenShotName+randomVar+".png";
	        File destination = new File(dest);
	        FileUtils.copyFile(source, destination);        
	                     
	        return dest;
	    }
}
