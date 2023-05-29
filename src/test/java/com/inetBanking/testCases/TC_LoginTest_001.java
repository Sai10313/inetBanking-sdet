package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pages.LoginPage;



public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException
	{
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("Entered UserName");
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.clickLoginBtn();
		logger.info("clicked on LoginButton");
		
		if(driver.getTitle().equals("Guru99 Bank Home Page_Sai"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			screenCapture(driver,"loginTest");
			
			Assert.assertFalse(false);
			logger.info("Login Test Failed");
		}
	}

}
