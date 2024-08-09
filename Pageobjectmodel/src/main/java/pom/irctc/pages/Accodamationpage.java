package pom.irctc.pages;


import wrappers.GenericWrappers;

public class Accodamationpage extends GenericWrappers {
	
	public Accodamationpage window() {
		switchToParentWindow();
		return this;
	}
	public Accodamationpage time() {
		waitproperty(10000);
		return this;
	}
	public Accodamationpage sidebar() {
		clickByXpath("//a[@id='sidebarCollapse']");
		return this;
	}
	public Ftrpage clickbookonyourcoach() {
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new Ftrpage();
		
	}
	public Chater clickonchater() {
		clickByXpath("//a[text()='Charter']");
		return new Chater();
}
	public Toursism clickonhotelicon() {
		clickByXpath("//span[text()='Hotels']");
		return new Toursism();
	
	}

}