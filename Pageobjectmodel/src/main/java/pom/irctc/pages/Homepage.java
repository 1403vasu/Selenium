package pom.irctc.pages;
import wrappers.GenericWrappers;

public class Homepage extends GenericWrappers{
	public Homepage clickonholiday() {
		clickByXpath("//a[text()=' HOLIDAYS ']");
		 return this;
	}
	
	public Homepage clickonstay(){
		clickByXpath("//span[text()='Stays']");
		return this;	
	}
	
	public  Accodamationpage clickonlounge() {
		clickByXpath("//span[text()='Lounge']");
		return new Accodamationpage();
	}
	public Regsistrationpage clickonreg() {
		clickByXpath("//a[text()=' REGISTER ']");
		return new Regsistrationpage();
}
}