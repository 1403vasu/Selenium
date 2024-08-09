package pom.bookcoach.TC;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Covidalert;
import wrappers.Projectwrappers;

public class TC3 extends Projectwrappers {
	 @BeforeClass
	 public void beforeclass(){
		 testCaseName = "TC3";
		 testCaseDescription ="Book coach";
		author = "vasumathi";
		 category = "smoke";
		 browsername = "chrome";
		 url ="https://www.irctc.co.in/nget/train-search";  
	 }
	 @Test
 public void bookcoach() {
	 new Covidalert()
	 .clickonok()
	 .clickonholiday()
	 .clickonstay()
	 .clickonlounge()
	 .window()
	 .sidebar()
	 
	 .clickbookonyourcoach() 
	 .opennewwindow()
	 . clickonnewuser()
	 .username("vasumathi")
	 .password("Vasumathi@14")
	 .conpassword("Vasumathi@14")
	 .secqnts("What is your pet name?")
	 .secans("leeiya")
	 .gender()
	 .martialstatus()
	 .mail("mathivasu14@gmail.com")
	 .occupation("Public")
	 .firstname("vasumathi")
	 .nationality("Indian")
	 .flatno("14")
	 .street("perugudi")
	 .Area("chennai")
	 .country("India")
	 .mobileno("8344959590")
	 .Pincode("620023")
	 .City("Tiruchirappalli")
	 .State("TAMIL NADU")
	 .postoffice("Khajanagar S.O")
	 .sameadd()
	 .officeaddress("5/14")
	 .officestreet("kknagar")
	 .officeArea("chennai")
	 .countryoffice("India")
	 .mobilenooff("9087654321")
	 .Pincodeoff("600096")
	 .Cityoff("Chennai")
	 .Stateoff("TAMIL NADU")
	 .postofficeoff("Rajaji Bhavan S.O");
	  
	 }
}
