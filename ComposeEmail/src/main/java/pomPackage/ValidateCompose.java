package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
;

public class ValidateCompose {
	WebDriver driver;
	static WebDriverWait wait;

	@FindBy(xpath = "//div[text()='Compose']")
	private WebElement Compose;

	@FindBy(xpath = "//div[@class='Am Al editable LW-avf tS-tW']")
	private static WebElement Body;

	@FindBy(xpath = "//input[@name='subjectbox']")
	private WebElement Subject;

	

	public ValidateCompose(WebDriver driver)     //constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	}

	// methods
	public void clickOnCompose() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Compose']")));
		Compose.click();
	}

	public void sendBodyCredentials() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")));
		Body.click();
		Body.sendKeys("Automation QA test for Incubyte");
	}
	
	public void sendSubjectCredentials() {
			Subject.click();
			Subject.sendKeys("Incubyte");	
	}

}
