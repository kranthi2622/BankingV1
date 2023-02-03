package com.banking.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Cust_Page {
	
	WebDriver ldriver;
	
	public Add_Cust_Page(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[normalize-space()='New Customer']")
	WebElement newcustomer;
	
	@FindBy(xpath="//a[normalize-space()='New Customer']")
	WebElement alertbtn;
	
	@FindBy(xpath="(//table[@align='center']//input)[1]")
	WebElement custname;
	
	@FindBy(xpath="(//input[@name='rad1'])[1]")
	WebElement custgender;
	
	
	@FindBy(xpath="//input[@type='date']")
	WebElement custdob;
	
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement custadders;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement custcity;
	@FindBy(xpath="//input[@name='state']")
	WebElement custState;
	@FindBy(xpath="//input[@name='pinno']")
	WebElement custpincode;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement custTelephone;
	
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement custemail;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement custpwd;
	

	@FindBy(xpath="//input[@name='sub']")
	WebElement submitbtn;
	
	
	public void clickNewcust() {
		newcustomer.click();
	}
	public void switchTo() {
		alertbtn.click();
	}
	
	

	public void custname(String Cname) {
		custname.sendKeys(Cname);
	}
	
	public void custgender(String Cgender) {
		custgender.click();
	}
	public void custdob(String mm,String dd,String yy) {
		custdob.sendKeys(mm);
		custdob.sendKeys(dd);
		custdob.sendKeys(yy);
	}
	public void custadders(String Cadd) {
		 custadders.sendKeys(Cadd);
	}
	public void custcity(String Ccity) {
		custcity.sendKeys(Ccity);
	}
	public void custState(String Cstate) {
		custState.sendKeys(Cstate);
	}
	
	
	public void custpincode(String Cpin) {
		custpincode.sendKeys(String.valueOf(Cpin));
	}
	
	public void custTelephone(String Cmobile) {
		custTelephone.sendKeys(Cmobile);
	}
	
	public void custemail(String Cmail) {
		custemail.sendKeys(Cmail);
	}
	
	public void  custpwd(String pwd) {
		 custpwd.sendKeys(pwd);
	}
	
	public void  submitbtn() {
		 submitbtn.click();
	}
	
}
	
	
	
	
