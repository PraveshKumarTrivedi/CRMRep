package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'Log In')]")
	WebElement loginLink;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement loginbtn;
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPage()
	{
		return driver.getTitle();
	}
	
	public HomePage validateUser(String un, String upwd)
	{
		loginLink.click();
		username.sendKeys(un);
		password.sendKeys(upwd);
		loginbtn.click();
		return new HomePage();
	}

}

