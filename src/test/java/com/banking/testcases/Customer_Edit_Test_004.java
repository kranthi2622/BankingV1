package com.banking.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.banking.pageobject.Customer_Edit_Page;
import com.banking.pageobject.LoginPage;

public class Customer_Edit_Test_004 extends BaseClass{
	private static final Logger logger=LogManager.getLogger(Customer_Edit_Test_004.class);
	
	@Test
	public void editcustomer() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username entered ");

		lp.setpassword(password);
		logger.info("password entered ");
		Thread.sleep(3000);

		lp.clickSubmit();
		logger.info("clicked submit");
		Thread.sleep(3000);
		
		Customer_Edit_Page ep=new Customer_Edit_Page(driver);
		
		ep.editcustomer();
		driver.navigate().refresh();
		ep.editcustomer();
		Thread.sleep(3000);
		ep.customerID("49059");
		ep.clicksubmit();
		Thread.sleep(3000);
		ep.Editcustomercity();
		Thread.sleep(3000);
		ep.customercity("chikkaballapura");
		logger.info("customer city changed");
		Thread.sleep(3000);
		ep.customerTele();
		
		Thread.sleep(3000);
		ep.customerTele("8495894462");
		logger.info("customer telephone changed");
		ep.clicksubbtn();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		//driver.navigate().back();
	}

}
