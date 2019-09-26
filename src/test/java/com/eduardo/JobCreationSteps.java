package com.eduardo;

import org.jbehave.core.annotations.*;

public class JobCreationSteps {
	
	@Given("I'm creating a job")
	public void selectJobCreation() {
		
	}
	
	@Given("My name is $name")
	public void jobCreateSetName(String name) {
		
	}

	@When("when I create the job")
	public void jobCreateCall() {
		
	}
	
	@Then("Then I get the response code $responseCode")
	public void validateHttpCode(int responseCode) {
		
	}
	
}
