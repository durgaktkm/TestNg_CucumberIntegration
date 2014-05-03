package com.test;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Ramprasad on 5/2/14.
 */
public class MyTests {
    @cucumber.api.java.en.Given("^something$")
    public void something() throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println("Hello dear");
    }


    @When("^not happened$")
    public void not_happened() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^cry$")
    public void cry() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
