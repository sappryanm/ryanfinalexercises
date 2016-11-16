package com.techelevator.ssg.selenium;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.techelevator.ssg.pageobject.AgeCalculator;
import com.techelevator.ssg.pageobject.HomePage;

public class HomePageTests {
	private static WebDriver webDriver;
	private HomePage homePage;
	
	
	@BeforeClass
	public static void SetUpWebDriver() {
		String homeDir = System.getProperty("user.home");
		System.setProperty("webdriver.chrome.driver", homeDir+"/dev-tools/chromedriver/chromedriver");
		webDriver = new ChromeDriver();
	}
	@Before
	public void setup() {
		webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair/");
		homePage = new HomePage(webDriver);
	}
	
	@AfterClass
	public static void cleanUPpWebDriver() {
		webDriver.close();
	}
	
	@Test
	/* Compare this test to the same test in the MortgageCalculatorIntegrationTestWithoutPageObject class.
	 * Using the Page Object pat_tern here makes the test much more readable. */
	public void verify_there_Are_eight_planets() {
		List<WebElement> planets = homePage.getPlanetElements();
		
		Assert.assertNotNull(planets);
		Assert.assertEquals(8, planets.size());
	}
	@Test
	public void verify_planet_names() {
		List<WebElement> planetElements = homePage.getPlanetNameElements();
		List<String>	planetNames = new ArrayList<String>();
		
		for(WebElement element: planetElements) {
			planetNames.add(element.getText());
		}
		Assert.assertTrue("Mercury was not in the list", planetNames.contains("Mercury"));
		Assert.assertTrue("Mercury was not in the list", planetNames.contains("Venus"));
		Assert.assertTrue("Mercury was not in the list", planetNames.contains("Earth"));
		Assert.assertTrue("Mercury was not in the list", planetNames.contains("Mars"));
		Assert.assertTrue("Mercury was not in the list", planetNames.contains("Jupiter"));
		Assert.assertTrue("Mercury was not in the list", planetNames.contains("Saturn"));
		Assert.assertTrue("Mercury was not in the list", planetNames.contains("Uranus"));
		Assert.assertTrue("Mercury was not in the list", planetNames.contains("Neptune"));
		
	}
	@Test
	public void verify_age_calculator_lin() {
		AgeCalculator ageCalculator = homePage.clickAgeCalculatorLink();
		
		Assert.assertEquals("alien age calculator", ageCalculator.getPageTitle());
	}
	@Test
	public void verify_last_post() {
		webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair/spaceForumResult");
		WebElement lastPost = webDriver.findElement(By.cssSelector(".post:last-child > h4"));
		Assert.assertNotNull (lastPost);
		Assert.assertEquals(lastPost.getText(), "asda");
	}
}
