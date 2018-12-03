package com.actitime.tests;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

public class VerifyBuildNumberTest extends BaseTest
{
	@Test(priority=3)
	public void verifyBuildNo()
	{
		String user=ExcelData.getData("./data/input.xlsx","sheet1", 1, 0);
		String pass=ExcelData.getData("./data/input.xlsx","sheet1", 1, 1);
		String loginTitle=ExcelData.getData("./data/input.xlsx","sheet1", 1, 2);
		String enterTimeTrack=ExcelData.getData("./data/input.xlsx","sheet1", 1, 3);
		LoginPage lp= new LoginPage(driver);
		EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
		lp.enterUserName(user);
		lp.enterPassword(pass);
		lp.clickOnlogin();
		ep.clickOnHelp();
		ep.clickOnAboutYourActitime();
		ep.Buildnumber();
				
				
		
	}

}
