package com.banking.testcases;




import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageobject.LoginPage;



public class Tc_LoginTest_001 extends BaseClass{
	LoginPage lp;
	private static final Logger	logger =LogManager.getLogger(Tc_LoginTest_001.class);

	@Test
	public void loginTest() throws InterruptedException, IOException {
		
		logger.info("url is opened ");
		
		 lp=new LoginPage(driver);
		
		lp.setUserName(username);
		
		logger.info("username entered ");
		
	
		lp.setpassword(password);
		logger.info("password entered ");
		Thread.sleep(3000);
		
		lp.clickSubmit();
		logger.info("clicked on login ");
		
	
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("test case passed ");
		}
		
		else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
			
		}
		
		
		
	}

}
