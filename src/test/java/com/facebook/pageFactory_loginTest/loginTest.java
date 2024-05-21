package com.facebook.pageFactory_loginTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
WebDriver driver;
String userNameId="email";
String passwordId="pass";

@BeforeMethod
public void openApp() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
}
@Test
public void validLogintest() {
 findByid(userNameId).sendKeys("sarawat");
 findByid(passwordId).sendKeys("ppp");
//findByid("pass").click();
	
}
public WebElement findByid(String id) {
	return driver.findElement(By.id(id));
	
}


	
}

