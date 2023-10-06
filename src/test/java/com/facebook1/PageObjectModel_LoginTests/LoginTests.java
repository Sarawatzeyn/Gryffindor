package com.facebook1.PageObjectModel_LoginTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook1.PageObjectModel_LoginPage.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests {
	WebDriver driver;//instance variable
	LoginPage loginPage;//building has a relationship loginPage
	
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.facebook.com/");
	}
@Test(priority=1)
public void validLoginTest() {
	loginPage=new LoginPage(driver);
	loginPage.userName("lala");
	loginPage.password("123");
	loginPage.clickLoginButton();
	
}
@Test(priority=2)
public void InvalidLoginTest() {
	loginPage=new LoginPage(driver);
	loginPage.userName("11");
	loginPage.password("kjkl");
	loginPage.clickLoginButton();
	
}
@AfterMethod
public void closeApp() {
	if (driver!=null) {
		driver.quit();
	}
}
}
