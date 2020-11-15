package banking.bankmyclass;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BankingTest {
	public static WebDriver driver;
	public static WebDriverWait wait;
	Login obj1;
  @Test
  public void f() {
	  obj1.userclick("mngr294715");
	  obj1.passclick("UqYdyga");
	  obj1.logclick();
	  obj1.outclick();
	  obj1.reclick();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers\\chromedriver_win32 (1)\\chromedriver.exe\\");
	  driver=new ChromeDriver();
	  driver.get("http://www.demo.guru99.com/V4/");
	  wait=new WebDriverWait(driver,2000);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	  
	  obj1= new Login(driver,wait);
	  
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
