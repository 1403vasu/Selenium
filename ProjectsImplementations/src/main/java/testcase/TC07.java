package testcase;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilis.DP07;
import wrappers.GenericWrappers;
public class TC07 extends GenericWrappers {
@Test(dataProvider="fo",dataProviderClass=DP07.class)
	public void frro(String id,String pass,String repass,String Qns,String Ans,String uname,String gen,String des,String email,String mob,String phone,String name,String cap,String add,String State,String City,String fro,String acco,String star,String mailid,String mcon,String co,String noname,String add0,String state0,String cidis,String eo,
			String pho,String mobo,String nameo,String addresso,String stateo,String citydistro,String emailido,String phoneno,String mobileo,String name_o,String address_o,String state_o,String citydistr_o,String emailid_o,String phoneno_o,String mobile_o) {		
    invokeApp("chrome","https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
    clickByLink("Sign Up (Registration)");
    enterById("u_id",id);
    enterById("u_pwd",pass);
    enterById("u_repwd",repass);
    waitproperty(5000);
    selectVisibileTextById("u_secques",Qns);
    enterById("u_secans",Ans);
    enterById("u_name",uname);
   selectVisibileTextById("u_gender",gen);
    waitproperty(3000);
    enterById("u_dob","14/3/97");
    waitproperty(5000);
    enterById("u_designation",des);
    enterById("u_emailid",email);
    enterById("u_mobile",mob);
    enterById("u_phone",phone);
    selectVisibileTextById("u_nationality","INDIA");
    enterById("name",name);
    enterById("capacity",cap);
    enterById("address",add);
    selectVisibileTextById("state",State);
    waitproperty(5000);
    selectVisibileTextById("city_distr",City);
   waitproperty(5000);
   selectVisibileTextById("frrodata",fro);
   waitproperty(4000);
   selectVisibileTextById("acco_type",acco);
   waitproperty(4000);
   selectVisibileTextById("star_rat",star);
   waitproperty(3000);
    enterById("email",mailid);
    enterById("mcontact",mcon);
    enterById("contact",co);
    
    enterByName("name_o",noname);
    enterByName("address_o",add0);
    selectVisibileTextById("state_o",state0);
   waitproperty(4000);
   selectVisibileTextById("citydistr_o",cidis);
    enterByName("emailid_o",eo);
    enterByName("phoneno_o",pho);
    enterByName("mobile_o",mobo);
    clickByXpath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input");
    
    
    enterByName("name_o",nameo);
    enterByName("address_o",addresso);
    selectVisibileTextById("state_o",stateo);
   waitproperty(4000);
   selectVisibileTextById("citydistr_o",citydistro);
    enterByName("emailid_o",emailido);
    enterByName("phoneno_o",phoneno);
    enterByName("mobile_o",mobileo);
    clickByXpath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input");
    
    
    enterByName("name_o",name_o);
    enterByName("address_o",address_o);
    selectVisibileTextById("state_o",state_o);
   waitproperty(4000);
   selectVisibileTextById("citydistr_o",citydistr_o);
    enterByName("emailid_o",emailid_o);
   enterByName("phoneno_o",phoneno_o);
    enterByName("mobile_o",mobile_o);
    clickByXpath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[2]/tbody/tr/td[2]/input");
    //closeAllBrowsers();
	
}
}
