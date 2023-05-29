package com.inetBanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="uid")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement loginBtn;
	
	@FindBy(xpath="")
	WebElement linkLogout;
	
	public void setUserName(String uname)
	{
		userName.sendKeys(uname);
		
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
		
	}
	public void clickLoginBtn()
	{
		loginBtn.click();
		
	}
	public void clickLogout()
	{
		linkLogout.click();
	}
	
}
