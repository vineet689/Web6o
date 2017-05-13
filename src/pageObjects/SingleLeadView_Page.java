package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class SingleLeadView_Page extends BaseClass {
	private static WebElement element;
	public static String sProductName;
	public static String sProductPrice;

	public SingleLeadView_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement CallActive() {
		element = null;
		try {
			element = driver
					.findElement(By
							.xpath("//a[@id='nav-activeVoice']/i/span/em"));
			Log.info("Found Call is in Active Mode!");
		} catch (Exception e) {
			Log.error("Seems Call is not in Active Mode!");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ProductName() {
		element = null;
		try {
			element = driver
					.findElement(By
							.xpath(".//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[2]/a"));
			Log.info("Product Name for purchased product is found on the Check Out Page");
		} catch (Exception e) {
			Log.error("Price for purchased product on Check Out page is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Continue() {
		element = null;
		try {
			element = driver
					.findElement(By
							.xpath(".//*[@id='checkout_page_container']/div[1]/a/span"));
			Log.info("Continue button is found on the Check Out Page");
		} catch (Exception e) {
			Log.error("Continue button on Check Out page is not found");
			throw (e);
		}
		return element;
	}
}
