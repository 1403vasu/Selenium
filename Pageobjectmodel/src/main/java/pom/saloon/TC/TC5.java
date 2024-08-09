package pom.saloon.TC;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Covidalert;
import pom.irctc.pages.Homepage;
import wrappers.Projectwrappers;

public class TC5 extends Projectwrappers{
	 @BeforeClass
	 public void beforeclass(){
		 testCaseName = "TC5";
		 testCaseDescription ="saloon";
		author = "vasumathi";
		category = "smoke";
		 browsername = "chrome";
		 url ="https://www.irctc.co.in/nget/train-search";  
	 }
	 @Test
public void saloon(){
	new Homepage()
	.clickonholiday()
	.clickonstay()
	.clickonlounge()
	.window()
	.sidebar()
	.clickonchater()
	.time()
	.clickonenquiry()
	.time()
	.name("vasumathi")
	.org("abc org")
	.add("5/14 gokulam colony")
	.mobile("8097651234")
	.email("abc@gmail.com")
	.request("Saloon")
	.origin("Bangalore")
	.destn("chennai")
	.time()
	.checkindate()
	.time()
	.date()
	.time()
	.check0ut()
	.time()
	.checkoutdate()
	.durationperios("Bussiness")
	.coachdetails("3 A.C")
	.numpass("5")
	.chaterpur("Business purpose")
	.services("A.C");
	
}
}
