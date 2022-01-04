package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ultilites.Driver;

public class FacebookReenterEmail {
	
	public FacebookReenterEmail() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(css="a[data-testid=\"open-registration-form-button\"]")
	public WebElement newAccountButton;
	
	@FindBy(css="input[name=\"firstname\"]")
	public WebElement firstName;
	
	@FindBy(css="input[name=\"lastname\"]")
	public WebElement lastName;
	
	@FindBy(css="input[name=\"reg_email__\"]")
	public WebElement email;
	
	@FindBy(css="input[name=\"reg_email_confirmation__\"]")
	public WebElement reenterEmail;

}
