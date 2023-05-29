package sdet.extentReports;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateExtentReport {
	
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void startReport()
	{
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/MyOwnRepo.html",true);
		extent.addSystemInfo("Host Name","Local Host");
		extent.addSystemInfo("Environment","QA");
		extent.addSystemInfo("User Name","Sai Kumar");
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		
	}

	@Test
	public void demoReportPass()
	{
		test=extent.startTest("demoReportPass");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert Pass Condition as true");
	}
	
	@Test
	public void demoReportFail()
	{
		test=extent.startTest("demoReportFail");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "Assert Fail Condition as False");
	}
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(LogStatus.FAIL, result.getThrowable());
			
		}
		extent.endTest(test);
	}
	
	@AfterTest
	public void endReport()
	{
		extent.flush();
	}
	
	
	
	
	
	
}
