package com.banking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_Edit_Page {
	
	
		
		WebDriver ldriver;
		
		public Customer_Edit_Page(WebDriver rdriver) {
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(linkText="Edit Customer")
		WebElement Editcustomer;
		

		@FindBy(xpath="//input[@name='cusid']")
		WebElement customeruserID;

		@FindBy(xpath="//input[@name='AccSubmit']")
		WebElement clicksubmit;

		
		@FindBy(xpath="//input[@name='city']")
		WebElement Editcustomercity;

		@FindBy(xpath="//input[@name='telephoneno']")
		WebElement EditcustomerTele;

		@FindBy(xpath="//input[@name='sub']")
		WebElement clicksubbtn;
		
		public void editcustomer() {
			Editcustomer.click();
		}
		

		public void customerID(String CUID) {
			customeruserID.sendKeys(CUID);
		}
		
		public void clicksubmit() {
			clicksubmit.click();
		}
		
		public void  Editcustomercity() {
			 Editcustomercity.clear();
		}
		
		public void customercity(String city) {
			Editcustomercity.sendKeys(city);
		}
		
		public void  customerTele() {
			 EditcustomerTele.clear();
		}
		public void customerTele(String tele) {
			EditcustomerTele.sendKeys(tele);
		}
		
		public void clicksubbtn() {
			clicksubbtn.click();
		}
		
}