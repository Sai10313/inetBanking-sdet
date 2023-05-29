package com.inetBanking.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig=new ReadConfig();
	
	public String url=readConfig.getApplicationUrl();
	public String userName=readConfig.getUserName();
	public String password=readConfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser)
	{
		 logger=LogManager.getLogger(BaseClass.class);
		 
		 if(browser.equals("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
			 driver=new ChromeDriver();
		 }
		 else if(browser.equals("edge"))
		 {
			 System.setProperty("webdriver.edge.driver",readConfig.getEdgePath());
			 driver=new EdgeDriver();
		 }
		    driver.get(url);
			logger.info("Entered url");
	   
	}
	public String randomestring()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	public static String randomNum()
	{
		String generatedPin=RandomStringUtils.randomNumeric(4);
		return generatedPin;
	}
	public void screenCapture(WebDriver driver,String tname) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Taken");
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
			

}
