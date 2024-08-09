package weektwo.testcase;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC003 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver d =  new ChromeDriver();
		d.get("https://www.irctc.co.in/nget/train-search");
		d.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		Thread.sleep(2000);
		d.manage().window().maximize();
		d.findElementByLinkText("HOLIDAYS").click();
		Thread.sleep(3000);
		d.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]").click();
		d.findElementByLinkText("Lounge").click();
	    Set<String> allwinidafter = d.getWindowHandles();
        System.out.println("allwinidafter");
        for(String eachId:allwinidafter ) {
        	System.out.println(eachId);
        	d.switchTo().window(eachId);
        }
        d.findElementByXPath("//*[@id=\"sidebarCollapse\"]").click();
        Thread.sleep(3000);
        d.findElementByLinkText("Charter").click();
        Thread.sleep(5000);
        d.findElementById("enquiry-tab").click();
        Thread.sleep(3000);
        d.findElementByName("name").sendKeys("mathivasu");
        d.findElementByName("organization").sendKeys("abs org");
        d.findElementByName("address").sendKeys("chennai");
        d.findElementByName("mobile").sendKeys("98765432");
        d.findElementByName("email").sendKeys("abc@gmail.com");
        WebElement seq1 = d.findElementByName("requestFor");
        Select sel = new Select(seq1);
        sel.selectByVisibleText("Saloon Charter");
        d.findElementByName("originStation").sendKeys("Chennai");
		d.findElementByName("destnStation").sendKeys("Bangalore");
		Thread.sleep(2000);
        d.findElementByName("checkInDate").click();
        Thread.sleep(3000);
        d.findElementByXPath("/html/body/app-root/ng-component/div[2]/div/div/div/div[2]/div/form/div/div[9]/div/div/table/tbody/tr[1]/td[5]/span").click();
        d.findElementByName("checkOutDate").click();
        d.findElementByXPath("/html/body/app-root/ng-component/div[2]/div/div/div/div[2]/div/form/div/div[10]/div/div/table/tbody/tr[2]/td[5]/span").click();
        d.findElementByName("durationPeriod").sendKeys("5");
        d.findElementByName("coachDetails").sendKeys(" 3 A.c");
        d.findElementByName("numPassenger").sendKeys("3");
        d.findElementByName("numPassenger").sendKeys("4");
        d.findElementByName("charterPurpose").sendKeys("Business purpose");
        d.findElementByName("services").sendKeys("Lunch");
        d.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button").click();
		//d.quit();

	}

}
