package ar.com.selenium.fw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ar.com.selenium.fw.core.FFDriver;


public class MainPage {
	
	private WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getSearchText(){
		return driver.findElement(By.id("searchInput"));
	}
	
	public WebElement getSearchButton() {
		return driver.findElement(By.name("go"));
	}
	

	
}
