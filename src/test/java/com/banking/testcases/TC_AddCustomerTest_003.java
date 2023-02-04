package com.banking.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageobject.Add_Cust_Page;
import com.banking.pageobject.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {

	private static final Logger logger = LogManager.getLogger(TC_AddCustomerTest_003.class.getName());

	@Test
	public void addNewCustomer() throws InterruptedException, IOException {

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username entered ");

		lp.setpassword(password);
		logger.info("password entered ");
		Thread.sleep(3000);

		lp.clickSubmit();
		logger.info("clicked submit");

		captureScreen(driver, "addNewCustomer");

		Add_Cust_Page addcust = new Add_Cust_Page(driver);
		addcust.clickNewcust();
		Thread.sleep(3000);
	/*	WebElement frame1 = driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0"));
	    driver.switchTo().frame(frame1);
	    WebElement frame2 = driver.findElement(By.id("ad_iframe"));
	    driver.switchTo().frame(frame2);
	    driver.findElement(By.xpath("  //*[@id=\"dismiss-button\"]/div/svg/path[2]")).click();
	    driver.switchTo().defaultContent();
	    Thread.sleep(5000);
	  //*[@id="dismiss-button"]/div/svg
	  //*[@id="dismiss-button"]/div/svg/path[1]
	  //*[@id="google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0"]
	    
	  //*[@id="dismiss-button"]/div/svg/path[2]
	  //*[@id="dismiss-button"]/div/svg/path[1]
	  //*[@id="dismiss-button"]/div/svg*/
		
		
		
		

		driver.navigate().refresh();
		Thread.sleep(3000);
		addcust.clickNewcust();
		logger.info("adding new cust details ");
		addcust.custname("Gsk");
		addcust.custgender("male");
		addcust.custdob("10", "15", "1997");
		Thread.sleep(3000);
		addcust.custadders("India");
		addcust.custcity("Bangalore");
		addcust.custState("Karnataka");
		addcust.custpincode("560033");
		addcust.custTelephone("8088146175");

		String email = randomestring() + "@gmail.com";
		addcust.custemail(email);
	//	addcust.custpwd("8495891446");
		addcust.submitbtn();
		Thread.sleep(3000);
		//driver.switchTo().alert().dismiss();
		driver.navigate().refresh();
		Thread.sleep(3000);
		logger.info("starting validation ");
		
		if(driver.getTitle().equals("Guru99 Bank Customer Registration Page"))
		{
		
			
			Assert.assertTrue(true);
			captureScreen(driver,"registration passed");
			Thread.sleep(3000);
			logger.info("test case passed ");
		}
		
		else {
			captureScreen(driver,"registration failure");
			Assert.assertTrue(false);
			logger.info("Customer Registration  failed");
			
		}
	}
	

	
		/*public void alertclose() {
			Actions act=new Actions(driver);
			WebElement ele=driver.findElement(By.xpath("//div//button[text()='No thanks']"))
			act.moveToElement(ele).build().perform();
			ele.click();
		}*/
		

	}


