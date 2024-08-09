package pom.irctc.pages;


import wrappers.GenericWrappers;

public class Covidalert extends GenericWrappers {
		public Homepage clickonok() {
			clickByXpath("//button[@class='btn btn-primary']");
			return new Homepage();
	}

}
