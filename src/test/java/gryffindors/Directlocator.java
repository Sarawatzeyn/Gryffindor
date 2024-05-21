package gryffindors;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Directlocator {
	
	
WebDriver driver;
@BeforeTest
public void openPage(){
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("");
}
@Test
public void idLocatorTest() {
	driver.findElement(By.id(null)).sendKeys("");
}
@Test
public void nameLocatorTest() {
	driver.findElement(By.name(null)).sendKeys("");
}
@Test
public void linlTextLocatorTest() {
	driver.findElement(By.linkText(null)).click();
}
@Test
public void partiallinkTextLocatorTest() {
	driver.navigate().back();
	driver.findElement(By.partialLinkText("")).click();
	
}
}