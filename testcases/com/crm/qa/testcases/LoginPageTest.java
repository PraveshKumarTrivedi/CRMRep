package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage login;
	HomePage homepage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		login = new LoginPage();
		homepage = new HomePage();
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title =login.validateLoginPage();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small","Title not matched");
		
	}
	@Test(priority=2)
	public void validateUserLoginTest()
	{
		homepage = login.validateUser(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod()
	public void tearDown()
	{
		//driver.quit();
	}

}
