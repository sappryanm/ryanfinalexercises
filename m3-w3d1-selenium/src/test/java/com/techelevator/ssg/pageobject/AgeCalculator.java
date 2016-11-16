package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AgeCalculator implements PageObject{
	private WebDriver webDriver;

	public AgeCalculator(WebDriver webDriver) {
		this.webDriver = webDriver;
		
	}
	@Override
	public String getPageTitle() {
		WebElement title = webDriver.findElement(By.cssSelector("#maint-content > h2"));
		return title.getText();
	}
	

	public AgeCalculator enterAge(String age) {
		WebElement ageField = webDriver.findElement(By.name("age"));
		ageField.sendKeys(age);
		return this;
	}
	public AgeCalculator choosePlanet(String plannet) {
		Select planetSelection = new Select(webDriver.findElement(By.name("plannet")));
		planetSelection.selectByVisibleText(plannet);;
		return this;
	}
	public AgeCalculatorResult submitForm() {
		WebElement submitButton = webDriver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[3]/td[2]/input"));
		submitButton.click();
		return new AgeCalculatorResult(webDriver);
	}
	public float getAgeResult() {
		//If you are 1 years old on plannet Earth then you are 4.0 mercury years old
		WebElement result = webDriver.findElement(By.cssSelector("#main-content > p"));
		String[] parts = result.getText().split(" ");
		float value = Float.parseFloat(parts[11]);
		return value;
	}
}
