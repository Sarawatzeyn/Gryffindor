package com.facebook.POM_PageFactory_LoginTestWithPagetory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.POM_PageFactory_LoginWithPageFactory.LoginPageWithPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithPageFactory {
WebDriver driver;
LoginPageWithPageFactory lpf;//has a relationship
@BeforeMethod
public void openApp() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	
}
@Test
public void invalidLoginTest() {
	lpf=new LoginPageWithPageFactory(driver);
	lpf.userNameMethod("sarawat");
	lpf.passwordMethod("ppp");
	lpf.loginButton();
}
@Test
public void boundaryLoginTest() {
	lpf=new LoginPageWithPageFactory(driver);
	lpf.userNameMethod("sarawat");
	lpf.passwordMethod("ppp");
	lpf.loginButton();
}
@AfterMethod
public void closeApp() {
	if (driver!=null) {
		driver.quit();
	}
}
}
