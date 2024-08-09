package WeekOne;

import org.openqa.selenium.chrome.ChromeDriver;

public class irctc_signup_page {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver d = new ChromeDriver();
	     d.manage().window().maximize();
	     d.get("https://www.irctc.co.in/nget/train-search");
	     d.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
	     d.findElementByLinkText("REGISTER").click();
	     Thread.sleep(5000);
	     d.findElementById("userName").sendKeys("Vasu1234mathi");
	     d.findElementById("usrPwd").sendKeys("Vasumathi@123");
	     d.findElementById("cnfUsrPwd").sendKeys("Vasumathi@123");
	     d.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input").sendKeys("liliya");
	     d.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
	     Thread.sleep(3000);
	     d.findElementById("firstName").sendKeys("MATHI");
	     d.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input").sendKeys("14-3-1997");
	     d.findElementByXPath("//*[@id=\"unmarried\"]/div/div[2]").click();
	     d.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[2]").click();
	     d.findElementById("email").sendKeys("vasumathik1497@gmail.com");
	     d.findElementById("mobile").sendKeys("9345110162");
	     d.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
	     d.findElementById("resAddress1").sendKeys("5/14");
		 d.findElementById("resAddress2").sendKeys("Gokulam");
		 d.findElementById("resAddress3").sendKeys("Kajamalai");
		 d.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[4]/input").sendKeys("620023");
		 d.findElementById("resState").sendKeys("TamilNadu");
		 d.findElementById("resPhone").sendKeys("9723456120");
			
}
}
