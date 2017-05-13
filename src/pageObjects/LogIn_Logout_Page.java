package pageObjects;
        
import org.openqa.selenium.*;

import utility.Log;

    public class LogIn_Logout_Page extends BaseClass {
           private static WebElement element = null;
        
        public LogIn_Logout_Page(WebDriver driver){
            	super(driver);
        }     
        public static WebElement txtbx_UserName() throws Exception{
        	try{
	            element = driver.findElement(By.id("username"));
	            Log.info("Username text box is found on the Login Page");
        	}catch (Exception e){
           		Log.error("UserName text box is not found on the Login Page");
           		throw(e);
           		}
           	return element;
            }
        
        public static WebElement txtbx_Password() throws Exception{
        	try{
	        	element = driver.findElement(By.name("pass"));
	            Log.info("Password text box is found on the Login page");
        	}catch (Exception e){
        		Log.error("Password text box is not found on the Login Page");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement btn_LogIn() throws Exception{
        	try{
	        	element = driver.findElement(By.name("login"));
	            Log.info("Login button is found on the Login page");
        	}catch (Exception e){
        		Log.error("Login button is not found on the Login Page");
           		throw(e);
           		}
           	return element;
        }
        
        
        public static WebElement btn_Dashboard(){
        	element = null;
        	try{
        		 //driver.findElement(By.id("logo")).click();
        		element =driver.findElement(By.id("logo"));
        		Log.info("Logout button Found on Page.");
        	}catch(Exception e){
           		Log.error("Logout button doesn't found");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement btn_SignOut(){
        	element = null;
        	try{
        		element =driver.findElement(By.linkText("Sign Out"));
        		Log.info("Logout button Found on Page.");
        	}catch(Exception e){
           		Log.error("Logout button doesn't found");
           		throw(e);
           		}
           	return element;
        }
        
        public static WebElement finalLogout(){
	    	 element = null;
	       	try{
	       		element= driver.findElement(By.xpath("(//button[@id='bot0-Msg1'])[3]"));
	       		Log.info("Final Logout button found on the page.");
	       	}catch (Exception e){
	       		Log.error("Final logout button is not found on the page");
	       		throw(e);
	       		}
	       	return element;
	        }
        
    }