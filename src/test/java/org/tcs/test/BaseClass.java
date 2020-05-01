package org.tcs.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	//Method to initialize the driver
	public static void driverIntialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJAPPA\\Desktop\\JavaPractise\\FirstSamMavenProject\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();			
	}
	//Method to launch URL
	public static void launchURL(String URL) {
		driver.get(URL);
	}
	
	//Method to enter inputs in text field
	public static void fill(WebElement e, String text) {
		e.sendKeys(text);
	}
	
	//Method to perform click operation
	public static void btnClick(WebElement e) {
		e.click();
	}
	//Method to get current page URL
	public static void getCurrentURL() {
		driver.getCurrentUrl();
	}
	//Method to close all browsers opened by web driver
	public static void closeAllBrowsers() {
		driver.quit();
	}
	//Method to close all browsers opened by web driver
	public static void closeCurrentWindow() {
		driver.close();
	}
	//Method to get current page title
	public static void getPageTitle() {
		driver.getTitle();
	}
	
	
	
	
}
