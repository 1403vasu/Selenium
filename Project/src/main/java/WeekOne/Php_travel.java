package WeekOne;

import org.openqa.selenium.chrome.ChromeDriver;

public class Php_travel {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver d = new ChromeDriver();
	     d.manage().window().maximize();
	     d.get("https://www.phptravels.org/register.php");
	     d.findElementById("inputFirstName").sendKeys("Vasumathi");
	     d.findElementById("inputLastName").sendKeys("Karthikeyan");
	     d.findElementById("inputEmail").sendKeys("vasumathik1497@gmail.com");
	     d.findElementById("inputPhone").sendKeys("9656789345");
	     d.findElementById("inputCompanyName").sendKeys("RAM");
	     d.findElementById("inputAddress1").sendKeys("kartoffel");
	     d.findElementById("inputAddress2").sendKeys("Chennai");
	     d.findElementById("inputCity").sendKeys("Trichy");
	     d.findElementById("inputPostcode").sendKeys("620023");
	     d.findElementById("customfield2").sendKeys("8610560004");
	     d.findElementById("inputNewPassword1").sendKeys("Vasumathi@1234@123");
	     d.findElementById("inputNewPassword2").sendKeys("Vasumathi@1234@123");
	     
	}

}
