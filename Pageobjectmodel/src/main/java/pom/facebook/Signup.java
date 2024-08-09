package pom.facebook;

import wrappers.GenericWrappers;

public class Signup extends GenericWrappers{
	public Createaccount account(){
		clickByXpath("//a[text()='Create New Account']");
		return new Createaccount();
		
	}

}
