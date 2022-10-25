package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement Email;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement EmailNext;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement PasswordNext;
	
	
	public SignIn(WebDriver driver)     //constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	}
    
	//methods
	public void sendEmail()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
		Email.sendKeys("@gmail.com");  //please enter mail id
		EmailNext.click();
	}
	public void sendPassword()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		Password.sendKeys("******");  //please enter password
		PasswordNext.click();
	}
	
}

