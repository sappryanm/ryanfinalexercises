package com.techelevator.ssg.selenium;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.techelevator.ssg.pageobject.AgeCalculator;
import com.techelevator.ssg.pageobject.AgeCalculatorResult;
import com.techelevator.ssg.pageobject.HomePage;

public class AlienAgeTest {
	private static WebDriver webDriver;
	private AgeCalculator ageCalculator;
	
	
	@BeforeClass
	public static void SetUpWebDriver() {
		String homeDir = System.getProperty("user.home");
		System.setProperty("webdriver.chrome.driver", homeDir+"/dev-tools/chromedriver/chromedriver");
		webDriver = new ChromeDriver();
	}
	@Before
	public void setup() {
		webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair/alienAge");
		ageCalculator = new AgeCalculator(webDriver);
	}
	
	@AfterClass
	public static void cleanUPpWebDriver() {
		webDriver.close();
	}
	@Test
	public void one_earth_year_on_mercury_is_4_point_1477() {
		AgeCalculator resultPage = ageCalculator.choosePlanet("mercury")
														.enterAge("1");
														.submitForm();
		Assert.assertEquals(4.0, resultPage.getAgeResult(),0.5);
	}


	
}