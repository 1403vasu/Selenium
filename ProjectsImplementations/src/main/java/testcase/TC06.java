package testcase;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilis.DP06;
import wrappers.GenericWrappers;
public class TC06 extends GenericWrappers {
	@Test(dataProvider="saloon",dataProviderClass=DP06.class)
public void saloon(String Name,String org,String address,String mobile,String email,String origin,String dest,String period,String coach,String numpass,String numpass1,String purpose,String service) {
	invokeApp("chrome","https://www.irctc.co.in/nget/train-search");
	clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
	waitproperty(2000);
	clickByLink("HOLIDAYS");
	waitproperty(3000);
	clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]");
	clickByLink("Lounge");
    switchToParentWindow();
   clickByXpath("//*[@id=\"sidebarCollapse\"]");
    waitproperty(3000);
    clickByLink("Charter");
    waitproperty(5000);
   clickById("enquiry-tab");
    waitproperty(3000);
    enterByName("name",Name);
    enterByName("organization",org);
    enterByName("address",address);
    enterByName("mobile",mobile);
    enterByName("email",email);
    waitproperty(5000);
    selectVisibileTextByXpath("/html/body/app-root/ng-component/div[2]/div/div/div/div[2]/div/form/div/div[6]/select","Saloon Charter");
    enterByName("originStation",origin);
	enterByName("destnStation",dest);
	waitproperty(5000);
    clickByName("checkInDate");
    waitproperty(5000);
    clickByXpath("/html/body/app-root/ng-component/div[2]/div/div/div/div[2]/div/form/div/div[9]/div/div/table/tbody/tr[5]/td[1]/span");
    clickByName("checkOutDate");
    waitproperty(3000);
    clickByXpath("/html/body/app-root/ng-component/div[2]/div/div/div/div[2]/div/form/div/div[10]/div/div/table/tbody/tr[5]/td[4]/span");
    enterByName("durationPeriod",period);
    enterByName("coachDetails",coach);
    enterByName("numPassenger",numpass);
    enterByName("numPassenger",numpass1);
    enterByName("charterPurpose",purpose);
    enterByName("services",service);
   // clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button");
	//closeAllBrowsers();
}

}
