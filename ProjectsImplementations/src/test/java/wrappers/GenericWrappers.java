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

public class GenericWrappers implements Wrappers {
	RemoteWebDriver d;
	int i =1;
	private WebElement WebElement;
	@Override
	public void invokeApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			      d = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("Webdriver.gecko.driver","./drivers/firefoxdriver.exe");
				 d = new FirefoxDriver();
				
			}
			else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("Webdriver.ie.driver","./drivers/IEDriverServer.exe");
				 d = new InternetExplorerDriver();
			}
			d.manage().window().maximize();
			d.get(url);
			System.out.println("The browse "+browser+" is launched with given "+url+" successfully");
		} catch(SessionNotCreatedException e) {
			System.err.print("The browser "+browser+" is not launced with given url "+url+" due to session not created error");
		} catch(InvalidArgumentException e) {
			System.err.print("The browser "+browser+" is not launced as url "+url+"  doesnt contain https/https");
		} catch(WebDriverException e) {
			System.err.print("The browse "+browser+" is not launced due to unknown error");
		}
		finally {
			takeSnap();
		}
	}
	@Override
	public void enterById(String idValue, String data) {
	    try {
			d.findElementById(idValue).sendKeys(data);
			System.out.println("The element with id "+idValue+" is entered with "+data);
		} catch (NoSuchElementException e) {
		   System.err.print("The element with id "+idValue+" is not in the dom");
		} catch(ElementNotVisibleException e) {
		  System.err.print("The element with "+idValue+" is not not interactable ");	
		}catch(StaleElementReferenceException e)
	    {
			System.err.print("The element with "+idValue+" is not stable to interact");
	    }catch(WebDriverException e) {
	    	System.err.print("The element with data "+idValue+" is entered with data "+data+" due to unknown error");
	    }
	    finally {
	    	takeSnap();
	    }
	}

