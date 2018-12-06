package guru99.gittest;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class App {

	private WebDriver driver;
	private String baseUrl;
	

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANDY\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//PropertyConfigurator.configure("log4j.properties");
		driver.get(baseUrl);
		
		
	}

	@Test
	public void fillBasicInfo() throws Exception {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("xpedia"));
		System.out.println(url);
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
