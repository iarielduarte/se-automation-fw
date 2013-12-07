package ar.com.selenium.fw.scripts;

/**
 * @author Ariel Duarte
 */
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import ar.com.selenium.fw.core.FFDriver;
import ar.com.selenium.fw.pages.MainPage;
import ar.com.selenium.fw.pages.SearchResultPage;

public class SmokeTest {
	
	WebDriver driver;
 
  @BeforeSuite
  public void beforeSuite() {
//	  driver = FFDriver.getDriver(); //selenium-server
	  driver = FFDriver.getFirefoxDriver();//selenium-firefox-driver
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }
  
  @Test(description="Go to Wikipedia Home Page")
  public void verifyEnterOnWikipedia() {
	  driver.get("http://www.wikipedia.org/");
	  Reporter.log("Verify correct title is displayed");
	  Assert.assertEquals(driver.getTitle(), "Wikipedia");
  }
  
  
  @Test(description="Go to Wikipedia Home Page")
  public void verifySearchButtonFunctionality() {
	  driver.get("http://www.wikipedia.org/");
	  MainPage home = new MainPage(driver);
	  home.getSearchText().sendKeys("Selenium");
	  home.getSearchButton().click();
	  Reporter.log("Verify correct search button functionality");
	  SearchResultPage resultPage = new SearchResultPage(driver);
	  Assert.assertTrue(resultPage.getTitleArticle().getText().equals("xxxxxxxx"));
  }
  
 
  

}
