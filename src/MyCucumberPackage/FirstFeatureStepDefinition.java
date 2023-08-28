package MyCucumberPackage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstFeatureStepDefinition {
	
	@Given("Given annotation")
	public void loginFuntion() {
		System.out.println("I start the application");
	}
	@Then("Then Annotation")
	public void thenFunction() {
		System.out.println("I should see a selection of products");
	}
	@When ("When Annotation") 
	public void whenFunction() {
		System.out.println("I browse without the buying Product");
	}
	@Then("Scenario Then Annotation again")
	public void thenFunctionTwo() {
		System.out.println("My basket should be empty");
	}
	@And("And Annotation")
	public void andFunction() {
		System.out.println("I close the application");
	} 
	
	

}