@Override
	public void enterByName(String nameValue, String data) {
		try {
			d.findElementByName(nameValue).sendKeys(data);
			System.out.println("The element with "+nameValue+" is entered with "+data);
		} 
		catch (NoSuchElementException e) {
			System.err.print("The element with id "+nameValue+" is not in the dom");
		} catch(ElementNotVisibleException e) {
		  System.err.print("The element with "+nameValue+" is not not interactable ");	
		}catch(StaleElementReferenceException e)
	    {
			System.err.print("The element with "+nameValue+" is not stable to interact");
	    }catch(WebDriverException e) {
	    	System.err.print("The element with data "+nameValue+" is entered with data "+data+" due to unknown error");
	    }
		finally {
			takeSnap();
		}
		}	
	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			d.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The element with "+xpathValue+" is entered with "+data);
		} 
			catch (NoSuchElementException e) {
				System.err.print("The element with id "+xpathValue+" is not in the dom");
			} catch(ElementNotVisibleException e) {
			  System.err.print("The element with "+xpathValue+" is not not interactable ");	
			}catch(StaleElementReferenceException e)
		    {
				System.err.print("The element with "+xpathValue+" is not stable to interact");
		    }catch(ElementClickInterceptedException e) {
		    	System.err.print("The element with "+xpathValue+" is click not properly executed");
		    }
		catch(WebDriverException e) {
		    	System.err.print("The element with data "+xpathValue+" is entered with data "+data+" due to unknown error");
		    }
			finally {
				takeSnap();
		}}

	@Override
	public void verifyTitle(String title) {
		try {
			String actualtitle = d.getTitle();
			if(actualtitle.equals(title)) {
				System.out.println("The title of the page "+title+" is matched with expected tittle "+title);
			}else {
				System.out.println("The title of the page "+title+" is not matched with expected tittle "+title);
			}
		} catch (WebDriverException e) {
			System.err.println("The title of page "+title+"is not verified due to unknown error");
			
		}finally {
			takeSnap();
		}}
		
	@Override
	public void verifyTextById(String id, String text) {
	 try {
		String actualtext=d.findElementById(id).getText();
		if(actualtext.equals(text))
		 {
			 System.out.println("The element with "+id+" is actual text match with expected tittle "+text);
		 }else {
			 System.out.println("The element with "+id+" is actual text not match with expected tittle "+text);
		 }
		}
	catch (NoSuchElementException e) {
		System.err.print("No such element with id "+id+" is not present and cannot verified with text "+text+" not present");
	}catch(ElementNotVisibleException e) {
		System.err.print(" Element with id "+id+" is not visible so it was not  verified with text "+text+" not present");
	}catch (WebDriverException e) {
		System.err.println("The title of page "+id+"is not verified due to unknown error");
		
	}finally {
		takeSnap();
	}}
	 @Override
	public void verifyTextByXpath(String xpath, String text) {

		 try {
			String actualxpath=d.findElementByXPath(xpath).getText();
			if(actualxpath.equals(text))
			 {
				 System.out.println("The element with "+xpath+" is actual text match with expected tittle "+text);
			 }else {
				 System.out.println("The element with "+xpath+" is actual text not match with expected tittle "+text);
			 }
			}
		catch (NoSuchElementException e) {
			System.err.print("No such element with id "+xpath+" is not present and cannot verified with text "+text+" not present");
		}catch(ElementNotVisibleException e) {
			System.err.print(" Element with id "+xpath+" is not visible so it was not  verified with text "+text+" not present");
		}catch (WebDriverException e) {
			System.err.println("The title of page "+xpath+"is not verified due to unknown error");
			
		}finally {
			takeSnap();
		}}
	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		 try {
			String actualxpath=d.findElementByXPath(xpath).getText();
			if(actualxpath.contains(text))
			 {
				 System.out.println("The element with "+xpath+" is actual text match with expected tittle "+text);
			 }
			 else {
			  System.out.println("The element with "+xpath+" is actual text was not match with expected tittle "+text);
			 }}
		 
			 catch (NoSuchElementException e) {
				System.err.print("No such element with id "+xpath+" is not present and cannot verified with text "+text+" not present");
			}catch(ElementNotVisibleException e) {
				System.err.print(" Element with id "+xpath+" is not visible so it was not  verified with text "+text+" not present");
			}catch (WebDriverException e) {
				System.err.println("The title of page "+xpath+"is not verified due to unknown error");
				
			}finally {
				takeSnap();
			}
		 }

	@Override
	public void clickById(String id) {
		try {
		   
			 d.findElementById(id).click();
			System.out.println("The given id "+id+" is clicked");
		} catch (NoSuchElementException e) {
			System.err.print("The element with id "+id+" is not in the dom");
		} catch(ElementNotVisibleException e) {
		  System.err.print("The element with "+id+" is not not interactable ");	
		}catch(StaleElementReferenceException e)
	    {
			System.err.print("The element with "+id+" is not stable to interact");
	    }catch(ElementClickInterceptedException e) {
	    	System.err.print("The element with "+id+" is click not properly executed");
	    }
	catch(WebDriverException e) {
	    	System.err.print("The element with data "+id+" is entered with data  due to unknown error");
	    }
			finally {
						takeSnap();
		}
	}
