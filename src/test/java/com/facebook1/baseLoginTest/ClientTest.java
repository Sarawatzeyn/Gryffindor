package com.facebook1.baseLoginTest;

import org.testng.annotations.Test;

import com.facebook1.POM_PageFactory_LoginWithPageFactory.LoginPageWithPageFactory;
import com.facebook1.base.BaseTests;
import com.facebook1.utilities.PropertiesReader;

public class ClientTest extends BaseTests{
	LoginPageWithPageFactory lpf;
	PropertiesReader propertiesReader;
	
	
	@Test
	public void validLoginTest() {
		propertiesReader = new PropertiesReader();//has a relationship
		
		
		lpf=new LoginPageWithPageFactory(driver);
		lpf.userNameMethod(propertiesReader.getuserName());
		lpf.passwordMethod(propertiesReader.getPassword());
		lpf.loginButton();
	}
	
}
