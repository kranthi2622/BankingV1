package com.banking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
@FindBy(name="uid")
WebElement txtUserName;

@FindBy(name="password")
WebElement txtPassword;

@FindBy(name="btnLogin")
WebElement btLogin;


@FindBy(xpath="//a[contains(text(),'Log out')]")
WebElement lnkLogout;

public void setUserName(String uname) {
	txtUserName.sendKeys(uname);
}

public void setpassword(String pwd) {
	txtPassword.sendKeys(pwd);
}

public void clickSubmit() {
	btLogin.click();;
}
public void clicklogout() {
	lnkLogout.click();
}



}
