package ar.com.selenium.fw.core;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.uiautomation.ios.IOSCapabilities;

public class IOSDriver {

	public static void main(String[] args) throws Exception {
        DesiredCapabilities safari = IOSCapabilities.iphone("Safari");
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), safari);

        driver.get("http://www.ebay.co.uk/");

        System.out.println(driver.getTitle());
        driver.quit();
    }
	
}
