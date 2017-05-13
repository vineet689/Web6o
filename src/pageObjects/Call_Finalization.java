package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.Utils;
    public class Call_Finalization extends BaseClass{
            private static WebElement element = null;
           
        public Call_Finalization(WebDriver driver){
            	super(driver);
        }    
        
        public static WebElement ResultCode_drop(){
       	 element = null;
          	try{
          		element= driver.findElement(By.xpath("//div[@id='content']/ui-view/ng-include[2]/div[2]/div[2]/button"));
          		Log.info("ResultCode Drop Down Found");
          	}catch (Exception e){
          		Log.error("ResultCode Drop Down not found on the page.");
          		throw(e);
          		}
          	return element;
           }
        
        public static WebElement Select_ResultCode(){
       	 element = null;   //driver.findElement(By.linkText("Call")).click();
          	try{
          		element= driver.findElement(By.linkText("Connect"));
          		Log.info("ResultCode Selected.");
          	}catch (Exception e){
          		Log.error("Not able to Select ResultCode.");
          		throw(e);
          		}
          	return element;
           }
        
        
        
        
        public static WebElement lnk_LogOut() throws Exception{
            try{
	        	element = driver.findElement(By.id("Sign Out"));
	            Log.info("Log Out link is found on the Home Page");
            }catch (Exception e){
            	Log.error("Log Out link is not found on the Home Page");
           		throw(e);
           		}
           	return element;
        }
        
        public static class TopNavigation{
        	
        	public static class Product_Type{
        		
        			static WebElement mainElement;
      		
        		public static void Accessories() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.linkText("Product Category"));
	        			Log.info("Product category link is found under Top Navigation");
	        			Utils.mouseHoverAction(mainElement, "Accessories");
        			}catch (Exception e){
        				Log.error("Accessories link is not found under Product Category");
        				throw(e);
        			}
                   }
        		
        		public static void iMacs() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.linkText("Product Category"));
	        			Log.info("Product category link is found under Top Navigation");
	        			Utils.mouseHoverAction(mainElement, "iMacs");
        			}catch (Exception e){
        				Log.error("Accessories link is not found under Product Category");
        				throw(e);
        			}
                   }
        		
        		public static void iPads() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.linkText("Product Category"));
	        			Log.info("Product category link is found under Top Navigation");
	        			Utils.mouseHoverAction(mainElement, "iPads");
        			}catch (Exception e){
        				Log.error("Accessories link is not found under Product Category");
        				throw(e);
        			}
                   }
        		

        		
        		
        		 
        		
        	}
        	
        }
        

      
    }
