package WeekOne;

import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver d = new ChromeDriver();
	     d.manage().window().maximize();
	     d.get("https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
	     d.findElementByLinkText("Sign Up (Registration)").click();
	     d.findElementById("u_id").sendKeys("Vasu@1234mathi");
	     d.findElementById("u_pwd").sendKeys("Vasumathi@123");
	     d.findElementById("u_repwd").sendKeys("Vasumathi@123");
	     d.findElementById("u_secans").sendKeys("Robin sharma");
	     d.findElementById("u_name").sendKeys("Mathi@123Vasu");
	     d.findElementById("u_dob").sendKeys("14/3/97");
	     d.findElementById("u_designation").sendKeys("Engineering");
	     d.findElementById("u_emailid").sendKeys("vasumathik1497@gmail.com");
	     d.findElementById("u_mobile").sendKeys("8344959590");
	     d.findElementById("u_phone").sendKeys("0431-2457609");
	     d.findElementById("name").sendKeys("vasu");
	     d.findElementById("capacity").sendKeys("10");
	     d.findElementById("address").sendKeys("5/14,gokulam colony,kajamalai");
	     d.findElementById("email").sendKeys("mathivasu14@gmail.com");
	     d.findElementById("mcontact").sendKeys("9876543210");
	     d.findElementById("contact").sendKeys("9087654321");
	     d.findElementByName("name_o").sendKeys("raja");
	     d.findElementByName("address_o").sendKeys("chennai0ne");
	     d.findElementByName("emailid_o").sendKeys("vasumathi14@gmail.com");
	     d.findElementByName("phoneno_o").sendKeys("9870345112");
	     d.findElementByName("mobile_o").sendKeys("9856702314");
	     
	     

	}

}
