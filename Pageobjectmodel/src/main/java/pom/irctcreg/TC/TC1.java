package pom.irctcreg.TC;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Covidalert;
import pom.irctc.pages.Homepage;
import wrappers.Projectwrappers;

public class TC1 extends Projectwrappers {
	 @BeforeClass
	 public void beforeclass(){
		 testCaseName = "TC1";
		 testCaseDescription ="irctcreg";
		 author = "vasumathi";
		 category = "smoke";
		 browsername = "chrome";
		 url ="https://www.irctc.co.in/nget/train-search";  
		 }
	 @Test
  public void regsistration() {
  new Homepage()
  .clickonreg()
  .username("VMathi")
  .password("Vasumathi@1403")
  .confirmpassword("Vasumathi@1403")
  .preferlanguage("English")
  .secqns("What is your petname?")
  .secans("leeiya")
  .continuebt()
  .firstname("Vasuma")
  .occ("PRIVATE")
  .mariteal()
  .country("India")
  .gender()
  .email("vasumathik1497@gmail.com")
  .mobile("9087654321")
  .nationality("India")
  .nextpage()
  .flat("5/15")
  .street("kknagar")
  .Area("Gokulam colony")
  .pincode("620023")
  .state("TAMIL NADU")
  .city("Tiruchirappalli")
  .postoffice("Khajanagar S.O")
  .phone("8907654321")
  .office();
  
}
}