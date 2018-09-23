package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPageObject ; // LoginPage loginPageObject = new LoginPage() ;
	HomePage homepage ; 
	
	// First of all need to create the constructor of LoginPageTest Class 
	
	public LoginPageTest(){
		super() ; 
		
	}
	
	@BeforeMethod
	
	public void SetUp() { 
		
		initialization();
		loginPageObject = new LoginPage();
	}
	
	@Test (priority = 1 )
	
	public void LoginPageTitleTest() { 
		
		String actula = loginPageObject.ValidateLoginPageTitle();
		Assert.assertEquals(actula, "#1 Free CRM software in the cloud for sales and service");
		
		
	}
	
	
	@Test(priority = 2)
	public void CheckLogoImageTest() {
		
		boolean statu = loginPageObject.validateCRMImage();
		Assert.assertTrue(statu);
	}
	
	@Test (priority =3)
	
	public void LoginPageTest1()
	{
		
		homepage =loginPageObject.Login(prop.getProperty("username"), prop.getProperty("password")) ;
	}
	
	
	

	@AfterMethod 
	
	public void tearDown() { 
		
		driver.quit();
	}
	
	
	

}
