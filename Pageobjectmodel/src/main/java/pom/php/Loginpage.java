package pom.php;

import wrappers.GenericWrappers;

public class Loginpage extends GenericWrappers {
 public Loginpage firstname(String data) {
	 enterByXpath("//input[@id='inputFirstName']", data);
	return this;
 }
 public Loginpage lastname(String data) {
	 enterByXpath("//input[@id='inputLastName']", data);
	return this;
 }
 public Loginpage email(String data) {
	 enterByXpath("//input[@id='inputEmail']", data);
	return this;
 }
 /*public Loginpage code(String data) {
	 enterByXpath("//*[@class='selected-dial-code']", data);
	return this;
 }*/
 public Loginpage phone(String data) {
	 enterByXpath("//input[@id='inputPhone']", data);
	return this;
 } 
 public Loginpage companyname(String data) {
	 enterByXpath("//input[@id='inputCompanyName']", data);
	return this;
 } 
 public Loginpage companyadd(String data) {
	 enterByXpath("//input[@id='inputAddress1']", data);
	return this;
 } 
 public Loginpage companyaddtwo(String data) {
	 enterByXpath("//input[@id='inputAddress2']", data);
	return this;
 } 
 public Loginpage companycity(String data) {
	 enterByXpath("//input[@id='inputCity']", data);
	return this;
 } 
 public Loginpage companystate(String data) {
	 enterByXpath("//input[@id='stateinput']", data);
	return this;
 }
 public Loginpage companypostcode(String data) {
	 enterByXpath("//input[@name='postcode']", data);
	return this;
 }
 public Loginpage companycoun(String data) {
	 enterByXpath("//*[@name='country']", data);
	return this;
 }
 public Loginpage companyphone(String data) {
	 enterByXpath("//input[@name='customfield[2]']", data);
	return this;
 }
 public Loginpage password(String data) {
	 enterByXpath("//input[@name='password']", data);
	return this;
 }
 public Loginpage passwordtwo(String data) {
	 enterByXpath("//input[@name='password2']", data);
	return this;
 }
}

