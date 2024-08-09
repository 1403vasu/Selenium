package pom.php.TC;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.php.Loginpage;
import wrappers.Projectwrappers;
public class TC6 extends Projectwrappers{
	 @BeforeClass
	 public void beforeclass(){
		 testCaseName = "TC6";
		 testCaseDescription ="To verify the php";
		author = "vasumathi";
		 category = "smoke";
		 browsername = "chrome";
		 url ="https://www.phptravels.org/register.php";  
	 }
@Test
public void php() {
	new Loginpage()
	.firstname("vasu")
	.lastname("mathi")
	.email("xyz@gmail.com")
	.phone("8344959590")
	.companyname("abc limited")
	.companyadd("Perugudi")
	.companyaddtwo("chennai")
	.companycity("Trichy")
	.companystate("Tamil Nadu")
	.companypostcode("620023")
	.companycoun("India")
	.companyphone("9087651234")
	.password("vasuma")
	.passwordtwo("vasuma");
	
}
}
