package testcase;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import utilis.DP05;
import wrappers.GenericWrappers;

public class TC05 extends GenericWrappers {
	@Test(dataProvider="coach",dataProviderClass=DP05.class)
	public void bookyourcoach(String Userid,String password,String conformpass,String secqstn,String secans,String email,String occupation,String fname,String nationality,String flatno,String street,String area,String mobile,String pincode,String postoffice,
			String flatnooffice,String street1, String area1, String country1,String mobile1,String pincode1,String postoffice1) {
		invokeApp("chrome","https://www.irctc.co.in/nget/train-search");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		waitproperty(5000);
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]");
		clickByLink("Lounge");
		switchToParentWindow();
	    clickByXpath("//*[@id=\"sidebarCollapse\"]");
	    waitproperty(5000);
	    clickByLink("Book Your Coach/Train");
        waitproperty(5000);
        switchToParentWindow();
	    clickByLink("New User? Signup");
	    enterById("userId",Userid);
	    enterById("password",password);
	    enterById("cnfPassword",password);
		selectVisibileTextById("secQstn",secqstn);
		enterById("secAnswer",secans);
		clickById("dateOfBirth");
		clickByLink("14");
		clickByXpath("/html/body/div[2]/form/div/div[2]/table/tbody/tr[8]/td[2]/label[2]");
	    clickByXpath("/html/body/div[2]/form/div/div[2]/table/tbody/tr[9]/td[2]/input[2]");
	    enterById("email",email);
	    selectVisibileTextById("occupation",occupation);
	    enterById("fname",fname);
	    selectVisibileTextById("natinality",nationality);
	    enterById("flatNo",flatno);
		enterById("street",street);
		enterById("area",area);
		waitproperty(10000);
		selectIndexById("country",1);
		enterById("mobile",mobile);
		enterById("pincode",pincode);
		waitproperty(5000);
		enterByXpath("//html/body",Keys.PAGE_DOWN);
		waitproperty(10000);
		selectVisibileTextById("postOffice",postoffice);
		 waitproperty(10000);
		 clickById("sameAddresses1");
		 enterById("flatNoOffice",flatnooffice);
		enterById("streetOffice",street1);
		enterById("areaOffice",area1);
		selectVisibileTextById("countryOffice",country1);
		enterById("mobileOffice",mobile1);
		enterById("pincodeOffice",pincode1);
        waitproperty(2000);
		waitproperty(2000);
		clickByXpath("//*[@id=\"postOfficeOffice\"]");
		selectVisibileTextById("postOfficeOffice",postoffice1);
		//closeAllBrowsers();
	    
	    
	    
	  

	}
}
