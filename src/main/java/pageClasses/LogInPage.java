package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{
	@FindBy(id="login2")
private WebElement logIn;//declaration
	@FindBy(id="loginusername")
private WebElement userName;
	@FindBy(id="loginpassword")
private WebElement passWord;
	@FindBy(xpath="//button[text()='Log in']")
private WebElement logInButton;
	@FindBy(id="//a[@id='nameofuser']")
private WebElement welcomeText;
//initilization private data members through constructor
public LogInPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}	
public WebElement logIn()//utilization
{
	logIn.click();
	return logIn;
}
public void userName() throws InterruptedException
{
	Thread.sleep(4000);
	userName.sendKeys("Tejasvi");
}
public void passWord()
{
	passWord.sendKeys("tejasvi123");
}
public void logInButton()
{
	logInButton.click();
}
public String welcomeText() throws InterruptedException
{
	Thread.sleep(5000);
	return welcomeText.getText();
	
}
}