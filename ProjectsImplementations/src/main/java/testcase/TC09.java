package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import wrappers.GenericWrappers;

public class TC09 extends GenericWrappers {
@Test
 public void prompt () {
invokeApp("chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"); //Load url
waitproperty(5000);
iframe("//*[@id=\"iframeResult\"]"); 
clickByXpathNoSnap("/html/body/button"); // Try button
sendkeysalerts("Vasu");  //sending name
getAlertText(); //alert text
acceptAlert();  //alert accept
getTextById("demo");
refresh();
//repeat step
iframe("//*[@id=\"iframeResult\"]"); 
clickByXpathNoSnap("/html/body/button");
sendkeysalerts("vasu");
getAlertText();
acceptAlert();
waitproperty(5000);
//Thread.sleep(5000);
clickByXpathNoSnap("/html/body/button");
dismissAlert();
getTextById("demo");
defcontent();
clickById("tryhome");
}
}

