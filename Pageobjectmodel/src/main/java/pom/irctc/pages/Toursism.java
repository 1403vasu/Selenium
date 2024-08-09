package pom.irctc.pages;
import wrappers.GenericWrappers;

public class Toursism extends GenericWrappers {
	public Toursism switchwindow() {
		switchToLastWindow();
		return this;
	}
	public Toursism waittime() {
		waitproperty(5000);
		return this;
	}
	public Toursism login(){
		clickByXpath("//a[text()='Login']");
		return this;	
	}
	public Toursism guestlogin() {
		clickByXpath("//*[@id='profile-tab']");
		return this;
	}
	public Toursism emailid(String data){
		enterByXpath("(//input[@name='email'])[1]",data);
		return this;
	}
	public Toursism mnum(String data) {
		enterByXpath(" //input[@name='mobileNo']", data);
		return this;
	}
	public Toursism clickonok(){
	clickByXpath("(//button[text()='Login'])[2]");
	return this;
	}
	public Toursism search(String data) {
		enterByXpath("//input[@id='filterText']",data);
		return this;
	}
	public Toursism selecttext() {
		clickByXpath("//span[text()='Chennai']");
		return this;	
	}
	public Toursism startdate() {
		clickByXpath("//input[@name='dt12']");
		return this;
	}
	public Toursism clickdate() {
		clickByXpath("(//span[@class='owl-dt-calendar-cell-content'])[13]");
		return this;
	}
	public Toursism enddate() {
		clickByXpath("//input[@name='dt13']");
		return this;
	}
	public Toursism date() {
		clickByXpath("(//span[@class='owl-dt-calendar-cell-content'])[18]");
		return this;
	}
	public Toursism clickroom() {
		clickByXpath("//input[@id='user-data-wrapper-id']");
		return this;
	}
	public  Toursism room(String data) {
		enterByXpath("//*[@name='hotelRoom']",data);
		return this;
	}
	public Toursism adults(String data) {
	    selectVisibileidByXpath("//select[@name='hotelAdult']",data);
		return this;
	}
	public Toursism clickok() {
		clickByXpath("//button[text()='Done']");
		return this;
	}
	public Hotel findhotel() {
		clickByXpath("//button[text()='Find Hotel '] ");
		return new Hotel();
	}
}
