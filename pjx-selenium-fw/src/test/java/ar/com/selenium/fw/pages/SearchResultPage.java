package ar.com.selenium.fw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage {
	private WebDriver driver;
	
	
	
	public SearchResultPage(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getTitleArticleText() {
		return driver.findElement(By.xpath("//*[@id='firstHeading']/span"));
	}
}
