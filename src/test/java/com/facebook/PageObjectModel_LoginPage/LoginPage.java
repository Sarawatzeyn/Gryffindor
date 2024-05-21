package com.facebook.PageObjectModel_LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
/**
 * instance variable
 */
WebDriver driver;

	
public LoginPage(WebDriver driver) {//parameter driver user define constructor for pom
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);//this line is designed for POM
}
 public WebElement userName(String enterYourUserName) {
	 //driver.findElement(By.cssSelector("")is POMstyle coding 
	WebElement uName=driver.findElement(By.cssSelector("email"));
	uName.clear();
	uName.sendKeys(enterYourUserName);
	System.out.println("what is the tag name"+ uName.getTagName());
	return uName;
}
 public WebElement password(String enterYourPassword) {
	 WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
	 pass.clear();
	 pass.sendKeys(enterYourPassword);
	 return pass;
 }
 public void clickLoginButton() {
	 WebElement loginButton=driver.findElement(By.name("login"));
	 loginButton.click();
 }
 public WebElement forgetPassword() {
	 WebElement forgetpass=driver.findElement(By.linkText("Forgot password?"));
	 forgetpass.click();
	 return forgetpass;
 }
 public WebElement createNewAccount() {
	 WebElement newAccount=driver.findElement(By.linkText("Create new account"));
	 newAccount.click();
	 return newAccount;
 }






}
