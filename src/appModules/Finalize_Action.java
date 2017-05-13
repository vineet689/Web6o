package appModules;


import pageObjects.Call_Finalization;
import org.testng.Reporter;

public class Finalize_Action {
	
	public static void finalizationProcess() throws Exception {

		Call_Finalization.ResultCode_drop().click();
		Call_Finalization.Select_ResultCode().click();

	}

}
