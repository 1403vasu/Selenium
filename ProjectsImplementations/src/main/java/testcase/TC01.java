package testcase;

import org.testng.annotations.Test;

import utilis.Dp01;
import utilis.Dp02;
import wrappers.GenericWrappers;

public class TC01 extends GenericWrappers{
 @Test(dataProvider = "php",dataProviderClass=Dp01.class)
	public void php(String firstname,String lastname,String email,String phone,String company, String Address1,String Address2,
                      String city,String postcode,String customfield,String password1,String password2) {
		invokeApp("Chrome","https://www.phptravels.org/register.php");
		enterById("inputFirstName",firstname);
		enterById("inputLastName",lastname);
		enterById("inputEmail",email);
		enterById("inputPhone",phone);
		enterById("inputCompanyName",company);
		enterById("inputAddress1",Address1);
		enterById("inputAddress2",Address2);
		enterById("inputCity",city);
		enterById("inputPostcode",postcode);
		enterById("customfield2",customfield);
		enterById("inputNewPassword1",password1);
		enterById("inputNewPassword2",password2);
		
	}
}
