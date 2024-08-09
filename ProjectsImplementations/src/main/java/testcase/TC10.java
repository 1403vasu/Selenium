package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import wrappers.GenericWrappers;

public class TC10 extends GenericWrappers {
	@Test
	public void gst() {
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
	    enterByName("email","abcdg@gmail.com");
	     enterByName("mobileNo","8610360000");
	     clickByXpath("/html/body/app-root/app-fulllayout/homeheader/app-loginmodal/div/div/div/div/div/div[2]/div/form/div[3]/button");
        waitproperty(5000);
        clickById("filterText");
	    enterById("filterText","Chennai");
	    waitproperty(5000);
        clickByXpath("/html/body/app-root/app-fulllayout/app-home/div[2]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[1]/a/div[1]");
        waitproperty(5000);
        clickByName("dt12");
		waitproperty(1000);
		clickByXpath("/html/body/div/div[2]/div/owl-date-time-container/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[2]/td[2]");
		clickByName("dt13");
		waitproperty(1000);
		clickByXpath("/html/body/div/div[3]/div/owl-date-time-container/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[2]/td[4]");
		clickByXpath("/html/body/app-root/app-fulllayout/app-home/div[2]/div[2]/div/app-hotelmodify/form/div[4]");
        waitproperty(5000);
		selectNameByValue("hotelRoom","1");
        waitproperty(5000);
        selectNameByValue("hotelAdult","3");
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
		selectNameByValue("title","3");
		enterByName("firstName","vasu");
		enterByName("lastName","karthi");
		selectNameByValue("country","India");
		selectNameByValue("state","TN");
        selectNameByValue("gst","Yes");
		waitproperty(10000);
		enterByName("gstNumber","12345678901");
        enterByName("companyName","abc company");
        enterByName("companyAddress","xyz colony");
        waitproperty(10000);
        verifyTextByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/div/span","Please Enter Valid GSt number");
        closeAllBrowsers();
	}
}
