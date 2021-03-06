package step_definations;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FacebookReenterEmail;
import ultilites.Config;
import ultilites.Driver;

public class FacebookReenterEmailDefs {
	FacebookReenterEmail page = new FacebookReenterEmail();
	
	@When("^user fill firstname field as a \"([^\"]*)\"$")
	public void user_fill_firstname_field_as_a(String name) throws Throwable {
		page.firstName.sendKeys(name);
		Thread.sleep(3000);
	}

	@When("^user fill lastname field as a \"([^\"]*)\"$")
	public void user_fill_lastname_field_as_a(String lastName) throws Throwable {
		page.lastName.sendKeys(lastName);
		Thread.sleep(3000);
	}

	@When("^user fill email field as \"([^\"]*)\"$")
	public void user_fill_email_field_as(String email) throws Throwable {
		page.email.sendKeys(email);
		Thread.sleep(3000);
	}

	@Then("^useer able to see reenter enmail label$")
	public void useer_able_to_see_reenter_enmail_label() throws Throwable {
		Assert.assertTrue(page.reenterEmail.isDisplayed());
	}

//	@Given("^user on signin page$")
//	public void user_on_signin_page() throws Throwable {
//	    Driver.getDriver().get(Config.getProperty("url"));
//	    Thread.sleep(3000);
//	}
//
//	@When("^user click create new account button$")
//	public void user_click_create_new_account_button() throws Throwable {
//	  page.newAccountButton.click();
//	  Thread.sleep(3000);
//	}
//
//	@When("^user fill firstname field as a \"([^\"]*)\"$")
//	public void user_fill_firstname_field_as_a(String name) throws Throwable {
//	   page.firstName.sendKeys(name);
//	   Thread.sleep(3000);
//	}
//
//	@When("^user fill lastname field as a \"([^\"]*)\"$")
//	public void user_fill_lastname_field_as_a(String lastName) throws Throwable {
//	    page.lastName.sendKeys(lastName);
//	    Thread.sleep(3000);
//	}
//
//	@When("^user fill email field as \"([^\"]*)\"$")
//	public void user_fill_email_field_as(String email) throws Throwable {
//	    page.email.sendKeys(email);
//	    Thread.sleep(3000);
//	}
//
//	@Then("^useer able to see reenter enmail label$")
//	public void useer_able_to_see_reenter_enmail_label() throws Throwable {
//	  Assert.assertTrue(page.reenterEmail.isDisplayed());
//	  Thread.sleep(3000);
//	}
}
