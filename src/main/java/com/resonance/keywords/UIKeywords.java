package com.resonance.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	public static RemoteWebDriver driver = null;
	public static void openBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("ie")){
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();			
		}  
		else {
			System.out.println("Invalid browser name: "+browserName);
		}
	}
	public static void launchURL(String url) {
		driver.get(url);

	}
	public static String getTitle() {
		return driver.getTitle();
	}

	public static void enterText(WebElement element,String textToEnter) {
		element.sendKeys(textToEnter);
		
	}
	public void eneterText(By by , String textToEnter) {
		driver.findElement(by).sendKeys(textToEnter);
		}
	
	public void enterText(String locatorValue, String textToEnter) {
		driver.findElement(By.xpath(locatorValue)).sendKeys(textToEnter);

	}
	
	}
