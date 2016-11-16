package com.techelevator.ssg.cukes;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.ssg.pageobject.AgeCalculator;
import com.techelevator.ssg.pageobject.HomePage;
import com.techelevator.ssg.pageobject.PageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Component
public class HomePageStepTests {
	
	private WebDriver webDriver;
	private HomePage homePage;
	//private AgeCalculator ageCalculator;
	private PageObject page;
	
	@Autowired 
	public HomePageStepTests(WebDriver webDriver) {
		this.webDriver = webDriver;
		this.homePage = new HomePage(webDriver);

	}
	
	@Given ("^ I am on the home page$")
	public void go_to_the_home_page() throws Throwable {
		webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair/");
		homePage = new HomePage(webDriver);
		
		page = null;
	}
	@Given("^I click on the link: (.*)$")
	public void i_click_on_a_link(String linkName) throws Throwable {
		//webDriver.get("http://localhost:8080/m3[-java-ssg-exercises-pair/");
		page = homePage.clickLink(linkName);
			
	}

//	@Given("^the loan amount is \\$(.*)$")
//	public void the_loan_amount_is_$(String loanAmount) throws Throwable {
//	    calculatorInputPage.enterLoanAmount(loanAmount);
//	}
//
//	@Given("^the loan term is (.*) years$")
//	public void the_loan_term_is_years(String loanTerm) throws Throwable {
//	    calculatorInputPage.enterLoanTerm(loanTerm+" Years");
//	}
//
//	@Given("^the interest rate is (.*)%$")
//	public void the_interest_rate_is(String rate) throws Throwable {
//	    calculatorInputPage.enterInterestRate(rate);
//	}
//
//	@When("^I request the mortgage payment estimate$")
//	public void i_request_the_mortgage_payment_estimate() throws Throwable {
//	    calculatorInputPage.submitForm();
//	}
//
	@Then("^the title will be (.*)$")
	public void the_page_title_will_be_pageTIel_$(String pageTitle) throws Throwable {
	   // System.out.println(pageTitle);
	
			Assert.assertEquals(pageTitle, page.getPageTitle());
	}
}
