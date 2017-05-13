package appModules;


import pageObjects.ManualDial_Page;
import org.testng.Reporter;

public class ManualCall_Actions {
	
	public static void DialManualCall() throws Exception {

		ManualDial_Page.DialNumber1().click();
		ManualDial_Page.DialNumber2().click();
		ManualDial_Page.DialNumber3().click();
		ManualDial_Page.DialNumber4().click();
		ManualDial_Page.DialNumber5().click();
		ManualDial_Page.DialNumber6().click();
		ManualDial_Page.DialNumber7().click();
		ManualDial_Page.DialNumber8().click();
		ManualDial_Page.DialNumber9().click();
		//ManualDial_Page.DialNumber0().click();
		ManualDial_Page.CallButton().click();





	}

}
