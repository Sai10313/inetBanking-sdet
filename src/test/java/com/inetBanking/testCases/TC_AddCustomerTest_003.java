package com.inetBanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.inetBanking.pages.AddCustomerPage;
import com.inetBanking.pages.LoginPage;

import junit.framework.Assert;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		lp.setPassword(password);
		lp.clickLoginBtn();
		
		Thread.sleep(3000);
		
		AddCustomerPage adCust=new AddCustomerPage(driver);
		adCust.addCustomer();
		adCust.custName("Vihas");
		adCust.selectGender("male");
		adCust.customeDob("24", "july", "2016");
		Thread.sleep(3000);
		adCust.custAddress("INDIA");
		adCust.custCity("HYDERBAD");
		adCust.custState("Andhra pradesh");
		adCust.custPin("518395");
		adCust.custTelephone("9885488081");
	    String email=randomestring()+"@gamil.com";
	    adCust.custEmail(email);
	    adCust.custPassword("asdfgh");
	    adCust.clickSubmit();
	
	Thread.sleep(3000);
	
	boolean result=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(result ==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			screenCapture(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
	}
	
	
	
}
