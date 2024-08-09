package weektwo.testcase;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC001 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver d = new ChromeDriver();
	     d.manage().window().maximize();
	     d.get("https://www.irctc.co.in/nget/train-search");
	     d.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
	     Thread.sleep(5000);
	     d.findElementByLinkText("REGISTER").click();
	     Thread.sleep(5000);
	     d.findElementById("userName").sendKeys("Vasu1234mathi");
	     d.findElementById("usrPwd").sendKeys("Vasumathi@123");
	     d.findElementById("cnfUsrPwd").sendKeys("Vasumathi@123");
	     d.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div/div[3]/span").click();
	     d.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[1]/div/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
	     d.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div").click();
	     d.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
	     d.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input").sendKeys("liliya");
	     d.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
	     Thread.sleep(3000);
	     d.findElementById("firstName").sendKeys("MATHI");
	     Thread.sleep(4000);
	    d.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[2]/span").click();
		d.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li/span").click();
	     
	     
	     d.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input").sendKeys("14-3-1997");
	     d.findElementByXPath("//*[@id=\"unmarried\"]/div/div[2]").click();
	     d.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[2]").click();
	     d.findElementById("email").sendKeys("vasumathik1497@gmail.com");
	     d.findElementById("mobile").sendKeys("9345110162");
	     d.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select").click();
	     d.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select/option[106]").click();
	    
	     
	     d.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
	     d.findElementById("resAddress1").sendKeys("5/14");
		 d.findElementById("resAddress2").sendKeys("Gokulam");
		 d.findElementById("resAddress3").sendKeys("Kajamalai");
		 d.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[4]/input").sendKeys("620023");
		 d.findElementById("resState").sendKeys("TamilNadu");
          Thread.sleep(10000);
        d.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[6]/select").click();
        d.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[6]/select/option[2]").click();
  		Thread.sleep(4000);
        d.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select").click();
  		d.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select/option[2]").click();
        d.findElementById("resPhone").sendKeys("2468789");
  		d.findElementByXPath("//*[@id=\"no\"]/div/div[2]").click();
        d.findElementById("offAddress1").sendKeys("251");
		d.findElementById("offAddress2").sendKeys("market street");
		d.findElementById("offAddress3").sendKeys("K K nagar");
		d.findElementById("offPinCode").sendKeys("600096");
		d.findElementById("offState").sendKeys("Chennai");
		Thread.sleep(1000);
		d.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[7]/select").click();
	    d.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select/option[2]").click();
		Thread.sleep(1000);
		d.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[10]/div[7]/select").click();
		d.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[10]/div[7]/select/option[2]").click();
		
		d.findElementById("offPhone").sendKeys("9785642560");
		Thread.sleep(1000);
		
		//d.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[13]/span[1]/input").click();
		
		d.quit();
		

	}

}
