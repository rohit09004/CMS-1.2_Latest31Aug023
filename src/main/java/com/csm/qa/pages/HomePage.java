package com.csm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.csm.qa.base.CSMBase;

public class HomePage extends CSMBase{
	
	@FindBy(xpath="//*[contains(text(),'0-7723-2')]")
	WebElement Job_code_key;
	
	@FindBy(xpath="//*[contains(text(),'CMS Modules')]")
	 WebElement CMS_Module;
	
	@FindBy(xpath="//span[contains(text(),'Admin')]")
	WebElement Admin;
	
	@FindBy(xpath="//*[@title='IDC']")
	WebElement clickOnIDC;
	
	@FindBy(xpath="//*[@id='dx-451b9684-7988-666a-4cd5-7e2fbdb35bd9']/div[2]")
	WebElement masterData;

	//Initialise the page object 
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCMSModuleMenu()
	{
		CMS_Module.click();
	}
	

	
	
}