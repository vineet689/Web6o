package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.Utils;
    public class Home_Page extends BaseClass{
            private static WebElement element = null;
           
        public Home_Page(WebDriver driver){
            	super(driver);
        }    
        public static WebElement lnk_MyAccount() throws Exception{
            try{ 
             	element = driver.findElement(By.name("login"));
	            Log.info("Login button is found on the Login page");
        	}catch (Exception e){
        		Log.error("Login button is not found on the Login Page");
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
        
        public static WebElement agent_Presense_Icon() throws Exception{
        	try{
        		element =driver.findElement((By.xpath("//header[@id='header']/div[2]/div/button")));
        		Log.info("Agent Presence Icon found");
        	}catch (Exception e){
        		Log.error("Agent Presence Icon not found!!");
        		throw(e);
        	}
        		return element;
        	
        }
        
        public static WebElement ProjectDropdown() throws Exception{
        	try{
        		element =driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/div[2]/div/select"));
        		Log.info("Project Drop down found");
        	}catch (Exception e){
        		Log.error("Project Drop Down not found");
        		throw(e);
        	}
        	return element;
        }
        
        
        
        public static WebElement CollepseMenu() throws Exception{
        	try{
        		element =driver.findElement(By.cssSelector("i.fa.fa-reorder"));
        		Log.info("Collapse Menu found on the page");
        	}catch (Exception e){
        		Log.error("Collapse Menu not found on the page");
        		throw(e);
        	}
        	return element;
        }
        
        
        public static WebElement ManualCallButton(){
       	 element = null;   
          	try{
          		element= driver.findElement(By.linkText("Call"));
          		Log.info("Call Button found on the page.");
          	}catch (Exception e){
          		Log.error("Call Button not found on the page.");
          		throw(e);
          		}
          	return element;
           }
        
        public static WebElement ChatQueue() throws Exception{
        	try{
        		element =driver.findElement(By.cssSelector("#nav-chatQueue > span.menu-item-parent.ng-binding"));
        		Log.info("Chat Queue Option found on the page");
        	}catch (Exception e){
        		Log.error("Chat Queue option not found on the page");
        		throw(e);
        	}
        	return element;
        }
        
        public static WebElement Contacts() throws Exception{
        	try{
        		element =driver.findElement(By.cssSelector("#nav-contacts > span.menu-item-parent.ng-binding"));
        		Log.info("Contact Option found on the page");
        	}catch (Exception e){
        		Log.error("Contact option not found on the page");
        		throw(e);
        	}
        	return element;
        }
        
        
        public static WebElement InboundTotalDS() throws Exception{
        	try{
        		element =driver.findElement(By.xpath("//div[@id='content']/div/div/ul/li/dashboard-banner/div/div/div[2]/h1"));
        		Log.info("Inbound summary call DS found on the page");
        	}catch (Exception e){
        		Log.error("Inbound summary call DS not found on the page");
        		throw(e);
        	}
        	return element;
        }
        
        public static WebElement OutboundTotalDS() throws Exception{
        	try{
        		element =driver.findElement(By.xpath("//div[@id='content']/div/div/ul/li[2]/dashboard-banner/div/div/div[2]/h1"));
        		Log.info("Outbound summary call DS found on the page");
        	}catch (Exception e){
        		Log.error("Outbound summary call DS not found on the page");
        		throw(e);
        	}
        	return element;
        }
        
        public static WebElement ChatQueueTotalDS() throws Exception{
        	try{
        		element =driver.findElement(By.xpath("//div[@id='content']/div/div/ul/li[3]/dashboard-banner/div/div/div[2]/h1"));
        		Log.info("Chat Queue summary call DS found on the page");
        	}catch (Exception e){
        		Log.error("Chat Queue summary not found on the page");
        		throw(e);
        	}
        	return element;
        }
        
        public static WebElement DashboardLink() throws Exception{
        	try{
        		element =driver.findElement(By.cssSelector("span.menu-item-parent.ng-binding"));
        		Log.info("Dasbhboard link found on the page");
        	}catch (Exception e){
        		Log.error("Dashboard Link not found on the page");
        		throw(e);
        	}
        	return element;
        }
        
        public static WebElement CallLink() throws Exception{
        	try{
        		element =driver.findElement(By.cssSelector("#nav-activeVoice > span.menu-item-parent.ng-binding"));
        		Log.info("Call link found on the page");   //#nav-activeVoice > span.menu-item-parent.ng-binding
        	}catch (Exception e){
        		Log.error("Call Link not found on the page");
        		throw(e);
        	}
        	return element;
        }
        
        public static WebElement ChatEmailLink() throws Exception{
        	try{
        		element =driver.findElement(By.cssSelector("#nav-activeChatAndMessage > span.menu-item-parent.ng-binding"));
        		Log.info("Chat Email link found on the page");
        	}catch (Exception e){
        		Log.error("Chat Email Link not found on the page");
        		throw(e);
        	}
        	return element;
        }
        
        public static WebElement CallQueueLink() throws Exception{
        	try{
        		element =driver.findElement(By.cssSelector("#nav-voiceQueue > span.menu-item-parent.ng-binding"));
        		Log.info("Call Queue link found on the page");
        	}catch (Exception e){
        		Log.error("Call Queue Link not found on the page");
        		throw(e);
        	}
        	return element;
        }
        
        public static WebElement PhonePadding() throws Exception{
        	try{
        		element =driver.findElement(By.cssSelector("#nav-phone > span.menu-item-parent.ng-binding"));
        		Log.info("Phone padding found on the page");
        	}catch (Exception e){
        		Log.error("Phone padding not found on the page");
        		throw(e);
        	}
        	return element;
        }
        
        public static WebElement NumberInputTextBox() throws Exception{
        	try{
        		element =driver.findElement(By.xpath("//input[@type='text']"));
        		Log.info("Textbox for number  found on the page");
        	}catch (Exception e){
        		Log.error("Textbox for number does not found on the page");
        		throw(e);
        	}
        	return element;
        }
        
        
        public static class TopNavigation{
        	
        	public static class Product_Type{
        		
        			static WebElement mainElement;
      		
            		public static void agentPresence() throws Exception{
            			try{   //driver.findElement(By.xpath("//header[@id='header']/div[2]/div/button")).click();
    	        			mainElement = driver.findElement(By.xpath("//header[@id='header']/div[2]/div/button"));
    	        			Log.info("Agent Presence Icon is found under Top Navigation");
    	        			Utils.mouseHoverAction(mainElement, "Away");
            			}catch (Exception e){
            				Log.error("Agent Presence Icon not found under Home Page");
            				throw(e);
            			}
                       }
            		
            		public static void AgentPrsenceBusy() throws Exception{
            			try{
    	        			mainElement = driver.findElement(By.linkText("Busy"));
    	        			Log.info("Busy Presence is found under Top Navigation");
    	        			Utils.mouseHoverAction(mainElement, "Busy");
            			}catch (Exception e){
            				Log.error("Busy Presence is not found under Home Page");
            				throw(e);
            			}
                       }
            		
            		public static void AgentPresenceAvailable() throws Exception{
            			try{
    	        			mainElement = driver.findElement(By.linkText("Avaliable"));
    	        			Log.info("Avaliable icon is found under Top Navigation");
    	        			Utils.mouseHoverAction(mainElement, "Avaliable");
            			}catch (Exception e){
            				Log.error("Avaliable Icon is not found under Home Page");
            				throw(e);
            			}
                       } 
            		           //By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/div[2]/div/select
            		public static void ProjectDropDown() throws Exception{
            			try{
    	        			mainElement = driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[5]/ul/li/div/div[2]/div/select"));
    	        			Log.info("Project DropDown is found under Top Navigation");
    	        			Utils.mouseHoverAction(mainElement, "ProjectDropDown");
            			}catch (Exception e){
            				Log.error("Project DropDown not found under Home Page");
            				throw(e);
            			}
                       }
            		
            	}
            	
            }

      
    }
