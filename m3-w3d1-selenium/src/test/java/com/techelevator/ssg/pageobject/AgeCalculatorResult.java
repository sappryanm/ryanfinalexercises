package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AgeCalculatorResult {
	private WebDriver webDriver;

	public AgeCalculatorResult(WebDriver webDriver) {
	
		this.webDriver = webDriver;
	}
	
	

	public float getAgeResult() {
		//If you are 1 years old on plannet Earth then you are 4.0 mercury years old
		WebElement result = webDriver.findElement(By.cssSelector("#main-content > p"));
		String[] parts = result.getText().split(" ");
		float value = Float.parseFloat(parts[11]);
		return value;
	}

	public AgeCalculatorResult submitForm() {
		WebElement submitButton = webDriver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[3]/td[2]/input"));
		submitButton.click();
		return new AgeCalculatorResult(webDriver);
	}
	
	
}
