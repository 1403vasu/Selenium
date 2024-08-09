package pom.facebook.TC;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.Signup;
import wrappers.Projectwrappers;

public class TC2 extends Projectwrappers {
	 @BeforeClass
	 public void beforeclass(){
		 testCaseName = "TC2";
		 testCaseDescription ="To verify the facebook";
		 author = "vasumathi";
		 category = "smoke";
		 browsername = "chrome";
		 url ="https://www.facebook.com"; 	 
	 }
	 @Test
	 public void facebook() {
	 new  Signup()
	 .account()
	 .firstname("Vasu")
	 .lastname("Mathi")
	 .email("mathivasu14@gmail.com")
	 .password("Vasumathi@1403")
	 .sex()
	 ;
 }
}
