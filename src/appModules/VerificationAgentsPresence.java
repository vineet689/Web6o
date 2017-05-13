package appModules;

import pageObjects.Home_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

 
public class VerificationAgentsPresence {
	public static void productType(int iTestCaseRow) throws Exception {
		try {

		
			if("Busy".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType))){
	        	
	
				Home_Page.TopNavigation.Product_Type.AgentPrsenceBusy();				// Printing the logs
				Log.info("Product Type Accessories is selected from the Top menu");
			}
			// If the Excel value for the Product Type is iMacs, then do this
			if ("Avaliable".equals(ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_ProductType))) {
				Home_Page.TopNavigation.Product_Type.AgentPresenceAvailable();
				Log.info("Product Type iMacs is selected from the Top menu");
			}
			// If the Excel value for the Product Type is iPads, then do this
			if ("Away".equals(ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_ProductType))) {
				Home_Page.TopNavigation.Product_Type.agentPresence();
				Log.info("Product Type iPads is selected from the Top menu");
			}
			// If the Excel value for the Product Type is iPhones, then do this
			if ("Test Outbound".equals(ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_ProductType))) {
				Home_Page.TopNavigation.Product_Type.ProjectDropDown();
				Log.info("Product Type iPhones is selected from the Top menu");
			}
			// If the Excel value for the Product Type is null, then do this
			if ("".equals(ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_ProductType))) {
				Log.warn("Excel value for Product Type is Blank");
			}

		} catch (Exception e) {
	
			throw (e);
		}
	}

	public static void productNumber(int iTestCaseRow) throws Exception {
		try {


			if ("Busy".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductNumber))) {

			//	ProductListing_Page.Product_1.btn_AddToCart().click();
			
				Log.info("Product 1 is selected from the Product listing page");
			}
			// If the Excel value for the Product Number is "Product 2", then do
			// this
			if ("Product 2".equals(ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_ProductNumber))) {
			//	ProductListing_Page.Product_2.btn_AddToCart().click();
				Log.info("Product 2 is selected from the Product listing page");
			}
			// / If the Excel value for the Product Type is null, then do this
			if ("".equals(ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_ProductNumber))) {
				Log.warn("Excel value for Product Number is Blank");
			}

			
		} catch (Exception e) {

			throw (e);
		}
	}

}
