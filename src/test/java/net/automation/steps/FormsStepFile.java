package net.automation.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.automation.pages.FormsPageFile;
import net.automation.pages.Google;

public class FormsStepFile {
    Google google;
    FormsPageFile forms_page_file;

    @Given("^I am on the form page$")
    public void iAmOnTheFormPage()
    {
        google.goToHomePage();

    }


    @And("^I select forms details as follows$")
    public void iSelectFormsDetailsAsFollows(DataTable dataTable) throws InterruptedException {
        forms_page_file.selectformsdetails(dataTable);
    }
}
