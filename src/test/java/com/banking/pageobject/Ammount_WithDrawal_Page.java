package com.banking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ammount_WithDrawal_Page {
	
WebDriver ldriver;
	
	public Ammount_WithDrawal_Page(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(linkText="Withdrawal")
	WebElement withdrawalLink;
	
	
	@FindBy(xpath="//input[@name='accountno']")
	WebElement accountNo;
	
	@FindBy(xpath="//input[@name='ammount']")
	WebElement ammount;
	
	@FindBy(xpath="//input[@name='desc']")
	WebElement description;
	
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement AccSubBtn;
	
	
	public void withdrawalLink() {
		withdrawalLink.click();
	}
	
	public void  accountNo(String Accno) {
		 accountNo.sendKeys(Accno);
	}
	public void  ammount(String Ammount) {
		ammount.sendKeys(Ammount);
	}
	
	public void description(String desc) {
		description.sendKeys(desc);
	}
	
	public void  AccSubBtn() {
		 AccSubBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
