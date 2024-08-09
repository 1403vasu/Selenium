package pom.irctc.pages;


import wrappers.GenericWrappers;

public class Regsistrationpage extends GenericWrappers {
	public Regsistrationpage username(String data) {
		enterByXpath("//input[@id='userName']",data);
		return this;
	}
	public Regsistrationpage password(String data) {
		enterByXpath("//input[@id ='usrPwd']",data);
		return this;
	}
	public Regsistrationpage confirmpassword(String data) {
		enterByXpath("//input[@id ='cnfUsrPwd']",data);
		return this;
	}
	public Regsistrationpage preferlanguage(String data) {
		enterByXpath("(//span[@class='ng-tns-c65-19 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted'])",data);
		return this;	
	}
	public Regsistrationpage secqns(String data) {
		enterByXpath("(//span[@class='ng-tns-c65-20 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted'])",data);
		return this;
	}
	public Regsistrationpage secans(String data) {
		enterByXpath("//input[@formcontrolname='secAns'][1]",data);
		return this;
	}
	public Regsistrationpage continuebt() {
		clickByXpath("//button[@label ='Continue']");
		return this;
	}
	public Regsistrationpage firstname(String data) {
		enterByXpath("//input[@id='firstName']",data);
		return this;
	}
	public Regsistrationpage occ(String data){
		enterByXpath("(//span[@class='ng-tns-c65-21 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted'])",data);
		return this;
	}
	public Regsistrationpage mariteal() {
		clickByXpath("(//span[@class='ui-radiobutton-icon ui-clickable'])[2]");
		return this;
	}
	public Regsistrationpage country(String data) {
	enterByXpath("//select[@class='form-control ng-pristine ng-valid ng-touched']",data);
	return this;
	}
	public Regsistrationpage gender() {
		clickByXpath("(//span[@class='ui-button-text ui-clickable ng-star-inserted'])[2]");
		return this;
	}
	public Regsistrationpage email(String data) {
		enterByXpath("//input[@id ='email']",data);
		return this;
	}
	public  Regsistrationpage mobile(String data) {
		enterByXpath("//input[@id ='mobile']",data);
		return this;
	}
	public Regsistrationpage nationality(String data) {
		enterByXpath("//select[@class='form-control ng-pristine ng-invalid ng-touched'])",data);
		return this;
	}
	public Regsistrationpage nextpage() {
	clickByXpath("//button[@class='search_btn train_Search ng-star-inserted']");
	return this;
	}
	public Regsistrationpage flat(String data) {
		enterByXpath("//input[@id='resAddress1']",data);
		return this;
	}
	public Regsistrationpage street(String data) {
		enterByXpath("//input[@id='resAddress2']",data);
		return this;
	}
	public Regsistrationpage Area(String data) {
		enterByXpath("//input[@id='resAddress3']",data);
		return this;
	}
	public  Regsistrationpage pincode(String data) {
		enterByXpath("//input[@name='resPinCode']",data);
		return this;
	}
	public  Regsistrationpage state(String data) {
		enterByXpath("//input[@name='resState']",data);
		return this;
	}
	public  Regsistrationpage city(String data){
		enterByXpath("(//select[@class='form-control ng-pristine ng-invalid ng-touched'])",data);
		return this;
	}
	public  Regsistrationpage postoffice(String data){
		enterByXpath("(//select[@class='form-control ng-pristine ng-invalid ng-touched'])",data);
		return this;
	}
	public  Regsistrationpage phone(String data){
		enterByXpath("//input[@id='resPhone']",data);
		
		return this;
	}
	public  Regsistrationpage office(){
		clickByXpath("(//span[@class='ui-radiobutton-icon ui-clickable pi pi-circle-on'])[1]");
		return this;
	}
	}

