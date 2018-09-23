package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

//import org.openqa.selenium.WebDriver;


		
public class TestBase {
	
	
	public static WebDriver driver ; 
	public static Properties prop ; 
	
	// Create the Constructor of test Base Class 
	public 	TestBase() {
		
		// Inside Base Class we need to describe the Properties file 
		
		prop = new Properties() ; 
		FileInputStream ip;
		try {
			
			ip = new FileInputStream("C:\\Users\\mama\\Downloads\\eclipse\\workspace\\FreeCrmProject\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
// After the Constructor we will create the initialization method 
	
	public static void initialization() {
		
		             String browserName =   prop.getProperty("browser");
		             
		             if(browserName.equalsIgnoreCase("chrome")) {
		            	 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		            	  driver=new ChromeDriver();
		            	 
		             }
		
		             else if(browserName.equalsIgnoreCase("FF")) {
		            	 System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		            	  driver=new FirefoxDriver();
		            	 
		             }
		             
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		   driver.get(prop.getProperty("url"));
		             
		             
		             
		             
	}
	
	
	

}
 
	
	


