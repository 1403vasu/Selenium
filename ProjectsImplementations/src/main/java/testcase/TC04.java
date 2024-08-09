package testcase;



import org.testng.annotations.Test;

import utilis.DP04;
import utilis.Dp02;
import wrappers.GenericWrappers;

public class TC04 extends GenericWrappers {
	@Test(dataProvider="fetch",dataProviderClass=DP04.class)
 public void irctcsignup(String Username,String password, String confpassword, String firstname,String email, String mobile,String resAddress1,String resAddress2,String resAddress3,String resstate,String resphone,String offAddress1,String offAddress2,String offAddress3,
		 String offpincode,String offstate, String offphone)
 {
	 invokeApp("chrome","https://www.irctc.co.in/nget/train-search");
	 clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
	 waitproperty(4000);
	 clickByLink("REGISTER");
	 waitproperty(5000);
	 enterById("userName",Username);
	 enterById("usrPwd",password);
	 enterById("cnfUsrPwd",confpassword);
	 clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div/div[3]/span");
	 clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li"); 
	 clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div");
	 clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li");
	 enterByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input","liliya");
	 clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
	 waitproperty(5000);
	 enterById("firstName",firstname);
     waitproperty(4000);
     clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[2]/span");
	 clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li/span");
	 enterByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input","14-3-1997");
	 clickByXpath("//*[@id=\"unmarried\"]/div/div[2]");
	 clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[2]");
	 enterById("email",email);
	 enterById("mobile",mobile);
	 clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select");
	 clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select/option[106]");
	 clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
     enterById("resAddress1",resAddress1);
     enterById("resAddress2",resAddress2);
     enterById("resAddress3",resAddress3);
	 enterByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[4]/input","620023");
	 enterById("resState",resstate);
     waitproperty(10000);
    clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[6]/select");
    clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[6]/select/option[2]");
	waitproperty(4000);
    clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select");
    clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select/option[2]");
    enterById("resPhone",resphone);
	clickByXpath("//*[@id=\"no\"]/div/div[2]");
	enterById("offAddress1",offAddress1);
	enterById("offAddress2",offAddress2);
	enterById("offAddress3",offAddress3);
	enterById("offPinCode",offpincode);
	enterById("offState",offstate);
	waitproperty(1000);
	clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[7]/select");
	clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select/option[2]");
	waitproperty(1000);
	clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[10]/div[7]/select");
	clickByXpath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[10]/div[7]/select/option[2]");
	enterById("offPhone",offphone);
	waitproperty(1000);
	closeAllBrowsers();
	 
 }
}

