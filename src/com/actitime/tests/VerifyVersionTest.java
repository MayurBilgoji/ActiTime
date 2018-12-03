package com.actitime.tests;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

public class VerifyVersionTest extends BaseTest
{
	
@Test(priority=2)
 public void testVerifyVersion()
 {
	String loginTitle=ExcelData.getData("./data/input.xlsx","sheet1",1, 2) ;
	LoginPage lp=new LoginPage(driver);
	lp.verifyPage(loginTitle);
	lp.verifyVersion();
}
}
