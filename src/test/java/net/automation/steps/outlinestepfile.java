package net.automation.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.automation.pages.Google;
import net.automation.pages.Outlinepagefile;
import org.junit.Assert;
import utilities.LoadProperties;

public class outlinestepfile {
    Google google;
    Outlinepagefile outlinepagefile;

    @Given("^I am on instagram page$")
    public void iAmOnInstagramPage()
    {
        google.goToHomePage();
    }

    @And("^Fill the \"([^\"]*)\" and \"([^\"]*)\" in field$")
    public void fillTheAndInField(String arguser, String argpass) throws Throwable
    {

       outlinepagefile.usernamepassword(arguser, argpass);

    }

    @When("^click on the login button$")
    public void clickOnTheLoginButton()
    {
        outlinepagefile.loginbutton();
    }

    @And("^apply assertion on cases \"([^\"]*)\"$")
    public void applyAssertionOnCases(String args1) throws Throwable
    {
        outlinepagefile.comparefaultmessage(args1);

    }
}
