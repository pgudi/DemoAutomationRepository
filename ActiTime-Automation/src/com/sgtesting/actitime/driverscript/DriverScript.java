package com.sgtesting.actitime.driverscript;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.datatable.Datatable;
import com.sgtesting.actitime.tests.Initialize;

public class DriverScript {
	public static WebDriver oBrowser=null;
	public static String strPath=null;
	public static Datatable datatable=null;
	public static String strControllerExcelFile=null;
	public static String strTestScriptDataFile=null;
	public static void main(String[] args) {
		
		try
		{
			strPath=System.getProperty("user.dir");
			strControllerExcelFile=strPath+"\\Controller\\data_Controller.xlsx";
			datatable=new Datatable();
			int iControllerRC=datatable.rowCount(strControllerExcelFile, "Scenarios");
			for(int tcid=0;tcid<iControllerRC;tcid++)
			{
				String testcaseid=datatable.getCellData(strControllerExcelFile, "Scenarios", "TestcaseID", tcid+2);
				String testcasename=datatable.getCellData(strControllerExcelFile, "Scenarios", "TestcaseName", tcid+2);
				String testcasedesc=datatable.getCellData(strControllerExcelFile, "Scenarios", "Description", tcid+2);
				String runstatus=datatable.getCellData(strControllerExcelFile, "Scenarios", "RunStatus", tcid+2);
				System.out.println("testcaseid :"+testcaseid);
				System.out.println("testcasename :"+testcasename);
				System.out.println("testcasedesc :"+testcasedesc);
				System.out.println("runstatus :"+runstatus);
				if(runstatus.equalsIgnoreCase("yes"))
				{
					oBrowser=Initialize.launchBrowser();
					//Create Driver Parameter
					Class driverParam[]=new Class[1];
					driverParam[0]=WebDriver.class;
					
					strTestScriptDataFile=strPath+"\\TestScriptDataFiles\\"+testcasename+".xlsx";
					int iTestScriptRC=datatable.rowCount(strTestScriptDataFile, testcaseid);
					for(int tsid=0;tsid<iTestScriptRC;tsid++)
					{
						String testscriptid=datatable.getCellData(strTestScriptDataFile, testcaseid, "TestScriptID", tsid+2);
						String testdescription=datatable.getCellData(strTestScriptDataFile, testcaseid, "Description", tsid+2);
						String testmethodname=datatable.getCellData(strTestScriptDataFile, testcaseid, "MethodName", tsid+2);
						String testpkgclassname=datatable.getCellData(strTestScriptDataFile, testcaseid, "PackageClassName", tsid+2);
						System.out.println("testscriptid :"+testscriptid);
						System.out.println("testdescription :"+testdescription);
						System.out.println("testmethodname :"+testmethodname);
						System.out.println("testpkgclassname :"+testpkgclassname);
						
						Class clsObject=Class.forName(testpkgclassname);
						Object obj=clsObject.getDeclaredConstructor().newInstance();
						
						Method method=obj.getClass().getMethod(testmethodname, driverParam);
						method.invoke(obj, oBrowser);
					}
					System.out.println("++++++++++++++++++++++++++++++++++++++");
				}
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
