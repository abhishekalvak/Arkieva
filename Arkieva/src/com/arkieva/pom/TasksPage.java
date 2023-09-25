package com.arkieva.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewBtn;

@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustomer;

@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
private WebElement customerNameField;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement customerDescrField;

@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
private WebElement copyProjectDropdown;

@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
private WebElement bigbangOption;

@FindBy(xpath="//div[text()='Create Customer']")
private WebElement createCustomerBtn;

@FindBy(xpath="//div[text()='+ New Project']")
private WebElement newProjectBtn;

@FindBy(xpath="//input[@placeholder=\"Enter Project Name\" and @class]")
private WebElement enterProjectNameField;

@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
private WebElement customerDropDwn;

@FindBy(xpath="//div[@class='searchItemList']/div[text()='HDFC_001']")
private WebElement hDFC_001;

@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
private WebElement projectDesc;

@FindBy(xpath="//div[text()='Create Project']")
private WebElement createProjectBtn;

@FindBy(xpath="//div[text()='+ New Tasks']")
private WebElement newTaskBtn;

@FindBy(xpath="//div[text()='- Select Customer -']")
private WebElement selctCustDropDwn;

@FindBy(xpath="(//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
private WebElement taskHDFC_001;

@FindBy(xpath="//div[contains(text(),' Select Project')]")
private WebElement selectProjectDropDwn;

@FindBy(xpath="//div[@class='searchItemList']/div[text()='Flight operations']")
private WebElement flightOperations;

@FindBy(xpath="//div[text()='Create Tasks']")
private WebElement createTaskButton;

@FindBy(xpath="//input[@placeholder='Enter task name' and @fdprocessedid='4maxnh']")
private WebElement taskField;

@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
private WebElement successText;

public TasksPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setAddNewBtn() {
	addNewBtn.click();
}

public void setNewCustomer() {
	newCustomer.click();
}

public void setCustomerNameField(String text) {
	customerNameField.sendKeys(text);;
}

public void setCustomerDescrField(String desc) {
	customerDescrField.sendKeys(desc);;
}

public void setCopyProjectDropdown() {
	copyProjectDropdown.click();;
}

public void setBigbangOption() {
	bigbangOption.click();;
}

public void setCreateCustomerBtn() {
	createCustomerBtn.click();;
}

public void setNewProjectBtn() {
	newProjectBtn.click();
}
public void setEnterProjectNameField(String text) {
	enterProjectNameField.sendKeys(text);
}



public void setCustomerDropDwn() {
	customerDropDwn.click();;
}

public void setHDFC_001() {
	hDFC_001.click();
}

public void setProjectDesc(String desc) {
	projectDesc.sendKeys(desc);;
}


public WebElement getCreateProjectBtn() {
	return createProjectBtn;
}

public void setCreateProjectBtn() {
	createProjectBtn.click();
}

public void setNewTaskBtn() {
	newTaskBtn.click();
}

public void setSelctCustDropDwn() {
	selctCustDropDwn.click();
}
public void settaskHDFC_001() {
	taskHDFC_001.click();
}

public void setSelectProjectDropDwn() {
	selectProjectDropDwn.click();
}

public void setFlightOperations() {
	flightOperations.click();
}

public void setCreateTaskButton() {
	createTaskButton.click();
}

public void setTaskField(String text) {
	taskField.sendKeys(text);
}

public WebElement getSuccessText() {
	return successText;
}
}
