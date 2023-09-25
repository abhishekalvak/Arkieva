package com.arkieva.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.arkieva.generic.BaseClass;
import com.arkieva.generic.FileLib;
import com.arkieva.pom.EnterTimeTrack;
import com.arkieva.pom.TasksPage;

@Listeners(com.arkieva.generic.ListenerImplementation.class)
public class CreateCustomer extends BaseClass {

	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		EnterTimeTrack et=new EnterTimeTrack(driver);
		et.setTaskTab();
		FileLib fl=new FileLib();
		String name=fl.getExcelData("CreateCustomer", 1, 6);
		String desc=fl.getExcelData("CreateCustomer", 1, 7);
		TasksPage tp=new TasksPage(driver);
		tp.setAddNewBtn();
		tp.setNewCustomer();
		tp.setCustomerNameField(name);
		tp.setCustomerDescrField(desc);
		tp.setCopyProjectDropdown();
		tp.setBigbangOption();
		tp.setCreateCustomerBtn();
		Thread.sleep(5000);
	}
}
