package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class ManualDial_Page extends BaseClass{
	private static WebElement element=null;

     public ManualDial_Page(WebDriver driver){
         	super(driver);
     }     
     
     public static WebElement DialNumber1(){
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/span/span/button"));
       		Log.info("1(one) Digits number found on the page.");
       	}catch (Exception e){
       		Log.error("1(one) Digits number not found on the page.");
       		throw(e);
       		}
       	return element;
        }
     
     public static WebElement DialNumber2(){
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/span/span[2]/button"));
       		Log.info("2(one) Digits number found on the page.");
       	}catch (Exception e){
       		Log.error("2(two) Digits number not found on the page.");
       		throw(e);
       		}
       	return element;
        }
     
     public static WebElement DialNumber3(){
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/span/span[3]/button"));
       		Log.info("2(one) Digits number found on the page.");
       	}catch (Exception e){
       		Log.error("2(two) Digits number not found on the page.");
       		throw(e);
       		}
       	return element;
        }
     
     public static WebElement DialNumber4(){
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/span/span/button[2]"));
       		Log.info("2(one) Digits number found on the page.");
       	}catch (Exception e){
       		Log.error("2(two) Digits number not found on the page.");
       		throw(e);
       		}
       	return element;
        }
     
     public static WebElement DialNumber5(){
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/span/span[2]/button[2]"));
       		Log.info("2(one) Digits number found on the page.");
       	}catch (Exception e){
       		Log.error("2(two) Digits number not found on the page.");
       		throw(e);
       		}
       	return element;
        }
     
     public static WebElement DialNumber6(){
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/span/span[3]/button[2]"));
       		Log.info("2(one) Digits number found on the page.");
       	}catch (Exception e){
       		Log.error("2(two) Digits number not found on the page.");
       		throw(e);
       		}
       	return element;
        }
     
     public static WebElement DialNumber7(){
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/span/span/button[3]"));
       		Log.info("2(one) Digits number found on the page.");
       	}catch (Exception e){
       		Log.error("2(two) Digits number not found on the page.");
       		throw(e);
       		}
       	return element;
        }
     
     public static WebElement DialNumber8(){
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/span/span[2]/button[3]"));
       		Log.info("2(one) Digits number found on the page.");
       	}catch (Exception e){
       		Log.error("2(two) Digits number not found on the page.");
       		throw(e);
       		}
       	return element;
        }
     
     public static WebElement DialNumber9(){
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/span/span[3]/button[3]"));
       		Log.info("2(one) Digits number found on the page.");
       	}catch (Exception e){
       		Log.error("2(two) Digits number not found on the page.");
       		throw(e);
       		}
       	return element;
        }
     
     public static WebElement DialNumber0(){
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/span/span[2]/button[4]"));
       		Log.info("2(one) Digits number found on the page.");
       	}catch (Exception e){
       		Log.error("2(two) Digits number not found on the page.");
       		throw(e);
       		}
       	return element;
        }
     
     public static WebElement DialHash(){
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/span/span/button[4]"));
       		Log.info("2(one) Digits number found on the page.");
       	}catch (Exception e){
       		Log.error("2(two) Digits number not found on the page.");
       		throw(e);
       		}
       	return element;
        }
     
     public static WebElement DialAstisk(){
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/span/span/button[4]"));
       		Log.info("2(one) Digits number found on the page.");
       	}catch (Exception e){
       		Log.error("2(two) Digits number not found on the page.");
       		throw(e);
       		}
       	return element;
        }
     
     

     public static WebElement CallButton(){
    	 element = null;   //driver.findElement(By.linkText("Call")).click();
       	try{
       		element= driver.findElement(By.linkText("Call"));
       		Log.info("2(one) Digits number found on the page.");
       	}catch (Exception e){
       		Log.error("2(two) Digits number not found on the page.");
       		throw(e);
       		}
       	return element;
        }

}


