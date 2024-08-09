package testcase;

import org.junit.Test;

import wrappers.GenericWrappers;

public class TC03 extends GenericWrappers{
	@Test
	public void simplealert() {
	invokeApp("chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	waitproperty(5000);
	iframe("/html/body/div[4]/div[4]/div/div/iframe");
	waitproperty(4000);
	clickByXpathNoSnap("/html/body/button");
	waitproperty(5000);
	getAlertText();
	waitproperty(5000);
	acceptAlert();
	waitproperty(5000);
	defcontent();
	clickById("tryhome");
	}
}
