package weektwo.alert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	 public static void main(String[] args) throws InterruptedException {
    
     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     ChromeDriver d = new ChromeDriver();
     d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
   //  d.manage().window().maximize();
     WebElement frame = d.findElementByXPath("/html/body/div[4]/div[4]/div/div/iframe");
     d.switchTo().frame(frame);
     Thread.sleep(2000);
     d.findElementByXPath("/html/body/button").click();
     String alertText=d.switchTo().alert().getText(); 
 	 System.out.println(alertText);
 	 d.switchTo().alert().accept();
 	 if(alertText.equals("Press a button!"))
 	 {
 		 System.out.println("Accept");
 	 }
 	 else {
 		 System.out.println("dismiss");
 	 }
 	 d.navigate ().refresh();
 	 Thread.sleep(5000);
 	d.manage().window().maximize();
    WebElement frame1= d.findElementByXPath("/html/body/div[4]/div[4]/div/div/iframe");
    d.switchTo().frame(frame1);
    Thread.sleep(2000);
    d.findElementByXPath("/html/body/button").click();
    d.switchTo().alert().dismiss();
    String text = d.findElementById("demo").getText();
    if(text.equals("Press a button!")) {
    	System.out.print("accept");
    }
    else {
    	System.out.print("dismiss");
    	
    }
    d.switchTo().defaultContent();
    d.findElementById("tryhome").click();
 	 
	}

}
