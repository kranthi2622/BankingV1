package com.banking.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.banking.pageobject.LoginPage;
import com.banking.utilites.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	Logger logger=LogManager.getLogger(TC_LoginDDT_002 .class.getName());
	
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException, IOException {
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		logger.info("user name provided");
		lp.setpassword(pwd);
		logger.info("password is provided");
		lp.clickSubmit();
		logger.info("clicked on login btn");
		Thread.sleep(3000);
		
		 
		
		if(isAlertPresent()==true)
		{
			captureScreen(driver ,"loginfailed");
			Thread.sleep(2000);
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			
			Assert.assertTrue(false);
			logger.error("login failed");
		}
		else {
			Assert.assertTrue(true);
			logger.info("login passed");
			
			lp.clicklogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
		}
		
	}
	
	public boolean isAlertPresent() {//it is user defined method created to check alert is present or not
		try {
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e) {
			return false;
		}
		
	}
	
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
	String path=System.getProperty("user.dir")+"/src/test/java/com/banking/testdata/Bankdetails.xlsx";
	
	int rownum=XLUtils.getRowCount(path,"sheet1");
	int colcount=XLUtils.getCellCount(path, "sheet1", 1);
	
	String Bankdetails[][]=new String[rownum][colcount];
	
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			Bankdetails[i-1][j]=XLUtils.getCellData(path, "sheet1", i, j);
			
			}
	}
	return Bankdetails;
	
	
	
	

}}
