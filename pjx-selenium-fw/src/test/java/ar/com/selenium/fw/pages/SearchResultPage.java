package ar.com.selenium.fw.pages;

/**
 * @author Ariel Duarte
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
	
	private WebDriver driver;

	public SearchResultPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getTitleArticle(){
		return driver.findElement(By.xpath("//*[@id='firstHeading']/span"));
	}

}
