package WeekOne;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      ChromeDriver d = new ChromeDriver();
      d.manage().window().maximize();
      d.get("https://www.facebook.com");
      d.findElementByLinkText("Create New Account").click();
      Thread.sleep(5000);
      d.findElementByName("firstname").sendKeys("vasu");
      d.findElementByName("lastname").sendKeys("mathi");
      d.findElementByName("reg_email__").sendKeys("abc@gmail.com");
      d.findElementByName("reg_email_confirmation__").sendKeys("abc@gmail.com");
      d.findElementById("password_step_input").sendKeys("Vasumathi@123");
     // Thread.sleep(5000);
      d.findElementByXPath("(//input[@name='sex'])[2]").click();
	}

}
