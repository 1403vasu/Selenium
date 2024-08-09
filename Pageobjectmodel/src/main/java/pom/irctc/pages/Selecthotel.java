package pom.irctc.pages;

import wrappers.GenericWrappers;

public class Selecthotel extends GenericWrappers{
	public Selecthotel waitwindows() {
		switchToParentWindow();
		return this;
	}
	public Selecthotel time() {
		waitproperty(5000);
		return this;
	}
	public Selecthotel firsthotelname() {
		getTextByXpath("(//div[@class='mid-searchpack'])[1]");
		return this;
	}
	public Selecthotel priceofhotel() {
		getTextByXpath("(//div[@class='standard-price mt-2'])[1]");
		return this;
	}
public Selecthotel continuetobook(){
	clickByXpath("//*[@class='btn btn-radius-none yellow-gradient my-2']");
	return this;
}
public Selecthotel guestuserlogin() {
	clickByXpath("//a[text()='Guest User Login ']");
	return this;
}
public Selecthotel email(String data) {
	enterByXpath("//input[@name='username']",data);
	return this;
}
public Selecthotel password(String data) {
	enterByXpath("//input[@name='password']", data);
	return this;
}
public Selecthotel login() {
clickByXpath("//*[@class='btn btn-md btn-primary btn-radius yellow-gradient']");
return this;
}
public Selecthotel Title(String data) {
	enterByXpath("//*[@name='title']",data);
	return this;
}
public Selecthotel Firstname(String data) {
	enterByXpath("//input[@name='firstName']",data);
	return this;
}
public Selecthotel lastname(String data) {
	enterByXpath("//input[@name='lastName']",data);
return this;
}
public Selecthotel country(String data) {
	enterByXpath("//*[@name='country']",data);
	return this;
}
public Selecthotel state(String data) {
	enterByXpath("//*[@name='state']",data);
	return this;
}
public Selecthotel mobilenumber(String data) {
	enterByXpath("//input[@name='mobileNo']",data);
	return this;
}
public Selecthotel emailid(String data) {
	enterByXpath("//input[@name='email']",data);
	return this;
}
public Selecthotel gstoptional(String data) {
	enterByXpath("//*[@name='gst']",data);
	return this;
}
public Selecthotel companyname(String data) {
	enterByXpath("//input[@name='companyName']", data);
	return this;
}
public Selecthotel companyadd (String data) {
	enterByXpath("//input[@name='companyAddress']", data);
	return this;
}
public Selecthotel companygst(String data) {
	enterByXpath("//input[@name='gstNumber']", data);
	return this;
}
public Selecthotel bookcontinue() {
	clickByXpath("//*[@class='btn btn-radius-none yellow-gradient my-0 ml-2']");
	return this;
}
public Selecthotel agreecondition() {
	clickByXpath("(//span[@class='checkmark'])");
	return this;
}
public Selecthotel makepayment() {
	clickByXpath("//*[@class='btn btn-radius-none yellow-gradient my-0 ml-2']");
	return this;
}

}
