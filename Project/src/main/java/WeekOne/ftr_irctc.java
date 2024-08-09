package WeekOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ftr_irctc {
	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     ChromeDriver d = new ChromeDriver();
     d.manage().window().maximize();
     d.get("https://www.ftr.irctc.co.in/ftr/");
     d.findElementByLinkText("New User? Signup").click();
     Thread.sleep(5000);
     d.findElementByName("userId").sendKeys("Mathi14");
     d.findElementByName("password").sendKeys("Vasu@123");
     d.findElementByName("cnfPassword").sendKeys("Vasu@123");
     d.findElementById("secAnswer").sendKeys("Liliya");
     d.findElementById("dateOfBirth").sendKeys("14/3/1997");
     d.findElementByXPath("//*[@id=\"gender1\"]").click();
     d.findElementByXPath("//*[@id=\"maritalStatus1\"]").click();
     d.findElementById("email").sendKeys("vasumathik1497@gmail.com");
     d.findElementById("fname").sendKeys("Vasu");
     d.findElementById("mname").sendKeys("mathi");
     d.findElementById("lname").sendKeys("karthi");
     d.findElementById("flatNo").sendKeys("5/14");
     d.findElementById("street").sendKeys("Gokulam colony,kajamalai");
     d.findElementById("area").sendKeys("Trichy");
     d.findElementById("mobile").sendKeys("9345110162");
    // d.findElementById("pincode").sendKeys("620023");
     
}
}