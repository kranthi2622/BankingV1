package com.banking.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.banking.pageobject.Create_New_Account_Page;
import com.banking.pageobject.LoginPage;

public class Create_NewAccount_Test_005 extends BaseClass {
	
private static final Logger logger=LogManager.getLogger( Create_NewAccount_Test_005.class);
	
	@Test
	public void addaccount() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username entered ");

		lp.setpassword(password);
		logger.info("password entered ");
		Thread.sleep(3000);

		lp.clickSubmit();
		logger.info("clicked submit");
		Thread.sleep(3000);
		
		
		Create_New_Account_Page ac=new Create_New_Account_Page(driver);
		
		ac.newaccount();
		driver.navigate().refresh();
		Thread.sleep(3000);
		ac.newaccount();
		
		ac.newaccountCID("49059");
		Thread.sleep(3000);
		
		ac.initialdeposit("1000");
		Thread.sleep(2000);
		ac.clickbtn();
		
		
		if(driver.getPageSource().contains("Account Generated Successfully!!!"))
		{
		
			
			Assert.assertTrue(true);
			captureScreen(driver,"Account Created");
			Thread.sleep(3000);
			logger.info("Account created successfully ");
			logger.info("test case passed ");
		}
		
		else {
			captureScreen(driver,"account not created");
			Assert.assertTrue(false);
			logger.info("Customer Registration  failed");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}