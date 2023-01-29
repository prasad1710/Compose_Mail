package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pomPackage.SignIn;
import pomPackage.ValidateCompose;

public class ComposeEmailTest extends BaseClass {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = openChromeBrowser();
	}
	@Test(priority=1)
	public void sendEmail() throws InterruptedException {
		SignIn signin = new SignIn(driver);
		signin.sendEmail();
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void sendPassword() throws InterruptedException {
		SignIn signin = new SignIn(driver);
		signin.sendPassword();
		Thread.sleep(5000);
	}
	@Test(priority=3)
	public void clickOnCompose() {
		ValidateCompose compose= new ValidateCompose(driver);
		compose.clickOnCompose();
	}
    @Test(priority=4)
	public void sendBodyCredentials() {
    	ValidateCompose compose= new ValidateCompose(driver);
		compose.sendBodyCredentials();
	}
	@Test(priority=5)
	public void sendSubjectCredentials() {
		ValidateCompose compose= new ValidateCompose(driver);
		compose.sendSubjectCredentials();	
	}
	
	



	// @AfterClass public void afterClass() {
	//	driver.quit(); }
//
}
