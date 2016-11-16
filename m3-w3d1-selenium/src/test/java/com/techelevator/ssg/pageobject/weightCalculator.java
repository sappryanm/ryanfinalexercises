package com.techelevator.ssg.pageobject;

import org.openqa.selenium.WebDriver;

public class weightCalculator implements PageObject{
		private WebDriver webDriver;

		public AgeCalculator(WebDriver webDriver) {
			this.webDriver = webDriver;
			
		}
}
