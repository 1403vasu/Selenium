package pom.irctc.pages;

import wrappers.GenericWrappers;

public class Hotel extends GenericWrappers {
	public Hotel nextscreen() {
		switchToLastWindow();
		return this;
	}
	public Selecthotel firsthotel() {
		clickByXpath("(//div[@class='right-searchpack'])[1]");
		return new Selecthotel();
	}
	public Hotel time() {
		waitproperty(5000);
		return this;
	}
}
