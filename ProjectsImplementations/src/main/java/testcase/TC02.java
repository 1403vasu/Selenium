package testcase;


import org.testng.annotations.Test;

import utilis.Dp02;
import wrappers.GenericWrappers;

public class TC02 extends GenericWrappers {
	@Test(dataProvider="fetchdata",dataProviderClass=Dp02.class)
	public void facebook(String firstname,String lastname,String emailid,String conformEmailid,String password,String dobday, String dobmonth,String dobyear){
		invokeApp("chrome","https://www.facebook.com");
		clickByLink("Create New Account");
		waitproperty(5000);
		enterByName("firstname",firstname);
		enterByName("lastname", lastname);
	    enterByName("reg_email__",emailid);
	    enterByName("reg_email_confirmation__",conformEmailid);
	    enterById("password_step_input",password);
	    selectVisibileTextById("day",dobday);
	    selectVisibileTextById("month",dobmonth);
	    selectVisibileTextById("year", dobyear);
	   // enterByName("password_step_input","Vasumathi@123" );
	    clickByXpath("(//input[@name='sex'])[2]");
	  
	}
	
	}
