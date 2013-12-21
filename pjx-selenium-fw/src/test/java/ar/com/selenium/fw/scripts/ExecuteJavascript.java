package ar.com.selenium.fw.scripts;

import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ar.com.selenium.fw.core.HCDriver;

public class ExecuteJavascript {

	WebDriver driver;

	@BeforeTest
	public void start() {
		driver = HCDriver.getWebDriver();
	}

	@AfterTest
	public void stop() {
		driver.quit();
	}

	@Test(description="Verificamos el titulo de la pagina obtenida con JavaScript")
	public void javaScriptExec() throws Exception {
		driver.get("http://duckduckgo.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String readyState = (String) js.executeScript("return document.readyState");
		System.out.println("readyState  : " + readyState);

		String title = (String) js.executeScript("return document.title");
		System.out.println("title  : " + title);

		String domain = (String) js.executeScript("return document.domain");
		System.out.println("domain  : " + domain);

		String lastModified = (String) js.executeScript("return document.lastModified");
		System.out.println("lastModified  : " + lastModified);

		String URL = (String) js.executeScript("return document.URL");
		System.out.println("Full URL  : " + URL);

		String error = (String) ((JavascriptExecutor) driver)
				.executeScript("return window.jsErrors");
		System.out.println("Windows js errors  :   " + error);
		
		js.executeScript("alert('Titulo de Pagina"+title+"');");
		Thread.sleep(10000);
		
		Assert.assertEquals(title, "Search DuckDuckGo");
	}

}