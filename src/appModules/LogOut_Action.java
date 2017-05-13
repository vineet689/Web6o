package appModules;

import org.testng.Reporter;

import pageObjects.LogIn_Logout_Page;
import utility.Utils;
import utility.Log;

// This is called Modularization, when we club series of actions in to one Module
 
public class LogOut_Action {

		public static void ExecuteLogOut() throws Exception {

		//LogIn_Logout_Page.btn_LogIn().click();
		//Log.info("Click action is performed on Submit button");
		//LogIn_Logout_Page.btn_Dashboard().click();
		LogIn_Logout_Page.btn_SignOut().click();
		Reporter.log("SignOut Action is successfully perfomred");
		LogIn_Logout_Page.finalLogout().click();
		Reporter.log("Final LogOut Action is successfully perfomred");

				
		//Utils.waitForElement(LogIn_Logout_Page.btn_SignOut());

	
	}
}
