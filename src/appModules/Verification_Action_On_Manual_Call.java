package appModules;

import org.testng.Reporter;

import pageObjects.BaseClass;
import pageObjects.SingleLeadView_Page;
import pageObjects.Confirmation_Page;
import utility.Log;

public class Verification_Action_On_Manual_Call {

	public static void CheckOnjectOnManualCall() throws Exception {


		if (SingleLeadView_Page.sProductName.equals(Confirmation_Page.sProductName)) {

			Reporter.log("Verification Passed for Product Name");

		} else {
			// If it not matched then the verification check is failed
			Reporter.log("Verification Failed for Product Name");
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

}
