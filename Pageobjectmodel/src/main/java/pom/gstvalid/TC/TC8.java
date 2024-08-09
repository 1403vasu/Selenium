package pom.gstvalid.TC;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Covidalert;
import wrappers.Projectwrappers;

public class TC8 extends Projectwrappers{
	 @BeforeClass
	 public void beforeclass(){
		 testCaseName = "TC8";
		 testCaseDescription ="To verify the gstvalid";
		author = "vasumathi";
		 category = "smoke";
		 browsername = "chrome";
		 url ="https://www.irctc.co.in/nget/train-search";  
	 }
@Test
	public void gstvalid() {
		new Covidalert()
		.clickonok()
		.clickonholiday()
		.clickonstay()
		.clickonlounge()
		.clickonhotelicon()
		.login()
		.guestlogin()
		.emailid("xyz@gnail.com")
		.mnum("9087654321")
		.clickonok()
		.search("chennai")
		.selecttext()
		.startdate()
		.clickdate()
		.enddate()
		.date()
		.clickroom()
		.room("1")
		.adults("2")
		.clickok()
		. findhotel()
		.firsthotel()
		.continuetobook()
		.guestuserlogin()
		.email("abc@gmail.com")
		.password("vasu@123")
		.login()
		.Title("miss")
		.Firstname("vasu")
		.lastname("karthi")
		.country("India")
		.state("TAMIL NADU")
		.mobilenumber("9087654321")
		.emailid("mathivasu14@gmail.com")
		.gstoptional("yes")
		.companygst("9087654321")
		.companyname("abc")
		.companyadd("k.k nagar")
		;

	}

}
