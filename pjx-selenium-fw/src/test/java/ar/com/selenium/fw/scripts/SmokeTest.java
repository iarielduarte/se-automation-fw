package ar.com.selenium.fw.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import ar.com.selenium.fw.core.FFDriver;
import ar.com.selenium.fw.pages.MainPage;
import ar.com.selenium.fw.pages.SearchResultPage;

public class SmokeTest {
	WebDriver driver;
 
  @BeforeSuite
  public void BeforeSuite() {
	  driver = FFDriver.getDriver();
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }
  
  
  @Test(description="Go to Wikipedia Home Page")
  public void verifyEnterOnWikipedia() {
	  driver.get("http://www.wikipedia.org/");
	  /*Verify home page title*/
	  Reporter.log("Verify correct title is displapyed");
	  Assert.assertEquals(driver.getTitle(), "Wikipedia");
	 
  }
  
  @Test(description="Search button functionality")
  public void verifySearchButtonFunctionality() {
	  driver.get("http://www.wikipedia.org/");
	  MainPage home = new MainPage(driver);
	  home.getSearchText().sendKeys("Selenium");
	  home.getSearchButton().click();
	  SearchResultPage searchResutl = new SearchResultPage(driver);
	  String expectedResutl = "Selenium";
	  System.out.println(searchResutl.getTitleArticleText());
	  Reporter.log("Verify correct search button functionality");
	  /*Verify expected result of the search*/
	  Assert.assertTrue(searchResutl.getTitleArticleText().getText().equals(expectedResutl));
  }
  
  

}
