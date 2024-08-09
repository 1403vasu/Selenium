package pom.formc;

import wrappers.GenericWrappers;

public class Clickonreg extends GenericWrappers {
	
 public Signuppage signup() {
	 clickByXpath("//a[text()='Sign Up (Registration)']");
	 return new Signuppage();
 }
}
