package pom.formc.TC;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.Clickonreg;
import wrappers.Projectwrappers;

public class TC4 extends Projectwrappers{
	 @BeforeClass
	 public void beforeclass(){
		 testCaseName = "TC4";
		 testCaseDescription ="formc";
		author = "vasumathi";
		category = "smoke";
		 browsername = "chrome";
		 url ="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";  
	 }
	 @Test
public void formc() {
	new  Clickonreg ()
	.signup()
	.userid("Vasumathi123")
	.password("Vasumathi@14")
     .conpassword("Vasumathi@14")
	.selqns(" where did you meet your spouse?")
	.selans("home")
	.seluser("vasuma")
	.gender("Female")
	.des("IT employee")
	.email("mathivasu14@gmail.com")
	.mobile("8344959590")
	.phone("9087654321")
	.nationality("INDIA")
	.name("vasu")
	.capacity("45")
	.add("Gokulam")
	.state("TAMIL NADU")
	.time()
	.city("TIRUCHIRAPPALLI")
	.time()
	.frro("FRO TRICHY URBAN")
	.Type("Individual House")
	.grade("Four Star")
	.emailid("xyz@gmail.com")
	.mobilenum("9078654321")
	.phenum("0431-2457609")
	.hname("mathi")
	.hadd("kknagar")
	.hstate("MADHYA PRADESH")
	.time()
	.hcity("PANNA")
	.hemail("abc@gmail.com")
	.hpho("90876543212")
	.hmob("9087654121");
}
}
