package weektwo.testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC006 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver d = new ChromeDriver();
	     d.manage().window().maximize();
	     d.get("https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
	     d.findElementByLinkText("Sign Up (Registration)").click();
	     d.findElementById("u_id").sendKeys("Vasu@1234mathi");
	     d.findElementById("u_pwd").sendKeys("Vasumathi@123");
	     d.findElementById("u_repwd").sendKeys("Vasumathi@123");
	     Thread.sleep(5000);
	     WebElement list = d.findElementById("u_secques");
	     Select sc1 = new Select(list);
	     sc1.selectByVisibleText("where did you meet your spouse?");
	     d.findElementById("u_secans").sendKeys("My home");
	     d.findElementById("u_name").sendKeys("Mathi@123Vasu");
	     WebElement ls = d.findElementById("u_gender");
	     Select sc2 = new Select(ls);
	     sc2.selectByVisibleText("Female");
	     Thread.sleep(3000);
	     d.findElementById("u_dob").sendKeys("14/3/97");
	     Thread.sleep(5000);
	     d.findElementById("u_designation").sendKeys("Engineering");
	     d.findElementById("u_emailid").sendKeys("vasumathik1497@gmail.com");
	     d.findElementById("u_mobile").sendKeys("8344959590");
	     d.findElementById("u_phone").sendKeys("0431-2457609");
	     WebElement l2 = d.findElementById("u_nationality");
	     Select sl = new Select(l2);
	     sl.selectByVisibleText("INDIA");
	     d.findElementById("name").sendKeys("vasu");
	     d.findElementById("capacity").sendKeys("10");
	     d.findElementById("address").sendKeys("5/14,gokulam colony,kajamalai");
	     WebElement state = d.findElementById("state");
	     Select s2 = new Select(state);
	     s2.selectByVisibleText("TAMIL NADU");
	     Thread.sleep(5000);
	     WebElement l3 =d.findElementById("city_distr");
	     Select s3 = new Select(l3);
	    s3.selectByVisibleText("TIRUCHIRAPPALLI");
	    Thread.sleep(5000);
	     WebElement l4 =d.findElementById("frrodata");
	     Select s4 = new Select(l4);
	    s4.selectByVisibleText("FRO TRICHY URBAN");
	    Thread.sleep(4000);
	    WebElement l5 =d.findElementById("acco_type");
	     Select s5 = new Select(l5);
	    s5.selectByVisibleText("Service Apartment");
	    Thread.sleep(4000);
	    WebElement l6 =d.findElementById("star_rat");
	     Select s6 = new Select(l6);
	    s6.selectByVisibleText("Five Star");
	    Thread.sleep(3000);
	     d.findElementById("email").sendKeys("mathivasu14@gmail.com");
	     d.findElementById("mcontact").sendKeys("9876543210");
	     d.findElementById("contact").sendKeys("9087654321");
	     d.findElementByName("name_o").sendKeys("raja");
	     d.findElementByName("address_o").sendKeys("chennai0ne");
	     WebElement l7 =d.findElementById("state_o");
	     Select s7 = new Select(l7);
	    s7.selectByVisibleText("GOA");
	    Thread.sleep(4000);
	    WebElement l8 =d.findElementById("citydistr_o");
	     Select s8 = new Select(l8);
	    s8.selectByVisibleText("GOA");
	     d.findElementByName("emailid_o").sendKeys("vasumathi14@gmail.com");
	     d.findElementByName("phoneno_o").sendKeys("9870345112");
	     d.findElementByName("mobile_o").sendKeys("9856702314");
	     d.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input").click();
	     
	     
	     d.findElementByName("name_o").sendKeys("aadhi");
	     d.findElementByName("address_o").sendKeys("kumbakonam");
	     WebElement lo =d.findElementById("state_o");
	     Select st = new Select(lo);
	    st.selectByVisibleText("TAMIL NADU");
	    Thread.sleep(4000);
	    WebElement lo1 =d.findElementById("citydistr_o");
	     Select st1 = new Select(lo1);
	    st1.selectByVisibleText("THANJAVUR");
	     d.findElementByName("emailid_o").sendKeys("vasumathi14@gmail.com");
	     d.findElementByName("phoneno_o").sendKeys("9870345112");
	     d.findElementByName("mobile_o").sendKeys("9856702314");
	     d.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input").click();
	     
	     
	     d.findElementByName("name_o").sendKeys("vasu");
	     d.findElementByName("address_o").sendKeys("Trichy");
	     WebElement lo2 =d.findElementById("state_o");
	     Select st3 = new Select(lo2);
	    st.selectByVisibleText("TAMIL NADU");
	    Thread.sleep(4000);
	    WebElement d1 =d.findElementById("citydistr_o");
	     Select t1 = new Select(d1);
	    t1.selectByVisibleText("CHENGALPATTU");
	     d.findElementByName("emailid_o").sendKeys("vasumathi14@gmail.com");
	     d.findElementByName("phoneno_o").sendKeys("9870345112");
	     d.findElementByName("mobile_o").sendKeys("9856702314");
	     d.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input").click();
	     d.quit();
	     

	}

}
