package support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

	private static final String browser = "CHROME";
	private static WebDriver driver;

	public static WebDriver getBrowser() {

		driver = createChromeDriver();
		
//		switch (browser) {
//		case "CHROME":
//			driver = createChromeDriver();
//			break;
//		case "IE":
//			driver = createIEDriver();
//			break;
//		case "FIREFOX":
//		default:
//			driver = createFirefoxDriver();
//			break;
//		}
		addAllBrowserSetup(driver);
		return driver;
	}

	private static WebDriver createIEDriver() {
		System.setProperty("webdriver.ie.driver", "//src//main//resources//IEDriver//IEDriverServer.exe");
		return new InternetExplorerDriver();
	}

	private static WebDriver createChromeDriver() {		
		System.setProperty("webdriver.chrome.driver", "src//main//resources//ChromeDriver//chromedriver.exe");
		return new ChromeDriver();
	}

	private static WebDriver createFirefoxDriver() {
		return new FirefoxDriver();
	}

	private static void addAllBrowserSetup(WebDriver driver) {
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

}
