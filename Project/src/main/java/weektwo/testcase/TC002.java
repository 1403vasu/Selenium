package weektwo.testcase;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC002 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver d =  new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.irctc.co.in/nget/train-search");
		d.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		Thread.sleep(5000);
		d.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a").click();
		d.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]").click();
		d.findElementByLinkText("Lounge").click();
        
        Set<String> allwinidafter = d.getWindowHandles();
        
        for(String eachId:allwinidafter ) {
        	System.out.println(eachId);
        	d.switchTo().window(eachId);
        }
        d.findElementByXPath("//*[@id=\"sidebarCollapse\"]").click();
        Thread.sleep(5000);
        d.findElementByLinkText("Book Your Coach/Train").click();
        Thread.sleep(5000);
        Set<String> allwin = d.getWindowHandles();
        System.out.println("allwinidafter");
        for(String eachId:allwin ) {
        	System.out.println(eachId);
        	d.switchTo().window(eachId);
        }
	    d.findElementByLinkText("New User? Signup").click();
	    d.findElementById("userId").sendKeys("Vasum123");
	    d.findElementById("password").sendKeys("Vasum123");
	    d.findElementById("cnfPassword").sendKeys("Vasum123");
	   WebElement seq = d.findElementById("secQstn");
	    Select sel = new Select(seq);
	    sel.selectByVisibleText("Where did you first meet your spouse?");
	    d.findElementById("secAnswer").sendKeys("In my home");
	    d.findElementById("dateOfBirth").click();
		d.findElementByLinkText("14").click();
	    //Thread.sleep(5000);
	    d.findElementByXPath("/html/body/div[2]/form/div/div[2]/table/tbody/tr[8]/td[2]/label[2]").click();
	    d.findElementByXPath("/html/body/div[2]/form/div/div[2]/table/tbody/tr[9]/td[2]/input[2]").click();
	    d.findElementById("email").sendKeys("vasumathik1497@gmail.com");
	    WebElement dp=d.findElementById("occupation");
	    Select sel1 = new Select(dp);
	    sel1.selectByVisibleText("Public");
	    d.findElementById("fname").sendKeys("Vasumathi");
	    WebElement ele =d.findElementById("natinality");
	    Select se = new Select(ele);
	    se.selectByVisibleText("Indian");
	    d.findElementById("flatNo").sendKeys("5/14");
		d.findElementById("street").sendKeys("Gokulam colony");
		d.findElementById("area").sendKeys("Kajamalai");
		Thread.sleep(10000);
		WebElement count = d.findElementById("country");
		Select selc = new Select(count);
		selc.selectByIndex(1);
		d.findElementById("mobile").sendKeys("8610560004");
		d.findElementById("pincode").sendKeys("620023");
		Thread.sleep(5000);
		d.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(10000);
						
		WebElement po = d.findElementById("postOffice");
		Select selc3 = new Select(po);
		selc3.selectByValue("Khajanagar S.O");
		 Thread.sleep(5000);
		 d.findElementByXPath("/html/body/div[2]/form/div/div[2]/table/tbody/tr[26]/td/div/div/b/label[3]/input").click();
		 d.findElementById("flatNoOffice").sendKeys("14");
		d.findElementById("streetOffice").sendKeys("Kajanagar");
		d.findElementById("areaOffice").sendKeys("Kajamalai");
		WebElement cou =d.findElementById("countryOffice");
		Select se12 = new Select(cou);
		se12.selectByVisibleText("India");
		d.findElementById("mobileOffice").sendKeys("9087654321");
		d.findElementById("pincodeOffice").sendKeys("600096");
        Thread.sleep(2000);
		Thread.sleep(2000);
		d.findElementByXPath("//*[@id=\"postOfficeOffice\"]").click();
		WebElement of=d.findElementById("postOfficeOffice");
		Select sa=new Select(of);
		sa.selectByValue("Perungudi S.O");
		d.quit();
		

	  
	    
	    }
	}
