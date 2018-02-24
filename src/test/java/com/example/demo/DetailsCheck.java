package com.example.demo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DetailsCheck extends CucumberRoot {
 
	    private ResponseEntity<String> response; // output

	    @When("^the client calls /details$")
	    public void the_client_issues_GET_details() throws Throwable {
	        response = template.getForEntity("/details", String.class);
	    }
	    
	    @Then("^the client receives response status code of (\\d+)$")
	    public void the_client_receives_status_code_of(int statusCode) throws Throwable {
	        HttpStatus currentStatusCode = response.getStatusCode();
	        assertThat("status code is incorrect : " +
	                response.getBody(), currentStatusCode.value(), is(statusCode));
	    }
	    
	    @When("^the client calls request to /details1$")
	    public void the_client_issues_GET_details1() throws Throwable {
	        response = template.getForEntity("/details1", String.class);
	    }
	    
	    @Then("^the client receives response negative status code of (\\d+)$")
	    public void the_client_receives_wrong_status_code_of(int statusCode) throws Throwable {
	        HttpStatus currentStatusCode = response.getStatusCode();
	        assertThat("status code is incorrect : " +
	                response.getBody(), currentStatusCode.value(), is(statusCode));
	    }
	}
