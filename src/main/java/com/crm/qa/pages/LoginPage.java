package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	// Need the page Factory here 
	
	@FindBy(name = "username")
	WebElement  name1 ;
	
	@FindBy(name="password")
	WebElement password1;
	
	@FindBy(xpath ="//input[@type = 'submit']")
	WebElement LoginBtn ;
	
	@FindBy(xpath="font[contains(text()  , 'Sign Up')]")
	WebElement SignUpBtn;
	
	
	@FindBy(xpath="html/body/div[2]/div/div[1]/a/img")
	WebElement CrmLogoImg;
	
	
     public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
     public String ValidateLoginPageTitle() {
 		
 		return driver.getTitle();
 	}
     
     public boolean validateCRMImage() { 
    	 
    	return CrmLogoImg.isDisplayed();
    	 
     }
     
     public HomePage Login(String un , String pwd) {
    	 name1.sendKeys(un);
    	 password1.sendKeys(pwd);
    	 LoginBtn.click();
    	 return new HomePage();
    	 
    	 
     }
     
     
     
     
     
     
     
     
     
     
     

}
