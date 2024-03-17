package Utilities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	WebDriver driver;
 @BeforeMethod
  public void beforeMethod(){
	  WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();

	
}

@AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
