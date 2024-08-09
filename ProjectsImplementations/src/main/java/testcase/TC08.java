package testcase;

import java.util.Set;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utilis.DP08;
import wrappers.GenericWrappers;

public class TC08 extends GenericWrappers{
@Test(dataProvider="validation",dataProviderClass=DP08.class)
	public void Otp(String mail,String mob,String room,String adult,String title,String firstname,String lastname,String country,String state,String gst) {
		invokeApp("chrome","https://www.irctc.co.in/nget/train-search");
		waitproperty(10000);
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		waitproperty(5000);
	   clickByLink("HOLIDAYS");
		waitproperty(3000);
		clickByLink("Stays");
		clickByLink("Lounge");
		switchToParentWindow();
		clickByXpath("/html/body/app-root/accommodation/div[2]/div[1]/ul/li[2]/a");
		switchToParentWindow();
        waitproperty(10000);
		clickByXpath("/html/body/app-root/app-fulllayout/homeheader/header/nav/div/div[2]/div[2]/ul/li[2]/a");
		waitproperty(5000);
	    clickByXpath("//*[@id=\"profile-tab\"]");
	    waitproperty(5000);
	    enterByName("email",mail);
	     enterByName("mobileNo",mob);
	     clickByXpath("/html/body/app-root/app-fulllayout/homeheader/app-loginmodal/div/div/div/div/div/div[2]/div/form/div[3]/button");
        waitproperty(5000);
        clickById("filterText");
	    enterById("filterText","Chennai");
	    waitproperty(5000);
        clickByXpath("/html/body/app-root/app-fulllayout/app-home/div[2]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[1]/a/div[1]");
        waitproperty(5000);
        clickByName("dt12");
		waitproperty(1000);
		clickByXpath("/html/body/div/div[2]/div/owl-date-time-container/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[3]");
		clickByName("dt13");
		waitproperty(1000);
		clickByXpath("/html/body/div/div[3]/div/owl-date-time-container/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[7]");
		clickByXpath("/html/body/app-root/app-fulllayout/app-home/div[2]/div[2]/div/app-hotelmodify/form/div[4]");
        waitproperty(5000);
		selectNameByValue("hotelRoom",room);
        waitproperty(5000);
        selectNameByValue("hotelAdult",adult);
        waitproperty(5000);
        //click to continue
		clickByXpath("/html/body/app-root/app-fulllayout/app-home/div[2]/div[2]/div/app-hotelmodify/form/div[4]/div/div/div[2]/button");
		waitproperty(5000);
		//find hotels
		              
		clickByXpath("/html/body/app-root/app-fulllayout/app-home/div[2]/div[2]/div/app-hotelmodify/form/div[5]/button");
		//select the first hotels
		waitproperty(10000);
		clickByXpath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a");
		 switchToParentWindow();
		waitproperty(10000);
		//get hotel name
		getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[1]/div/h5");
        waitproperty(5000);
       // get price details
        getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/strong");
		waitproperty(10000);
		//continue to book
		clickByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/button");
		waitproperty(10000);
		
		selectNameByValue("title",title);
		enterByName("firstName",firstname);
		enterByName("lastName",lastname);
		selectNameByValue("country",country);
		
		selectNameByValue("state",state);
		
		
        selectNameByValue("gst",gst);
		waitproperty(10000);
		
		getTextByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[1]/div/div/h5");
		verifyTextContainsByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[1]/div/div/h5","/html/body/app-root/app-fulllayout/app-paxdetail/div[1]/div/div/h5");
		waitproperty(5000);
		//continue
		clickByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/button[2]");
	  
	  waitproperty(5000);
	   clickByXpath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[1]/ul/li/label/span");
	  waitproperty(5000);
	 clickByXpath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[2]/button[2]");
	 waitproperty(5000);
	 clickByXpath("//*[@id=\"modalOTP\"]/div/div/form/div/div[2]/button");
	 waitproperty(10000);
	 verifyTextContainsByXpath("//*[@id=\\\"modalOTP\\\"]/div/div/form/div/div[2]/button", "otp is required.");
	 closeAllBrowsers();
	
	}
}
