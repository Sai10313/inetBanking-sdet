package com.inetBanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	
	
	WebDriver ldriver;
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[2]/a")
	WebElement addNewCustomer;
	
	@FindBy(how=How.NAME, using="name")
	WebElement name;
	
	@FindBy(how=How.NAME, using="rad1")
	WebElement gender;
	
	@FindBy(how=How.NAME, using="dob")
	WebElement date;
	
	@FindBy(how=How.NAME, using="addr")
	WebElement address;
	
	@FindBy(how=How.NAME, using="city")
	WebElement city;
	
	@FindBy(how=How.NAME, using="state")
	WebElement state;
	
	@FindBy(how=How.NAME, using="pinno")
	WebElement pin;
	
	@FindBy(how=How.NAME, using="telephoneno")
	WebElement phone;
	
	@FindBy(how=How.NAME, using="emailid")
	WebElement mail;
	
	@FindBy(how=How.NAME, using="password")
	WebElement password;
	
	@FindBy(how=How.NAME, using="sub")
	WebElement submit;
	
	public void addCustomer()
	{
		addNewCustomer.click();
	}
	
	public void custName(String cname)
	{
		name.sendKeys(cname);
	}
	public void selectGender(String cgender)
	{
		gender.click();
	}
	public void customeDob(String mm,String dd,String yy)
	{
		date.sendKeys(mm);
		date.sendKeys(dd);
		date.sendKeys(yy);
	}
	public void custAddress(String caddress)
	{
		address.sendKeys(caddress);
	}
	public void custCity(String ccity)
	{
		city.sendKeys(ccity);
	}
	public void custState(String cstate)
	{
		state.sendKeys(cstate);
	}
	public void custPin(String cpin)
	{
		pin.sendKeys(cpin);
	}
	public void custTelephone(String ctelephone)
	{
		phone.sendKeys(ctelephone);
	}
	public void custEmail(String cemail)
	{
		mail.sendKeys(cemail);
	}
	public void custPassword(String cpassword)
	{
		password.sendKeys(cpassword);
	}
	public void clickSubmit()
	{
		submit.click();
	}
}
