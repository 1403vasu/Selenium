package testcase;

import org.junit.Test;
import wrappers.GenericWrappers;

public class TC11 extends GenericWrappers{
	@Test
	public void conform() {
	invokeApp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm\r\n" +"");
	waitproperty(5000);
	iframe("//*[@id=\"iframeResult\"]");
	clickByXpathNoSnap("/html/body/button"); //click on try it
	AlertText();
	acceptAlert(); //alert accept
	getAlertText();
	getTextById("demo");
	refresh();	//page refresh
	waitproperty(5000);
	iframe("//*[@id=\"iframeResult\"]"); 
	clickByXpath("/html/body/button"); //click on try it
	getAlertText();
	acceptAlert();
	clickByXpath("/html/body/button"); //click on try it
	dismissAlert();
	getTextById("demo");
	defcontent();
	clickById("tryhome"); //home 
	
	
	

}

}


