package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import support.Browsers;

public class Driver {

	public static WebDriver driver;	
	
	public synchronized  WebDriver startBrowser() {  
		if (driver==null) {
			try {				
				driver = Browsers.getBrowser();
	        } catch (UnreachableBrowserException e) {
	        	driver = Browsers.getBrowser();
	        }
		}
        return driver;
    }
	
	
	public synchronized  WebDriver closeBrowser() {
		if (driver!=null) {
			try {				
				driver.close();
	        } catch (UnreachableBrowserException e) {
	        	driver.close();
	        }
		}
        return driver;
    }
}
