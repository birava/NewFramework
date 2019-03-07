package com.manne.cva;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstPgm {
	
	

WebDriver d;
	
	
	
	@BeforeMethod
	
	public void mai() {
		System.setProperty("webdriver.chrome.driver", "E:\\cva selenium\\SivaKumarFW\\Drivers\\chromedriver.exe");
		
		d = new ChromeDriver();
		d.navigate().to("https://www.gmail.com/");
		

	}
	
	@AfterMethod
	
	public  void non() {
	d.quit();

	}
	
	@Test
	public void mn() {
		// TODO Auto-generated method stub
System.out.println("siva");

Reporter.log("sivakumar");

Reporter.log("sivakumar");
Reporter.log("sivakumar");
Reporter.log("sivakumar");


	}

}
