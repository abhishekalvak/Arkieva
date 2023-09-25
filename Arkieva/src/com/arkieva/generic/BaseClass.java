package com.arkieva.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.arkieva.pom.EnterTimeTrack;
import com.arkieva.pom.LoginPage;

public class BaseClass {
public static WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void loginArkieva() throws IOException
	{
		FileLib fl=new FileLib();
		String url=fl.getPropertData("url");
		String un=fl.getPropertData("un");
		String pwd=fl.getPropertData("pwd");
		driver.get(url);
		LoginPage lp=new LoginPage(driver);
		lp.setLogin(un, pwd);
	}
	@AfterMethod
	public void logoutArkieva()
	{
		EnterTimeTrack et=new EnterTimeTrack(driver);
		et.setLogout();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
