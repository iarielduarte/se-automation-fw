package ar.com.selenium.fw.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HCDriver {

	/**
	 *Se coloca la variable del mismo tipo que la clase llama por convension "instance".
	 *Aqui reside todo el secreto de este patrón, ya que es dicha variable la que se instancia por unica vez y se devuelve al cliente.
	 */
	private static HCDriver instance = null;
	public static WebDriver driver = null;
	
	
	/**
	 * Se privatiza el constructor para que no se pueda hacer un new Singleton() 
	 */
	private HCDriver() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/**
	 * Para utilizar la unica instancia de la clase los clientes deveran convocar al metodo "getInstance()"
	 * @return
	 */
	static public HCDriver getInstance() {
		if (instance == null) {
			instance = new HCDriver();
		}
		return instance;
	}
	
	/**
	 * No provee de la unica instancia del driver
	 * @return WebDriver
	 */
    public static WebDriver getWebDriver() {
        return HCDriver.getInstance().driver;
    }
	
	/**
	 * Ejecutor de codigo JavaScript
	 * @param script
	 */
	public void executeScript(String script) {
        JavascriptExecutor js = (JavascriptExecutor) HCDriver.getWebDriver();
        js.executeScript(script);
    }

}
