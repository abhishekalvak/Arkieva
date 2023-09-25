package com.arkieva.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack {
	
@FindBy(id="logoutLink")
private WebElement logBtn;

@FindBy(xpath="//div[text()='Tasks']/..")
private WebElement taskTab;

public EnterTimeTrack(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void setLogout()
{
	logBtn.click();
}

public void setTaskTab() {
	taskTab.click();
}


}
