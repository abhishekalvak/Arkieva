package com.arkieva.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.arkieva.generic.BaseClass;
import com.arkieva.generic.FileLib;
import com.arkieva.pom.EnterTimeTrack;
import com.arkieva.pom.TasksPage;

@Listeners(com.arkieva.generic.ListenerImplementation.class)
public class CreateProject extends BaseClass{
@Test
public void testCreateProject() throws EncryptedDocumentException, IOException, InterruptedException
{
	EnterTimeTrack et=new EnterTimeTrack(driver);
	et.setTaskTab();
	TasksPage t=new TasksPage(driver);
	FileLib fl=new FileLib();
	String pNam=fl.getExcelData("CreateProject", 1, 6);
	String pDesc=fl.getExcelData("CreateProject", 1, 7);
	t.setAddNewBtn();
	t.setNewProjectBtn();;
	t.setEnterProjectNameField(pNam);
	t.setCustomerDropDwn();
	t.setHDFC_001();
	t.setProjectDesc(pDesc);
	t.setCreateProjectBtn();
	Thread.sleep(5000);
}
}
