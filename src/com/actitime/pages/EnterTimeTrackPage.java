package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.actitime.generic.BasePage;

public class EnterTimeTrackPage extends BasePage
{
	//declaration
	@FindBy(id="logoutLink")
	private WebElement logoutBTN;
	
	@FindBy(xpath="//div[@class='popup_menu_icon support_icon']")
	private WebElement helpBTN;
	
	@FindBy(xpath="//a[.='About your actiTIME']")
	private WebElement aboutYourActiTime;
	
	@FindBy(xpath="//span[.='(build 40469)']")
	private WebElement build;
	
	//initialization
	public EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	//utilization
	public void clickOnLogout()
	{
		logoutBTN.click();
	}
	public void clickOnHelp()
	{
		helpBTN.click();
	}
	public void clickOnAboutYourActitime()
	{
		aboutYourActiTime.click();
	}
	public void Buildnumber()
	{
		verifyElement(build);
		Reporter.log("Build number: "+build.getText(),true);
	}
}


