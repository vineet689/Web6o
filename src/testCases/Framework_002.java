package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.Home_Page;

import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
import appModules.VerificationAgentsPresence;
import appModules.SignIn_Action;
import appModules.Verification_Action_Before_Call;

public class Framework_002 {
	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  	DOMConfigurator.configure("log4j.xml");
	  	sTestCaseName = this.toString();
	  	sTestCaseName = Utils.getTestCaseName(this.toString());
		Log.startTestCase(sTestCaseName);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		driver = Utils.OpenBrowser(iTestCaseRow);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		new BaseClass(driver);  
        }
  
  @Test
  public void VerificationBeforeCall() throws Exception {
	  try{
		SignIn_Action.Execute(iTestCaseRow);
		//Home_Page.agent_Presense_Icon();
		Verification_Action_Before_Call.CheckOnjectBeforeCall();
		
		ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
	  }catch (Exception e){
		  ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
		  Utils.takeScreenshot(driver, sTestCaseName);
		  Log.error(e.getMessage());
		  throw (e);
	  }
		
  }
		
		
  @AfterMethod
  public void afterMethod() {
	    Log.endTestCase(sTestCaseName);
	    driver.close();
  		}
}
