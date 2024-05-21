package com.facebook.POM_PageFactory_LoginWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
//page object model formula--each web element have own method
	//pom have its own constructor in each page
	//formula=@findBy(how=How.attributes/locator name,using=values/xpath/css
WebDriver driver;

	

public LoginPageWithPageFactory(WebDriver driver) {
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(how=How.ID,using="email")WebElement userNameId;
public WebElement userNameMethod(String enterYourUserName) {
	//driver.findElement(By.id("email"));
	userNameId.sendKeys(enterYourUserName);
	return userNameId;
}
@FindBy(how=How.NAME,using="pass")public WebElement passwordLocator;
public WebElement passwordMethod(String enterYourPassword) {
	passwordLocator.sendKeys(enterYourPassword);
return passwordLocator;
}
@FindBy(how=How.XPATH,using="//button[starts-with(@id,'u_0_5_')]")
private WebElement loginButtonLocator;
public void loginButton() {
	loginButtonLocator.click();
}



}
