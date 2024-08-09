package pom.formc;

import pom.irctc.pages.Accodamationpage;
import wrappers.GenericWrappers;

public class Signuppage extends GenericWrappers {
	public Signuppage userid(String data) {
		enterByXpath("//input[@name='u_id']", data);
		return this;
	}
	public Signuppage password(String data) {
		enterByXpath("//input[@id='u_pwd']", data);
		return this;
	}
	public Signuppage conpassword(String data) {
		enterByXpath("//input[@name='u_repwd']", data);
		return this;
	}
	public Signuppage selqns(String data) {
		enterByXpath("//*[@name='u_secques']", data);
		return this;
	}
	public Signuppage selans(String data) {
		enterByXpath("//input[@name='u_secans']", data);
		return this;
	}
	public Signuppage seluser(String data) {
		enterByXpath("//input[@name='u_name']", data);
		return this;
	}
	public Signuppage gender(String data) {
		enterByXpath("//*[@name='u_gender']", data);
		return this;
	}
	public Signuppage des(String data) {
		enterByXpath("//input[@name='u_designation']", data);
		return this;
	}
	public Signuppage email(String data) {
		enterByXpath("//input[@name='u_emailid']", data);
		return this;
	}
	public Signuppage mobile(String data) {
         enterByXpath("//input[@name='u_mobile']", data);
		return this;
	}
	public Signuppage phone(String data) {
	enterByXpath("//input[@name='u_phone']",data);
	return this;
	}
	public Signuppage nationality(String data) {
	enterByXpath("//*[@name='u_nationality']",data);
	return this;
	}
	public Signuppage name(String data) {
		enterByXpath("//input[@name='name']",data);
		return this;
		}
	public Signuppage capacity(String data) {
		enterByXpath("//input[@name='capacity']",data);
		return this;
		}
	public Signuppage add(String data) {
		enterByXpath("//*[@name='address']",data);
		return this;
		}
	public Signuppage state(String data) {
		enterByXpath("//*[@name='state']",data); 
		return this;
		}
	public Signuppage time() {
		waitproperty(10000);
		return this;
	}
	public Signuppage city(String data) {
		selectVisibileTextByXpath("//select[@id='city_distr']",data);
		return this;
		}

	public Signuppage frro(String data) {
		selectVisibileTextByXpath("//*[@name='frrodata']",data);
		return this;
		}
	public Signuppage Type(String data) {
		selectVisibileTextByXpath("//select[@name='acco_type']",data);
		return this;
		}
	
   public Signuppage grade(String data) {
	    selectVisibileTextByXpath("//select[@id='star_rat']",data);
		return this;
		}
	public Signuppage emailid(String data) {
		enterByXpath("//input[@name='email']",data);
		return this;
		}
	public Signuppage mobilenum(String data) {
		enterByXpath("//input[@name='mcontact']",data);
		return this;
		}
	public Signuppage phenum(String data) {
		enterByXpath("//input[@name='contact']",data);
		return this;
		}
	public Signuppage hname(String data) {
		enterByXpath("//input[@name='name_o']",data);
		return this;
		}
	public Signuppage hadd(String data) {
		enterByXpath("//input[@name='address_o']",data);
		return this;
		}
	public Signuppage hstate(String data) {
		enterByXpath("//*[@name='state_o']",data);
		return this;
		}
	public Signuppage hcity(String data) {
		enterByXpath("//*[@name='citydistr_o']",data);
		return this;
		}
	public Signuppage hemail(String data) {
		enterByXpath("//*[@name='emailid_o']",data);
		return this;
		}
	public Signuppage hpho(String data) {
		enterByXpath("//input[@name='phoneno_o']",data);
		return this;
		}
	public Signuppage hmob(String data) {
		enterByXpath("//input[@name='mobile_o']",data);
		return this;
		}
}

