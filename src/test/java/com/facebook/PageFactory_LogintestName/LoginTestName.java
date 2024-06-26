package com.facebook.PageFactory_LogintestName;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestName {
WebDriver driver;
String userName="email";
String passwordName="pass";
String loginButtonName="login";

@BeforeMethod
public void openApp() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
}
@Test
public void validLoginTest() {
	findById(userName).sendKeys("muhitt");
	findById(passwordName).sendKeys("ppp");
	findById(loginButtonName).click();
}
@Test
public void InvalidLoginTest() {
	findById(userName).sendKeys("muhitt");
	findById(passwordName).sendKeys("ppp");
	findById(loginButtonName).click();
}
@Test
public void boundaryTest() {
	findById(userName).sendKeys("muhitt");
	findById(passwordName).sendKeys("ppp");
	findById(loginButtonName).click();	
}
public WebElement findById(String name) {
	return driver.findElement(By.name(name));
}
}
