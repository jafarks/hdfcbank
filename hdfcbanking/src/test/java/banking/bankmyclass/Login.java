package banking.bankmyclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	By user=By.xpath("//input[@name='uid']");
	By password=By.xpath("//input[@name='password']");
	By login=By.xpath("//input[@name='btnLogin']");
	By reset=By.xpath("//input[@name='btnReset']");
	By logout=By.xpath("//a[text()='Log out']");
	
	public Login(WebDriver driver, WebDriverWait wait) {
		this.driver=driver;
		this.wait=wait;
	}

	public void userclick(String n)
	{
		//driver.findElement(user).sendKeys("mngr294715");
		wait.until(ExpectedConditions.visibilityOfElementLocated(user)).sendKeys(n);
		
	}
	public void passclick(String b)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(b);
	}
	public void logclick()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(login)).click();
	}
	public void outclick()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(logout)).click();
	}

	public void reclick()
	{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(reset)).click();
	}
}
