package com.arkieva.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement passwd;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgnBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String uname,String password)
	{
	un.sendKeys(uname);
	passwd.sendKeys(password);
	lgnBtn.click();
	}
}
