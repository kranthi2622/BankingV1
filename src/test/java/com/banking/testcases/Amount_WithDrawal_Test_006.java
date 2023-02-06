package com.banking.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageobject.Ammount_WithDrawal_Page;
import com.banking.pageobject.LoginPage;

public class Amount_WithDrawal_Test_006 extends BaseClass{
	
	
	
private static final Logger logger=LogManager.getLogger( Amount_WithDrawal_Test_006 .class);
	
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
		
		Ammount_WithDrawal_Page awd=new Ammount_WithDrawal_Page(driver);
		awd.withdrawalLink();
		driver.navigate().refresh();
		awd.withdrawalLink();
		Thread.sleep(3000);
		
		awd.accountNo("118174");
		logger.info("accno entered");
		awd.ammount("100");
		logger.info("ammount entered");
		awd.description("withdraw");
		Thread.sleep(3000);
		
		awd.AccSubBtn();
		
		
		if(driver.getPageSource().contains("Transaction details of Withdrawal for Account 118174"))
		{
		
			
			Assert.assertTrue(true);
			captureScreen(driver,"Ammount withdrawal");
			Thread.sleep(3000);
			logger.info("Account withdraw successfully ");
			logger.info("test case passed ");
		}
		
		else {
			captureScreen(driver,"account not created");
			Assert.assertTrue(false);
			logger.info("Customer Registration  failed");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}