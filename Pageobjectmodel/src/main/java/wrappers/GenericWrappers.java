package wrappers;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;
public class GenericWrappers extends Reporting implements Wrappers {
	public static RemoteWebDriver d;
	int i =1;
	private WebElement WebElement;
	@Override
	public void invokeApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				 System.setProperty("webdriver.chrome.driver", "./Drivers1/chromedriver.exe");
			      d = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("Webdriver.gecko.driver","./Drivers1/firefoxdriver.exe");
				 d = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("Webdriver.ie.driver","./Drivers1/IEDriverServer.exe");
				 d = new InternetExplorerDriver();
			}
			d.manage().window().maximize();
			d.get(url);
			reportStep("The browse "+browser+" is launched with given "+url+" successfully","pass");
		} catch(SessionNotCreatedException e) {
			reportStep("The browser "+browser+" is not launced with given url "+url+" due to session not created error","fail");
		} catch(InvalidArgumentException e) {
			reportStep("The browser \"+browser+\" is not launced as url \"+url+\"  doesnt contain https/https","fail");
		} catch(WebDriverException e) {
			reportStep("The browse "+browser+" is not launced due to unknown error","fail");
		}
	}
	@Override
	public void enterById(String idValue, String data) {
	    try {
			d.findElementById(idValue).sendKeys(data);
		     reportStep("The element with id "+idValue+" is entered with "+data+"", "pass");
		} catch (NoSuchElementException e) {
		   reportStep("The element with id "+idValue+" is not in the dom","fail");
		} catch(ElementNotVisibleException e) {
		 
			reportStep("The element with "+idValue+" is not not interactable","fail");
		}catch(StaleElementReferenceException e)
	    {
			reportStep("The element with "+idValue+" is not stable to interact","fail");
	    }catch(WebDriverException e) {
	    	reportStep("The element with data "+idValue+" is entered with data "+data+" due to unknown error","fail");
	    } 
	}
