package weektwo.testcase;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC004 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver d =  new ChromeDriver();
		d.get("https://www.irctc.co.in/nget/train-search");
		d.manage().window().maximize();
		Thread.sleep(10000);
		d.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		Thread.sleep(5000);
	   d.findElementByLinkText("HOLIDAYS").click();
		Thread.sleep(3000);
		d.findElementByLinkText("Stays").click();
		d.findElementByLinkText("Lounge").click();
		Set<String> winid=d.getWindowHandles();
		System.out.print("winid");
		for(String eachid:winid) {
			d.switchTo().window(eachid);
		}
		d.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[1]/ul/li[2]/a").click();
		Set<String> winid1=d.getWindowHandles();
		System.out.println(winid1);
	
			for(String id : winid1) {
				d.switchTo().window(id);
				}
         Thread.sleep(10000);
		 d.findElementByXPath("/html/body/app-root/app-fulllayout/homeheader/header/nav/div/div[2]/div[2]/ul/li[2]/a").click();
		 Thread.sleep(5000);
	     d.findElementByXPath("//*[@id=\"profile-tab\"]").click();
	     Thread.sleep(5000);
	     d.findElementByName("email").sendKeys("abcdg@gmail.com");
	     d.findElementByName("mobileNo").sendKeys("8610360000");
	     d.findElementByXPath("/html/body/app-root/app-fulllayout/homeheader/app-loginmodal/div/div/div/div/div/div[2]/div/form/div[3]/button").click();
        Thread.sleep(5000);
        d.findElementById("filterText").click();
	    d.findElementById("filterText").sendKeys("Chennai");
	    Thread.sleep(5000);
        d.findElementByXPath("/html/body/app-root/app-fulllayout/app-home/div[2]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[1]/a/div[1]").click();
        Thread.sleep(5000);
        d.findElementByName("dt12").click();
		Thread.sleep(1000);
		d.findElementByXPath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[3]/td[6]/span").click();
		d.findElementByName("dt13").click();
		Thread.sleep(1000);
		d.findElementByXPath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[3]/td[7]/span").click();
		d.findElementByXPath("/html/body/app-root/app-fulllayout/app-home/div[2]/div[2]/div/app-hotelmodify/form/div[4]").click();
        WebElement room = d.findElementByName("hotelRoom");
        Select dp1 = new Select(room);
        dp1.selectByValue("1");
        Thread.sleep(5000);
        WebElement ad = d.findElementByName("hotelAdult");
        Select dp2 = new Select(ad);
        dp2.selectByValue("3");
        Thread.sleep(5000);
        //click
		d.findElementByXPath("/html/body/app-root/app-fulllayout/app-home/div[2]/div[2]/div/app-hotelmodify/form/div[4]/div/div/div[2]/button").click();
		Thread.sleep(5000);
		//find hotels
		d.findElementByXPath("/html/body/app-root/app-fulllayout/app-home/div[2]/div[2]/div/app-hotelmodify/form/div[5]/button").click();
		//hotels
		Thread.sleep(10000);
		d.findElementByXPath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a/div/div[2]/div/h5").click();

		
		Set<String> ho = d.getWindowHandles();
		for(String id2: ho) {
			d.switchTo().window(id2);
		}
		Thread.sleep(10000);
        String text =d.findElementByXPath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[1]/div/h5").getText();
		System.out.println(text);
        Thread.sleep(5000);
		String price = d.findElementByXPath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/strong").getText();
		System.out.print(price);
		Thread.sleep(10000);
		d.findElementByXPath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[3]/button/b").click();
		Thread.sleep(5000);
		WebElement title = d.findElementByName("title");
		Select sel3 = new Select(title);
		sel3.selectByValue("3");
		d.findElementByName("firstName").sendKeys("vasu");
		d.findElementByName("lastName").sendKeys("karthi");
		WebElement country = d.findElementByName("country");
		Select se4 = new Select(country);
		se4.selectByValue("India");
		
		WebElement state = d.findElementByName("state");
		Select se5 = new Select(state);
		se5.selectByValue("TN");
		
		
		WebElement gst = d.findElementByName("gst");
		Select se6 = new Select(gst);
		se6.selectByValue("No");
		Thread.sleep(10000);
		String hotelname = d.findElementByXPath("/html/body/app-root/app-fulllayout/app-paxdetail/div[1]/div/div/h5").getText();
		System.out.println("Hotel Name Before Payement: " + hotelname);
		if (text.contentEquals(hotelname))
		{
			System.out.println("name is same");
		}
		else
		{
			System.out.println("name is different");
		}
	  d.findElementByXPath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/button[2]").click();
	  Thread.sleep(5000);
	   d.findElementByXPath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[1]/ul/li/label/span").click();
	  Thread.sleep(5000);
	  d.findElementByXPath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[2]/button[2]").click();
	  Thread.sleep(5000);
	  d.findElementByXPath("//*[@id=\"modalOTP\"]/div/div/form/div/div[2]/button").click();
		Thread.sleep(3000);
		String otp = d.findElementByXPath("//*[@id=\"modalOTP\"]/div/div/form/div/div[1]/span").getText();
		System.out.println("OTP text is: "+otp);
		Thread.sleep(3000);
		if(otp.contains("required")) 
		{
			System.out.println("OTP Verified");
		}
		else 
		{
			System.out.println("OTP not Verified");
		}
		
		Thread.sleep(4000);
		d.quit();
	
	
}
		
}      
         
	
	    
		
		

	


