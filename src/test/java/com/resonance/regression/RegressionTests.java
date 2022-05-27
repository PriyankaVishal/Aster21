package com.resonance.regression;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.resonance.keywords.UIKeywords;
import junit.framework.Assert;

public class RegressionTests {
	@Test
	public void verifyTitleOfHomrPage() {
	UIKeywords.openBrowser("chrome");
	UIKeywords.launchURL("https://www.amazon.com");
	String actualTitle = UIKeywords.getTitle();
	UIKeywords.enterText(element,textToEnter);
	Assert.assertEquals("Home Page",actualTitle);

	}
}
