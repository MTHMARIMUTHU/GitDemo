package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {
	
	@Given("^Validate the Browser$")
    public void validate_the_browser() throws Throwable {
		System.out.println("Validated the Browser");
       
    }

    @When("^Broswer is opened$")
    public void broswer_is_opened() throws Throwable {
    	System.out.println("Browser Ready");
        
    }

    @Then("^Browser page should display$")
    public void browser_page_should_display() throws Throwable {
    	System.out.println("Google browser Ready");
       
    }

    @Given("^User is on Landing page$")
    public void user_is_on_landing_page() throws Throwable {
    	System.out.println("Navigated to login");
       
    }

    @When("^User login with application user name  password$")
    public void user_login_with_application_user_name_and_password() throws Throwable {
    	System.out.println("Entered user&pass");
     
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("we are in homepage");
        
    }

    @And("^All credit cards should be displayed$")
    public void all_credit_cards_should_be_displayed() throws Throwable {
    	System.out.println("card displayed");
        
    }
    
    @When("^User login with application user name \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_with_application_user_name_and_password(String arg1, String arg2) throws Throwable {
    	System.out.println("Logged In");
    	System.out.println(arg1);
    	System.out.println(arg2);
    	
    }
    	
    	@Then("^All credit cards should not be displayed$")
    	public void all_credit_cards_should_not_be_displayed() throws Throwable {
    	    // Write code here that turns the phrase above into concrete actions
    		System.out.println("card not displayed");
    	}
    	@When("^User login details enter$")
    	public void user_login_details_enter(DataTable arg1) throws Throwable {
    	List<List<String>> obj=arg1.raw();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	
    	}
    	
    	
    	 @When("^User login  application (.+) and password (.+)$")
         public void user_login_with_application_user_name_user_and_password_pass(String arg1, String arg2) throws Throwable {
       	  System.out.println(arg1);
       	  System.out.println(arg2);
    	 }

}