@Override
	public void enterByName(String nameValue, String data) {
		try {
			d.findElementByName(nameValue).sendKeys(data);
			//reportstep("The element with "+nameValue+" is entered with "+data);
			reportStep("The element with "+nameValue+" is entered with "+data+"","pass");
			
		} 
		catch (NoSuchElementException e) {
			//reportstep("The element with id "+nameValue+" is not in the dom");
			reportStep("The element with id "+nameValue+" is not in the dom","fail");
		} catch(ElementNotVisibleException e) {
		  //reportstep("The element with "+nameValue+" is not not interactable ");	
			reportStep("The element with "+nameValue+" is not not interactable ","fail");
		}catch(StaleElementReferenceException e)
	    {
			//reportstep("The element with "+nameValue+" is not stable to interact");
			reportStep("The element with "+nameValue+" is not stable to interact","fail");
	    }catch(WebDriverException e) {
	    	//reportstep("The element with data "+nameValue+" is entered with data "+data+" due to unknown error");
	      reportStep("The element with data "+nameValue+" is entered with data "+data+" due to unknown error","fail");
	    }
		}	
	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			d.findElementByXPath(xpathValue).sendKeys(data);
			 reportStep("The element with "+xpathValue+" is entered with "+data,"pass");
		} 
			catch (NoSuchElementException e) {
				//reportstep("The element with id "+xpathValue+" is not in the dom");
				 reportStep("The element with id "+xpathValue+" is not in the dom","fail");
			} catch(ElementNotVisibleException e) {
			  //reportstep("The element with "+xpathValue+" is not not interactable");
			  reportStep("The element with "+xpathValue+" is not not interactable","fail");
			}catch(StaleElementReferenceException e)
		    {
				//reportstep("The element with "+xpathValue+" is not stable to interact");
				 reportStep("The element with "+xpathValue+" is not stable to interact","fail");
		    }catch(ElementClickInterceptedException e) {
		    	//reportstep("The element with "+xpathValue+" is click not properly executed");
		    	 reportStep("The element with "+xpathValue+" is click not properly executed","fail");
		    }
		catch(WebDriverException e) {
		    	//reportstep("The element with data "+xpathValue+" is entered with data "+data+" due to unknown error");
		    	 reportStep("The element with data "+xpathValue+" is entered with data "+data+" due to unknown error","fail");
		    }
	}
	@Override
	public void verifyTitle(String title) {
		try {
			String actualtitle = d.getTitle();
			if(actualtitle.equals(title)) {
				//reportstep("The title of the page "+title+" is matched with expected tittle "+title);
				 reportStep("The title of the page "+title+" is matched with expected tittle "+title,"pass");
			}else {
				//reportstep("The title of the page "+title+" is not matched with expected tittle "+title);
				reportStep("The title of the page "+title+" is not matched with expected tittle "+title,"fail");
			}
		} catch (WebDriverException e) {
			//reportstepln("The title of page "+title+"is not verified due to unknown error");
			reportStep("The title of page "+title+"is not verified due to unknown error","fail");
		}
		}
	@Override
	public void verifyTextById(String id, String text) {
	 try {
		String actualtext=d.findElementById(id).getText();
		if(actualtext.equals(text))
		 {
			 //reportstep("The element with "+id+" is actual text match with expected tittle "+text);
			 reportStep("The element with "+id+" is actual text match with expected tittle "+text,"pass");
		 }else {
			 //reportstep("The element with "+id+" is actual text not match with expected tittle "+text);
			 reportStep("The element with "+id+" is actual text not match with expected tittle "+text,"fail");
		 }
		}
	catch (NoSuchElementException e) {
		//reportstep("No such element with id "+id+" is not present and cannot verified with text "+text+" not present");
		reportStep("No such element with id "+id+" is not present and cannot verified with text "+text+" not present","fail");
	}
	catch(ElementNotVisibleException e) {
		//reportstep(" Element with id "+id+" is not visible so it was not  verified with text "+text+" not present");
		reportStep(" Element with id "+id+" is not visible so it was not  verified with text "+text+" not present","fail");
	}catch (WebDriverException e) {
		//reportstepln("The title of page "+id+"is not verified due to unknown error");
		reportStep("The title of page "+id+"is not verified due to unknown error","fail");
	}}
	 @Override
	public void verifyTextByXpath(String xpath, String text) {
		 try {
			String actualxpath=d.findElementByXPath(xpath).getText();
			if(actualxpath.equals(text))
			 {
				 //reportstep("The element with "+xpath+" is actual text match with expected tittle "+text);
				 reportStep("The element with "+xpath+" is actual text match with expected tittle "+text,"pass");
			 }else {
				// reportstep("The element with "+xpath+" is actual text not match with expected tittle "+text);
				 reportStep("The element with "+xpath+" is actual text not match with expected tittle "+text,"fail");
			 }
			}
		catch (NoSuchElementException e) {
			//reportstep("No such element with id "+xpath+" is not present and cannot verified with text "+text+" not present");
			reportStep("No such element with id "+xpath+" is not present and cannot verified with text "+text+" not present","fail");
		}catch(ElementNotVisibleException e) {
			//reportstep(" Element with id "+xpath+" is not visible so it was not  verified with text "+text+" not present");
			reportStep(" Element with id "+xpath+" is not visible so it was not  verified with text "+text+" not present","fail");
		}catch (WebDriverException e) {
			//reportstepln("The title of page "+xpath+"is not verified due to unknown error");
			reportStep("The title of page "+xpath+"is not verified due to unknown error","fail");
		}}
	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		 try {
			String actualxpath=d.findElementByXPath(xpath).getText();
			if(actualxpath.contains(text))
			 {
				 //reportstep("The element with "+xpath+" is actual text match with expected tittle "+text);
				 reportStep("The element with "+xpath+" is actual text match with expected tittle "+text,"pass");
			 }
			 else {
			  //reportstep("The element with "+xpath+" is actual text was not match with expected tittle "+text);
			  reportStep("The element with "+xpath+" is actual text was not match with expected tittle "+text,"fail");
			 }}
			 catch (NoSuchElementException e) {
				//reportstep("No such element with id "+xpath+" is not present and cannot verified with text "+text+" not present");
				reportStep("No such element with id "+xpath+" is not present and cannot verified with text "+text+" not present","fail");
			}catch(ElementNotVisibleException e) {
				//reportstep(" Element with id "+xpath+" is not visible so it was not  verified with text "+text+" not present");
				reportStep(" Element with id "+xpath+" is not visible so it was not  verified with text "+text+" not present","fail");
			}catch (WebDriverException e) {
				//reportstepln("The title of page "+xpath+"is not verified due to unknown error");
				reportStep("The title of page "+xpath+"is not verified due to unknown error","fail");
			}
		 }
	@Override
	public void clickById(String id) {
		try {
			 d.findElementById(id).click();
			reportStep("The given id "+id+" is clicked","pass");
		} catch (NoSuchElementException e) {
			reportStep("The element with id "+id+" is not in the dom","fail");
		} catch(ElementNotVisibleException e) {
		  reportStep("The element with "+id+" is not not interactable","fail");
		}catch(StaleElementReferenceException e)
	    {
			reportStep("The element with "+id+" is not stable to interact","fail");
	    }catch(ElementClickInterceptedException e) {
	    	reportStep("The element with "+id+" is click not properly executed","fail");
	    }
	catch(WebDriverException e) {
	    	//reportstep("The element with data "+id+" is entered with data  due to unknown error");
	    	reportStep("The element with data "+id+" is entered with data  due to unknown error","fail");
	    }
			
	}
