package guru99.gittest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static WebDriver driver;
	private static String baseUrl;

	@BeforeClass
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
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
