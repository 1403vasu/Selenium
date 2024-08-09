package pom.facebook;

import wrappers.GenericWrappers;

public class Createaccount extends GenericWrappers {
	public Createaccount firstname(String data){
		enterByXpath("//input[@name='firstname']",data);
		return this;
	}
	public Createaccount lastname(String data){
		enterByXpath("//input[@name='lastname']", data);
		return this;
	}
	public Createaccount email(String data){
		enterByXpath("//input[@name='reg_email__']", data);
		return this;
	}
	public Createaccount password(String data){
		enterByXpath("//input[@name='reg_passwd__']", data);
		return this;
	}
	public Createaccount sex(){
		clickByXpath("//input[@name='sex'][1]");
		return this;
	}
	
}
