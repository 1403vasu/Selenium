package pom.irctc.pages;


import wrappers.GenericWrappers;

public class Publicregsistration extends GenericWrappers {
	public Publicregsistration username(String data) {
		enterByXpath("//input[@id='userId']", data);
		return this;
	}
	public Publicregsistration password(String data) {
		enterByXpath("//input[@id='password']", data);
		return this;
	}
	public Publicregsistration conpassword (String data) {
		enterByXpath("//input[@id='cnfPassword']", data);
		return this;
	}
	public Publicregsistration secqnts (String data) {
		enterByXpath("//*[@id='secQstn']", data);
		return this;
	}
	public Publicregsistration secans (String data) {
		enterByXpath("//input[@id='secAnswer']", data);
		return this;
	}
	public Publicregsistration gender(){
	clickByXpath("//input[@id='gender1']");
	return this;	
	}
	public  Publicregsistration martialstatus() {
		clickByXpath("//input[@id='maritalStatus1']");
		return this;
	}
	public Publicregsistration mail(String data){
		enterByXpath("//input[@id='email']", data);
		return this;
	}
	public Publicregsistration occupation(String data){
	  enterByXpath("//*[@id='occupation']", data);
	  return this;
	}
	public Publicregsistration firstname(String data) {
		enterByXpath("//input[@id='fname']", data);
		return this;
	}
	public Publicregsistration nationality(String data) {
		enterByXpath("//*[@id='natinality']", data);
		return this;
	}
	public Publicregsistration flatno(String data) {
		enterByXpath("//input[@id='flatNo']", data);
		return this;
}
	public Publicregsistration street(String data) { 
		enterByXpath("//input[@id='street']", data);
		return this;
}
	public Publicregsistration Area(String data) {
		enterByXpath("//input[@id='area']", data);
		return this;
	}
	public Publicregsistration country(String data) {
		enterByXpath("//*[@id='country']", data);
		return this;
	}
	public Publicregsistration mobileno(String data) {
		enterByXpath("//input[@id='mobile']", data);
		return this;
	}
	public Publicregsistration Pincode(String data) {
		enterByXpath("//input[@id='pincode']", data);
		return this;
	}
	public Publicregsistration City(String data) {
		enterByXpath("//*[@id='city']", data);
		return this;
	}
	public Publicregsistration State(String data) {
		enterByXpath("//*[@id='state']", data);
		return this;
	}
	public Publicregsistration postoffice(String data) {
		enterByXpath("//*[@id='postOffice']", data);
		return this;
	}
	public Publicregsistration sameadd() {
		clickByXpath("//*[@id='sameAddresses1']");
		return this;
	}
	public Publicregsistration officeaddress(String data) {
		enterByXpath("//input[@id='flatNoOffice']", data);
		return this;
}
	public Publicregsistration officestreet(String data) { 
		enterByXpath("//input[@id='streetOffice']", data);
		return this;
}
	public Publicregsistration officeArea(String data) {
		enterByXpath("//input[@id='areaOffice']", data);
		return this;
	}
	public Publicregsistration countryoffice(String data) {
		enterByXpath("//*[@id='countryOffice']", data);
		return this;
	}
	public Publicregsistration mobilenooff(String data) {
		enterByXpath("//*[@id='mobileOffice']", data);
		return this;
	}
	public Publicregsistration Pincodeoff(String data) {
		enterByXpath("//*[@id='pincodeOffice']", data);
		return this;
	}
	public Publicregsistration Cityoff(String data) {
		enterByXpath("//*[@id='cityOffice']", data);
		return this;
	}
	public Publicregsistration Stateoff(String data) {
		enterByXpath("//*[@id='stateOffice']", data);
		return this;
	}
	public Publicregsistration postofficeoff(String data) {
		enterByXpath("//*[@id='postOfficeOffice']", data);
		return this;
	}
}
