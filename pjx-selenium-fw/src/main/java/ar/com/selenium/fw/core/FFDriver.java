package ar.com.selenium.fw.core;

/**
 * @author Ariel Duarte
 */
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FFDriver {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver(){
		DesiredCapabilities dc = new DesiredCapabilities().firefox();
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
	
	public static WebDriver getFirefoxDriver() {
		return new FirefoxDriver();
	}

}
