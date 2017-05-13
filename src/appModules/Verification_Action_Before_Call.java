package appModules;

import org.testng.Reporter;

import pageObjects.BaseClass;
import pageObjects.Home_Page;
import pageObjects.LogIn_Logout_Page;
import pageObjects.SingleLeadView_Page;
import pageObjects.Confirmation_Page;
import utility.Log;

public class Verification_Action_Before_Call {

	public static void CheckOnjectBeforeCall() throws Exception {

		if(Home_Page.agent_Presense_Icon().isDisplayed()){
			Reporter.log("Verification Passed for Presense Icon after Agent's Login ");
		}
		else{
			Reporter.log("Verification Failed for Presense Icon after Agent's Login");
		}
		if(Home_Page.ProjectDropdown().isDisplayed()){
			Reporter.log("Verification Passed for Project Dropdown after Agent's Login ");
		}
		else{
			Reporter.log("Verification Failed for Project Dropdown after Agent's Login");
		}
		if(Home_Page.CollepseMenu().isDisplayed()){
			Reporter.log("Verification Passed for Collepse Menu after Agent's Login ");
		}
		else{
			Reporter.log("Verification Failed for Collepse Menu after Agent's Login");
		}
		if(Home_Page.DashboardLink().isDisplayed()){
			Reporter.log("Verification Passed for Dashboard Link after Agent's Login ");
		}
		else{
			Reporter.log("Verification Failed for Dashboard Link after Agent's Login");
		}
		if(Home_Page.InboundTotalDS().isEnabled()){
			Reporter.log("Verification Passed for InboundTotal Call DS after Agent's Login ");
		}
		else{
			Reporter.log("Verification Failed for InboundTotal Call DS after Agent's Login");
		}
		
		if(Home_Page.OutboundTotalDS().isDisplayed()){
			Reporter.log("Verification Passed for Outbound Total Call DS after Agent's Login ");
		}
		else{
			Reporter.log("Verification Failed for Outbound Total Call DS after Agent's Login");
		}
		
		if(Home_Page.ChatQueueTotalDS().isDisplayed()){
			Reporter.log("Verification Passed for ChatQueueTotal DS after Agent's Login ");
		}
		else{
			Reporter.log("Verification Failed for ChatQueueTotal DS after Agent's Login");
		}
		if(Home_Page.CallLink().isDisplayed()){
			Reporter.log("Verification Passed for Call button after Agent's Login ");
		}
		else{
			Reporter.log("Verification Failed for Call button after Agent's Login");
		}
		
		if(Home_Page.CallQueueLink().isDisplayed()){
			Reporter.log("Verification Passed for CallQueueLink after Agent's Login ");
		}
		else{
			Reporter.log("Verification Failed for CallQueueLink after Agent's Login");
		}
		
		if(Home_Page.ChatEmailLink().isDisplayed()){
			Reporter.log("Verification Passed for ChatEmailLink after Agent's Login ");
		}
		else{
			Reporter.log("Verification Failed for ChatEmailLink after Agent's Login");
		}
		
		if(Home_Page.Contacts().isDisplayed()){
			Reporter.log("Verification Passed for Contacts after Agent's Login ");
		}
		else{
			Reporter.log("Verification Failed for Contacts after Agent's Login");
		}
		
		if(Home_Page.NumberInputTextBox().isDisplayed()){
			Reporter.log("Verification Passed for NumberInputTextBox after Agent's Login ");
		}
		else{
			Reporter.log("Verification Failed for NumberInputTextBox after Agent's Login");
		}
	/*
		
		if (LogIn_Logout_Page.btn_Dashboard().equals(Home_Page.lnk_LogOut())) {
			// Here I have put a verification check on the Product Name, if it
			// is matched, my verification will pass
			Reporter.log("Verification Passed for Logout Option");

		} else {
			// If it not matched then the verification check is failed
			Reporter.log("Verification Failed for LogOut Option");
			// If the above verification gets failed then I have to report this
			// to my test and fail the test accordingly
			// To achieve this, I have initialized this variable of Base class
			// at the start of my test with value true in it
			// At the end of my test, i will match the value, if it will be
			// false then I will fail the test, else the test will be pass
			BaseClass.bResult = false;
		}

		if (SingleLeadView_Page.sProductPrice.equals(Confirmation_Page.sProductPrice)) {
			Reporter.log("Verification Passed for Product Price");
		} else {
			Reporter.log("Verification Failed for Product Price");
			BaseClass.bResult = false;
		}
	}
*/
}
}
