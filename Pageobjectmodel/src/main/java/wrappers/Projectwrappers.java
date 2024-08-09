package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Projectwrappers extends GenericWrappers {
	public String browsername,url;
	@BeforeSuite
public void beforesuite(){
		startReport();
	}
	@BeforeTest
  public void beforeTest() {
	  
  }
	@BeforeClass
  public void beforeclass() {
	  
  }
	@BeforeMethod
  public void beforemethod() {
		startTest(testCaseName,testCaseDescription);
	    invokeApp(browsername, url);
  }
	@AfterMethod
  public void aftermethod() {
	 // closeAllBrowsers();
  }
	@AfterClass
  public void afterclass() {
	  endTest(); 
  }
	@AfterTest
  public void afterTest() {
	  endReport();
  }
	@AfterSuite
  public void aftersuite(){
		endReport();
	}
  
}
