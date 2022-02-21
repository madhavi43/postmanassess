package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods{
	
	@Given("Enter the username as {string}")
	public LoginPage enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	@Given("Enter the password as {string}")
	public LoginPage enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	@When("Click on login button")
	public HomePage clickLogin() {
		click(locateElement(Locators.CLASS_NAME, "decorativeSubmit"));
		reportStep("Login button clicked successfully", "pass");
		return new HomePage();
	}

}
