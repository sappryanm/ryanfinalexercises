package com.techelevator.ssg.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver webDriver;

	public HomePage(WebDriver webDriver) {
		this.webDriver =webDriver;
		
	}
	public List<WebElement> getPlanetElements() {
		return webDriver.findElements(By.className("plannet"));
	}
	public List<WebElement> getPlanetNameElements() {
		return webDriver.findElements(By.cssSelector(".plannet > h2"));
	}
	public AgeCalculator  clickAgeCalculatorLink() {
		WebElement ageCalculatorLink = webDriver.findElement(By.linkText("Alien Age"));
		ageCalculatorLink.click();
		return new AgeCalculator(webDriver);
	}
	public PageObject clickLink(String linkText) {
		WebElement pageLink = webDriver.findElement(By.linkText("linkText"));
		pageLink.click();
		
		if(linkText.equals("Alien Age")) {
			return new AgeCalculator(webDriver);
		
		} else {
			return null;
		}
	
	}

//	private static WebDriver webDriver;
//	private static HomePage H
//}
}