@Override
	public void clickByClassName(String classVal) {
		try {
			d.findElementByClassName(classVal).click();
			System.out.println("The given id "+classVal+" is clicked");
		} catch (NoSuchElementException e) {
			System.err.print("The element with id "+classVal+" is not in the dom");
		} catch(ElementNotVisibleException e) {
		  System.err.print("The element with "+classVal+" is not not interactable ");	
		}catch(StaleElementReferenceException e)
	    {
			System.err.print("The element with "+classVal+" is not stable to interact");
	    }catch(ElementClickInterceptedException e) {
	    	System.err.print("The element with "+classVal+" is click not properly executed");
	    }
	catch(WebDriverException e) {
	    	System.err.print("The element with data "+classVal+" is entered with data  due to unknown error");
	    }
		finally {
			takeSnap();
	}}

	@Override
	public void clickByName(String name) {
		try {
			d.findElementByName(name).click();
			System.out.println("The given id "+name+" is clicked");
		} catch (NoSuchElementException e) {
			System.err.print("The element with id "+name+" is not in the dom");
		} catch(ElementNotVisibleException e) {
		  System.err.print("The element with "+name+" is not not interactable ");	
		}catch(StaleElementReferenceException e)
	    {
			System.err.print("The element with "+name+" is not stable to interact");
	    }catch(ElementClickInterceptedException e) {
	    	System.err.print("The element with "+name+" is click not properly executed");
	    }
	catch(WebDriverException e) {
	    	System.err.print("The element with data "+name+" is entered with data  due to unknown error");
	    }
			finally {	
				takeSnap();
	}}
		@Override
	public void clickByLink(String name) {
		try {
			d.findElementByLinkText(name).click();
			System.out.println("The given link "+name+" is clicked");
		}
		catch (NoSuchElementException e) {
			System.err.print("The element with id "+name+" is not in the dom");
		} catch(ElementNotVisibleException e) {
		  System.err.print("The element with "+name+" is not not interactable ");	
		}catch(StaleElementReferenceException e)
	    {
			System.err.print("The element with "+name+" is not stable to interact");
	    }catch(ElementClickInterceptedException e) {
	    	System.err.print("The element with "+name+" is click not properly executed");
	    }
	catch(WebDriverException e) {
	    	System.err.print("The element with data "+name+" is entered with data  due to unknown error");
	    }
			finally {
				takeSnap();
			}
	}
	@Override
	public void clickByLinkNoSnap(String name) {
		try {
			d.findElementByLinkText(name).click();
			System.out.println("The given link "+name+" is clicked");
		}
		catch (NoSuchElementException e) {
			System.err.print("The element with id "+name+" is not in the dom");
		} catch(ElementNotVisibleException e) {
		  System.err.print("The element with "+name+" is not not interactable ");	
		}catch(StaleElementReferenceException e)
	    {
			System.err.print("The element with "+name+" is not stable to interact");
	    }catch(ElementClickInterceptedException e) {
	    	System.err.print("The element with "+name+" is click not properly executed");
	    }
	catch(WebDriverException e) {
	    	System.err.print("The element with data "+name+" is entered with data  due to unknown error");
	    }
	}
	@Override
	public void clickByXpath(String xpathVal) {
		try {
			d.findElementByXPath(xpathVal).click();
			System.out.println("The given xpath "+xpathVal+" is clicked");
		}
		catch (NoSuchElementException e) {
			System.err.print("No such element with xpath "+xpathVal+" is present in the  dom");
		} catch(ElementNotVisibleException e) {
		  System.err.print("The element with "+xpathVal+" is not not interactable ");	
		}catch(StaleElementReferenceException e)
	    {
			System.err.print("The element with "+xpathVal+" is not stable to interact");
	    }catch(ElementClickInterceptedException e) {
	    	System.err.print("The element with "+xpathVal+" is click not properly executed");
	    }
	catch(WebDriverException e) {
	    	System.err.print("The element with data "+xpathVal+" is entered with data  due to unknown error");
	    }
		finally {	
				takeSnap();
			}
	}
	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			d.findElementByXPath(xpathVal).click();
			System.out.println("The given xpath "+xpathVal+" is clicked");
		}
		catch (NoSuchElementException e) {
			System.err.print("The element with id "+xpathVal+" is not in the dom");
		} catch(ElementNotVisibleException e) {
		  System.err.print("The element with "+xpathVal+" is not not interactable ");	
		}catch(StaleElementReferenceException e)
	    {
			System.err.print("The element with "+xpathVal+" is not stable to interact");
	    }catch(ElementClickInterceptedException e) {
	    	System.err.print("The element with "+xpathVal+" is click not properly executed");
	    }
	catch(WebDriverException e) {
	    	System.err.print("The element with data "+xpathVal+" is entered with data  due to unknown error");
	    }
	}

	@Override
	public String getTextById(String idVal) {
		String id1 = null;
		try {
	   id1 =d.findElementById(idVal).getText();
		System.out.println("Id for the text is "+id1);
		}catch(NoSuchElementException e) {	
			System.err.println("The element with id "+idVal+" is not present in the dom");
		}finally {
			takeSnap();
		}
		return id1;
	}
	@Override
	public String getTextByXpath(String xpathVal) {
		String xp = null;
		try {
			 xp =d.findElementByXPath(xpathVal).getText();
			System.out.println(xp);
		}
		catch (NoSuchElementException e) {
			System.err.print("The element with xpath "+xpathVal+" is not in the dom");
		} catch(ElementNotVisibleException e) {
		  System.err.print("The element with "+xpathVal+" is not not interactable ");	
		}catch(StaleElementReferenceException e)
	    {
			System.err.print("The element with "+xpathVal+" is not stable to interact");
	    }catch(ElementClickInterceptedException e) {
	    	System.err.print("The element with "+xpathVal+" is click not properly executed");
	    }
	catch(WebDriverException e) {
	    	System.err.print("The element with data "+xpathVal+" is entered with data  due to unknown error");
	    }
			finally {
				
				takeSnap();}
		      	return xp;
	}
	@Override
	public void selectVisibileTextById(String id, String value) {
		 try {
			WebElement visibileid = d.findElementById(id);
			Select textid = new Select(visibileid);
			textid.selectByVisibleText(value);
			System.out.println("Text is visible by "+value);
		}catch(ElementNotVisibleException e) {
			  System.err.print("The element with "+value+" is not not interactable ");	
			}catch(StaleElementReferenceException e)
		    {
				System.err.print("The element with "+value+" is not stable to interact");
		    }catch(ElementClickInterceptedException e) {
		    	System.err.print("The element with "+value+" is click not properly executed");
		    }
		catch(WebDriverException e) {
		    	System.err.print("The element with data "+value+" is entered with data  due to unknown error");
		    }
				finally {
					takeSnap();
				} 
		}	
	@Override
	public void selectIndexById(String id, int value) {
		try {
			WebElement indexid = d.findElementById(id);
			Select indexid1 = new Select(indexid);
			indexid1.selectByIndex(value);
			System.out.println("Text is visible by "+value);
		}
		catch(ElementNotVisibleException e) {
			  System.err.print("The element with "+value+" is not not interactable ");	
			}
		catch(StaleElementReferenceException e)
		    {
				System.err.print("The element with "+value+" is not stable to interact");
		    }
		catch(ElementClickInterceptedException e) {
		    	System.err.print("The element with "+value+" is click not properly executed");
		    }
		catch(WebDriverException e) {
		    	System.err.print("The element with data "+value+" is entered with data  due to unknown error");
		    }
				finally {
					takeSnap();
				} 
		}
	@Override
	public void switchToParentWindow() {
	try {
		Set <String> allwinid = d.getWindowHandles();
			for(String eachid : allwinid) {
				d.switchTo().window(eachid);
			}
			System.out.println("Window is switch to ParentWindow");
		} catch (NoSuchWindowException e) {
			System.err.print("No such window in the application");
		}catch(WebDriverException e) {
			System.err.print("No such element in the dom");
		}
		finally {
		takeSnap();
	}
	}
	@Override
	public void switchToLastWindow() {
		try {
			Set <String> allwinafterclick = d.getWindowHandles();
				for(String eachid : allwinafterclick) {
					d.switchTo().window(eachid);
				}
				System.out.println("Window is switch to lastwindow");
			} catch (NoSuchWindowException e) {
				System.err.print("No such window in the application");
			}catch(WebDriverException e) {
				System.err.print("No such element in the dom");
			}
			finally {
			takeSnap();
		}
		}
	@Override
	public void acceptAlert() {
	try {
		d.switchTo().alert().accept();
		System.out.println("The alert was accepted");
	}catch (NoAlertPresentException e) {
		System.err.print("No alert was present");
	}catch(ElementNotVisibleException e) {
		  System.err.print("The element with is not interactable ");	
		}
	catch(StaleElementReferenceException e)
	    {
			System.err.print("The element with is not stable to interact");
	    }
	catch(ElementClickInterceptedException e) {
	    	System.err.print("The element with  is click not properly executed");
	    }
	catch(WebDriverException e) {
	    	System.err.print("The element with data is entered is due to unknown error");
	    }finally {
					takeSnap();
			} 
	}	
	@Override
	public void dismissAlert() {
try {
			d.switchTo().alert().dismiss();
			System.out.println("The alert was rejected");
		}catch (NoAlertPresentException e) {
			System.err.print("No alert was present");
		}catch(ElementNotVisibleException e) {
			  System.err.print("The element with is not interactable ");	
			}
		catch(StaleElementReferenceException e)
		    {
				System.err.print("The element with is not stable to interact");
		    }
		catch(ElementClickInterceptedException e) {
		    	System.err.print("The element with  is click not properly executed");
		    }
		catch(WebDriverException e) {
		    	System.err.print("The element with data is entered is due to unknown error");
		    }finally {
						takeSnap();
				} 
		}
	@Override
	public String getAlertText() {
		String alertText=null;
		 try {
			  alertText=d.switchTo().alert().getText();
			System.out.println("Alert text "+alertText+" has been captured successfully");
		 }
		 catch (NoAlertPresentException e) {
				System.err.print("No alert was present");
			}catch(ElementNotVisibleException e) {
				  System.err.print("The element with is not interactable ");	
				}
			catch(StaleElementReferenceException e)
			    {
					System.err.print("The element with is not stable to interact");
			    }
			catch(ElementClickInterceptedException e) {
			    	System.err.print("The element with  is click not properly executed");
			    }
			catch(WebDriverException e) {
			    	System.err.print("The element with data is entered is due to unknown error");
			    }
		return alertText;
	}

	@Override
	public void takeSnap() {
			try {
				File src = d.getScreenshotAs(OutputType.FILE);
				File dest = new File("./screenshots/snap "+i+".png");
				FileUtils.copyFile(src, dest);
				System.out.println("screenshoot is taken and stored in destination");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}       catch (WebDriverException e) {
		           System.err.println("The browser is not closed due to unknown error");
			}
			i=i+1;
	}
	public void closeBrowser() {
		try {
			d.close();
         System.out.println("Current window is closed successfully");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The browser window is not cloased as there is no such element");
		} catch (WebDriverException e) {
			System.err.println("The browser is not closed due to unknown error");
		}

	}

	public void closeAllBrowsers() {
		try {
			d.quit();
			System.out.println("All window is closed successfully");
		}catch (NoSuchElementException e) {
	System.err.println("The browser window is not cloased as there is no such element");
		} catch (WebDriverException e) {
			System.err.println("The browser is not closed due to unknown error");

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
			System.out.println("window out from default content");
		} 
		catch (NoSuchWindowException e) {
			System.err.println("No such window present in dom"); 
		}
		catch (WebDriverException e) {
			System.err.println("No such Driver present in dom");
	}
	}

	@Override
	public void selectVisibileTextByName(String Name, String value) {
			 try {
				WebElement visibileid1 = d.findElementById(Name);
				Select textid1 = new Select(visibileid1);
				textid1.selectByVisibleText(value);
				System.out.println("Text is visible by "+value);
			}catch(ElementNotVisibleException e) {
				  System.err.println("The element with "+value+" is not not interactable ");	
				}catch(StaleElementReferenceException e)
			    {
					System.err.println("The element with "+value+" is not stable to interact");
			    }catch(ElementClickInterceptedException e) {
			    	System.err.println("The element with "+value+" is click not properly executed");
			    }
			catch(WebDriverException e) {
			    	System.err.println("The element with data "+value+" is entered with data  due to unknown error");
			    }
					finally {
						
						takeSnap();
					} 
			}

	@Override
	public void selectVisibileTextByXpath(String xpath, String value) {
		 try {
				WebElement visibileid12 = d.findElementByXPath(xpath);
				Select textid12 = new Select(visibileid12);
				textid12.selectByVisibleText(value);
				System.out.println("Text is visible by "+value);
			}catch(ElementNotVisibleException e) {
				  System.err.println("The element with "+value+" is not not interactable ");	
				}catch(StaleElementReferenceException e)
			    {
					System.err.println("The element with "+value+" is not stable to interact");
			    }catch(ElementClickInterceptedException e) {
			    	System.err.println("The element with "+value+" is click not properly executed");
			    }
			catch(WebDriverException e) {
			    	System.err.println("The element with data "+value+" is entered with data  due to unknown error");
			    }
					finally {
						
						takeSnap();
					} 
			}
	@Override
	public void enterByXpath(String xpathValue, Keys pageDown) {
			// TODO Auto-generated method stub
			try {
				d.findElementByXPath(xpathValue).sendKeys(pageDown);
				System.out.println("The element with "+xpathValue+" is entered with "+pageDown);
			} 
				catch (NoSuchElementException e) {
					System.err.print("The element with id "+xpathValue+" is not in the dom");
				} catch(ElementNotVisibleException e) {
				  System.err.print("The element with "+xpathValue+" is not not interactable ");	
				}catch(StaleElementReferenceException e)
			    {
					System.err.print("The element with "+xpathValue+" is not stable to interact");
			    }catch(ElementClickInterceptedException e) {
			    	System.err.print("The element with "+xpathValue+" is click not properly executed");
			    }
			catch(WebDriverException e) {
			    	System.err.print("The element with data "+xpathValue+" is entered with data "+pageDown+" due to unknown error");
			    }
				finally {
					takeSnap();
			}}
	@Override
	public void selectNameByValue(String Name, String value) {
		try {
			WebElement nameid = d.findElementByName(Name);
			Select indexid1 = new Select(nameid);
			indexid1.selectByValue(value);
			System.out.println("Text is visible by "+value);
		}catch(ElementNotVisibleException e) {
			  System.err.print("The element with "+value+" is not not interactable ");	
			}catch(StaleElementReferenceException e)
		    {
				System.err.print("The element with "+value+" is not stable to interact");
		    }catch(ElementClickInterceptedException e) {
		    	System.err.print("The element with "+value+" is click not properly executed");
		    }
		catch(WebDriverException e) {
		    	System.err.print("The element with data "+value+" is entered with data  due to unknown error");
		    }
				finally {
					takeSnap();
				} 
		}
	@Override
	public void iframe(String path) {
		
			try {
				WebElement id1 = d.findElementByXPath(path);
				d.switchTo().frame(id1);
				System.out.println("screen is switched to frame");
			}
			catch (NoSuchWindowException e) {
			System.err.println("No such window present in dom");
			}
			catch (WebDriverException e) {
				System.err.println("No such Driver present in dom");
		}	
	}
	@Override
	public void sendkeysalerts(String Val) {
		// TODO Auto-generated method stub
		try {
			d.switchTo().alert().sendKeys(Val);
			System.out.println("User send the input" +Val);
			
		}
		catch (NoSuchWindowException e) {
			System.err.println("No such window present in dom");
			}
			catch (WebDriverException e) {
				System.err.println("No such Driver present in dom");
		}finally {
			takeSnap();
		}
	}
	@Override
public void alerttext(String name) {
		
	}
	@Override
	public void AlertText() {
		
		 try {
			 String alertText=d.switchTo().alert().getText();
			System.out.println("Alert text "+alertText+" has been captured successfully");
		 }
		 catch (NoAlertPresentException e) {
				System.err.print("No alert was present");
			}catch(ElementNotVisibleException e) {
				  System.err.print("The element with is not interactable ");	
				}
			catch(StaleElementReferenceException e)
			    {
					System.err.print("The element with is not stable to interact");
			    }
			catch(ElementClickInterceptedException e) {
			    	System.err.print("The element with  is click not properly executed");
			    }
			catch(WebDriverException e) {
			    	System.err.print("The element with data is entered is due to unknown error");
			    }
	
	}
	@Override
	public void refresh() {
		d.navigate().refresh();
		
	}

		
}	
		
	



	

