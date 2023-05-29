package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	public ReadConfig() 
	{
		File file=new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(file);
			prop=new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Exception is :"+e.getMessage());
		} 
	}
	public String getApplicationUrl()
	{
		String url=prop.getProperty("baseUrl");
		return url;
	}
	
	public String getUserName()
	{
		String uname=prop.getProperty("username");
		return uname;
	}
	public String getPassword()
	{
		String pwd=prop.getProperty("password");
		return pwd;
	}
	public String getChromePath()
	{
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}
	public String getEdgePath()
	{
		String edgePath=prop.getProperty("edgepath");
		return edgePath;
	}public String getBrowserName()
	{
		String bn=prop.getProperty("browserName");
		return bn;
	}
	
}
