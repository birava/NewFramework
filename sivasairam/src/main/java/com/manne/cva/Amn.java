package com.manne.cva;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amn {

WebDriver d;
	
	
	
	@BeforeMethod
	
	public void mai() {
		
		
		d = new ChromeDriver();
		d.navigate().to("----");
		

	}
	
	@AfterMethod
	
	public  void non() {
	d.quit();

	}
	
	@Test
	public void mn() {
		
System.out.println("siva");

Reporter.log("sivakumar");

Reporter.log("sivakumar");
Reporter.log("sivakumar");
Reporter.log("sivakumar");


	}

}

