package com.facebook1.baseLoginTest;

import org.testng.annotations.Test;

import com.facebook1.POM_PageFactory_LoginWithPageFactory.LoginPageWithPageFactory;
import com.facebook1.base.BaseTests;

public class invalidLoginTest extends BaseTests{
	LoginPageWithPageFactory lpf;
	
	@Test
	public void validLoginTest() {
		lpf=new LoginPageWithPageFactory(driver);
		lpf.userNameMethod("sarawat");
		lpf.passwordMethod("ppp");
		lpf.loginButton();
	}
	
}
