package net.automation.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.automation.pages.Entriespagefile;
import net.automation.pages.Google;

public class countentries {
    Google google;
    Entriespagefile entriespagefile;
    @Given("^I am on entries page$")
    public void iAmOnEntriesPage()
    {
        google.goToHomePage();
    }

    @And("^calculate and verify the entries$")
    public void calculateAndVerifyTheEntries()
    {
        entriespagefile.entry();

    }
}
