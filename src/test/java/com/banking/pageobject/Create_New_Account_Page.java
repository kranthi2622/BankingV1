package com.banking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_New_Account_Page {
WebDriver ldriver;
	
	public Create_New_Account_Page(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[normalize-space()='New Account']")
	WebElement newaccount;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement newaccountCID;
	

	@FindBy(xpath="//input[@name='inideposit']")
	WebElement initialdeposit;
	
	@FindBy(xpath="//input[@name='button2']")
	WebElement clickbtn;

	
	
	public void newaccount() {
		newaccount.click();
	}
	

	public void newaccountCID(String cid) {
		 newaccountCID.sendKeys(cid);
	}
	

	public void initialdeposit(String indep) {
		initialdeposit.sendKeys(indep);
	}
	

	public void clickbtn() {
		clickbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
