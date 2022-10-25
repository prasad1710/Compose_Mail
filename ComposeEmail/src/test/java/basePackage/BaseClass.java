package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver openChromeBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham bhand\\Desktop\\pd\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://accounts.google.com/v3/signin/identifier?dsh=S-1610081382%3A1665856123771915&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWpNhNClJ4afitvl6BhVkf8zewL_bgQ-4HGBiXs5SvoZpYdAr_eWAuNaF8Ui3uQQIjSB2CaPrg");
	return driver;
	}

}
