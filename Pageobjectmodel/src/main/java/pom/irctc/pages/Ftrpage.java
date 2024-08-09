package pom.irctc.pages;


import wrappers.GenericWrappers;

public class Ftrpage extends GenericWrappers {
	 public Ftrpage opennewwindow() {
		   switchToLastWindow();
		   return this;
	 }
	 public Publicregsistration clickonnewuser() {
		 clickByXpath("//a[text()='New User? Signup']");
		 return new Publicregsistration();
	 }
	
	 
}