@Override
	public void clickByClassName(String classVal) {
		try {
			d.findElementByClassName(classVal).click();
			//reportstep("The given id "+classVal+" is clicked");
			reportStep("The given id "+classVal+" is clicked","pass");
		} catch (NoSuchElementException e) {
			//reportstep("The element with id "+classVal+" is not in the dom");
			reportStep("The element with id "+classVal+" is not in the dom","fail");
		} catch(ElementNotVisibleException e) {
		  //reportstep("The element with "+classVal+" is not not interactable ");
		  reportStep("The element with "+classVal+" is not not interactable ","fail");
		}catch(StaleElementReferenceException e)
	    {
			//reportstep("The element with "+classVal+" is not stable to interact");
			reportStep("The element with "+classVal+" is not stable to interact","fail");
	    }catch(ElementClickInterceptedException e) {
	    	//reportstep("The element with "+classVal+" is click not properly executed");
	    	reportStep("The element with "+classVal+" is click not properly executed","fail");
	    }
	catch(WebDriverException e) {
	    	
	    	reportStep("The element with data "+classVal+" is entered with data  due to unknown error","fail");
	    }	
	}
	@Override
	public void clickByName(String name) {
		try {
			d.findElementByName(name).click();
			reportStep("The given id "+name+" is clicked","pass");
		} catch (NoSuchElementException e) {
			reportStep("The element with id "+name+" is not in the dom","fail");
		} catch(ElementNotVisibleException e) {
		  reportStep("The element with "+name+" is not not interactable","fail");	
		}catch(StaleElementReferenceException e)
	    {
			reportStep("The element with "+name+" is not stable to interact","fail");
	    }catch(ElementClickInterceptedException e) {
	    	reportStep("The element with "+name+" is click not properly executed","fail");
	    }
	catch(WebDriverException e) {
	    	reportStep("The element with data "+name+" is entered with data  due to unknown error","fail");
	    }	
	}
		@Override
	public void clickByLink(String name) {
		try {
			d.findElementByLinkText(name).click();
			reportStep("The given link "+name+" is clicked","pass");
		}
		catch (NoSuchElementException e) {
			reportStep("The element with id "+name+" is not in the dom","fail");
		} catch(ElementNotVisibleException e) {
		  reportStep("The element with "+name+" is not not interactable","fail");	
		}catch(StaleElementReferenceException e)
	    {
			reportStep("The element with "+name+" is not stable to interact","fail");
	    }catch(ElementClickInterceptedException e) {
	    	reportStep("The element with "+name+" is click not properly executed","fail");
	    }
	catch(WebDriverException e) {
	    	reportStep("The element with data "+name+" is entered with data  due to unknown error","fail");
	    }		
	}
	@Override
	public void clickByLinkNoSnap(String name) {
		try {
			d.findElementByLinkText(name).click();
			reportStep("The given link "+name+" is clicked","pass");
		}
		catch (NoSuchElementException e) {
			reportStep("The element with id "+name+" is not in the dom","fail");
		} catch(ElementNotVisibleException e) {
		  reportStep("The element with "+name+" is not not interactable","fail");	
		}catch(StaleElementReferenceException e)
	    {
			reportStep("The element with "+name+" is not stable to interact","fail");
	    }catch(ElementClickInterceptedException e) {
	    	reportStep("The element with "+name+" is click not properly executed","fail");
	    }
	catch(WebDriverException e) {
	    	reportStep("The element with data "+name+" is entered with data  due to unknown error","fail");
	    }
	}
	@Override
	public void clickByXpath(String xpathVal) {
		try {
			d.findElementByXPath(xpathVal).click();
			reportStep("The given xpath "+xpathVal+" is clicked","pass");
		}
		catch (NoSuchElementException e) {
			reportStep("No such element with xpath "+xpathVal+" is present in the  dom","fail");
		} catch(ElementNotVisibleException e) {
		  reportStep("The element with "+xpathVal+" is not not interactable","fail");	
		}catch(StaleElementReferenceException e)
	    {
			reportStep("The element with "+xpathVal+" is not stable to interact","fail");
	    }catch(ElementClickInterceptedException e) {
	    	reportStep("The element with "+xpathVal+" is click not properly executed","fail");
	    }
	catch(WebDriverException e) {
	    	reportStep("The element with data "+xpathVal+" is entered with data  due to unknown error","fail");
	    }
		
	}
	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			d.findElementByXPath(xpathVal).click();
			reportStep("The given xpath "+xpathVal+" is clicked","pass");
		}
		catch (NoSuchElementException e) {
			reportStep("The element with id "+xpathVal+" is not in the dom","fail");
		} catch(ElementNotVisibleException e) {
		  reportStep("The element with "+xpathVal+" is not not interactable","fail");	
		}catch(StaleElementReferenceException e)
	    {
			reportStep("The element with "+xpathVal+" is not stable to interact","fail");
	    }catch(ElementClickInterceptedException e) {
	    	reportStep("The element with "+xpathVal+" is click not properly executed","fail");
	    }
	catch(WebDriverException e) {
	    	reportStep("The element with data "+xpathVal+" is entered with data  due to unknown error","fail");
	    }
	}

	@Override
	public String getTextById(String idVal) {
		String id1 = null;
		try {
	   id1 =d.findElementById(idVal).getText();
		reportStep("Id for the text is "+id1,"pass");
		}catch(NoSuchElementException e) {	
			reportStep("The element with id "+idVal+" is not present in the dom","fail");
		}
		
		return id1;
	}
	@Override
	public String getTextByXpath(String xpathVal) {
		String xp = null;
		try {
			 xp =d.findElementByXPath(xpathVal).getText();
			reportStep("The element with  xpath "+xp+" is present","pass");
		}
		catch (NoSuchElementException e) {
			reportStep("The element with xpath "+xpathVal+" is not in the dom","fail");
		} catch(ElementNotVisibleException e) {
		  reportStep("The element with "+xpathVal+" is not not interactable","fail");	
		}catch(StaleElementReferenceException e)
	    {
			reportStep("The element with "+xpathVal+" is not stable to interact","fail");
	    }catch(ElementClickInterceptedException e) {
	    	reportStep("The element with "+xpathVal+" is click not properly executed","fail");
	    }
	catch(WebDriverException e) {
	    	reportStep("The element with data "+xpathVal+" is entered with data  due to unknown error","fail");
	    }
			
		      	return xp;
	}
	@Override
	public void selectVisibileTextById(String id, String value) {
		 try {
			WebElement visibileid = d.findElementById(id);
			Select textid = new Select(visibileid);
			textid.selectByVisibleText(value);
			reportStep("Text is visible by "+value,"pass");
		}catch(ElementNotVisibleException e) {
			  reportStep("The element with "+value+" is not not interactable","fail");	
			}catch(StaleElementReferenceException e)
		    {
				reportStep("The element with "+value+" is not stable to interact","fail");
		    }catch(ElementClickInterceptedException e) {
		    	reportStep("The element with "+value+" is click not properly executed","fail");
		    }
		catch(WebDriverException e) {
		    	reportStep("The element with data "+value+" is entered with data  due to unknown error","fail");
		    }	
		}	
	@Override
	public void selectIndexById(String id, int value) {
		try {
			WebElement indexid = d.findElementById(id);
			Select indexid1 = new Select(indexid);
			indexid1.selectByIndex(value);
			reportStep("Text is visible by "+value,"pass");
		}
		catch(ElementNotVisibleException e) {
			  reportStep("The element with "+value+" is not not interactable","fail");	
			}
		catch(StaleElementReferenceException e)
		    {
				reportStep("The element with "+value+" is not stable to interact","fail");
		    }
		catch(ElementClickInterceptedException e) {
		    	reportStep("The element with "+value+" is click not properly executed","fail");
		    }
		catch(WebDriverException e) {
		    	reportStep("The element with data "+value+" is entered with data  due to unknown error","fail");
		    }
		}
	@Override
	public void switchToParentWindow() {
	try {
		Set <String> allwinid = d.getWindowHandles();
			for(String eachid : allwinid) {
				d.switchTo().window(eachid);
			}
			reportStep("Window is switch to ParentWindow","pass");
		} catch (NoSuchWindowException e) {
			reportStep("No such window in the application","fail");
		}catch(WebDriverException e) {
			reportStep("No such element in the dom","fail");
		}
		
	}
	@Override
	public void switchToLastWindow() {
		try {
			Set <String> allwinafterclick = d.getWindowHandles();
				for(String eachid : allwinafterclick) {
					d.switchTo().window(eachid);
				}
				reportStep("Window is switch to lastwindow","pass");
			} catch (NoSuchWindowException e) {
				reportStep("No such window in the application","fail");
			}catch(WebDriverException e) {
				reportStep("No such element in the dom","pass");
			}
		
		}
	@Override
	public void acceptAlert() {
	try {
		d.switchTo().alert().accept();
		reportStep("The alert was accepted","pass");
	}catch (NoAlertPresentException e) {
		reportStep("No alert was present","fail");
	}catch(ElementNotVisibleException e) {
		  reportStep("The element with is not interactable","fail");	
		}
	catch(StaleElementReferenceException e)
	    {
			reportStep("The element with is not stable to interact","fail");
	    }
	catch(ElementClickInterceptedException e) {
	    	reportStep("The element with  is click not properly executed","fail");
	    }
	catch(WebDriverException e) {
	    	reportStep("The element with data is entered is due to unknown error","fail");
	    }
	}	
	@Override
	public void dismissAlert() {
try {
			d.switchTo().alert().dismiss();
			reportStep("The alert was rejected","pass");
		}catch (NoAlertPresentException e) {
			reportStep("No alert was present","fail");
		}catch(ElementNotVisibleException e) {
			  reportStep("The element with is not interactable","fail");	
			}
		catch(StaleElementReferenceException e)
		    {
				reportStep("The element with is not stable to interact","fail");
		    }
		catch(ElementClickInterceptedException e) {
		    	reportStep("The element with  is click not properly executed","fail");
		    }
		catch(WebDriverException e) {
		    	reportStep("The element with data is entered is due to unknown error","fail");
		    }
		}
	@Override
	public String getAlertText() {
		String alertText=null;
		 try {
			  alertText=d.switchTo().alert().getText();
			reportStep("Alert text "+alertText+" has been captured successfully","pass");
		 }
		 catch (NoAlertPresentException e) {
				reportStep("No alert was present","fail");
			}catch(ElementNotVisibleException e) {
				  reportStep("The element with is not interactable","fail");	
				}
			catch(StaleElementReferenceException e)
			    {
					reportStep("The element with is not stable to interact","fail");
			    }
			catch(ElementClickInterceptedException e) {
			    	reportStep("The element with  is click not properly executed","fail");
			    }
			catch(WebDriverException e) {
			    	reportStep("The element with data is entered is due to unknown error","fail");
			    }
		return alertText;
	}

	@Override
	public long takeSnap() {
		long number =0;
			try {
		        number = (long)(Math.floor( Math.random()*100000000)+1000000);
				File src = d.getScreenshotAs(OutputType.FILE);
				File dest = new File("./reports2/screenshots/snap "+number+".png");
				FileUtils.copyFile(src, dest);
				//reportStep("screenshoot is taken and stored in destination","pass");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}       catch (WebDriverException e) {
		           reportStep("The browser is not closed due to unknown error","fail",false );
			}
			return number ;
		
	}
	public void closeBrowser() {
		try {
			d.close();
         reportStep("Current window is closed successfully","pass",false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The browser window is not cloased as there is no such element","fail");
		} catch (WebDriverException e) {
			reportStep("The browser is not closed due to unknown error","fail",false);
		}

	}

	public void closeAllBrowsers() {
		try {
			d.quit();
			reportStep("All window is closed successfully","pass",false);
		}catch (NoSuchElementException e) {
	reportStep("The browser window is not cloased as there is no such element","fail",false);
		} catch (WebDriverException e) {
			reportStep("The browser is not closed due to unknown error","fail",false);

		}

	}

	@Override
	public void waitproperty(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void defcontent() {
		try {
			d.switchTo().defaultContent();
			reportStep("window out from default content","pass");
		} 
		catch (NoSuchWindowException e) {
			reportStep("No such window present in dom","fail"); 
		}
		catch (WebDriverException e) {
			reportStep("No such Driver present in dom","fail");
	}
	}

	@Override
	public void selectVisibileTextByName(String Name, String value) {
			 try {
				WebElement visibileid1 = d.findElementById(Name);
				Select textid1 = new Select(visibileid1);
				textid1.selectByVisibleText(value);
				reportStep("Text is visible by "+value,"pass");
			}catch(ElementNotVisibleException e) {
				  reportStep("The element with "+value+" is not not interactable","fail");	
				}catch(StaleElementReferenceException e)
			    {
					reportStep("The element with "+value+" is not stable to interact","fail");
			    }catch(ElementClickInterceptedException e) {
			    	reportStep("The element with "+value+" is click not properly executed","fail");
			    }
			catch(WebDriverException e) {
			    	reportStep("The element with data "+value+" is entered with data  due to unknown error","fail");
			    }	
			}

	@Override
	public void selectVisibileTextByXpath(String xpath, String value) {
		 try {
				WebElement visibileid12 = d.findElementByXPath(xpath);
				Select textid12 = new Select(visibileid12);
				textid12.selectByVisibleText(value);
				reportStep("Text is visible by "+value,"pass");
			}catch(ElementNotVisibleException e) {
				  reportStep("The element with "+value+" is not not interactable","fail");	
				}catch(StaleElementReferenceException e)
			    {
					reportStep("The element with "+value+" is not stable to interact","fail");
			    }catch(ElementClickInterceptedException e) {
			    	reportStep("The element with "+value+" is click not properly executed","fail");
			    }
			catch(WebDriverException e) {
			    	reportStep("The element with data "+value+" is entered with data  due to unknown error","fail");
			    }	 
			}
	@Override
	public void enterByXpath(String xpathValue, Keys pageDown) {
			// TODO Auto-generated method stub
			try {
				d.findElementByXPath(xpathValue).sendKeys(pageDown);
				reportStep("The element with "+xpathValue+" is entered with "+pageDown,"pass");
			} 
				catch (NoSuchElementException e) {
					reportStep("The element with id "+xpathValue+" is not in the dom","fail");
				} catch(ElementNotVisibleException e) {
				  reportStep("The element with "+xpathValue+" is not not interactable","fail");	
				}catch(StaleElementReferenceException e)
			    {
					reportStep("The element with "+xpathValue+" is not stable to interact","fail");
			    }catch(ElementClickInterceptedException e) {
			    	reportStep("The element with "+xpathValue+" is click not properly executed","fail");
			    }
			catch(WebDriverException e) {
			    	reportStep("The element with data "+xpathValue+" is entered with data "+pageDown+" due to unknown error","fail");
			    }
				
			}
	@Override
	public void selectNameByValue(String Name, String value) {
		try {
			WebElement nameid = d.findElementByName(Name);
			Select indexid1 = new Select(nameid);
			indexid1.selectByValue(value);
			reportStep("Text is visible by "+value,"pass");
		}catch(ElementNotVisibleException e) {
			  reportStep("The element with "+value+" is not not interactable","fail");	
			}catch(StaleElementReferenceException e)
		    {
				reportStep("The element with "+value+" is not stable to interact","fail");
		    }catch(ElementClickInterceptedException e) {
		    	reportStep("The element with "+value+" is click not properly executed","fail");
		    }
		catch(WebDriverException e) {
		    	reportStep("The element with data "+value+" is entered with data  due to unknown error","fail");
		    }
				 
		}
	@Override
	public void iframe(String path) {
		
			try {
				WebElement id1 = d.findElementByXPath(path);
				d.switchTo().frame(id1);
				reportStep("screen is switched to frame","pass");
			}
			catch (NoSuchWindowException e) {
			reportStep("No such window present in dom","fail");
			}
			catch (WebDriverException e) {
				reportStep("No such Driver present in dom","fail");
		}	
	}
	@Override
	public void sendkeysalerts(String Val) {
		// TODO Auto-generated method stub
		try {
			d.switchTo().alert().sendKeys(Val);
			reportStep("User send the input" +Val,"pass");
			
		}
		catch (NoSuchWindowException e) {
			reportStep("No such window present in dom","fail");
			}
			catch (WebDriverException e) {
				reportStep("No such Driver present in dom","fail");
		}
	}	
	@Override
	public void AlertText() {
		
		 try {
			 String alertText=d.switchTo().alert().getText();
			reportStep("Alert text "+alertText+" has been captured successfully","pass");
		 }
		 catch (NoAlertPresentException e) {
				reportStep("No alert was present","fail");
			}catch(ElementNotVisibleException e) {
				  reportStep("The element with is not interactable","fail");	
				}
			catch(StaleElementReferenceException e)
			    {
					reportStep("The element with is not stable to interact","fail");
			    }
			catch(ElementClickInterceptedException e) {
			    	reportStep("The element with  is click not properly executed","fail");
			    }
			catch(WebDriverException e) {
			    	reportStep("The element with data is entered is due to unknown error","fail");
			    }
	
	}
	@Override
	public void refresh() {
		d.navigate().refresh();
		
	}
	@Override
	public void alerttext(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void selectVisibileidByXpath(String xpath, String value) {
		 try {
				WebElement visibileid13 = d.findElementByXPath(xpath);
				Select textid12 = new Select(visibileid13);
				textid12.selectByVisibleText(value);
				reportStep("Text is visible by "+value,"pass");
			}catch(ElementNotVisibleException e) {
				  reportStep("The element with "+value+" is not not interactable","fail");	
				}catch(StaleElementReferenceException e)
			    {
					reportStep("The element with "+value+" is not stable to interact","fail");
			    }catch(ElementClickInterceptedException e) {
			    	reportStep("The element with "+value+" is click not properly executed","fail");
			    }
			catch(WebDriverException e) {
			    	reportStep("The element with data "+value+" is entered with data  due to unknown error","fail");
			    }	 
			}
		
	}

		

		
	



	

