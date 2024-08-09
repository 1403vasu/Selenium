package pom.otpvalid.TC;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Covidalert;
import pom.irctc.pages.Homepage;
import wrappers.Projectwrappers;
public class TC7 extends Projectwrappers{
		 @BeforeClass
		 public void beforeclass(){
			 testCaseName = "TC7";
			 testCaseDescription ="To verify the otpvalid";
			 author = "vasumathi";
			 category = "smoke";
			 browsername = "chrome";
			 url ="https://www.irctc.co.in/nget/train-search";  
		 }
	@Test
	public void otpvalid() {
	new Homepage()
	.clickonholiday()
	.clickonstay()
	.clickonlounge()
	.time()
	.window()
	.clickonhotelicon()
	.switchwindow()
	.login()
	.waittime()
	.guestlogin()
	.waittime()
	.emailid("xyz@gmail.com")
	.mnum("9087654321")
	.waittime()
	.clickonok()
	.waittime()
	.search("chennai")
	.waittime()
    .selecttext()
    .waittime()
	.startdate()
	.waittime()
	.clickdate()
	.waittime()
	.enddate()
	.waittime()
	.date()
	.waittime()
	.clickroom()
	.waittime()
	.room("1")
	.adults("2")
	.waittime()
	.clickok()
	.waittime()
	.findhotel()
	.nextscreen()
	.time()
	.firsthotel()
	.waitwindows()
	.time()
	.firsthotelname()
	.time()
	.priceofhotel()
	.time()
	.continuetobook()
	.time()
	.Title("miss")
	.Firstname("vasu")
	.lastname("karthi")
	.country("India")
	.state("TAMIL NADU")
	//.mobilenumber("9087654321")
	//.emailid("mathivasu14@gmail.com")
	.time()
	.bookcontinue()
	.time()
	.agreecondition()
	.time()
	.makepayment()
	;
}
}