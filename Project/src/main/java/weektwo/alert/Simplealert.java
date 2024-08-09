package weektwo.alert;

import org.openqa.selenium.chrome.ChromeDriver;

public class Simplealert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		//d.manage().window().maximize();
		Thread.sleep(4000);
	    //d.switchTo().frame("iframeResult");
		d.switchTo().frame("iframeResult");
		d.findElementByXPath("/html/body/button").click();
		//Thread.sleep(2000);
		String alertext =d.switchTo().alert().getText();
		System.out.print(alertext);
		d.switchTo().alert().accept();
		d.switchTo().defaultContent();
		d.findElementById("tryhome").click();

	}

}
