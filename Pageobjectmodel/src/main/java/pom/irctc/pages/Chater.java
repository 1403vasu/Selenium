package pom.irctc.pages;


import wrappers.GenericWrappers;

public class Chater extends GenericWrappers {
	public Chater time() {
		waitproperty(10000);
		return this;
	}
	 public  Chater clickonenquiry() {
			clickByXpath("//a[text()='Enquiry Form']");
			return this;
		 }
	    public  Chater name(String data) {
				enterByXpath("//input[@name='name']",data);
				return this;
			 }
	    public  Chater org(String data) {
			enterByXpath("//input[@name='organization']",data);
			return this;
		 }
	    public  Chater add(String data) {
			enterByXpath("//input[@name='address']",data);
			return this;
		 }
	    public  Chater mobile(String data) {
	  enterByXpath("//input[@name='mobile']",data);
	   return this;
	    }
	     public  Chater email(String data) {
	    	  enterByXpath("//input[@name='email']",data);
	    	   return this;
	    	    }
	     public Chater request(String data) {
	    	 enterByXpath("//*[@name='requestFor']", data);
	    	 return this;
	     }
	     public  Chater origin(String data) {
	   	  enterByXpath("//input[@name='originStation']",data);
	   	   return this;
	   	    }
	     public  Chater destn(String data) {
	   	  enterByXpath("//input[@name='destnStation']",data);
	   	   return this;
	   	    }
	     public  Chater checkindate() {
	   	  clickByXpath("//input[@name='checkInDate']");
	   	   return this;
	   	    }
	     public Chater date() {
	    	 clickByXpath("//span[text()='29'][1]");
	    	 return this;
	     }
	     public  Chater check0ut() {
	      	  clickByXpath("//input[@name='checkOutDate']");
	      	   return this;
	      	    }
	     public  Chater checkoutdate() {
	      	  clickByXpath("(//span[text()='30'])[1]");
	      	   return this;
	      	    }
	     public  Chater durationperios(String data) {
	   	  enterByXpath("//input[@name='durationPeriod']",data);
	   	   return this;
	   	    }
	     public  Chater coachdetails(String data) {
	      	  enterByXpath("//input[@name='coachDetails']",data);
	      	   return this;
	      	    }
	     
	     public  Chater numpass(String data) {
	     	  enterByXpath("//input[@name='numPassenger']",data);
	     	   return this;
	     	    }
	     
	     public  Chater chaterpur(String data) {
	    	  enterByXpath("//*[@name='charterPurpose']",data);
	    	   return this;
	    	    } 
	     public  Chater services(String data) {
	    	  enterByXpath("//*[@name='services']",data);
	    	   return this;
	    	    }
}
