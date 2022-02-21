package com.salesforce.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksImplementation extends ProjectSpecificMethods{
	@Before
	public void beforeScenario(Scenario sc) {
		testName.set(sc.getName());
		setNode();

	}

}
