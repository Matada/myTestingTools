package steps;

import io.cucumber.java.en.*;

public class myTestingToolsSteps {

    @Given("Environment is correctly configured")
    public void environmentIsCorrectlyConfigured() {

        System.out.println("Step Given, thread: " + Thread.currentThread().getId());
    }

    @When("User run the test")
    public void userRunTheTest() {
        System.out.println("Step When, thread: " + Thread.currentThread().getId());
    }

    @Then("Browser window will popup")
    public void browserWindowWillPopup() {
        System.out.println("Step Then, thread: " + Thread.currentThread().getId());
    }

    @And("Value can be read from label")
    public void valueCanBeReadFromLabel() {
        System.out.println("Step And, thread: " + Thread.currentThread().getId());
    }

    @Then("Value can be read from the input field")
    public void valueCanBeReadFromTheInputField() {
        System.out.println("Step And, thread: " + Thread.currentThread().getId());
    }

}
