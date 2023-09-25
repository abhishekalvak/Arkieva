package com.arkieva.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.arkieva.generic.BaseClass;
import com.arkieva.generic.FileLib;
import com.arkieva.pom.EnterTimeTrack;
import com.arkieva.pom.TasksPage;

@Listeners(com.arkieva.generic.ListenerImplementation.class)
public class CreateTask extends BaseClass{

	@Test
	public void testCreateTask() throws InterruptedException, EncryptedDocumentException, IOException
	{
		EnterTimeTrack et=new EnterTimeTrack(driver);
		et.setTaskTab();
		TasksPage tp=new TasksPage(driver);
		FileLib fl=new FileLib();
		String text=fl.getExcelData("CreateTask", 1, 6);
		tp.setAddNewBtn();
		tp.setNewTaskBtn();
		Thread.sleep(4000);
		tp.setSelctCustDropDwn();
		tp.settaskHDFC_001();
		Thread.sleep(4000);
		tp.setSelectProjectDropDwn();
		tp.setFlightOperations();
		tp.setTaskField(text);
		String ATxt=tp.getSuccessText().getText();
		String ExTxt="Flight operations";
		Assert.assertEquals(ATxt, ExTxt);
		tp.setCreateTaskButton();
		Thread.sleep(4000);
	}
}
