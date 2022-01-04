package step_definations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Facebook;
import ultilites.Config;
import ultilites.Driver;

public class FacebookDefs {
	Facebook home= new Facebook();
	
	@Given("^user on signin page$")
	public void user_on_signin_page() throws Throwable {
		Driver.getDriver().get(Config.getProperty("url"));
	}

	@When("^user click create new account button$")
	public void user_click_create_new_account_button() throws Throwable {
	   Assert.assertTrue(home.yeniHesapOlstur.isDisplayed());
	   home.yeniHesapOlstur.click();
	   Thread.sleep(3000);
	}

	@Then("^user able to see sign up title$")
	public void user_able_to_see_sign_up_title() throws Throwable {
	    Assert.assertTrue(home.title.isDisplayed());
	    Thread.sleep(3000);
	}

	@Then("^user able to see sign up subtitle$")
	public void user_able_to_see_sign_up_subtitle() throws Throwable {
	   Assert.assertTrue(home.subtitle.isDisplayed());
	   Thread.sleep(3000);
	}

	@Then("^user able to see firstname label$")
	public void user_able_to_see_firstname_label() throws Throwable {
		String firstNameLabel = home.firstName.getAttribute("aria-label");
		  Assert.assertEquals(firstNameLabel, "Adýn");
		  Thread.sleep(3000);
	}

	@Then("^user able to see lastname label$")
	public void user_able_to_see_lastname_label() throws Throwable {
		  Assert.assertTrue(home.lastName.isDisplayed());
		  Thread.sleep(3000);
	}

	@Then("^user able to see mobile number or email label$")
	public void user_able_to_see_mobile_number_or_email_label() throws Throwable {
		  Assert.assertTrue(home.numberOrEmail.isDisplayed());
		  Thread.sleep(3000);
	}

	@Then("^user able to see new password label$")
	public void user_able_to_see_new_password_label() throws Throwable {
		  Assert.assertTrue(home.password.isDisplayed());
		  Thread.sleep(3000);
	}

	@Then("^user able to see birthday header$")
	public void user_able_to_see_birthday_header() throws Throwable {
		  Assert.assertTrue(home.birthday.isDisplayed());
		  Thread.sleep(3000);
	}

	@Then("^user able to see gender header$")
	public void user_able_to_see_gender_header() throws Throwable {
		  Assert.assertTrue(home.gender.isDisplayed());
		  Thread.sleep(3000);
	}

//	@Then("^user able to see policy message$")
//	public void user_able_to_see_policy_message() throws Throwable {
//	    
//	}

	@Then("^user able to see sign up button text$")
	public void user_able_to_see_sign_up_button_text() throws Throwable {
		  Assert.assertTrue(home.signInButton.isDisplayed());
		  Thread.sleep(3000);
	}
}
