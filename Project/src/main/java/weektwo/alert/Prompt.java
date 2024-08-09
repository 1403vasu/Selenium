package weektwo.alert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 ChromeDriver driver= new ChromeDriver();
	 driver.manage().window().maximize(); 
	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"); 
	 Thread.sleep(5000);
	WebElement frame=driver.findElementByXPath("//*[@id=\"iframeResult\"]"); 
	driver.switchTo().frame(frame);
	driver.findElementByXPath("/html/body/button").click();
	driver.switchTo().alert().sendKeys("Vasumathi"); 
	String alertText=driver.switchTo().alert().getText(); 
	System.out.println(alertText);  
	driver.switchTo().alert().accept();  
    if(alertText.equals("Please enter your name:")) { 
		System.out.println("Yes");
		}
		else 
		{
			System.out.println("No");
		} 
	   Thread.sleep(5000);
		driver.navigate().refresh(); 
		WebElement frame1=driver.findElementByXPath("//*[@id=\"iframeResult\"]"); 
		driver.switchTo().frame(frame1);
		driver.findElementByXPath("/html/body/button").click();
		driver.switchTo().alert().dismiss(); 
		if(alertText.equals("Please enter your name:")) { 
			System.out.println("Yes");
			}
			else 
			{
				System.out.println("No");
			}
	}

}
